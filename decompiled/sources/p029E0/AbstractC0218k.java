package p029E0;

import java.util.Arrays;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;

/* renamed from: E0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0218k extends AbstractC0212e {

    /* renamed from: j */
    public byte[] f917j;

    /* renamed from: k */
    public volatile boolean f918k;

    public AbstractC0218k(InterfaceC5493g interfaceC5493g, C5497k c5497k, int i7, C4327q c4327q, int i8, Object obj, byte[] bArr) {
        super(interfaceC5493g, c5497k, i7, c4327q, i8, obj, -9223372036854775807L, -9223372036854775807L);
        AbstractC0218k abstractC0218k;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = AbstractC5330M.f18805f;
            abstractC0218k = this;
        } else {
            abstractC0218k = this;
            bArr2 = bArr;
        }
        abstractC0218k.f917j = bArr2;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public final void mo481b() {
        try {
            this.f880i.mo714o(this.f873b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f918k) {
                m918i(i8);
                i7 = this.f880i.read(this.f917j, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f918k) {
                mo916g(this.f917j, i8);
            }
            AbstractC5496j.m23079a(this.f880i);
        } catch (Throwable th) {
            AbstractC5496j.m23079a(this.f880i);
            throw th;
        }
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public final void mo482c() {
        this.f918k = true;
    }

    /* renamed from: g */
    public abstract void mo916g(byte[] bArr, int i7);

    /* renamed from: h */
    public byte[] m917h() {
        return this.f917j;
    }

    /* renamed from: i */
    public final void m918i(int i7) {
        byte[] bArr = this.f917j;
        if (bArr.length < i7 + 16384) {
            this.f917j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
