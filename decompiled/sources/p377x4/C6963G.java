package p377x4;

import android.view.KeyEvent;
import p054H4.C0573i;
import p377x4.C6969M;

/* renamed from: x4.G */
/* loaded from: classes.dex */
public class C6963G implements C6969M.d {

    /* renamed from: a */
    public final C0573i f24924a;

    /* renamed from: b */
    public final C6969M.b f24925b = new C6969M.b();

    public C6963G(C0573i c0573i) {
        this.f24924a = c0573i;
    }

    @Override // p377x4.C6969M.d
    /* renamed from: a */
    public void mo28540a(KeyEvent keyEvent, final C6969M.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f24924a.m2192e(new C0573i.b(keyEvent, this.f24925b.m28566a(keyEvent.getUnicodeChar())), action != 0, new C0573i.a() { // from class: x4.F
                @Override // p054H4.C0573i.a
                /* renamed from: a */
                public final void mo2193a(boolean z6) {
                    C6969M.d.a.this.mo28568a(z6);
                }
            });
        } else {
            aVar.mo28568a(false);
        }
    }
}
