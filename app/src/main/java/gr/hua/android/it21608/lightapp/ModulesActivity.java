package gr.hua.android.it21608.lightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModulesActivity extends AppCompatActivity {

    Button btnModule1;
    Button btnModule2;
    Button btnModule3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        btnModule1 = findViewById(R.id.buttonModule1);
        btnModule2 = findViewById(R.id.buttonModule2);
        btnModule3 = findViewById(R.id.buttonModule3);

        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModulesActivity.this,Module1Activity.class);
                startActivity(intent);
            }
        });


    }
}
