package p031E2;

import android.os.SystemClock;

/* renamed from: E2.g */
/* loaded from: classes.dex */
public class C0271g implements InterfaceC0268d {

    /* renamed from: a */
    public static final C0271g f1091a = new C0271g();

    /* renamed from: d */
    public static InterfaceC0268d m1116d() {
        return f1091a;
    }

    @Override // p031E2.InterfaceC0268d
    /* renamed from: a */
    public final long mo1110a() {
        return System.currentTimeMillis();
    }

    @Override // p031E2.InterfaceC0268d
    /* renamed from: b */
    public final long mo1111b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p031E2.InterfaceC0268d
    /* renamed from: c */
    public final long mo1112c() {
        return System.nanoTime();
    }
}
