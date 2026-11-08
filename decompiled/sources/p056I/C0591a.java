package p056I;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: I.a */
/* loaded from: classes.dex */
public final class C0591a extends ClickableSpan {

    /* renamed from: a */
    public final int f2092a;

    /* renamed from: b */
    public final C0612v f2093b;

    /* renamed from: c */
    public final int f2094c;

    public C0591a(int i7, C0612v c0612v, int i8) {
        this.f2092a = i7;
        this.f2093b = c0612v;
        this.f2094c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2092a);
        this.f2093b.m2432T(this.f2094c, bundle);
    }
}
