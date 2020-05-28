package gr.hua.android.it21608.lightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class Module1Activity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
    long down, up;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public String ipOn,ipOff;
    private boolean isOn = false;
    private String strData,text1;
    private String[] ip = new String[2];
    DBHelper myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        button1 = findViewById(R.id.button);
        button1.setOnTouchListener(buttonOnTouchListener);
        button2 = findViewById(R.id.button2);
        button2.setOnTouchListener(buttonOnTouchListener);
        button3 = findViewById(R.id.button3);
        button3.setOnTouchListener(buttonOnTouchListener);
        button4 = findViewById(R.id.button4);
        button4.setOnTouchListener(buttonOnTouchListener);
        button5 = findViewById(R.id.button5);
        button5.setOnTouchListener(buttonOnTouchListener);
        button6 = findViewById(R.id.button6);
        button6.setOnTouchListener(buttonOnTouchListener);
        button7 = findViewById(R.id.button7);
        button7.setOnTouchListener(buttonOnTouchListener);
        button8 = findViewById(R.id.button8);
        button8.setOnTouchListener(buttonOnTouchListener);
        button9 = findViewById(R.id.button9);
        button9.setOnTouchListener(buttonOnTouchListener);
        button10 = findViewById(R.id.button10);
        button10.setOnTouchListener(buttonOnTouchListener);
        button11 = findViewById(R.id.button11);
        button11.setOnTouchListener(buttonOnTouchListener);
        button12 = findViewById(R.id.button12);
        button12.setOnTouchListener(buttonOnTouchListener);
        button13 = findViewById(R.id.button13);
        button13.setOnTouchListener(buttonOnTouchListener);
        button14 = findViewById(R.id.button14);
        button14.setOnTouchListener(buttonOnTouchListener);
        button15 = findViewById(R.id.button15);
        button15.setOnTouchListener(buttonOnTouchListener);
        button16 = findViewById(R.id.button16);
        button16.setOnTouchListener(buttonOnTouchListener);

        Intent intent = getIntent();

        myDB = new DBHelper(this);

        if(intent.hasExtra("id")) {
            if (getIntent().getExtras().getInt("id") == R.id.button) {
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button1.setText(strData);
                }
                myDB.updateData(1 ,strData,ip[0],ip[1]);
            }
            else if (getIntent().getExtras().getInt("id") == R.id.button2){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button2.setText(strData);
                }
                myDB.updateData(2 ,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button3){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button3.setText(strData);
                }
                myDB.updateData(3,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button4){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button4.setText(strData);
                }
                myDB.updateData(4,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button5){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button5.setText(strData);
                }
                myDB.updateData(5,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button6){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button6.setText(strData);
                }
                myDB.updateData(6,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button7){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button7.setText(strData);
                }
                myDB.updateData(7,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button8){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button8.setText(strData);
                }
                myDB.updateData(8,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button9){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button9.setText(strData);
                }
                myDB.updateData(9,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button10){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button10.setText(strData);
                }
                myDB.updateData(10,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button11){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button11.setText(strData);
                }
                myDB.updateData(11,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button12){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button12.setText(strData);
                }
                myDB.updateData(12,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button13){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button13.setText(strData);
                }
                myDB.updateData(13,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button14){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button14.setText(strData);
                }
                myDB.updateData(14,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button15){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button15.setText(strData);
                }
                myDB.updateData(15,strData,ip[0],ip[1]);
            }
            else if(getIntent().getExtras().getInt("id") == R.id.button16){
                if (intent.hasExtra("ipon")) {
                    ip[0] = getIntent().getExtras().getString("ipon");
                    Toast.makeText(this, ip[0], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("ipoff")) {
                    ip[1] = getIntent().getExtras().getString("ipoff");
                    Toast.makeText(this, ip[1], Toast.LENGTH_SHORT).show();
                }
                if (intent.hasExtra("name")) {
                    strData = getIntent().getExtras().getString("name");
                    saveData(strData);
                    button16.setText(strData);
                }
                myDB.updateData(16,strData,ip[0],ip[1]);
            }

        }


        loadData();
        Cursor results1 = myDB.getNamewithID(1);
        while (results1.moveToNext()) {
            button1.setText(results1.getString(0));
        }

        results1 = myDB.getNamewithID(2);
        while (results1.moveToNext()) {
            button2.setText(results1.getString(0));
        }

        results1 = myDB.getNamewithID(3);
        while (results1.moveToNext()) {
            button3.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(4);
        while (results1.moveToNext()) {
            button4.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(5);
        while (results1.moveToNext()) {
            button5.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(6);
        while (results1.moveToNext()) {
            button6.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(7);
        while (results1.moveToNext()) {
            button7.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(8);
        while (results1.moveToNext()) {
            button8.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(9);
        while (results1.moveToNext()) {
            button9.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(10);
        while (results1.moveToNext()) {
            button10.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(11);
        while (results1.moveToNext()) {
            button11.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(12);
        while (results1.moveToNext()) {
            button12.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(13);
        while (results1.moveToNext()) {
            button13.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(14);
        while (results1.moveToNext()) {
            button14.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(15);
        while (results1.moveToNext()) {
            button15.setText(results1.getString(0));
        }
        results1 = myDB.getNamewithID(16);
        while (results1.moveToNext()) {
            button16.setText(results1.getString(0));
        }


        loadData();

    }

    public void saveData(String name){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TEXT,name);
        editor.apply();
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        text1 = sharedPreferences.getString(TEXT,"button");
    }

    public View.OnTouchListener buttonOnTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    down = System.currentTimeMillis();
                    break;
                case MotionEvent.ACTION_UP:
                    up = System.currentTimeMillis();
                    if (up - down > 2000) {
                        Toast.makeText(Module1Activity.this, "More than 2 seconds", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Module1Activity.this,ChangeValues.class);
                        intent.putExtra("buttonId", view.getId());
                        startActivity(intent);
                    }
                    else {
                        if (isOn == false) {
                            Toast.makeText(Module1Activity.this, "Inside turn On", Toast.LENGTH_SHORT).show();
                            Cursor ipOnResults = myDB.getIpOnwithID(1);
                            while (ipOnResults.moveToNext()) {
                                ipOn = ipOnResults.getString(0);
                            }
                            HttpGetRequest getRequest = new HttpGetRequest();
                            try {
                                getRequest.execute(ipOn).get();
                            } catch (ExecutionException | InterruptedException e) {
                                e.printStackTrace();
                                Toast.makeText(Module1Activity.this, "wrong ip", Toast.LENGTH_SHORT).show();
                            }
                            isOn = true;
                        }
                        else{
                            Toast.makeText(Module1Activity.this, "Inside turn Off", Toast.LENGTH_SHORT).show();
                            Cursor ipOffResults = myDB.getIpOffwithID(1);
                            while (ipOffResults.moveToNext()) {
                                ipOff = ipOffResults.getString(0);
                            }
                            HttpGetRequest getRequest = new HttpGetRequest();
                            try {
                                getRequest.execute(ipOff).get();
                            } catch (ExecutionException | InterruptedException e) {
                                e.printStackTrace();
                                Toast.makeText(Module1Activity.this, "wrong ip", Toast.LENGTH_SHORT).show();
                            }
                            isOn = false;
                        }

                    }
                    }
                    return true;
            }

    };

}
