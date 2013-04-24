package com.shakingearthdigital.logutil;

import android.util.Log;



public class LogUtil {

	/**
	 * Turn debugging on or off
	 */
	private static final boolean DEBUG = true;
	
	/**
	 * Tag to be used for static calls
	 */
	private static final String sTAG = "LogUtil";
	
	private String TAG = sTAG;
	
	
	public LogUtil(String tag){
		TAG = tag;
	}
	
	public void d(String log){
		if (DEBUG){
			Log.d(TAG,log);
		}
	}
	
	public void w(String log){
		if (DEBUG){
			Log.w(TAG,log);
		}
	}
	
	public void e(String log){
		if (DEBUG){
			Log.e(TAG,log);
		}
	}
	
	public void e(String log, Throwable tr){
		if (DEBUG){
			Log.e(TAG,log, tr);
		}
	}
	
	public static void log(String log){
		if (DEBUG){
			Log.d(sTAG,log);
		}
	}
	
	public static void logW(String log){
		if (DEBUG){
			Log.w(sTAG,log);
		}
	}
	
	public static void logW(String log, Throwable tr){
		if (DEBUG){
			Log.w(sTAG, log, tr);
		}
	}
	
	public static void logE(String log){
		if (DEBUG){
			Log.e(sTAG,log);
		}
	}
	
	public static void logE(String log, Throwable tr){
		if (DEBUG){
			Log.e(sTAG,log,tr);
		}
	}
}
