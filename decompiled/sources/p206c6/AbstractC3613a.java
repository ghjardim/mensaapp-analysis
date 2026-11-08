package p206c6;

import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.fork.ForkServer;
import p206c6.C3619g;

/* renamed from: c6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3613a {

    /* renamed from: a */
    public static final byte[] f12090a;

    /* renamed from: b */
    public static final byte[] f12091b;

    static {
        C3619g.a aVar = C3619g.f12117d;
        f12090a = aVar.m14654a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m14648j();
        f12091b = aVar.m14654a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m14648j();
    }

    /* renamed from: a */
    public static final String m14564a(byte[] bArr, byte[] map) {
        AbstractC5469l.m23028e(bArr, "<this>");
        AbstractC5469l.m23028e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b7 = bArr[i7];
            int i9 = i7 + 2;
            byte b8 = bArr[i7 + 1];
            i7 += 3;
            byte b9 = bArr[i9];
            bArr2[i8] = map[(b7 & ForkServer.ERROR) >> 2];
            bArr2[i8 + 1] = map[((b7 & 3) << 4) | ((b8 & ForkServer.ERROR) >> 4)];
            int i10 = i8 + 3;
            bArr2[i8 + 2] = map[((b8 & 15) << 2) | ((b9 & ForkServer.ERROR) >> 6)];
            i8 += 4;
            bArr2[i10] = map[b9 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b10 = bArr[i7];
            bArr2[i8] = map[(b10 & ForkServer.ERROR) >> 2];
            bArr2[i8 + 1] = map[(b10 & 3) << 4];
            bArr2[i8 + 2] = 61;
            bArr2[i8 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i7 + 1;
            byte b11 = bArr[i7];
            byte b12 = bArr[i11];
            bArr2[i8] = map[(b11 & ForkServer.ERROR) >> 2];
            bArr2[i8 + 1] = map[((b11 & 3) << 4) | ((b12 & ForkServer.ERROR) >> 4)];
            bArr2[i8 + 2] = map[(b12 & 15) << 2];
            bArr2[i8 + 3] = 61;
        }
        return AbstractC3612Y.m14563c(bArr2);
    }

    /* renamed from: b */
    public static /* synthetic */ String m14565b(byte[] bArr, byte[] bArr2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bArr2 = f12090a;
        }
        return m14564a(bArr, bArr2);
    }
}
