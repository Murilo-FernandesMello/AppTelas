package br.ulbra.trocadetelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


        Button btTelaprincipal, btTela2, btTela3;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            CarregarTelaPrincipal();
        }

        public void CarregarTelaPrincipal() {
            setContentView(R.layout.activity_main);
            btTela2 = (Button) findViewById(R.id.btTela2);
            btTela2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CarregarTela2();
                }
            });
            btTela3 = (Button) findViewById(R.id.btTela3);
            btTela3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CarregarTela3();
                }
            });

        }

        public void CarregarTela2() {
            setContentView(R.layout.tela2);
            btTelaprincipal = (Button) findViewById(R.id.btTela1);
            btTelaprincipal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CarregarTelaPrincipal();
                }


            });
        }

        public void CarregarTela3(){
            setContentView(R.layout.tela3);
            btTela3 = (Button) findViewById(R.id.btTela1_0);
            btTela3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CarregarTelaPrincipal();
                }
            });
        }
    }
