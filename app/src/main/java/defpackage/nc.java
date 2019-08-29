package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.amap.bundle.drive.common.dialog.nightmode.widget.NightModeImageButton;
import com.autonavi.minimap.R;

/* renamed from: nc reason: default package */
/* compiled from: NightModeImageButtonAttrsWrapper */
public final class nc extends my<NightModeImageButton> {
    public nc(Context context, AttributeSet attributeSet, int i, NightModeImageButton nightModeImageButton) {
        super(context, attributeSet, i, nightModeImageButton);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, AttributeSet attributeSet, int i) {
        super.a(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.NightMode, i, 0);
        this.b = obtainStyledAttributes.getResourceId(R.styleable.NightMode_dayModeSrc, -1);
        this.c = obtainStyledAttributes.getResourceId(R.styleable.NightMode_nightModeSrc, -1);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        super.a(z);
        if (this.b <= 0 || z) {
            if (this.c > 0 && z) {
                ((NightModeImageButton) this.a).setImageResource(this.c);
            }
            return;
        }
        ((NightModeImageButton) this.a).setImageResource(this.b);
    }

    public final void b(int i, int i2) {
        if (i != this.b || i2 != this.c) {
            this.b = i;
            this.c = i2;
            a(this.h);
        }
    }
}
