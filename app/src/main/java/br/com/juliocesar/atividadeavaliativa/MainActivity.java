package br.com.juliocesar.atividadeavaliativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnSaudacao;
    TextView TvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.editNome);
        btnSaudacao = findViewById(R.id.btnBotao);
        TvMensagem = findViewById(R.id.tvNome);

        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PEGAR A INFORMAÇÃO DO EDITTEXT
                String nome = edtNome.getText().toString();
                String mensagem = "Olá " + nome;
                TvMensagem.setText(mensagem);
            }
        });



    }
}