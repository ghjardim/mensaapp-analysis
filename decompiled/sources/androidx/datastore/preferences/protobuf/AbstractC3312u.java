package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.u */
/* loaded from: classes.dex */
public abstract class AbstractC3312u {

    /* renamed from: a */
    public static final Charset f10662a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f10663b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f10664c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f10665d;

    /* renamed from: e */
    public static final ByteBuffer f10666e;

    /* renamed from: f */
    public static final AbstractC3292g f10667f;

    /* renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        /* renamed from: a */
        boolean m12841a(int i7);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        /* renamed from: c */
        void mo12323c();

        /* renamed from: d */
        b mo12187d(int i7);

        /* renamed from: j */
        boolean mo12324j();
    }

    static {
        byte[] bArr = new byte[0];
        f10665d = bArr;
        f10666e = ByteBuffer.wrap(bArr);
        f10667f = AbstractC3292g.m12383i(bArr);
    }

    /* renamed from: a */
    public static Object m12834a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m12835b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m12836c(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m12837d(byte[] bArr) {
        return m12838e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m12838e(byte[] bArr, int i7, int i8) {
        int m12840g = m12840g(i8, bArr, i7, i8);
        if (m12840g == 0) {
            return 1;
        }
        return m12840g;
    }

    /* renamed from: f */
    public static int m12839f(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    /* renamed from: g */
    public static int m12840g(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }
}
