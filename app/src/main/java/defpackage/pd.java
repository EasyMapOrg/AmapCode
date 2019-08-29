package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.amap.bundle.drive.navi.drivenavi.normal.page.AjxRouteCarNaviPage;
import com.amap.bundle.drive.result.driveresult.result.AjxRouteTruckResultPage;
import com.amap.bundle.drive.result.view.DriveRecommendView;
import com.amap.bundle.drivecommon.tools.DriveUtil;
import com.autonavi.bundle.routecommon.inter.IRouteUI;
import com.autonavi.bundle.routecommon.inter.IRouteUI.ContainerType;
import com.autonavi.bundle.uitemplate.mapwidget.IMapWidgetManager.Stub;
import com.autonavi.bundle.uitemplate.mapwidget.inter.IMapWidget;
import com.autonavi.bundle.uitemplate.mapwidget.inter.WidgetType;
import com.autonavi.bundle.uitemplate.mapwidget.widget.BaseMapWidgetPresenter;
import com.autonavi.map.fragmentcontainer.page.utils.AMapPageUtil;
import com.autonavi.minimap.R;

/* renamed from: pd reason: default package */
/* compiled from: TruckMapWidgetHelper */
public final class pd {
    AjxRouteTruckResultPage a;
    public boolean b = false;
    DriveRecommendView c;
    public Context d;
    qb e;
    ContainerType[] f = null;
    public View g = null;
    private ox h;

    public pd(AjxRouteTruckResultPage ajxRouteTruckResultPage, qb qbVar) {
        this.a = ajxRouteTruckResultPage;
        this.h = (ox) ajxRouteTruckResultPage.getPresenter();
        this.e = qbVar;
        this.d = this.a.getContext();
    }

    public final void a() {
        if (this.b) {
            this.c.hideRecommendViewAnim(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    pd.this.c.post(new Runnable() {
                        public final void run() {
                            IRouteUI b = pd.this.e.b();
                            if (b != null) {
                                b.b((View) pd.this.c);
                                if (pd.this.f != null) {
                                    b.a(pd.this.f);
                                    pd.this.f = null;
                                }
                            }
                            pd.this.c = null;
                        }
                    });
                }
            });
            this.e.e();
            if (this.c != null && this.c.selectedHasChange()) {
                new pf(this.e).i = "planresult_preference";
                if (!AMapPageUtil.getTopPageClass().equals(AjxRouteCarNaviPage.class)) {
                    this.h.b();
                }
            }
            this.b = false;
            if (this.g != null) {
                TextView textView = (TextView) this.g.findViewById(R.id.recommend_tv);
                if (textView != null) {
                    textView.setText(DriveUtil.getChoiceString(DriveUtil.getTruckRoutingChoice(), 1));
                }
            }
        }
    }

    public static void a(int i) {
        BaseMapWidgetPresenter baseMapWidgetPresenter = (BaseMapWidgetPresenter) Stub.getMapWidgetManager().getPresenter(WidgetType.PATHTIPSENTERVIEW);
        if (baseMapWidgetPresenter != null) {
            IMapWidget widget = baseMapWidgetPresenter.getWidget();
            if (widget != null) {
                View contentView = widget.getContentView();
                if (contentView != null) {
                    contentView.setVisibility(i);
                }
            }
        }
    }
}
