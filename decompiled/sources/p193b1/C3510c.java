package p193b1;

import java.nio.ByteBuffer;
import p141U0.AbstractC2501c;
import p141U0.C2500b;
import p232g0.C4334x;
import p259j0.C5322E;
import p259j0.C5356y;
import p259j0.C5357z;

/* renamed from: b1.c */
/* loaded from: classes.dex */
public final class C3510c extends AbstractC2501c {

    /* renamed from: a */
    public final C5357z f11777a = new C5357z();

    /* renamed from: b */
    public final C5356y f11778b = new C5356y();

    /* renamed from: c */
    public C5322E f11779c;

    @Override // p141U0.AbstractC2501c
    /* renamed from: b */
    public C4334x mo8457b(C2500b c2500b, ByteBuffer byteBuffer) {
        C5322E c5322e = this.f11779c;
        if (c5322e == null || c2500b.f7337q != c5322e.m21655f()) {
            C5322E c5322e2 = new C5322E(c2500b.f20079f);
            this.f11779c = c5322e2;
            c5322e2.m21650a(c2500b.f20079f - c2500b.f7337q);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f11777a.m21937R(array, limit);
        this.f11778b.m21915o(array, limit);
        this.f11778b.m21918r(39);
        long m21908h = (this.f11778b.m21908h(1) << 32) | this.f11778b.m21908h(32);
        this.f11778b.m21918r(20);
        int m21908h2 = this.f11778b.m21908h(12);
        int m21908h3 = this.f11778b.m21908h(8);
        this.f11777a.m21940U(14);
        C4334x.b m14109a = m21908h3 != 0 ? m21908h3 != 255 ? m21908h3 != 4 ? m21908h3 != 5 ? m21908h3 != 6 ? null : C3514g.m14109a(this.f11777a, m21908h, this.f11779c) : C3511d.m14089a(this.f11777a, m21908h, this.f11779c) : C3513f.m14096a(this.f11777a) : C3508a.m14086a(this.f11777a, m21908h2, m21908h) : new C3512e();
        return m14109a == null ? new C4334x(new C4334x.b[0]) : new C4334x(m14109a);
    }
}
