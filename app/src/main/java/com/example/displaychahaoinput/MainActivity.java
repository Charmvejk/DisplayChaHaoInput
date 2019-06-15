package com.example.displaychahaoinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        View bt = findViewById(R.id.bt);
        View iv = findViewById(R.id.iv);
        EditTextUtils.clearButtonListener(et1, bt);
        EditTextUtils.clearButtonListener(et2, iv);

    }
}
