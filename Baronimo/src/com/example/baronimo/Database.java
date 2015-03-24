/**
 * Package for databases
 */
package com.example.baronimo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * @author 40033364 This class will hold the databases we need for the app...
 */
public class Database extends SQLiteOpenHelper {

	public static final String TABLE_BARS = "Bars";
	public static final String COLUMN_BAR_ID= "_id";
	public static final String COLUMN_BAR_NAME = "Name";
	public static final String COLUMN_BAR_LONG = "Longitude";
	public static final String COLUMN_BAR_LAT = "Latitude";

	private static final String DATABASE_NAME = "Bars.db";
	private static final int DATABASE_VERSION = 1;

	public Database(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	  // Database creation sql statement
	  private static final String DATABASE_CREATE = "create table "
	      + TABLE_BARS + "(" + COLUMN_BAR_ID
	      + " integer primary key autoincrement, " + COLUMN_BAR_NAME
	      + " text not null), " + COLUMN_BAR_LONG + " real, "  + COLUMN_BAR_LAT + " real;";
	  
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
