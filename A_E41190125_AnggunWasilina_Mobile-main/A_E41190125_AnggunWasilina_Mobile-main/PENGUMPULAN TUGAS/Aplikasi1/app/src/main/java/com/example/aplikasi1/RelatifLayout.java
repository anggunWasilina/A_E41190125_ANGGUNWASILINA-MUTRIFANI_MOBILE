package com.example.aplikasi1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RelatifLayout extends Activity {

    EditText NamaLengkap;
    Button Done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realatif_layout);

        NamaLengkap = findViewById(R.id.NamaLengkap);
        Done = findViewById(R.id.done);
    }

}


