package kidsair.kidsscrip.childair.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import kidsair.kidsscrip.childair.Model.Chid;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;


public class Database extends SQLiteAssetHelper {

    private static final String DB_NAME="chid.db";
    private static final int DB_VER=1;
    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }
    public List<Chid> getChid(){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[]  sqlSelect={"Name","Time","Temperature","Dust1", "Dust2"};
        String tableName="chid";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null ,null,null,null,null);
        List<Chid> result = new ArrayList<>();
        if (cursor.moveToNext()){
            do {
                Chid chid = new Chid();
                chid.setName(cursor.getString(cursor.getColumnIndex("Name")));
                chid.setTime(cursor.getString(cursor.getColumnIndex("Time")));
                chid.setTemperature(cursor.getString(cursor.getColumnIndex("Temperature")));
                chid.setDust1(cursor.getString(cursor.getColumnIndex("Dust1")));
                chid.setDust2(cursor.getString(cursor.getColumnIndex("Dust2")));
                result.add(chid);

            }while (cursor.moveToNext());
        }return result;


    }
    public List<String> getNames(){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[]  sqlSelect={"Name"};
        String tableName="chid";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null ,null,null,null,null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToNext()){
            do {

                result.add(cursor.getString(cursor.getColumnIndex("Name")));

            }while (cursor.moveToNext());
        }return result;
    }
    public List<Chid> getChidByName(String name){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[]  sqlSelect={"Name","Time","Temperature","Dust1", "Dust2"};
        String tableName="chid";
        qb.setTables(tableName);

        Cursor cursor = qb.query(db,sqlSelect,"Name LIKE ?" ,new String[]{"%"+name+"%"},null,null,null);
        List<Chid> result = new ArrayList<>();
        if (cursor.moveToNext()){
            do {
                Chid chid = new Chid();
                chid.setName(cursor.getString(cursor.getColumnIndex("Name")));
                chid.setTime(cursor.getString(cursor.getColumnIndex("Time")));
                chid.setTemperature(cursor.getString(cursor.getColumnIndex("Temperature")));
                chid.setDust1(cursor.getString(cursor.getColumnIndex("Dust1")));
                chid.setDust2(cursor.getString(cursor.getColumnIndex("Dust2")));
                result.add(chid);

            }while (cursor.moveToNext());
        }return result;
    }
}