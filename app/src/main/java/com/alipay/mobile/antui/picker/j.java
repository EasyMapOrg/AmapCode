package com.alipay.mobile.antui.picker;

import com.alipay.mobile.antui.picker.AUWheelView.OnWheelViewListener;

/* compiled from: AUDatePickerView */
final class j implements OnWheelViewListener {
    final /* synthetic */ AUDatePickerView a;

    j(AUDatePickerView this$0) {
        this.a = this$0;
    }

    public final void onSelected(boolean isUserScroll, int selectedIndex, String item) {
        this.a.selectedMonthIndex = selectedIndex;
        this.a.handleChangeByMinMaxDate(false, true, false, false);
        this.a.onDatePickChange();
    }
}
