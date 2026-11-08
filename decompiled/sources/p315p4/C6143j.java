package p315p4;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC5469l;
import p061I4.C0659k;

/* renamed from: p4.j */
/* loaded from: classes.dex */
public final class C6143j implements C0659k.d {

    /* renamed from: a */
    public final C0659k.d f21936a;

    /* renamed from: b */
    public final Handler f21937b;

    public C6143j(C0659k.d methodResult) {
        AbstractC5469l.m23028e(methodResult, "methodResult");
        this.f21936a = methodResult;
        this.f21937b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: g */
    public static final void m25602g(C6143j c6143j, String str, String str2, Object obj) {
        c6143j.f21936a.mo2315b(str, str2, obj);
    }

    /* renamed from: h */
    public static final void m25603h(C6143j c6143j) {
        c6143j.f21936a.mo2316c();
    }

    /* renamed from: i */
    public static final void m25604i(C6143j c6143j, Object obj) {
        c6143j.f21936a.mo2314a(obj);
    }

    @Override // p061I4.C0659k.d
    /* renamed from: a */
    public void mo2314a(final Object obj) {
        this.f21937b.post(new Runnable() { // from class: p4.h
            @Override // java.lang.Runnable
            public final void run() {
                C6143j.m25604i(C6143j.this, obj);
            }
        });
    }

    @Override // p061I4.C0659k.d
    /* renamed from: b */
    public void mo2315b(final String errorCode, final String str, final Object obj) {
        AbstractC5469l.m23028e(errorCode, "errorCode");
        this.f21937b.post(new Runnable() { // from class: p4.g
            @Override // java.lang.Runnable
            public final void run() {
                C6143j.m25602g(C6143j.this, errorCode, str, obj);
            }
        });
    }

    @Override // p061I4.C0659k.d
    /* renamed from: c */
    public void mo2316c() {
        this.f21937b.post(new Runnable() { // from class: p4.i
            @Override // java.lang.Runnable
            public final void run() {
                C6143j.m25603h(C6143j.this);
            }
        });
    }
}
