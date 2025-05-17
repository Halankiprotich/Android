package com.example.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbConnect extends SQLiteOpenHelper {

    private static String dbName="androidbegin";
    private static int dbVersion=1;
    private static String dbTable= "users";


    private static String ID= "id";
    private static String fullname= "fullname";
    private  static String email= "email";
    private static String DOB="DOB";
    private  static String phonenumber= "phonenumber";
    private static String password= "password";

    public dbConnect(@Nullable Context context){
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table " + dbTable + "("+" INTEGER PRIMARY KEY AUTOINCREMENT, "+ fullname + " TEXT, "+email+" TEXT, "+DOB+" TEXT, "+phonenumber+" TEXT, "+password+" TEXT )";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + dbTable);
        onCreate(db);

    }
    public void addusers(users user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
                values.put(fullname, user.getFullname());
                values.put(email, user.getEmail());
                values.put(DOB, user.getDOB());
                values.put(phonenumber, user.getPhonenumber());
                values.put(password, user.getPassword());
                db.insert(dbTable, null, values);

    }
}
