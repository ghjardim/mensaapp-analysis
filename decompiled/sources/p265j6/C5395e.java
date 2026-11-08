package p265j6;

import p230f6.AbstractC4292d;

/* renamed from: j6.e */
/* loaded from: classes2.dex */
public final class C5395e extends AbstractC5391a {

    /* renamed from: j6.e$a */
    public static class a extends AbstractC4292d {
        /* renamed from: l */
        public C5395e m22309l() {
            return new C5395e(m17937g());
        }
    }

    public C5395e(int i7) {
        if (i7 >= 0) {
            m22294a(i7);
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i7);
    }

    /* renamed from: o */
    public static a m22307o() {
        return new a();
    }

    @Override // p265j6.AbstractC5391a
    /* renamed from: c */
    public byte[] mo22295c() {
        return m22296d();
    }

    /* renamed from: r */
    public int m22308r() {
        return this.f19226e;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 > bArr.length || i8 < 0 || (i9 = i7 + i8) > bArr.length || i9 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        if (i8 == 0) {
            return;
        }
        m22300m(bArr, i7, i8);
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        m22299j(i7);
    }
}
