package p253i5;

import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;

/* renamed from: i5.w0 */
/* loaded from: classes2.dex */
public final class C4639w0 extends AbstractC4417S.g {

    /* renamed from: a */
    public final C4429c f17276a;

    /* renamed from: b */
    public final C4424Z f17277b;

    /* renamed from: c */
    public final C4426a0 f17278c;

    public C4639w0(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c) {
        this.f17278c = (C4426a0) AbstractC2932o.m10573p(c4426a0, "method");
        this.f17277b = (C4424Z) AbstractC2932o.m10573p(c4424z, "headers");
        this.f17276a = (C4429c) AbstractC2932o.m10573p(c4429c, "callOptions");
    }

    @Override // p237g5.AbstractC4417S.g
    /* renamed from: a */
    public C4429c mo18713a() {
        return this.f17276a;
    }

    @Override // p237g5.AbstractC4417S.g
    /* renamed from: b */
    public C4424Z mo18714b() {
        return this.f17277b;
    }

    @Override // p237g5.AbstractC4417S.g
    /* renamed from: c */
    public C4426a0 mo18715c() {
        return this.f17278c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4639w0.class != obj.getClass()) {
            return false;
        }
        C4639w0 c4639w0 = (C4639w0) obj;
        return AbstractC2928k.m10550a(this.f17276a, c4639w0.f17276a) && AbstractC2928k.m10550a(this.f17277b, c4639w0.f17277b) && AbstractC2928k.m10550a(this.f17278c, c4639w0.f17278c);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f17276a, this.f17277b, this.f17278c);
    }

    public final String toString() {
        return "[method=" + this.f17278c + " headers=" + this.f17277b + " callOptions=" + this.f17276a + "]";
    }
}
