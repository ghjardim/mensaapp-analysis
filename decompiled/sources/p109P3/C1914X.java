package p109P3;

import com.google.protobuf.AbstractC4055i;
import p088M3.C1170l;
import p376x3.C6950e;

/* renamed from: P3.X */
/* loaded from: classes.dex */
public final class C1914X {

    /* renamed from: a */
    public final AbstractC4055i f5724a;

    /* renamed from: b */
    public final boolean f5725b;

    /* renamed from: c */
    public final C6950e f5726c;

    /* renamed from: d */
    public final C6950e f5727d;

    /* renamed from: e */
    public final C6950e f5728e;

    public C1914X(AbstractC4055i abstractC4055i, boolean z6, C6950e c6950e, C6950e c6950e2, C6950e c6950e3) {
        this.f5724a = abstractC4055i;
        this.f5725b = z6;
        this.f5726c = c6950e;
        this.f5727d = c6950e2;
        this.f5728e = c6950e3;
    }

    /* renamed from: a */
    public static C1914X m6755a(boolean z6, AbstractC4055i abstractC4055i) {
        return new C1914X(abstractC4055i, z6, C1170l.m4496h(), C1170l.m4496h(), C1170l.m4496h());
    }

    /* renamed from: b */
    public C6950e m6756b() {
        return this.f5726c;
    }

    /* renamed from: c */
    public C6950e m6757c() {
        return this.f5727d;
    }

    /* renamed from: d */
    public C6950e m6758d() {
        return this.f5728e;
    }

    /* renamed from: e */
    public AbstractC4055i m6759e() {
        return this.f5724a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1914X.class != obj.getClass()) {
            return false;
        }
        C1914X c1914x = (C1914X) obj;
        if (this.f5725b == c1914x.f5725b && this.f5724a.equals(c1914x.f5724a) && this.f5726c.equals(c1914x.f5726c) && this.f5727d.equals(c1914x.f5727d)) {
            return this.f5728e.equals(c1914x.f5728e);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m6760f() {
        return this.f5725b;
    }

    public int hashCode() {
        return (((((((this.f5724a.hashCode() * 31) + (this.f5725b ? 1 : 0)) * 31) + this.f5726c.hashCode()) * 31) + this.f5727d.hashCode()) * 31) + this.f5728e.hashCode();
    }
}
