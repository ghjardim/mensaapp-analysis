package p276l0;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p171Y2.AbstractC2922e;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: l0.e */
/* loaded from: classes.dex */
public final class C5491e extends AbstractC5488b {

    /* renamed from: e */
    public C5497k f19770e;

    /* renamed from: f */
    public byte[] f19771f;

    /* renamed from: g */
    public int f19772g;

    /* renamed from: h */
    public int f19773h;

    public C5491e() {
        super(false);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        if (this.f19771f != null) {
            this.f19771f = null;
            m23070w();
        }
        this.f19770e = null;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        m23071x(c5497k);
        this.f19770e = c5497k;
        Uri normalizeScheme = c5497k.f19781a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC5332a.m21797b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] m21737e1 = AbstractC5330M.m21737e1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (m21737e1.length != 2) {
            throw C4295A.m17944b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = m21737e1[1];
        if (m21737e1[0].contains(";base64")) {
            try {
                this.f19771f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw C4295A.m17944b("Error while parsing Base64 encoded string: " + str, e7);
            }
        } else {
            this.f19771f = AbstractC5330M.m21773s0(URLDecoder.decode(str, AbstractC2922e.f9008a.name()));
        }
        long j7 = c5497k.f19787g;
        byte[] bArr = this.f19771f;
        if (j7 > bArr.length) {
            this.f19771f = null;
            throw new C5494h(2008);
        }
        int i7 = (int) j7;
        this.f19772g = i7;
        int length = bArr.length - i7;
        this.f19773h = length;
        long j8 = c5497k.f19788h;
        if (j8 != -1) {
            this.f19773h = (int) Math.min(length, j8);
        }
        m23072y(c5497k);
        long j9 = c5497k.f19788h;
        return j9 != -1 ? j9 : this.f19773h;
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f19773h;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        System.arraycopy(AbstractC5330M.m21747i(this.f19771f), this.f19772g, bArr, i7, min);
        this.f19772g += min;
        this.f19773h -= min;
        m23069v(min);
        return min;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        C5497k c5497k = this.f19770e;
        if (c5497k != null) {
            return c5497k.f19781a;
        }
        return null;
    }
}
