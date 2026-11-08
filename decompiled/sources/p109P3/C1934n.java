package p109P3;

import android.util.Base64;
import com.google.protobuf.AbstractC4055i;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: P3.n */
/* loaded from: classes.dex */
public final class C1934n {

    /* renamed from: a */
    public final int f5829a;

    /* renamed from: b */
    public final AbstractC4055i f5830b;

    /* renamed from: c */
    public final int f5831c;

    /* renamed from: d */
    public final MessageDigest f5832d;

    /* renamed from: P3.n$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public C1934n(AbstractC4055i abstractC4055i, int i7, int i8) {
        if (i7 < 0 || i7 >= 8) {
            throw new IllegalArgumentException("Invalid padding: " + i7);
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i8);
        }
        if (abstractC4055i.size() > 0 && i8 == 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i8);
        }
        if (abstractC4055i.size() == 0 && i7 != 0) {
            throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i7);
        }
        this.f5830b = abstractC4055i;
        this.f5831c = i8;
        this.f5829a = (abstractC4055i.size() * 8) - i7;
        this.f5832d = m6878b();
    }

    /* renamed from: a */
    public static C1934n m6877a(AbstractC4055i abstractC4055i, int i7, int i8) {
        if (i7 < 0 || i7 >= 8) {
            throw new a("Invalid padding: " + i7);
        }
        if (i8 < 0) {
            throw new a("Invalid hash count: " + i8);
        }
        if (abstractC4055i.size() > 0 && i8 == 0) {
            throw new a("Invalid hash count: " + i8);
        }
        if (abstractC4055i.size() != 0 || i7 == 0) {
            return new C1934n(abstractC4055i, i7, i8);
        }
        throw new a("Expected padding of 0 when bitmap length is 0, but got " + i7);
    }

    /* renamed from: b */
    public static MessageDigest m6878b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e7);
        }
    }

    /* renamed from: e */
    public static long m6879e(byte[] bArr, int i7) {
        long j7 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j7 |= (bArr[i7 + i8] & 255) << (i8 * 8);
        }
        return j7;
    }

    /* renamed from: i */
    public static long m6880i(long j7, long j8) {
        long j9 = j7 - ((((j7 >>> 1) / j8) << 1) * j8);
        if (j9 < j8) {
            j8 = 0;
        }
        return j9 - j8;
    }

    /* renamed from: c */
    public int m6881c() {
        return this.f5829a;
    }

    /* renamed from: d */
    public final int m6882d(long j7, long j8, int i7) {
        return (int) m6880i(j7 + (j8 * i7), this.f5829a);
    }

    /* renamed from: f */
    public final boolean m6883f(int i7) {
        return ((1 << (i7 % 8)) & this.f5830b.mo16437f(i7 / 8)) != 0;
    }

    /* renamed from: g */
    public final byte[] m6884g(String str) {
        return this.f5832d.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: h */
    public boolean m6885h(String str) {
        if (this.f5829a == 0) {
            return false;
        }
        byte[] m6884g = m6884g(str);
        if (m6884g.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + m6884g.length + " (expected 16)");
        }
        long m6879e = m6879e(m6884g, 0);
        long m6879e2 = m6879e(m6884g, 8);
        for (int i7 = 0; i7 < this.f5831c; i7++) {
            if (!m6883f(m6882d(m6879e, m6879e2, i7))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.f5831c + ", size=" + this.f5829a + ", bitmap=\"" + Base64.encodeToString(this.f5830b.m16504C(), 2) + "\"}";
    }
}
