package com.androidlime.groceryshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



   private Button b1,b2,b3,b4;
    //private  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1= (Button) findViewById(R.id.register);
        b2= (Button) findViewById(R.id.login);
        b3= (Button) findViewById(R.id.faqs);
        b4= (Button) findViewById(R.id.contacts);




        //textView= (TextView) findViewById(R.id.loginn);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //textView.setText("Login");
                Toast.makeText(MainActivity.this,"Register button is Clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inta = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(inta);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent an= new Intent(MainActivity.this,Main4Activity.class);
                startActivity(an);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ntn = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(ntn);
            }
        });
    }
}
