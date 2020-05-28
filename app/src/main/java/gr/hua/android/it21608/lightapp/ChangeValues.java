package gr.hua.android.it21608.lightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangeValues extends AppCompatActivity {

    EditText editName;
    EditText editIPON;
    EditText editIPOFF;
    Button btnSaveChanges;
    Button tempBtn;
    String tmp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_values);

        editName = findViewById(R.id.editTextName);
        editIPON = findViewById(R.id.editTextIPON);
        editIPOFF = findViewById(R.id.editTextIPOFF);
        btnSaveChanges = findViewById(R.id.buttonSaveChanges);


        btnSaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ChangeValues.this, Module1Activity.class);
                int buttonID = getIntent().getExtras().getInt("buttonId");
//                tempBtn = findViewById(buttonID);
//                tmp = editName.getText().toString();
//                tempBtn.setText("ok");
//                System.out.println("________-----> "+editName.getText().toString());

                myIntent.putExtra("name", editName.getText().toString());
                myIntent.putExtra("ipon",editIPON.getText().toString());
                myIntent.putExtra("ipoff",editIPOFF.getText().toString());
                myIntent.putExtra("id",buttonID);


                startActivity(myIntent);
            }
        });
    }
}
