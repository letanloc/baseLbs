package com.paking.team.mylbs.notification;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by fcsdev on 11/26/16.
 */

public class L {
    private static String defaulTitle = "LOG";

    public static void e(String message) {
        Log.e(defaulTitle, message);
    }

    public static void e(String title, String message) {
        Log.e(title, message);
    }

    public static void d(String message) {
        Log.d(defaulTitle, message);
    }

    public static void d(String title, String message) {
        Log.d(title, message);
    }

    public static void LToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    public static void sToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
