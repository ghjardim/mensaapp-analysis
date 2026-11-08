package p386z;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: z.b */
/* loaded from: classes.dex */
public final class C7087b {

    /* renamed from: e */
    public static final C7087b f25178e = new C7087b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f25179a;

    /* renamed from: b */
    public final int f25180b;

    /* renamed from: c */
    public final int f25181c;

    /* renamed from: d */
    public final int f25182d;

    /* renamed from: z.b$a */
    public static class a {
        /* renamed from: a */
        public static Insets m29197a(int i7, int i8, int i9, int i10) {
            return Insets.of(i7, i8, i9, i10);
        }
    }

    public C7087b(int i7, int i8, int i9, int i10) {
        this.f25179a = i7;
        this.f25180b = i8;
        this.f25181c = i9;
        this.f25182d = i10;
    }

    /* renamed from: a */
    public static C7087b m29192a(C7087b c7087b, C7087b c7087b2) {
        return m29193b(Math.max(c7087b.f25179a, c7087b2.f25179a), Math.max(c7087b.f25180b, c7087b2.f25180b), Math.max(c7087b.f25181c, c7087b2.f25181c), Math.max(c7087b.f25182d, c7087b2.f25182d));
    }

    /* renamed from: b */
    public static C7087b m29193b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f25178e : new C7087b(i7, i8, i9, i10);
    }

    /* renamed from: c */
    public static C7087b m29194c(Rect rect) {
        return m29193b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C7087b m29195d(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return m29193b(i7, i8, i9, i10);
    }

    /* renamed from: e */
    public Insets m29196e() {
        return a.m29197a(this.f25179a, this.f25180b, this.f25181c, this.f25182d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7087b.class != obj.getClass()) {
            return false;
        }
        C7087b c7087b = (C7087b) obj;
        return this.f25182d == c7087b.f25182d && this.f25179a == c7087b.f25179a && this.f25181c == c7087b.f25181c && this.f25180b == c7087b.f25180b;
    }

    public int hashCode() {
        return (((((this.f25179a * 31) + this.f25180b) * 31) + this.f25181c) * 31) + this.f25182d;
    }

    public String toString() {
        return "Insets{left=" + this.f25179a + ", top=" + this.f25180b + ", right=" + this.f25181c + ", bottom=" + this.f25182d + '}';
    }
}
