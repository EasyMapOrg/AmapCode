package android.support.v4.widget;

import android.widget.OverScroller;

class ScrollerCompatIcs {
    ScrollerCompatIcs() {
    }

    public static float a(Object obj) {
        return ((OverScroller) obj).getCurrVelocity();
    }
}
