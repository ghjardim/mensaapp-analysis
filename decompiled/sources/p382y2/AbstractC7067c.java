package p382y2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: y2.c */
/* loaded from: classes.dex */
public abstract class AbstractC7067c {
    /* renamed from: A */
    public static void m29104A(Parcel parcel, int i7, Parcel parcel2, boolean z6) {
        if (parcel2 == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: B */
    public static void m29105B(Parcel parcel, int i7, List list, boolean z6) {
        if (list == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcel parcel2 = (Parcel) list.get(i8);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: C */
    public static void m29106C(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z6) {
        if (parcelable == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: D */
    public static void m29107D(Parcel parcel, int i7, short s7) {
        m29115L(parcel, i7, 4);
        parcel.writeInt(s7);
    }

    /* renamed from: E */
    public static void m29108E(Parcel parcel, int i7, String str, boolean z6) {
        if (str == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeString(str);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: F */
    public static void m29109F(Parcel parcel, int i7, String[] strArr, boolean z6) {
        if (strArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeStringArray(strArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: G */
    public static void m29110G(Parcel parcel, int i7, List list, boolean z6) {
        if (list == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeStringList(list);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: H */
    public static void m29111H(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8, boolean z6) {
        if (parcelableArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m29116M(parcel, parcelable, i8);
            }
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: I */
    public static void m29112I(Parcel parcel, int i7, List list, boolean z6) {
        if (list == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m29116M(parcel, parcelable, 0);
            }
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: J */
    public static int m29113J(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: K */
    public static void m29114K(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: L */
    public static void m29115L(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    /* renamed from: M */
    public static void m29116M(Parcel parcel, Parcelable parcelable, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m29117a(Parcel parcel) {
        return m29113J(parcel, 20293);
    }

    /* renamed from: b */
    public static void m29118b(Parcel parcel, int i7) {
        m29114K(parcel, i7);
    }

    /* renamed from: c */
    public static void m29119c(Parcel parcel, int i7, BigDecimal bigDecimal, boolean z6) {
        if (bigDecimal == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: d */
    public static void m29120d(Parcel parcel, int i7, BigDecimal[] bigDecimalArr, boolean z6) {
        if (bigDecimalArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i8 = 0; i8 < length; i8++) {
            parcel.writeByteArray(bigDecimalArr[i8].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i8].scale());
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: e */
    public static void m29121e(Parcel parcel, int i7, BigInteger bigInteger, boolean z6) {
        if (bigInteger == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeByteArray(bigInteger.toByteArray());
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: f */
    public static void m29122f(Parcel parcel, int i7, BigInteger[] bigIntegerArr, boolean z6) {
        if (bigIntegerArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: g */
    public static void m29123g(Parcel parcel, int i7, boolean z6) {
        m29115L(parcel, i7, 4);
        parcel.writeInt(z6 ? 1 : 0);
    }

    /* renamed from: h */
    public static void m29124h(Parcel parcel, int i7, boolean[] zArr, boolean z6) {
        if (zArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeBooleanArray(zArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: i */
    public static void m29125i(Parcel parcel, int i7, Boolean bool, boolean z6) {
        if (bool != null) {
            m29115L(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z6) {
            m29115L(parcel, i7, 0);
        }
    }

    /* renamed from: j */
    public static void m29126j(Parcel parcel, int i7, Bundle bundle, boolean z6) {
        if (bundle == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeBundle(bundle);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: k */
    public static void m29127k(Parcel parcel, int i7, byte[] bArr, boolean z6) {
        if (bArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeByteArray(bArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: l */
    public static void m29128l(Parcel parcel, int i7, byte[][] bArr, boolean z6) {
        if (bArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: m */
    public static void m29129m(Parcel parcel, int i7, double d7) {
        m29115L(parcel, i7, 8);
        parcel.writeDouble(d7);
    }

    /* renamed from: n */
    public static void m29130n(Parcel parcel, int i7, double[] dArr, boolean z6) {
        if (dArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeDoubleArray(dArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: o */
    public static void m29131o(Parcel parcel, int i7, Double d7, boolean z6) {
        if (d7 != null) {
            m29115L(parcel, i7, 8);
            parcel.writeDouble(d7.doubleValue());
        } else if (z6) {
            m29115L(parcel, i7, 0);
        }
    }

    /* renamed from: p */
    public static void m29132p(Parcel parcel, int i7, float f7) {
        m29115L(parcel, i7, 4);
        parcel.writeFloat(f7);
    }

    /* renamed from: q */
    public static void m29133q(Parcel parcel, int i7, float[] fArr, boolean z6) {
        if (fArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeFloatArray(fArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: r */
    public static void m29134r(Parcel parcel, int i7, Float f7, boolean z6) {
        if (f7 != null) {
            m29115L(parcel, i7, 4);
            parcel.writeFloat(f7.floatValue());
        } else if (z6) {
            m29115L(parcel, i7, 0);
        }
    }

    /* renamed from: s */
    public static void m29135s(Parcel parcel, int i7, IBinder iBinder, boolean z6) {
        if (iBinder == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: t */
    public static void m29136t(Parcel parcel, int i7, int i8) {
        m29115L(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    /* renamed from: u */
    public static void m29137u(Parcel parcel, int i7, int[] iArr, boolean z6) {
        if (iArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeIntArray(iArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: v */
    public static void m29138v(Parcel parcel, int i7, List list, boolean z6) {
        if (list == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
                return;
            }
            return;
        }
        int m29113J = m29113J(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(((Integer) list.get(i8)).intValue());
        }
        m29114K(parcel, m29113J);
    }

    /* renamed from: w */
    public static void m29139w(Parcel parcel, int i7, Integer num, boolean z6) {
        if (num != null) {
            m29115L(parcel, i7, 4);
            parcel.writeInt(num.intValue());
        } else if (z6) {
            m29115L(parcel, i7, 0);
        }
    }

    /* renamed from: x */
    public static void m29140x(Parcel parcel, int i7, long j7) {
        m29115L(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    /* renamed from: y */
    public static void m29141y(Parcel parcel, int i7, long[] jArr, boolean z6) {
        if (jArr == null) {
            if (z6) {
                m29115L(parcel, i7, 0);
            }
        } else {
            int m29113J = m29113J(parcel, i7);
            parcel.writeLongArray(jArr);
            m29114K(parcel, m29113J);
        }
    }

    /* renamed from: z */
    public static void m29142z(Parcel parcel, int i7, Long l7, boolean z6) {
        if (l7 != null) {
            m29115L(parcel, i7, 8);
            parcel.writeLong(l7.longValue());
        } else if (z6) {
            m29115L(parcel, i7, 0);
        }
    }
}
