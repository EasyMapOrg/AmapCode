package android.support.v4.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ResourcesCompat {
    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int i, @Nullable Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return ResourcesCompatApi21.a(resources, i, theme);
        }
        return resources.getDrawable(i);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int i, int i2, @Nullable Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return ResourcesCompatApi21.a(resources, i, i2, theme);
        }
        if (VERSION.SDK_INT >= 15) {
            return ResourcesCompatIcsMr1.a(resources, i, i2);
        }
        return resources.getDrawable(i);
    }

    @ColorInt
    public int getColor(@NonNull Resources resources, @ColorRes int i, @Nullable Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return ResourcesCompatApi23.a(resources, i, theme);
        }
        return resources.getColor(i);
    }

    @Nullable
    public ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i, @Nullable Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return ResourcesCompatApi23.b(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }
}
