package p078L0;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p232g0.C4323m;
import p232g0.C4327q;
import p259j0.C5356y;
import p259j0.C5357z;

/* renamed from: L0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0868c {

    /* renamed from: a */
    public static final int[] f3002a = {2002, 2000, 1920, 1601, 1600, 1001, PipesIterator.DEFAULT_QUEUE_SIZE, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: L0.c$b */
    public static final class b {

        /* renamed from: a */
        public final int f3003a;

        /* renamed from: b */
        public final int f3004b;

        /* renamed from: c */
        public final int f3005c;

        /* renamed from: d */
        public final int f3006d;

        /* renamed from: e */
        public final int f3007e;

        public b(int i7, int i8, int i9, int i10, int i11) {
            this.f3003a = i7;
            this.f3005c = i8;
            this.f3004b = i9;
            this.f3006d = i10;
            this.f3007e = i11;
        }
    }

    /* renamed from: a */
    public static void m3599a(int i7, C5357z c5357z) {
        c5357z.m21935P(7);
        byte[] m21946e = c5357z.m21946e();
        m21946e[0] = -84;
        m21946e[1] = 64;
        m21946e[2] = -1;
        m21946e[3] = -1;
        m21946e[4] = (byte) ((i7 >> 16) & 255);
        m21946e[5] = (byte) ((i7 >> 8) & 255);
        m21946e[6] = (byte) (i7 & 255);
    }

    /* renamed from: b */
    public static C4327q m3600b(C5357z c5357z, String str, String str2, C4323m c4323m) {
        c5357z.m21940U(1);
        return new C4327q.b().m18250a0(str).m18264o0("audio/ac4").m18237N(2).m18265p0(((c5357z.m21926G() & 32) >> 5) == 1 ? 48000 : 44100).m18244U(c4323m).m18254e0(str2).m18234K();
    }

    /* renamed from: c */
    public static int m3601c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m3602d(new C5356y(bArr)).f3007e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r11 != 8) goto L40;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p078L0.AbstractC0868c.b m3602d(p259j0.C5356y r11) {
        /*
            r0 = 16
            int r1 = r11.m21908h(r0)
            int r0 = r11.m21908h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.m21908h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.m21908h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = m3604f(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.m21908h(r1)
            boolean r4 = r11.m21907g()
            if (r4 == 0) goto L45
            int r4 = r11.m21908h(r2)
            if (r4 <= 0) goto L45
            r11.m21918r(r0)
        L45:
            boolean r4 = r11.m21907g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r9 = r7
            goto L54
        L53:
            r9 = r6
        L54:
            int r11 = r11.m21908h(r3)
            if (r9 != r6) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = p078L0.AbstractC0868c.f3002a
            r11 = r0[r11]
            goto L91
        L63:
            if (r9 != r7) goto L90
            int[] r4 = p078L0.AbstractC0868c.f3002a
            int r6 = r4.length
            if (r11 >= r6) goto L90
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8b
            r7 = 11
            if (r1 == r0) goto L86
            if (r1 == r2) goto L8b
            if (r1 == r3) goto L7c
            goto L84
        L7c:
            if (r11 == r2) goto L82
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
        L82:
            int r4 = r4 + 1
        L84:
            r11 = r4
            goto L91
        L86:
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
            goto L82
        L8b:
            if (r11 == r2) goto L82
            if (r11 != r6) goto L84
            goto L82
        L90:
            r11 = 0
        L91:
            L0.c$b r0 = new L0.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p078L0.AbstractC0868c.m3602d(j0.y):L0.c$b");
    }

    /* renamed from: e */
    public static int m3603e(byte[] bArr, int i7) {
        int i8 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i9 = ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
        if (i9 == 65535) {
            i9 = ((bArr[4] & ForkServer.ERROR) << 16) | ((bArr[5] & ForkServer.ERROR) << 8) | (bArr[6] & ForkServer.ERROR);
        } else {
            i8 = 4;
        }
        if (i7 == 44097) {
            i8 += 2;
        }
        return i9 + i8;
    }

    /* renamed from: f */
    public static int m3604f(C5356y c5356y, int i7) {
        int i8 = 0;
        while (true) {
            int m21908h = i8 + c5356y.m21908h(i7);
            if (!c5356y.m21907g()) {
                return m21908h;
            }
            i8 = (m21908h + 1) << i7;
        }
    }
}
