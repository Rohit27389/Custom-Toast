package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.toast_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater=getLayoutInflater();
                //if u are using linear layout place of text then no need to access TextView
                LinearLayout linearLayout=findViewById(R.id.l1_linear);
                View view1=layoutInflater.inflate(R.layout.custom_layout_toast,linearLayout);

                /*TextView tv=view1.findViewById(R.id.textView1);
                tv.setText("Custom View");*/

                Toast toast=new Toast(MainActivity.this);
                toast.setView(view1);
                toast.setGravity(Gravity.LEFT |Gravity.TOP,150,300);
                toast.show();
            }
        });
    }
}