package com.example.project_doctor_dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class PatientDB extends SQLiteOpenHelper{
	private final static String DATABASE_NAME = "patientdata.db";
	private final static int DATABASE_VERSION = 1;
	//创建的表格名
	private final static String TABLE_NAME = "patient_table";
	private final static String TABLE_NAME02 = "test_table";
	private final static String TABLE_NAME03 = "sleepdiary_day";
	private final static String TABLE_NAME04 = "doctor_advice";
//	private final static String TABLE_NAME05 = "hamd_table";
//	private final static String TABLE_NAME06 = "sleepdiary_table";
	
	//一般信息参数
	public final static String PATIENT_ID = "id";
	public final static String CURRENT_DATE = "current_date";
	public final static String PATIENT_NAME = "patient_name";
	public final static String PATIENT_GENDER = "patient_gender";
	public final static String PATIENT_AGE = "patient_age";
	public final static String PATIENT_POSITION = "patient_postion";
	//文化程度
	public final static String PATIENT_SCDE = "patient_scde";
	//失眠时间
	public final static String PATIENT_INSOMNIA = "patient_insomnia";
	//病史
	public final static String PATIENT_MHISTORY = "patient_mhistory";
	public final static String PATIENT_HPONE = "patient_phone";
	public final static String PATIENT_HAMD = "patient_hamd";
	
	//测试参数
	public final static String PQSI = "pqsi";
	public final static String Sleepness = "sleepness";
	public final static String HAMA = "hama";
	public final static String HAMD = "hamd";
	public final static String ISI = "isi";
	
	//睡眠日记参数
	public final static String DAY01 = "day01";
	public final static String DAY02 = "day02";
	public final static String DAY03 = "day03";
	public final static String DAY04 = "day04";
	public final static String DAY05 = "day05";
	public final static String DAY06 = "day06";
	public final static String DAY07 = "day07";
	
	//医嘱信息
	public final static String DOCTORADVICE = "advice";

	
	public PatientDB(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	//创建表格
	@Override
	public void onCreate(SQLiteDatabase db) {
		//创建病人信息表
		String sql = "CREATE TABLE " + TABLE_NAME + " (" + PATIENT_ID + 
				" INTEGER primary key autoincrement, " + CURRENT_DATE + " text, "+ PATIENT_NAME + " text, " + PATIENT_GENDER + " text, " 
				+ PATIENT_AGE + " text, "+ PATIENT_POSITION + " text, "
				+ PATIENT_SCDE + " text, " + PATIENT_INSOMNIA + " text, " + PATIENT_MHISTORY + " text, " +PATIENT_HPONE +  " text);";
		Log.v("sql", sql);
		System.out.println("sql---" + sql);
		//创建测试表
	//	db.execSQL("CREATE TABLE  %1(id integer primary key autoincrement, pqsi varchar(30), sleepness varchar(30),hama varchar(30), hamd varchar(30))");
		db.execSQL(sql);
//		//创建测试表
		String sql02 = "CREATE TABLE " + TABLE_NAME02 + " (" + PATIENT_ID + " INTEGER primary key autoincrement, " + PQSI + " text, "+ Sleepness + " text, " + HAMA + " text, " 
				+ HAMD +" text, " + PATIENT_HPONE +  " text);";
		db.execSQL(sql02);
		//创建睡眠日记评估表
		String sql03 = "CREATE TABLE " + TABLE_NAME03 + " (" + PATIENT_ID + " INTEGER primary key autoincrement, " + PATIENT_HPONE + " text, "+DAY01 + " text, "+ DAY02 + " text, " + DAY03 + " text, " 
				+ DAY04 + " text, "+ DAY05 + " text, "+ DAY06 + " text, " + DAY07 +" text);";
		db.execSQL(sql03);
		//创建睡眠日记评估表
		String sql04 = "CREATE TABLE " + TABLE_NAME04 + " (" + PATIENT_ID + " INTEGER primary key autoincrement, " + PATIENT_HPONE + " text, "+ DOCTORADVICE +" text);";
		db.execSQL(sql04);
//		//创建心理评估一表
//		String sql04 = "CREATE TABLE " + TABLE_NAME04 + " (" + PATIENT_ID + " INTEGER primary key autoincrement, " + HAMA_1 + " text, "+ HAMA_2 + " text, " + HAMA_3 + " text, " 
//				+ HAMA_4 + " text, "+ HAMA_5 + " text, "+ HAMA_6 + " text, " + HAMA_7 + " text, " + HAMA_8 + " text, " + HAMA_9 + 
//				" text, " +HAMA_10 + " text, " + HAMA_11 +" text, " + HAMA_12 + " text, " + HAMA_13 +" text, "  + HAMA_14 + " text, "  + HAMA_SCORE +
//				" text);";
//		db.execSQL(sql04);
//		//创建心理评估二表
//		String sql05 = "CREATE TABLE " + TABLE_NAME05 + " (" + PATIENT_ID + " INTEGER primary key autoincrement, " + HAMD_1 + " text, "+ HAMD_2 + " text, " + HAMD_3 + " text, " 
//				+ HAMD_4 + " text, "+ HAMD_5 + " text, "+ HAMD_6 + " text, " + HAMD_7 + " text, " + HAMD_8 + " text, " + HAMD_9 + 
//				" text, " +HAMD_10 + " text, " + HAMD_11 +" text, " + HAMD_12 + " text, " + HAMD_13 +" text, "  + HAMD_14 + " text, "  + HAMD_15 +" text, "  + HAMD_16  +" text, " 
//				+ HAMD_17  +" text, "+ HAMD_SCORE +
//				" text);";
//		db.execSQL(sql05);
//		//创建睡眠日记表
//		String sql06 = "CREATE TABLE " + TABLE_NAME06 + " (" + PATIENT_ID + " INTEGER primary key autoincrement, " + DAY + " text, "+ QUESTION_1 + " text, "+ QUESTION_2 + " text, " + QUESTION_3 + " text, " 
//				+ QUESTION_4 + " text, "+ QUESTION_5 + " text, "+ QUESTION_6 + " text, " + QUESTION_7 + " text, " + QUESTION_8 + " text, " + QUESTION_9 + 
//				" text, " +QUESTION_10 + 
//				" text);";
//		db.execSQL(sql06);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//删除旧版表格
		//String sql = "DROP TABLE IF EXISTS " + TABLE_NAME;
		//db.execSQL(sql);
		//onCreate(db);
	}
}
