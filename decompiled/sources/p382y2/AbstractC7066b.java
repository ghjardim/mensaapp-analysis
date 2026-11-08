package p382y2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: y2.b */
/* loaded from: classes.dex */
public abstract class AbstractC7066b {

    /* renamed from: y2.b$a */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static Double m29063A(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        if (m29073K == 0) {
            return null;
        }
        m29076N(parcel, i7, m29073K, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: B */
    public static float m29064B(Parcel parcel, int i7) {
        m29077O(parcel, i7, 4);
        return parcel.readFloat();
    }

    /* renamed from: C */
    public static Float m29065C(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        if (m29073K == 0) {
            return null;
        }
        m29076N(parcel, i7, m29073K, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: D */
    public static int m29066D(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: E */
    public static IBinder m29067E(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m29073K);
        return readStrongBinder;
    }

    /* renamed from: F */
    public static int m29068F(Parcel parcel, int i7) {
        m29077O(parcel, i7, 4);
        return parcel.readInt();
    }

    /* renamed from: G */
    public static Integer m29069G(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        if (m29073K == 0) {
            return null;
        }
        m29076N(parcel, i7, m29073K, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: H */
    public static long m29070H(Parcel parcel, int i7) {
        m29077O(parcel, i7, 8);
        return parcel.readLong();
    }

    /* renamed from: I */
    public static Long m29071I(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        if (m29073K == 0) {
            return null;
        }
        m29076N(parcel, i7, m29073K, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: J */
    public static short m29072J(Parcel parcel, int i7) {
        m29077O(parcel, i7, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: K */
    public static int m29073K(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    /* renamed from: L */
    public static void m29074L(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + m29073K(parcel, i7));
    }

    /* renamed from: M */
    public static int m29075M(Parcel parcel) {
        int m29066D = m29066D(parcel);
        int m29073K = m29073K(parcel, m29066D);
        int m29100w = m29100w(m29066D);
        int dataPosition = parcel.dataPosition();
        if (m29100w != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m29066D))), parcel);
        }
        int i7 = m29073K + dataPosition;
        if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i7, parcel);
    }

    /* renamed from: N */
    public static void m29076N(Parcel parcel, int i7, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + i8 + " (0x" + Integer.toHexString(i8) + ")", parcel);
    }

    /* renamed from: O */
    public static void m29077O(Parcel parcel, int i7, int i8) {
        int m29073K = m29073K(parcel, i7);
        if (m29073K == i8) {
            return;
        }
        throw new a("Expected size " + i8 + " got " + m29073K + " (0x" + Integer.toHexString(m29073K) + ")", parcel);
    }

    /* renamed from: a */
    public static BigDecimal m29078a(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m29073K);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m29079b(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i8] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m29073K);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m29080c(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m29081d(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            bigIntegerArr[i8] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m29073K);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m29082e(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m29083f(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m29073K);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m29084g(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m29085h(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i8 = 0; i8 < readInt; i8++) {
            bArr[i8] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m29073K);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m29086i(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m29087j(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m29088k(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createIntArray;
    }

    /* renamed from: l */
    public static ArrayList m29089l(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m29073K);
        return arrayList;
    }

    /* renamed from: m */
    public static long[] m29090m(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createLongArray;
    }

    /* renamed from: n */
    public static Parcel m29091n(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m29073K);
        parcel.setDataPosition(dataPosition + m29073K);
        return obtain;
    }

    /* renamed from: o */
    public static Parcel[] m29092o(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i8] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i8] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m29073K);
        return parcelArr;
    }

    /* renamed from: p */
    public static Parcelable m29093p(Parcel parcel, int i7, Parcelable.Creator creator) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m29073K);
        return parcelable;
    }

    /* renamed from: q */
    public static String m29094q(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m29073K);
        return readString;
    }

    /* renamed from: r */
    public static String[] m29095r(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m29073K);
        return createStringArray;
    }

    /* renamed from: s */
    public static ArrayList m29096s(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m29073K);
        return createStringArrayList;
    }

    /* renamed from: t */
    public static Object[] m29097t(Parcel parcel, int i7, Parcelable.Creator creator) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m29073K);
        return createTypedArray;
    }

    /* renamed from: u */
    public static ArrayList m29098u(Parcel parcel, int i7, Parcelable.Creator creator) {
        int m29073K = m29073K(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (m29073K == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m29073K);
        return createTypedArrayList;
    }

    /* renamed from: v */
    public static void m29099v(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new a("Overread allowed size end=" + i7, parcel);
    }

    /* renamed from: w */
    public static int m29100w(int i7) {
        return (char) i7;
    }

    /* renamed from: x */
    public static boolean m29101x(Parcel parcel, int i7) {
        m29077O(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: y */
    public static Boolean m29102y(Parcel parcel, int i7) {
        int m29073K = m29073K(parcel, i7);
        if (m29073K == 0) {
            return null;
        }
        m29076N(parcel, i7, m29073K, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: z */
    public static double m29103z(Parcel parcel, int i7) {
        m29077O(parcel, i7, 8);
        return parcel.readDouble();
    }
}
