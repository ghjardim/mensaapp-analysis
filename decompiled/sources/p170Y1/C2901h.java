package p170Y1;

import java.util.Arrays;
import p149V1.C2610c;

/* renamed from: Y1.h */
/* loaded from: classes.dex */
public final class C2901h {

    /* renamed from: a */
    public final C2610c f8970a;

    /* renamed from: b */
    public final byte[] f8971b;

    public C2901h(C2610c c2610c, byte[] bArr) {
        if (c2610c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f8970a = c2610c;
        this.f8971b = bArr;
    }

    /* renamed from: a */
    public byte[] m10468a() {
        return this.f8971b;
    }

    /* renamed from: b */
    public C2610c m10469b() {
        return this.f8970a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2901h)) {
            return false;
        }
        C2901h c2901h = (C2901h) obj;
        if (this.f8970a.equals(c2901h.f8970a)) {
            return Arrays.equals(this.f8971b, c2901h.f8971b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8970a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8971b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f8970a + ", bytes=[...]}";
    }
}
