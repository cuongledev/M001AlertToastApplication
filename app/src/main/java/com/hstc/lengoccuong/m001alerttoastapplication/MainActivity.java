package com.hstc.lengoccuong.m001alerttoastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button showToast;
    private Button showCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        showToast = findViewById(R.id.show_toast);
        showToast.setOnClickListener(this);

        showCustomToast = findViewById(R.id.show_custom_toast);
        showCustomToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_toast:
                Toast.makeText(this,"This is a Toast",Toast.LENGTH_LONG).show();
                break;
            case R.id.show_custom_toast:
                MyToast myToast = new MyToast(this);
                myToast.show();
                break;
            default:
                break;
        }
    }
}
