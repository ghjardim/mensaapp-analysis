package p371w5;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: w5.d */
/* loaded from: classes2.dex */
public final class C6921d implements Comparable {

    /* renamed from: e */
    public static final a f24794e = new a(null);

    /* renamed from: f */
    public static final C6921d f24795f = C6922e.m28365a();

    /* renamed from: a */
    public final int f24796a;

    /* renamed from: b */
    public final int f24797b;

    /* renamed from: c */
    public final int f24798c;

    /* renamed from: d */
    public final int f24799d;

    /* renamed from: w5.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C6921d(int i7, int i8, int i9) {
        this.f24796a = i7;
        this.f24797b = i8;
        this.f24798c = i9;
        this.f24799d = m28364f(i7, i8, i9);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6921d other) {
        AbstractC5469l.m23028e(other, "other");
        return this.f24799d - other.f24799d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C6921d c6921d = obj instanceof C6921d ? (C6921d) obj : null;
        return c6921d != null && this.f24799d == c6921d.f24799d;
    }

    /* renamed from: f */
    public final int m28364f(int i7, int i8, int i9) {
        if (i7 >= 0 && i7 < 256 && i8 >= 0 && i8 < 256 && i9 >= 0 && i9 < 256) {
            return (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    public int hashCode() {
        return this.f24799d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24796a);
        sb.append('.');
        sb.append(this.f24797b);
        sb.append('.');
        sb.append(this.f24798c);
        return sb.toString();
    }
}
