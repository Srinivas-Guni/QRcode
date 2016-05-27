package app.webelement.com.myapplication.utilities;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by ADMIN on 5/27/16.
 */
public class Utility {

    public static void doVibrate(Context context) {
        Vibrator v = (Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
    }

}
