package com.gincana.enti.gincanaenti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    private Button btn_sortir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn_sortir = (Button)findViewById(R.id.btn_sortir);
        btn_sortir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
             //   Intent intent = new Intent();
               // intent.putExtra("resultat", "Resultat correcte");
              //  setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
