package com.example.exemplologterminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView estado;
    private Button btn;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estado = (TextView) findViewById(R.id.estado);
        btn = (Button) findViewById(R.id.btn);
        input = (EditText) findViewById(R.id.input);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = input.getText().toString();
                Log.d("estado", "a mensagem do utilizador é a seguinte:");
                Log.d("estado", msg);
                //estado.setText("Butao carregado");
            }
        });
    }
}