package com.jxj.labregulerk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button logbut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);
        logbut = (Button)findViewById(R.id.logBut);
    }

    public void masuk (View view){
        if (username.getText().toString().equals("")
                || password.getText().toString().equals(" ")){
            Toast.makeText(getApplicationContext(), "Masukkan Data!",
                    Toast.LENGTH_SHORT).show();
        }else{ if (username.getText().toString().equals("admin")
                || password.getText().toString().equals("admin")){
            Intent berhasil = new Intent(MainActivity.this,
                    Main2Activity.class);
            startActivity(berhasil);
        }

        }
    }
}
