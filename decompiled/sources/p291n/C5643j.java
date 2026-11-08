package p291n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p070K.AbstractC0817f;
import p223f.AbstractC4224i;

/* renamed from: n.j */
/* loaded from: classes.dex */
public class C5643j extends PopupWindow {

    /* renamed from: b */
    public static final boolean f20462b = false;

    /* renamed from: a */
    public boolean f20463a;

    public C5643j(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        m23697a(context, attributeSet, i7, i8);
    }

    /* renamed from: a */
    public final void m23697a(Context context, AttributeSet attributeSet, int i7, int i8) {
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14411v1, i7, i8);
        if (m23637r.m23652o(AbstractC4224i.f14419x1)) {
            m23698b(m23637r.m23638a(AbstractC4224i.f14419x1, false));
        }
        setBackgroundDrawable(m23637r.m23643f(AbstractC4224i.f14415w1));
        m23637r.m23653s();
    }

    /* renamed from: b */
    public final void m23698b(boolean z6) {
        if (f20462b) {
            this.f20463a = z6;
        } else {
            AbstractC0817f.m3402a(this, z6);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8) {
        if (f20462b && this.f20463a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f20462b && this.f20463a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f20462b && this.f20463a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}
