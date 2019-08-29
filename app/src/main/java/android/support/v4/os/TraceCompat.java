package android.support.v4.os;

import android.os.Build.VERSION;

public class TraceCompat {
    public static void beginSection(String str) {
        if (VERSION.SDK_INT >= 18) {
            TraceJellybeanMR2.a(str);
        }
    }

    public static void endSection() {
        if (VERSION.SDK_INT >= 18) {
            TraceJellybeanMR2.a();
        }
    }
}
