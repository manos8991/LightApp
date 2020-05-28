package gr.hua.android.it21608.lightapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSettings ;
    DBHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.ACCESS_NETWORK_STATE)
                != PackageManager.PERMISSION_GRANTED)
        {
            // Permission is not granted
            Toast.makeText(this, "Permission not granted", Toast.LENGTH_SHORT).show();
        }

        //call the contrustor so that the DB is created
        myDB = new DBHelper(this);

        if(myDB.isMasterEmpty()){
            //insert values
            Toast.makeText(this, "Inside", Toast.LENGTH_SHORT).show();
            for(int i = 0 ;i<16;i++){
                myDB.insertData(i,"192.168.1.4","192.168.1.4");
            }
        }
        else{
//            Db talbe content
            Cursor results = myDB.fnameQuery("ok");
            while (results.moveToNext()) {
                System.out.println("---------------------->button id "+results.getString(0)+" ipon "+results.getString(2)+" ipoff "+results.getString(3));
            }
            Cursor results1 = myDB.getNamewithID(2);
            while (results1.moveToNext()) {
                            System.out.println("PRINT SINGLE NAME FROM DB ---------------->"+results1.getString(0));

            }
        }

        btnSettings = findViewById(R.id.buttonSettings);

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModulesActivity.class);
                startActivity(intent);
            }
        });

    }


}
