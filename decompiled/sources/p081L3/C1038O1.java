package p081L3;

import com.google.protobuf.AbstractC4055i;
import p067J3.C0747h0;
import p088M3.C1181w;
import p116Q3.AbstractC2157z;
import p256j$.util.Objects;

/* renamed from: L3.O1 */
/* loaded from: classes.dex */
public final class C1038O1 {

    /* renamed from: a */
    public final C0747h0 f3431a;

    /* renamed from: b */
    public final int f3432b;

    /* renamed from: c */
    public final long f3433c;

    /* renamed from: d */
    public final EnumC1094l0 f3434d;

    /* renamed from: e */
    public final C1181w f3435e;

    /* renamed from: f */
    public final C1181w f3436f;

    /* renamed from: g */
    public final AbstractC4055i f3437g;

    /* renamed from: h */
    public final Integer f3438h;

    public C1038O1(C0747h0 c0747h0, int i7, long j7, EnumC1094l0 enumC1094l0, C1181w c1181w, C1181w c1181w2, AbstractC4055i abstractC4055i, Integer num) {
        this.f3431a = (C0747h0) AbstractC2157z.m7329b(c0747h0);
        this.f3432b = i7;
        this.f3433c = j7;
        this.f3436f = c1181w2;
        this.f3434d = enumC1094l0;
        this.f3435e = (C1181w) AbstractC2157z.m7329b(c1181w);
        this.f3437g = (AbstractC4055i) AbstractC2157z.m7329b(abstractC4055i);
        this.f3438h = num;
    }

    /* renamed from: a */
    public Integer m4112a() {
        return this.f3438h;
    }

    /* renamed from: b */
    public C1181w m4113b() {
        return this.f3436f;
    }

    /* renamed from: c */
    public EnumC1094l0 m4114c() {
        return this.f3434d;
    }

    /* renamed from: d */
    public AbstractC4055i m4115d() {
        return this.f3437g;
    }

    /* renamed from: e */
    public long m4116e() {
        return this.f3433c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1038O1.class != obj.getClass()) {
            return false;
        }
        C1038O1 c1038o1 = (C1038O1) obj;
        return this.f3431a.equals(c1038o1.f3431a) && this.f3432b == c1038o1.f3432b && this.f3433c == c1038o1.f3433c && this.f3434d.equals(c1038o1.f3434d) && this.f3435e.equals(c1038o1.f3435e) && this.f3436f.equals(c1038o1.f3436f) && this.f3437g.equals(c1038o1.f3437g) && Objects.equals(this.f3438h, c1038o1.f3438h);
    }

    /* renamed from: f */
    public C1181w m4117f() {
        return this.f3435e;
    }

    /* renamed from: g */
    public C0747h0 m4118g() {
        return this.f3431a;
    }

    /* renamed from: h */
    public int m4119h() {
        return this.f3432b;
    }

    public int hashCode() {
        return (((((((((((((this.f3431a.hashCode() * 31) + this.f3432b) * 31) + ((int) this.f3433c)) * 31) + this.f3434d.hashCode()) * 31) + this.f3435e.hashCode()) * 31) + this.f3436f.hashCode()) * 31) + this.f3437g.hashCode()) * 31) + Objects.hashCode(this.f3438h);
    }

    /* renamed from: i */
    public C1038O1 m4120i(Integer num) {
        return new C1038O1(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, this.f3436f, this.f3437g, num);
    }

    /* renamed from: j */
    public C1038O1 m4121j(C1181w c1181w) {
        return new C1038O1(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, c1181w, this.f3437g, this.f3438h);
    }

    /* renamed from: k */
    public C1038O1 m4122k(AbstractC4055i abstractC4055i, C1181w c1181w) {
        return new C1038O1(this.f3431a, this.f3432b, this.f3433c, this.f3434d, c1181w, this.f3436f, abstractC4055i, null);
    }

    /* renamed from: l */
    public C1038O1 m4123l(long j7) {
        return new C1038O1(this.f3431a, this.f3432b, j7, this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h);
    }

    public String toString() {
        return "TargetData{target=" + this.f3431a + ", targetId=" + this.f3432b + ", sequenceNumber=" + this.f3433c + ", purpose=" + this.f3434d + ", snapshotVersion=" + this.f3435e + ", lastLimboFreeSnapshotVersion=" + this.f3436f + ", resumeToken=" + this.f3437g + ", expectedCount=" + this.f3438h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1038O1(p067J3.C0747h0 r11, int r12, long r13, p081L3.EnumC1094l0 r15) {
        /*
            r10 = this;
            M3.w r7 = p088M3.C1181w.f3793b
            com.google.protobuf.i r8 = p109P3.C1922c0.f5790t
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p081L3.C1038O1.<init>(J3.h0, int, long, L3.l0):void");
    }
}
