package p067J3;

import com.google.firebase.firestore.C3952f;
import java.util.concurrent.Executor;
import p046G3.InterfaceC0447r;

/* renamed from: J3.h */
/* loaded from: classes.dex */
public class C0746h implements InterfaceC0447r {

    /* renamed from: a */
    public final Executor f2628a;

    /* renamed from: b */
    public final InterfaceC0447r f2629b;

    /* renamed from: c */
    public volatile boolean f2630c = false;

    public C0746h(Executor executor, InterfaceC0447r interfaceC0447r) {
        this.f2628a = executor;
        this.f2629b = interfaceC0447r;
    }

    @Override // p046G3.InterfaceC0447r
    /* renamed from: a */
    public void mo1589a(final Object obj, final C3952f c3952f) {
        this.f2628a.execute(new Runnable() { // from class: J3.g
            @Override // java.lang.Runnable
            public final void run() {
                C0746h.this.m3177c(obj, c3952f);
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ void m3177c(Object obj, C3952f c3952f) {
        if (this.f2630c) {
            return;
        }
        this.f2629b.mo1589a(obj, c3952f);
    }

    /* renamed from: d */
    public void m3178d() {
        this.f2630c = true;
    }
}
