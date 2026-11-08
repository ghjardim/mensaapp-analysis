package io.flutter.plugin.editing;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p054H4.C0585u;

/* renamed from: io.flutter.plugin.editing.r */
/* loaded from: classes.dex */
public class C4717r implements C0585u.b {

    /* renamed from: a */
    public final C0585u f17488a;

    /* renamed from: b */
    public final InputMethodManager f17489b;

    /* renamed from: c */
    public View f17490c;

    public C4717r(View view, InputMethodManager inputMethodManager, C0585u c0585u) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f17490c = view;
        this.f17489b = inputMethodManager;
        this.f17488a = c0585u;
        c0585u.m2323g(this);
    }

    @Override // p054H4.C0585u.b
    /* renamed from: a */
    public void mo2325a() {
        this.f17489b.startStylusHandwriting(this.f17490c);
    }

    @Override // p054H4.C0585u.b
    /* renamed from: b */
    public boolean mo2326b() {
        boolean isStylusHandwritingAvailable;
        isStylusHandwritingAvailable = this.f17489b.isStylusHandwritingAvailable();
        return isStylusHandwritingAvailable;
    }

    @Override // p054H4.C0585u.b
    /* renamed from: c */
    public boolean mo2327c() {
        return Build.VERSION.SDK_INT >= 34 && mo2326b();
    }
}
