package br.com.fatec.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton6;
    private Button buttonResponderP1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        associaComponentes();


    }

    private void associaComponentes(){
        this.radioButton6 = findViewById(R.id.radioButton6);
        this.buttonResponderP1 = findViewById(R.id.buttonResponderP1);
    }
}