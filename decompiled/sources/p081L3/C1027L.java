package p081L3;

import java.util.ArrayList;
import p067J3.C0756m;
import p067J3.C0783z0;
import p088M3.C1170l;
import p376x3.C6950e;

/* renamed from: L3.L */
/* loaded from: classes.dex */
public final class C1027L {

    /* renamed from: a */
    public final int f3409a;

    /* renamed from: b */
    public final boolean f3410b;

    /* renamed from: c */
    public final C6950e f3411c;

    /* renamed from: d */
    public final C6950e f3412d;

    /* renamed from: L3.L$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3413a;

        static {
            int[] iArr = new int[C0756m.a.values().length];
            f3413a = iArr;
            try {
                iArr[C0756m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3413a[C0756m.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1027L(int i7, boolean z6, C6950e c6950e, C6950e c6950e2) {
        this.f3409a = i7;
        this.f3410b = z6;
        this.f3411c = c6950e;
        this.f3412d = c6950e2;
    }

    /* renamed from: a */
    public static C1027L m4050a(int i7, C0783z0 c0783z0) {
        C6950e c6950e = new C6950e(new ArrayList(), C1170l.m4494b());
        C6950e c6950e2 = new C6950e(new ArrayList(), C1170l.m4494b());
        for (C0756m c0756m : c0783z0.m3333d()) {
            int i8 = a.f3413a[c0756m.m3252c().ordinal()];
            if (i8 == 1) {
                c6950e = c6950e.m28471e(c0756m.m3251b().getKey());
            } else if (i8 == 2) {
                c6950e2 = c6950e2.m28471e(c0756m.m3251b().getKey());
            }
        }
        return new C1027L(i7, c0783z0.m3340k(), c6950e, c6950e2);
    }

    /* renamed from: b */
    public C6950e m4051b() {
        return this.f3411c;
    }

    /* renamed from: c */
    public C6950e m4052c() {
        return this.f3412d;
    }

    /* renamed from: d */
    public int m4053d() {
        return this.f3409a;
    }

    /* renamed from: e */
    public boolean m4054e() {
        return this.f3410b;
    }
}
