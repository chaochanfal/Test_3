package com.example.asus.test_3;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BtnTest implements View.OnClickListener {
    private Context context;
    public BtnTest(Context context){this.context=context;}
    @Override
    public void onClick(View v) {
        Toast.makeText(context, "Activity", Toast.LENGTH_SHORT).show();
    }
}
