package p032E3;

import java.io.OutputStream;

/* renamed from: E3.b */
/* loaded from: classes.dex */
public final class C0290b extends OutputStream {

    /* renamed from: a */
    public long f1118a = 0;

    /* renamed from: a */
    public long m1159a() {
        return this.f1118a;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        this.f1118a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f1118a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 >= 0 && i7 <= bArr.length && i8 >= 0 && (i9 = i7 + i8) <= bArr.length && i9 >= 0) {
            this.f1118a += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
