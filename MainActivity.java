package com.example.petera.inputuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEnter;

    EditText etEmail, etNama, etUmur, etNo, etTanggal, etAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnter = findViewById(R.id.btnEnter);

        etEmail = findViewById(R.id.etEmail);
        etNama = findViewById(R.id.etNama);
        etNo = findViewById(R.id.etNo);
        etUmur = findViewById(R.id.etUmur);
        etTanggal = findViewById(R.id.etTanggal);
        etAlamat = findViewById(R.id.etAlamat);

        btnEnter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (etEmail.getText().toString().isEmpty() || etNama.getText().toString().isEmpty() || etNo.getText().toString().isEmpty()
                || etTanggal.getText().toString().isEmpty() || etAlamat.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Isi seluruh data", Toast.LENGTH_SHORT).show();
        }else if (etNama.getText().toString().length() < 5)
        {
            Toast.makeText(this, "Nama minimal 5 karakter", Toast.LENGTH_SHORT).show();
        }else{

            Intent i = new Intent(this,Main2Activity.class);
            i.putExtra("hasil","Email : " + etEmail.getText().toString() +
                    "\n" + "Nama : "+etNama.getText().toString() +
                    "\n" +"Umur :" +etUmur.getText().toString() +
                    "\n" + "No HP : " +etNo.getText().toString() +
                    "\n" + "Tanggal Lahir : "+etTanggal.getText().toString() +
                    "\n" + "Alamat : "+etAlamat.getText().toString());
//            i.putExtra("nama",etNama.getText().toString());
            startActivity(i);

            kosongkan();
        }

    }
    private void kosongkan(){
        etEmail.setText("");
        etAlamat.setText("");
        etTanggal.setText("");
        etNo.setText("");
        etUmur.setText("");
        etNama.setText("");
    }
}
