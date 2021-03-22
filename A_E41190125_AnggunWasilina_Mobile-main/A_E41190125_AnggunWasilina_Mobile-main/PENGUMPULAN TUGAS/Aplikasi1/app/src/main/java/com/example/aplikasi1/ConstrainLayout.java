package com.example.aplikasi1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class ConstrainLayout extends Activity {

    EditText Login ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constrain_layout);

        Login = findViewById(R.id.login);
    }
}
