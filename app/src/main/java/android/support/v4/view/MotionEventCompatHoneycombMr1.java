package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompatHoneycombMr1 {
    MotionEventCompatHoneycombMr1() {
    }

    static float a(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    static float a(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }
}
