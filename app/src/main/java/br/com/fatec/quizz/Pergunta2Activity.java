package br.com.fatec.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Pergunta2Activity extends AppCompatActivity {

    private RadioButton radioButtonPulpFiction;
    private Button buttonResponderP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta2);

        associaComponentes();

        buttonResponderP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButtonPulpFiction.isChecked()){
                    Toast.makeText(Pergunta2Activity.this, "Correto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Pergunta2Activity.this, "Incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void associaComponentes(){
        this.radioButtonPulpFiction = findViewById(R.id.radioButtonCorreto);
        this.buttonResponderP2 = findViewById(R.id.buttonResponderP2);
    }
}