package p232g0;

import android.media.AudioAttributes;
import p259j0.AbstractC5330M;

/* renamed from: g0.b */
/* loaded from: classes.dex */
public final class C4312b {

    /* renamed from: g */
    public static final C4312b f15006g = new e().m18126a();

    /* renamed from: h */
    public static final String f15007h = AbstractC5330M.m21783x0(0);

    /* renamed from: i */
    public static final String f15008i = AbstractC5330M.m21783x0(1);

    /* renamed from: j */
    public static final String f15009j = AbstractC5330M.m21783x0(2);

    /* renamed from: k */
    public static final String f15010k = AbstractC5330M.m21783x0(3);

    /* renamed from: l */
    public static final String f15011l = AbstractC5330M.m21783x0(4);

    /* renamed from: a */
    public final int f15012a;

    /* renamed from: b */
    public final int f15013b;

    /* renamed from: c */
    public final int f15014c;

    /* renamed from: d */
    public final int f15015d;

    /* renamed from: e */
    public final int f15016e;

    /* renamed from: f */
    public d f15017f;

    /* renamed from: g0.b$b */
    public static final class b {
        /* renamed from: a */
        public static void m18124a(AudioAttributes.Builder builder, int i7) {
            builder.setAllowedCapturePolicy(i7);
        }
    }

    /* renamed from: g0.b$c */
    public static final class c {
        /* renamed from: a */
        public static void m18125a(AudioAttributes.Builder builder, int i7) {
            builder.setSpatializationBehavior(i7);
        }
    }

    /* renamed from: g0.b$d */
    public static final class d {

        /* renamed from: a */
        public final AudioAttributes f15018a;

        public d(C4312b c4312b) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c4312b.f15012a).setFlags(c4312b.f15013b).setUsage(c4312b.f15014c);
            int i7 = AbstractC5330M.f18800a;
            if (i7 >= 29) {
                b.m18124a(usage, c4312b.f15015d);
            }
            if (i7 >= 32) {
                c.m18125a(usage, c4312b.f15016e);
            }
            this.f15018a = usage.build();
        }
    }

    /* renamed from: g0.b$e */
    public static final class e {

        /* renamed from: a */
        public int f15019a = 0;

        /* renamed from: b */
        public int f15020b = 0;

        /* renamed from: c */
        public int f15021c = 1;

        /* renamed from: d */
        public int f15022d = 1;

        /* renamed from: e */
        public int f15023e = 0;

        /* renamed from: a */
        public C4312b m18126a() {
            return new C4312b(this.f15019a, this.f15020b, this.f15021c, this.f15022d, this.f15023e);
        }

        /* renamed from: b */
        public e m18127b(int i7) {
            this.f15019a = i7;
            return this;
        }
    }

    /* renamed from: a */
    public d m18123a() {
        if (this.f15017f == null) {
            this.f15017f = new d();
        }
        return this.f15017f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4312b.class != obj.getClass()) {
            return false;
        }
        C4312b c4312b = (C4312b) obj;
        return this.f15012a == c4312b.f15012a && this.f15013b == c4312b.f15013b && this.f15014c == c4312b.f15014c && this.f15015d == c4312b.f15015d && this.f15016e == c4312b.f15016e;
    }

    public int hashCode() {
        return ((((((((527 + this.f15012a) * 31) + this.f15013b) * 31) + this.f15014c) * 31) + this.f15015d) * 31) + this.f15016e;
    }

    public C4312b(int i7, int i8, int i9, int i10, int i11) {
        this.f15012a = i7;
        this.f15013b = i8;
        this.f15014c = i9;
        this.f15015d = i10;
        this.f15016e = i11;
    }
}
