package p209d1;

import org.apache.tika.fork.ForkServer;
import p078L0.InterfaceC0884s;

/* renamed from: d1.g */
/* loaded from: classes.dex */
public final class C4107g {

    /* renamed from: d */
    public static final long[] f13808d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f13809a = new byte[8];

    /* renamed from: b */
    public int f13810b;

    /* renamed from: c */
    public int f13811c;

    /* renamed from: a */
    public static long m17283a(byte[] bArr, int i7, boolean z6) {
        long j7 = bArr[0] & 255;
        if (z6) {
            j7 &= ~f13808d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    /* renamed from: c */
    public static int m17284c(int i7) {
        int i8 = 0;
        while (true) {
            long[] jArr = f13808d;
            if (i8 >= jArr.length) {
                return -1;
            }
            if ((jArr[i8] & i7) != 0) {
                return i8 + 1;
            }
            i8++;
        }
    }

    /* renamed from: b */
    public int m17285b() {
        return this.f13811c;
    }

    /* renamed from: d */
    public long m17286d(InterfaceC0884s interfaceC0884s, boolean z6, boolean z7, int i7) {
        if (this.f13810b == 0) {
            if (!interfaceC0884s.mo3512d(this.f13809a, 0, 1, z6)) {
                return -1L;
            }
            int m17284c = m17284c(this.f13809a[0] & ForkServer.ERROR);
            this.f13811c = m17284c;
            if (m17284c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f13810b = 1;
        }
        int i8 = this.f13811c;
        if (i8 > i7) {
            this.f13810b = 0;
            return -2L;
        }
        if (i8 != 1) {
            interfaceC0884s.readFully(this.f13809a, 1, i8 - 1);
        }
        this.f13810b = 0;
        return m17283a(this.f13809a, this.f13811c, z7);
    }

    /* renamed from: e */
    public void m17287e() {
        this.f13810b = 0;
        this.f13811c = 0;
    }
}
