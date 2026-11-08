package p265j6;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p222e6.AbstractC4213g;

/* renamed from: j6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5391a extends OutputStream {

    /* renamed from: b */
    public int f19223b;

    /* renamed from: c */
    public int f19224c;

    /* renamed from: d */
    public byte[] f19225d;

    /* renamed from: e */
    public int f19226e;

    /* renamed from: a */
    public final List f19222a = new ArrayList();

    /* renamed from: f */
    public boolean f19227f = true;

    /* renamed from: a */
    public void m22294a(int i7) {
        if (this.f19223b < this.f19222a.size() - 1) {
            this.f19224c += this.f19225d.length;
            int i8 = this.f19223b + 1;
            this.f19223b = i8;
            this.f19225d = (byte[]) this.f19222a.get(i8);
            return;
        }
        byte[] bArr = this.f19225d;
        if (bArr == null) {
            this.f19224c = 0;
        } else {
            i7 = Math.max(bArr.length << 1, i7 - this.f19224c);
            this.f19224c += this.f19225d.length;
        }
        this.f19223b++;
        byte[] m17637e = AbstractC4213g.m17637e(i7);
        this.f19225d = m17637e;
        this.f19222a.add(m17637e);
    }

    /* renamed from: c */
    public abstract byte[] mo22295c();

    /* renamed from: d */
    public byte[] m22296d() {
        int i7 = this.f19226e;
        if (i7 == 0) {
            return AbstractC4213g.f14061b;
        }
        byte[] m17637e = AbstractC4213g.m17637e(i7);
        int i8 = 0;
        for (byte[] bArr : this.f19222a) {
            int min = Math.min(bArr.length, i7);
            System.arraycopy(bArr, 0, m17637e, i8, min);
            i8 += min;
            i7 -= min;
            if (i7 == 0) {
                break;
            }
        }
        return m17637e;
    }

    /* renamed from: g */
    public String m22297g(String str) {
        return new String(mo22295c(), str);
    }

    /* renamed from: h */
    public String m22298h(Charset charset) {
        return new String(mo22295c(), charset);
    }

    /* renamed from: j */
    public void m22299j(int i7) {
        int i8 = this.f19226e;
        int i9 = i8 - this.f19224c;
        if (i9 == this.f19225d.length) {
            m22294a(i8 + 1);
            i9 = 0;
        }
        this.f19225d[i9] = (byte) i7;
        this.f19226e++;
    }

    /* renamed from: m */
    public void m22300m(byte[] bArr, int i7, int i8) {
        int i9 = this.f19226e;
        int i10 = i9 + i8;
        int i11 = i9 - this.f19224c;
        int i12 = i8;
        while (i12 > 0) {
            int min = Math.min(i12, this.f19225d.length - i11);
            System.arraycopy(bArr, (i7 + i8) - i12, this.f19225d, i11, min);
            i12 -= min;
            if (i12 > 0) {
                m22294a(i10);
                i11 = 0;
            }
        }
        this.f19226e = i10;
    }

    public String toString() {
        return new String(mo22295c(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
