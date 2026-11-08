package p061I4;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
import p272k4.C5410A;

/* renamed from: I4.p */
/* loaded from: classes.dex */
public class C0664p implements InterfaceC0657i {

    /* renamed from: a */
    public static final C0664p f2266a = new C0664p();

    /* renamed from: b */
    public static final boolean f2267b;

    /* renamed from: c */
    public static final Charset f2268c;

    /* renamed from: I4.p$a */
    public static final class a extends ByteArrayOutputStream {
        /* renamed from: a */
        public byte[] m2672a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f2267b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f2268c = Charset.forName("UTF8");
    }

    /* renamed from: c */
    public static final void m2658c(ByteBuffer byteBuffer, int i7) {
        int position = byteBuffer.position() % i7;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i7) - position);
        }
    }

    /* renamed from: d */
    public static final byte[] m2659d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m2660e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public static final int m2660e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i7 = byteBuffer.get() & ForkServer.ERROR;
        return i7 < 254 ? i7 : i7 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    /* renamed from: h */
    public static final void m2661h(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        int size = byteArrayOutputStream.size() % i7;
        if (size != 0) {
            for (int i8 = 0; i8 < i7 - size; i8++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: i */
    public static final void m2662i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m2668o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static final void m2663j(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (f2267b) {
            byteArrayOutputStream.write(i7);
            byteArrayOutputStream.write(i7 >>> 8);
        } else {
            byteArrayOutputStream.write(i7 >>> 8);
            byteArrayOutputStream.write(i7);
        }
    }

    /* renamed from: k */
    public static final void m2664k(ByteArrayOutputStream byteArrayOutputStream, double d7) {
        m2667n(byteArrayOutputStream, Double.doubleToLongBits(d7));
    }

    /* renamed from: l */
    public static final void m2665l(ByteArrayOutputStream byteArrayOutputStream, float f7) {
        m2666m(byteArrayOutputStream, Float.floatToIntBits(f7));
    }

    /* renamed from: m */
    public static final void m2666m(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (f2267b) {
            byteArrayOutputStream.write(i7);
            byteArrayOutputStream.write(i7 >>> 8);
            byteArrayOutputStream.write(i7 >>> 16);
            byteArrayOutputStream.write(i7 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i7 >>> 24);
        byteArrayOutputStream.write(i7 >>> 16);
        byteArrayOutputStream.write(i7 >>> 8);
        byteArrayOutputStream.write(i7);
    }

    /* renamed from: n */
    public static final void m2667n(ByteArrayOutputStream byteArrayOutputStream, long j7) {
        if (f2267b) {
            byteArrayOutputStream.write((byte) j7);
            byteArrayOutputStream.write((byte) (j7 >>> 8));
            byteArrayOutputStream.write((byte) (j7 >>> 16));
            byteArrayOutputStream.write((byte) (j7 >>> 24));
            byteArrayOutputStream.write((byte) (j7 >>> 32));
            byteArrayOutputStream.write((byte) (j7 >>> 40));
            byteArrayOutputStream.write((byte) (j7 >>> 48));
            byteArrayOutputStream.write((byte) (j7 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j7 >>> 56));
        byteArrayOutputStream.write((byte) (j7 >>> 48));
        byteArrayOutputStream.write((byte) (j7 >>> 40));
        byteArrayOutputStream.write((byte) (j7 >>> 32));
        byteArrayOutputStream.write((byte) (j7 >>> 24));
        byteArrayOutputStream.write((byte) (j7 >>> 16));
        byteArrayOutputStream.write((byte) (j7 >>> 8));
        byteArrayOutputStream.write((byte) j7);
    }

    /* renamed from: o */
    public static final void m2668o(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (i7 < 254) {
            byteArrayOutputStream.write(i7);
        } else if (i7 <= 65535) {
            byteArrayOutputStream.write(254);
            m2663j(byteArrayOutputStream, i7);
        } else {
            byteArrayOutputStream.write(255);
            m2666m(byteArrayOutputStream, i7);
        }
    }

    @Override // p061I4.InterfaceC0657i
    /* renamed from: a */
    public ByteBuffer mo2637a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        mo2671p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.m2672a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // p061I4.InterfaceC0657i
    /* renamed from: b */
    public Object mo2638b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object m2669f = m2669f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return m2669f;
    }

    /* renamed from: f */
    public final Object m2669f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo2670g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: g */
    public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
        Object arrayList;
        int i7 = 0;
        switch (b7) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(m2659d(byteBuffer), f2268c), 16);
            case 6:
                m2658c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(m2659d(byteBuffer), f2268c);
            case 8:
                return m2659d(byteBuffer);
            case 9:
                int m2660e = m2660e(byteBuffer);
                int[] iArr = new int[m2660e];
                m2658c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (m2660e * 4));
                return iArr;
            case 10:
                int m2660e2 = m2660e(byteBuffer);
                long[] jArr = new long[m2660e2];
                m2658c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (m2660e2 * 8));
                return jArr;
            case 11:
                int m2660e3 = m2660e(byteBuffer);
                double[] dArr = new double[m2660e3];
                m2658c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (m2660e3 * 8));
                return dArr;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int m2660e4 = m2660e(byteBuffer);
                arrayList = new ArrayList(m2660e4);
                while (i7 < m2660e4) {
                    arrayList.add(m2669f(byteBuffer));
                    i7++;
                }
                break;
            case 13:
                int m2660e5 = m2660e(byteBuffer);
                arrayList = new HashMap();
                while (i7 < m2660e5) {
                    arrayList.put(m2669f(byteBuffer), m2669f(byteBuffer));
                    i7++;
                }
                break;
            case 14:
                int m2660e6 = m2660e(byteBuffer);
                float[] fArr = new float[m2660e6];
                m2658c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position(byteBuffer.position() + (m2660e6 * 4));
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return arrayList;
    }

    /* renamed from: p */
    public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i7 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m2666m(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m2667n(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                m2661h(byteArrayOutputStream, 8);
                m2664k(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                m2662i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f2268c));
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            m2662i(byteArrayOutputStream, obj.toString().getBytes(f2268c));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            m2662i(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            m2668o(byteArrayOutputStream, iArr.length);
            m2661h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i7 < length) {
                m2666m(byteArrayOutputStream, iArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            m2668o(byteArrayOutputStream, jArr.length);
            m2661h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i7 < length2) {
                m2667n(byteArrayOutputStream, jArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            m2668o(byteArrayOutputStream, dArr.length);
            m2661h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i7 < length3) {
                m2664k(byteArrayOutputStream, dArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            m2668o(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo2671p(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            m2668o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                mo2671p(byteArrayOutputStream, entry.getKey());
                mo2671p(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        m2668o(byteArrayOutputStream, fArr.length);
        m2661h(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i7 < length4) {
            m2665l(byteArrayOutputStream, fArr[i7]);
            i7++;
        }
    }
}
