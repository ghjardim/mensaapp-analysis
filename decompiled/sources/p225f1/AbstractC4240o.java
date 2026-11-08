package p225f1;

import java.nio.ByteBuffer;
import java.util.UUID;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: f1.o */
/* loaded from: classes.dex */
public abstract class AbstractC4240o {

    /* renamed from: f1.o$a */
    public static final class a {

        /* renamed from: a */
        public final UUID f14582a;

        /* renamed from: b */
        public final int f14583b;

        /* renamed from: c */
        public final byte[] f14584c;

        /* renamed from: d */
        public final UUID[] f14585d;

        public a(UUID uuid, int i7, byte[] bArr, UUID[] uuidArr) {
            this.f14582a = uuid;
            this.f14583b = i7;
            this.f14584c = bArr;
            this.f14585d = uuidArr;
        }
    }

    /* renamed from: a */
    public static byte[] m17805a(UUID uuid, byte[] bArr) {
        return m17806b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m17806b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m17807c(byte[] bArr) {
        return m17808d(bArr) != null;
    }

    /* renamed from: d */
    public static a m17808d(byte[] bArr) {
        UUID[] uuidArr;
        C5357z c5357z = new C5357z(bArr);
        if (c5357z.m21948g() < 32) {
            return null;
        }
        c5357z.m21939T(0);
        int m21942a = c5357z.m21942a();
        int m21957p = c5357z.m21957p();
        if (m21957p != m21942a) {
            AbstractC5346o.m21867h("PsshAtomUtil", "Advertised atom size (" + m21957p + ") does not match buffer size: " + m21942a);
            return null;
        }
        int m21957p2 = c5357z.m21957p();
        if (m21957p2 != 1886614376) {
            AbstractC5346o.m21867h("PsshAtomUtil", "Atom type is not pssh: " + m21957p2);
            return null;
        }
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        if (m17666c > 1) {
            AbstractC5346o.m21867h("PsshAtomUtil", "Unsupported pssh version: " + m17666c);
            return null;
        }
        UUID uuid = new UUID(c5357z.m21967z(), c5357z.m21967z());
        if (m17666c == 1) {
            int m21930K = c5357z.m21930K();
            uuidArr = new UUID[m21930K];
            for (int i7 = 0; i7 < m21930K; i7++) {
                uuidArr[i7] = new UUID(c5357z.m21967z(), c5357z.m21967z());
            }
        } else {
            uuidArr = null;
        }
        int m21930K2 = c5357z.m21930K();
        int m21942a2 = c5357z.m21942a();
        if (m21930K2 == m21942a2) {
            byte[] bArr2 = new byte[m21930K2];
            c5357z.m21953l(bArr2, 0, m21930K2);
            return new a(uuid, m17666c, bArr2, uuidArr);
        }
        AbstractC5346o.m21867h("PsshAtomUtil", "Atom data size (" + m21930K2 + ") does not match the bytes left: " + m21942a2);
        return null;
    }

    /* renamed from: e */
    public static byte[] m17809e(byte[] bArr, UUID uuid) {
        a m17808d = m17808d(bArr);
        if (m17808d == null) {
            return null;
        }
        if (uuid.equals(m17808d.f14582a)) {
            return m17808d.f14584c;
        }
        AbstractC5346o.m21867h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m17808d.f14582a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m17810f(byte[] bArr) {
        a m17808d = m17808d(bArr);
        if (m17808d == null) {
            return null;
        }
        return m17808d.f14582a;
    }

    /* renamed from: g */
    public static int m17811g(byte[] bArr) {
        a m17808d = m17808d(bArr);
        if (m17808d == null) {
            return -1;
        }
        return m17808d.f14583b;
    }
}
