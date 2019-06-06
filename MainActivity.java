package com.example.primeraapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarem l'editText
    EditText etName;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assignem el component del layout amb l'id:
        etName = findViewById(R.id.etName);
        txtResult = findViewById(R.id.txtResult);

    }

    public void btnOkPressed(View view) {
        //Agafem el text de l'EditText:
        String name = etName.getText().toString();
        //Modifiquem el text del TextView:
        txtResult.setText(getString(R.string.textHello)+" "+name+getString(R.string.textHowAreYou));
    }

    public void btnCancelPressed(View view)
    {
        etName.setText("");
        txtResult.setText("");
    }


}
