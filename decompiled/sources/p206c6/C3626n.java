package p206c6;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.n */
/* loaded from: classes2.dex */
public final class C3626n extends AbstractC3620h {

    /* renamed from: e */
    public final RandomAccessFile f12151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3626n(boolean z6, RandomAccessFile randomAccessFile) {
        super(z6);
        AbstractC5469l.m23028e(randomAccessFile, "randomAccessFile");
        this.f12151e = randomAccessFile;
    }

    @Override // p206c6.AbstractC3620h
    /* renamed from: m */
    public synchronized void mo14667m() {
        this.f12151e.close();
    }

    @Override // p206c6.AbstractC3620h
    /* renamed from: o */
    public synchronized void mo14668o() {
        this.f12151e.getFD().sync();
    }

    @Override // p206c6.AbstractC3620h
    /* renamed from: r */
    public synchronized int mo14669r(long j7, byte[] array, int i7, int i8) {
        AbstractC5469l.m23028e(array, "array");
        this.f12151e.seek(j7);
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            int read = this.f12151e.read(array, i7, i8 - i9);
            if (read != -1) {
                i9 += read;
            } else if (i9 == 0) {
                return -1;
            }
        }
        return i9;
    }

    @Override // p206c6.AbstractC3620h
    /* renamed from: v */
    public synchronized long mo14670v() {
        return this.f12151e.length();
    }

    @Override // p206c6.AbstractC3620h
    /* renamed from: w */
    public synchronized void mo14671w(long j7, byte[] array, int i7, int i8) {
        AbstractC5469l.m23028e(array, "array");
        this.f12151e.seek(j7);
        this.f12151e.write(array, i7, i8);
    }
}
