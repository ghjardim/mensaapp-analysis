package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.C */
/* loaded from: classes.dex */
public abstract class AbstractC4015C {

    /* renamed from: a */
    public static final Charset f13274a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f13275b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f13276c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f13277d;

    /* renamed from: e */
    public static final ByteBuffer f13278e;

    /* renamed from: f */
    public static final AbstractC4057j f13279f;

    /* renamed from: com.google.protobuf.C$a */
    public interface a {
        /* renamed from: a */
        int mo16192a();
    }

    /* renamed from: com.google.protobuf.C$b */
    public interface b {
    }

    /* renamed from: com.google.protobuf.C$c */
    public interface c {
        /* renamed from: a */
        boolean m16193a(int i7);
    }

    /* renamed from: com.google.protobuf.C$d */
    public interface d extends e {
    }

    /* renamed from: com.google.protobuf.C$e */
    public interface e extends List, RandomAccess {
        /* renamed from: c */
        void mo16194c();

        /* renamed from: d */
        e mo16168d(int i7);

        /* renamed from: j */
        boolean mo16195j();
    }

    static {
        byte[] bArr = new byte[0];
        f13277d = bArr;
        f13278e = ByteBuffer.wrap(bArr);
        f13279f = AbstractC4057j.m16529k(bArr);
    }

    /* renamed from: a */
    public static Object m16183a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m16184b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m16185c(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m16186d(byte[] bArr) {
        return m16187e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m16187e(byte[] bArr, int i7, int i8) {
        int m16190h = m16190h(i8, bArr, i7, i8);
        if (m16190h == 0) {
            return 1;
        }
        return m16190h;
    }

    /* renamed from: f */
    public static int m16188f(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    /* renamed from: g */
    public static boolean m16189g(byte[] bArr) {
        return AbstractC4012A0.m16121s(bArr);
    }

    /* renamed from: h */
    public static int m16190h(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    /* renamed from: i */
    public static String m16191i(byte[] bArr) {
        return new String(bArr, f13275b);
    }
}
