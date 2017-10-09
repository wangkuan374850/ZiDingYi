package com.example.administrator.shijianfenfa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/10/9.
 * 创建一个数据库 来存储数据
 */

public class RecordSQLiteOpenHelper extends SQLiteOpenHelper {

    //数据库名字
    private static String name = "temp.db";
    //版本号
    private static Integer version = 1;
    public RecordSQLiteOpenHelper(Context context) {

        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // 打开数据库 & 建立了一个叫records的表，里面只有一列name来存储历史记录：
        sqLiteDatabase.execSQL("create table records(id integer primary key autoincrement,name varchar(200))");
    }

    //这个是版本更新的时候用到的
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
