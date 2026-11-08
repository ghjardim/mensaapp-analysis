package p049H;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: H.u */
/* loaded from: classes.dex */
public class C0526u {

    /* renamed from: a */
    public int f1714a;

    /* renamed from: b */
    public int f1715b;

    public C0526u(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m2021a() {
        return this.f1714a | this.f1715b;
    }

    /* renamed from: b */
    public void m2022b(View view, View view2, int i7) {
        m2023c(view, view2, i7, 0);
    }

    /* renamed from: c */
    public void m2023c(View view, View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f1715b = i7;
        } else {
            this.f1714a = i7;
        }
    }

    /* renamed from: d */
    public void m2024d(View view, int i7) {
        if (i7 == 1) {
            this.f1715b = 0;
        } else {
            this.f1714a = 0;
        }
    }
}
