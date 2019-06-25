package com.example.petera.inputuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        hasil = findViewById(R.id.hasil);
        String hsl = getIntent().getStringExtra("hasil");

        hasil.setText(hsl);

    }
}
