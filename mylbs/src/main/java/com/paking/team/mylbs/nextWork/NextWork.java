package com.paking.team.mylbs.nextWork;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by fcsdev on 11/26/16.
 */

public class NextWork {
    public static Activity activity = null;

    public NextWork() {

    }

    public NextWork(Activity... activities) {
        activity = activities[0];
    }

    ConnectivityManager cm =
            (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);

    //}
    public static boolean isConnectNextWork(Activity... activities) {
        if (activities != null && activity == null)
            activity = activities[0];
        ConnectivityManager cm =
                (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();

        return networkInfo != null &&
                networkInfo.isConnectedOrConnecting();

    }

}
//    public static boolean isConnectNextWork() {
//        if (ContextCompat.checkSelfPermission(activity,
//                Manifest.permission.READ_CONTACTS)
//                != PackageManager.PERMISSION_GRANTED) {
//
//            // Should we show an explanation?
//            if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
//                    Manifest.permission.READ_CONTACTS)) {
//
//                // Show an explanation to the user *asynchronously* -- don't block
//                // this thread waiting for the user's response! After the user
//                // sees the explanation, try again to request the permission.
//
//            } else {
//
//                // No explanation needed, we can request the permission.
//
//                ActivityCompat.requestPermissions(activity,
//                        new String[]{Manifest.permission.READ_CONTACTS},
//                        Manifest.permission.MY_PERMISSIONS_REQUEST_READ_CONTACTS);
//
//                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
//                // app-defined int constant. The callback method gets the
//                // result of the request.
//            }
//            return false;
//        }
//
//
//    }
