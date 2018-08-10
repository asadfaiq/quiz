package com.sotest123456.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

public Button button1;
    public void init(){


        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {


                Intent asad = new Intent(MainActivity.this,Main3Activity.class);

                startActivity(asad);
            }


        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
init();

}
}
