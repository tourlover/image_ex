package com.example.image_ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import android.app.Dialog;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button show, hello, close;
    Dialog MyStruct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    show = (Button)findViewById(R.id.show);
    show.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            MyAlertStructure();
        }
    });

    }


    public void MyAlertStructure(){
        MyStruct = new Dialog(MainActivity.this);
        MyStruct.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyStruct.setContentView(R.layout.detailscreen);
        MyStruct.setTitle("My Custom Dialog");

        hello = (Button)MyStruct.findViewById(R.id.hello);
        close = (Button)MyStruct.findViewById(R.id.close);

        hello.setEnabled(true);
        close.setEnabled(true);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼 누르면 토스트이벤트발생", Toast.LENGTH_LONG).show();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyStruct.cancel();
            }
        });

        MyStruct.show();
    }

}
