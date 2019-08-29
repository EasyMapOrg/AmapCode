package com.alipay.mobile.beehive.cityselect.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.alipay.mobile.antui.basic.AUTitleBar;
import com.alipay.mobile.beehive.R;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SelectCityActivity_ extends SelectCityActivity implements HasViews, OnViewChangedListener {
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public final void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(this.onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(R.layout.activity_city_select);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    public final void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        this.onViewChangedNotifier_.notifyViewChanged(this);
    }

    public final void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        this.onViewChangedNotifier_.notifyViewChanged(this);
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        this.onViewChangedNotifier_.notifyViewChanged(this);
    }

    public final void onViewChanged(HasViews hasViews) {
        this.root = (ViewGroup) hasViews.findViewById(16908290);
        this.mTitleBar = (AUTitleBar) hasViews.findViewById(R.id.titleBar);
        afterViews();
    }
}
