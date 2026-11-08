package p343t0;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p259j0.AbstractC5332a;
import p276l0.C5495i;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public class C6407a implements InterfaceC5493g {

    /* renamed from: a */
    public final InterfaceC5493g f23130a;

    /* renamed from: b */
    public final byte[] f23131b;

    /* renamed from: c */
    public final byte[] f23132c;

    /* renamed from: d */
    public CipherInputStream f23133d;

    public C6407a(InterfaceC5493g interfaceC5493g, byte[] bArr, byte[] bArr2) {
        this.f23130a = interfaceC5493g;
        this.f23131b = bArr;
        this.f23132c = bArr2;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: c */
    public final void mo711c(InterfaceC5511y interfaceC5511y) {
        AbstractC5332a.m21800e(interfaceC5511y);
        this.f23130a.mo711c(interfaceC5511y);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        if (this.f23133d != null) {
            this.f23133d = null;
            this.f23130a.close();
        }
    }

    /* renamed from: g */
    public Cipher m26757g() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: n */
    public final Map mo713n() {
        return this.f23130a.mo713n();
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public final long mo714o(C5497k c5497k) {
        try {
            Cipher m26757g = m26757g();
            try {
                m26757g.init(2, new SecretKeySpec(this.f23131b, "AES"), new IvParameterSpec(this.f23132c));
                C5495i c5495i = new C5495i(this.f23130a, c5497k);
                this.f23133d = new CipherInputStream(c5495i, m26757g);
                c5495i.m23078c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // p232g0.InterfaceC4319i
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC5332a.m21800e(this.f23133d);
        int read = this.f23133d.read(bArr, i7, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public final Uri mo715s() {
        return this.f23130a.mo715s();
    }
}
