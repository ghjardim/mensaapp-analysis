package p378x5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p069J5.InterfaceC0800l;
import p104O5.AbstractC1421h;
import p104O5.C1419f;
import p125R5.AbstractC2281g;

/* renamed from: x5.k */
/* loaded from: classes2.dex */
public abstract class AbstractC7020k extends AbstractC7019j {
    /* renamed from: A */
    public static final Appendable m28805A(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(iArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (int i9 : iArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC0800l != null) {
                buffer.append((CharSequence) interfaceC0800l.invoke(Integer.valueOf(i9)));
            } else {
                buffer.append(String.valueOf(i9));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: B */
    public static final Appendable m28806B(long[] jArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(jArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (long j7 : jArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC0800l != null) {
                buffer.append((CharSequence) interfaceC0800l.invoke(Long.valueOf(j7)));
            } else {
                buffer.append(String.valueOf(j7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: C */
    public static final Appendable m28807C(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (Object obj : objArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            AbstractC2281g.m7725a(buffer, obj, interfaceC0800l);
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: D */
    public static final Appendable m28808D(short[] sArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(sArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (short s7 : sArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC0800l != null) {
                buffer.append((CharSequence) interfaceC0800l.invoke(Short.valueOf(s7)));
            } else {
                buffer.append(String.valueOf((int) s7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: E */
    public static final String m28809E(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(bArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28851x(bArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: F */
    public static final String m28810F(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(dArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28852y(dArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: G */
    public static final String m28811G(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(fArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28853z(fArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: H */
    public static final String m28812H(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(iArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28805A(iArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: I */
    public static final String m28813I(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(jArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28806B(jArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: J */
    public static final String m28814J(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28807C(objArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: K */
    public static final String m28815K(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(sArr, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28808D(sArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: L */
    public static /* synthetic */ String m28816L(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28809E(bArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: M */
    public static /* synthetic */ String m28817M(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28810F(dArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: N */
    public static /* synthetic */ String m28818N(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28811G(fArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: O */
    public static /* synthetic */ String m28819O(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28812H(iArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: P */
    public static /* synthetic */ String m28820P(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28813I(jArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: Q */
    public static /* synthetic */ String m28821Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28814J(objArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: R */
    public static /* synthetic */ String m28822R(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28815K(sArr, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: S */
    public static char m28823S(char[] cArr) {
        AbstractC5469l.m23028e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: T */
    public static Object m28824T(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* renamed from: U */
    public static final List m28825U(Object[] objArr, int i7) {
        AbstractC5469l.m23028e(objArr, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        }
        if (i7 == 0) {
            return AbstractC7024o.m28861g();
        }
        int length = objArr.length;
        if (i7 >= length) {
            return m28832b0(objArr);
        }
        if (i7 == 1) {
            return AbstractC7023n.m28856b(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = length - i7; i8 < length; i8++) {
            arrayList.add(objArr[i8]);
        }
        return arrayList;
    }

    /* renamed from: V */
    public static final Collection m28826V(Object[] objArr, Collection destination) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    /* renamed from: W */
    public static List m28827W(byte[] bArr) {
        AbstractC5469l.m23028e(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? m28834d0(bArr) : AbstractC7023n.m28856b(Byte.valueOf(bArr[0])) : AbstractC7024o.m28861g();
    }

    /* renamed from: X */
    public static List m28828X(double[] dArr) {
        AbstractC5469l.m23028e(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? m28835e0(dArr) : AbstractC7023n.m28856b(Double.valueOf(dArr[0])) : AbstractC7024o.m28861g();
    }

    /* renamed from: Y */
    public static List m28829Y(float[] fArr) {
        AbstractC5469l.m23028e(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? m28836f0(fArr) : AbstractC7023n.m28856b(Float.valueOf(fArr[0])) : AbstractC7024o.m28861g();
    }

    /* renamed from: Z */
    public static List m28830Z(int[] iArr) {
        AbstractC5469l.m23028e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? m28837g0(iArr) : AbstractC7023n.m28856b(Integer.valueOf(iArr[0])) : AbstractC7024o.m28861g();
    }

    /* renamed from: a0 */
    public static List m28831a0(long[] jArr) {
        AbstractC5469l.m23028e(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? m28838h0(jArr) : AbstractC7023n.m28856b(Long.valueOf(jArr[0])) : AbstractC7024o.m28861g();
    }

    /* renamed from: b0 */
    public static List m28832b0(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m28839i0(objArr) : AbstractC7023n.m28856b(objArr[0]) : AbstractC7024o.m28861g();
    }

    /* renamed from: c0 */
    public static List m28833c0(short[] sArr) {
        AbstractC5469l.m23028e(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? m28840j0(sArr) : AbstractC7023n.m28856b(Short.valueOf(sArr[0])) : AbstractC7024o.m28861g();
    }

    /* renamed from: d0 */
    public static final List m28834d0(byte[] bArr) {
        AbstractC5469l.m23028e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b7 : bArr) {
            arrayList.add(Byte.valueOf(b7));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static final List m28835e0(double[] dArr) {
        AbstractC5469l.m23028e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d7 : dArr) {
            arrayList.add(Double.valueOf(d7));
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public static final List m28836f0(float[] fArr) {
        AbstractC5469l.m23028e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static final List m28837g0(int[] iArr) {
        AbstractC5469l.m23028e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static final List m28838h0(long[] jArr) {
        AbstractC5469l.m23028e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static final List m28839i0(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        return new ArrayList(AbstractC7024o.m28860f(objArr));
    }

    /* renamed from: j0 */
    public static final List m28840j0(short[] sArr) {
        AbstractC5469l.m23028e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s7 : sArr) {
            arrayList.add(Short.valueOf(s7));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public static final Set m28841k0(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) m28826V(objArr, new LinkedHashSet(AbstractC7004D.m28732a(objArr.length))) : AbstractC7007G.m28755a(objArr[0]) : AbstractC7008H.m28756b();
    }

    /* renamed from: o */
    public static boolean m28842o(Object[] objArr, Object obj) {
        AbstractC5469l.m23028e(objArr, "<this>");
        return m28850w(objArr, obj) >= 0;
    }

    /* renamed from: p */
    public static List m28843p(Object[] objArr, int i7) {
        AbstractC5469l.m23028e(objArr, "<this>");
        if (i7 >= 0) {
            return m28825U(objArr, AbstractC1421h.m5528a(objArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    /* renamed from: q */
    public static List m28844q(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        return (List) m28845r(objArr, new ArrayList());
    }

    /* renamed from: r */
    public static final Collection m28845r(Object[] objArr, Collection destination) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: s */
    public static Object m28846s(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: t */
    public static C1419f m28847t(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        return new C1419f(0, m28848u(objArr));
    }

    /* renamed from: u */
    public static final int m28848u(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: v */
    public static Object m28849v(Object[] objArr, int i7) {
        AbstractC5469l.m23028e(objArr, "<this>");
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    /* renamed from: w */
    public static final int m28850w(Object[] objArr, Object obj) {
        AbstractC5469l.m23028e(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (AbstractC5469l.m23024a(obj, objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: x */
    public static final Appendable m28851x(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(bArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (byte b7 : bArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC0800l != null) {
                buffer.append((CharSequence) interfaceC0800l.invoke(Byte.valueOf(b7)));
            } else {
                buffer.append(String.valueOf((int) b7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: y */
    public static final Appendable m28852y(double[] dArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(dArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (double d7 : dArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC0800l != null) {
                buffer.append((CharSequence) interfaceC0800l.invoke(Double.valueOf(d7)));
            } else {
                buffer.append(String.valueOf(d7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: z */
    public static final Appendable m28853z(float[] fArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(fArr, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (float f7 : fArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC0800l != null) {
                buffer.append((CharSequence) interfaceC0800l.invoke(Float.valueOf(f7)));
            } else {
                buffer.append(String.valueOf(f7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }
}
