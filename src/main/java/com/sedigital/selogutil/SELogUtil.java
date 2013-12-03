package com.sedigital.selogutil;

/**
 * Copyright (C) <2013>  <Shaking Earth Digital>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 */

import android.util.Log;

public class SELogUtil {

    /**
     * Turn debugging on or off
     */
    private static final boolean DEBUG = true;

    /**
     * Tag to be used for static calls
     */
    private static final String sTAG = "LogUtil";

    private String TAG = sTAG;


    public SELogUtil(String tag){
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