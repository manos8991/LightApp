package gr.hua.android.it21608.lightapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    //DB name,table name,and column names
    public static String DATABASE_NAME = "name_ip_db";
    private static final int VERSION = 2;
    public static final String TABLE_NAME = "name_ip_table";
    public static String COLUMN_1 = "ID";
    public static String COLUMN_2 = "NAME";
    public static String COLUMN_3 = "IPON";
    public static String COLUMN_4 = "IPOFF";

    //DB constructor,when it's called DB is created
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table
        //CREATE TABLE ok (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,IP TEXT);
//        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,IP TEXT) ");
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_2 + " TEXT, " +
                COLUMN_3 + " TEXT, " +
                COLUMN_4 + " TEXT " +
                ");");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //drop table if exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(int NAME, String IPON , String IPOFF) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_2, NAME);
        contentValues.put(COLUMN_3, IPON);
        contentValues.put(COLUMN_4, IPOFF);
        long result = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        //if its not inserted insert method returns -1
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean  isMasterEmpty() {

        boolean flag;
        String quString = "select exists(select 1 from " + TABLE_NAME  + ");";

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(quString, null);
        cursor.moveToFirst();
        int count= cursor.getInt(0);
        if (count ==1) {
            flag =  false;
        } else {
            flag = true;
        }
        cursor.close();
        db.close();

        return flag;
    }

    public Cursor fnameQuery(String searchField) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT * FROM " + TABLE_NAME , null);
        return results;
    }

    public Cursor getNamewithID(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT "+COLUMN_2+" FROM " + TABLE_NAME+ " WHERE "+COLUMN_1+" = "+id , null);
        return results;
    }

    public Cursor getIpOnwithID(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT "+COLUMN_3+" FROM " + TABLE_NAME+ " WHERE "+COLUMN_1+" = "+id , null);
        return results;
    }

    public Cursor getIpOffwithID(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT "+COLUMN_4+" FROM " + TABLE_NAME+ " WHERE "+COLUMN_1+" = "+id , null);
        return results;
    }

    public boolean updateData(int id,String name,String ipon,String ipoff){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_2,name);
        contentValues.put(COLUMN_3,ipon);
        contentValues.put(COLUMN_4,ipoff);
        db.update(TABLE_NAME,contentValues, DBHelper.COLUMN_1 + "=" + id, null);
        return true;
    }

}
