package p030E1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: E1.y */
/* loaded from: classes.dex */
public class C0263y implements InterfaceC0264z {

    /* renamed from: a */
    public final ViewOverlay f1089a;

    public C0263y(View view) {
        this.f1089a = view.getOverlay();
    }

    @Override // p030E1.InterfaceC0264z
    /* renamed from: a */
    public void mo1086a(Drawable drawable) {
        this.f1089a.add(drawable);
    }

    @Override // p030E1.InterfaceC0264z
    /* renamed from: b */
    public void mo1087b(Drawable drawable) {
        this.f1089a.remove(drawable);
    }
}
