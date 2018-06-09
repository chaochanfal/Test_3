package com.example.asus.test_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /***
         *重新定义了OnClickListener接口
         */
        Button btn_Outerclass=findViewById(R.id.btn_Outerclass);
        btn_Outerclass.setOnClickListener(new BtnTest(this));
        /**
         *
         */
        Button btn_Activity=findViewById(R.id.btn_Activity);
        Button button6=findViewById(R.id.button6);
        /**
         *
         */
        Button btn_lnnerclass=findViewById(R.id.btn_lnnerclass);
        btn_lnnerclass.setOnClickListener(this);
        /**
         *
         */
        Button button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewe=findViewById(R.id.textview) ;
                textViewe.setText("匿名方法");
            }
        });
    }

    @Override
    public void onClick(View v) {
        TextView textViewe=findViewById(R.id.textview) ;
        textViewe.setText("btn_lnnerclass");

    }

    public void demo(View view) {
        Toast.makeText(MainActivity.this,"绑定方法",Toast.LENGTH_LONG).show();
    }

}
