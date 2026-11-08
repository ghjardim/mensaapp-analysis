package p054H4;

import java.util.Locale;
import p061I4.C0649a;
import p061I4.C0666r;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.k */
/* loaded from: classes.dex */
public class C0575k {

    /* renamed from: a */
    public b f1865a;

    /* renamed from: b */
    public b f1866b;

    /* renamed from: c */
    public boolean f1867c;

    /* renamed from: d */
    public final C0649a f1868d;

    /* renamed from: H4.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1869a;

        static {
            int[] iArr = new int[b.values().length];
            f1869a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1869a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1869a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1869a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1869a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: H4.k$b */
    public enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public C0575k(C7146a c7146a) {
        this(new C0649a(c7146a, "flutter/lifecycle", C0666r.f2272b));
    }

    /* renamed from: a */
    public void m2197a() {
        m2203g(this.f1865a, true);
    }

    /* renamed from: b */
    public void m2198b() {
        m2203g(b.DETACHED, this.f1867c);
    }

    /* renamed from: c */
    public void m2199c() {
        m2203g(b.INACTIVE, this.f1867c);
    }

    /* renamed from: d */
    public void m2200d() {
        m2203g(b.PAUSED, this.f1867c);
    }

    /* renamed from: e */
    public void m2201e() {
        m2203g(b.RESUMED, this.f1867c);
    }

    /* renamed from: f */
    public void m2202f() {
        m2203g(this.f1865a, false);
    }

    /* renamed from: g */
    public final void m2203g(b bVar, boolean z6) {
        b bVar2 = this.f1865a;
        if (bVar2 == bVar && z6 == this.f1867c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f1867c = z6;
            return;
        }
        int i7 = a.f1869a[bVar.ordinal()];
        b bVar3 = i7 != 1 ? (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? bVar : null : z6 ? b.RESUMED : b.INACTIVE;
        this.f1865a = bVar;
        this.f1867c = z6;
        if (bVar3 == this.f1866b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        AbstractC6917b.m28358f("LifecycleChannel", "Sending " + str + " message.");
        this.f1868d.m2612c(str);
        this.f1866b = bVar3;
    }

    public C0575k(C0649a c0649a) {
        this.f1865a = null;
        this.f1866b = null;
        this.f1867c = true;
        this.f1868d = c0649a;
    }
}
