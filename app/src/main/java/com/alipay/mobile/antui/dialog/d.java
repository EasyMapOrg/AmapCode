package com.alipay.mobile.antui.dialog;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: AUAuthorizeDialog */
final class d implements OnClickListener {
    final /* synthetic */ AUAuthorizeDialog a;

    d(AUAuthorizeDialog this$0) {
        this.a = this$0;
    }

    public final void onClick(View v) {
        if (this.a.mOnAuthListener != null) {
            this.a.mOnAuthListener.onCancel();
        }
        this.a.dismiss();
    }
}
