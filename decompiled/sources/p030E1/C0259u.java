package p030E1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: E1.u */
/* loaded from: classes.dex */
public class C0259u implements InterfaceC0260v {

    /* renamed from: a */
    public final ViewGroupOverlay f1087a;

    public C0259u(ViewGroup viewGroup) {
        this.f1087a = viewGroup.getOverlay();
    }

    @Override // p030E1.InterfaceC0264z
    /* renamed from: a */
    public void mo1086a(Drawable drawable) {
        this.f1087a.add(drawable);
    }

    @Override // p030E1.InterfaceC0264z
    /* renamed from: b */
    public void mo1087b(Drawable drawable) {
        this.f1087a.remove(drawable);
    }

    @Override // p030E1.InterfaceC0260v
    /* renamed from: c */
    public void mo1088c(View view) {
        this.f1087a.add(view);
    }

    @Override // p030E1.InterfaceC0260v
    /* renamed from: d */
    public void mo1089d(View view) {
        this.f1087a.remove(view);
    }
}
