package br.com.fatec.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton6;
    private Button buttonResponderP1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        associaComponentes();

        buttonResponderP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton6.isChecked()){
                    Toast.makeText(MainActivity.this, "Correto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void associaComponentes(){
        this.radioButton6 = findViewById(R.id.radioButton6);
        this.buttonResponderP1 = findViewById(R.id.buttonResponderP1);
    }
}