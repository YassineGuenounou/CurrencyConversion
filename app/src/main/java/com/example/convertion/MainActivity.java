package com.example.convertion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt=findViewById(R.id.txt1);
        EditText editTxt=findViewById(R.id.edittxt);
        RadioButton r1=findViewById(R.id.rb1);
        RadioButton r2=findViewById(R.id.rb2);
        Button btn=findViewById(R.id.btn);
        TextView txt2=findViewById(R.id.txt2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTxt.getText().length()==0)
                    Toast.makeText(getApplicationContext(),
                "Veuillez saisir un montant à convertir ", Toast.LENGTH_SHORT).show();
                else {
                    double res=0;
                    if(r1.isChecked())
                        res=Double.parseDouble(editTxt.getText().toString())/2.3;
                    else if (r2.isChecked())
                        res=Double.parseDouble(editTxt.getText().toString())*2.3;
                    else Toast.makeText(getApplicationContext(),"Veuillez selectionner un sens de conversion", Toast.LENGTH_SHORT).show();
                    txt2.setText("Resultat:"+res);
                }
            }
        });

    }}