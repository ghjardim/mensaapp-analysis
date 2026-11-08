package p074K3;

import java.util.Arrays;
import p088M3.C1170l;

/* renamed from: K3.a */
/* loaded from: classes.dex */
public final class C0826a extends AbstractC0830e {

    /* renamed from: a */
    public final int f2855a;

    /* renamed from: b */
    public final C1170l f2856b;

    /* renamed from: c */
    public final byte[] f2857c;

    /* renamed from: d */
    public final byte[] f2858d;

    public C0826a(int i7, C1170l c1170l, byte[] bArr, byte[] bArr2) {
        this.f2855a = i7;
        if (c1170l == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f2856b = c1170l;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f2857c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f2858d = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0830e)) {
            return false;
        }
        AbstractC0830e abstractC0830e = (AbstractC0830e) obj;
        if (this.f2855a == abstractC0830e.mo3447j() && this.f2856b.equals(abstractC0830e.mo3446i())) {
            boolean z6 = abstractC0830e instanceof C0826a;
            if (Arrays.equals(this.f2857c, z6 ? ((C0826a) abstractC0830e).f2857c : abstractC0830e.mo3444g())) {
                if (Arrays.equals(this.f2858d, z6 ? ((C0826a) abstractC0830e).f2858d : abstractC0830e.mo3445h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p074K3.AbstractC0830e
    /* renamed from: g */
    public byte[] mo3444g() {
        return this.f2857c;
    }

    @Override // p074K3.AbstractC0830e
    /* renamed from: h */
    public byte[] mo3445h() {
        return this.f2858d;
    }

    public int hashCode() {
        return ((((((this.f2855a ^ 1000003) * 1000003) ^ this.f2856b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f2857c)) * 1000003) ^ Arrays.hashCode(this.f2858d);
    }

    @Override // p074K3.AbstractC0830e
    /* renamed from: i */
    public C1170l mo3446i() {
        return this.f2856b;
    }

    @Override // p074K3.AbstractC0830e
    /* renamed from: j */
    public int mo3447j() {
        return this.f2855a;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f2855a + ", documentKey=" + this.f2856b + ", arrayValue=" + Arrays.toString(this.f2857c) + ", directionalValue=" + Arrays.toString(this.f2858d) + "}";
    }
}
