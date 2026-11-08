package p388z1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: z1.l */
/* loaded from: classes.dex */
public abstract class AbstractC7137l {

    /* renamed from: a */
    public static final byte[] f25366a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f25367b = {112, 114, 109, 0};

    /* renamed from: A */
    public static void m29398A(InputStream inputStream) {
        AbstractC7129d.m29384h(inputStream);
        int m29386j = AbstractC7129d.m29386j(inputStream);
        if (m29386j == 6 || m29386j == 7) {
            return;
        }
        while (m29386j > 0) {
            AbstractC7129d.m29386j(inputStream);
            for (int m29386j2 = AbstractC7129d.m29386j(inputStream); m29386j2 > 0; m29386j2--) {
                AbstractC7129d.m29384h(inputStream);
            }
            m29386j--;
        }
    }

    /* renamed from: B */
    public static boolean m29399B(OutputStream outputStream, byte[] bArr, C7128c[] c7128cArr) {
        if (Arrays.equals(bArr, AbstractC7138m.f25368a)) {
            m29411N(outputStream, c7128cArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC7138m.f25369b)) {
            m29410M(outputStream, c7128cArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC7138m.f25371d)) {
            m29408K(outputStream, c7128cArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC7138m.f25370c)) {
            m29409L(outputStream, c7128cArr);
            return true;
        }
        if (!Arrays.equals(bArr, AbstractC7138m.f25372e)) {
            return false;
        }
        m29407J(outputStream, c7128cArr);
        return true;
    }

    /* renamed from: C */
    public static void m29400C(OutputStream outputStream, C7128c c7128c) {
        int[] iArr = c7128c.f25349h;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            AbstractC7129d.m29392p(outputStream, i9 - i8);
            i7++;
            i8 = i9;
        }
    }

    /* renamed from: D */
    public static C7139n m29401D(C7128c[] c7128cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC7129d.m29392p(byteArrayOutputStream, c7128cArr.length);
            int i7 = 2;
            for (C7128c c7128c : c7128cArr) {
                AbstractC7129d.m29393q(byteArrayOutputStream, c7128c.f25344c);
                AbstractC7129d.m29393q(byteArrayOutputStream, c7128c.f25345d);
                AbstractC7129d.m29393q(byteArrayOutputStream, c7128c.f25348g);
                String m29422j = m29422j(c7128c.f25342a, c7128c.f25343b, AbstractC7138m.f25368a);
                int m29387k = AbstractC7129d.m29387k(m29422j);
                AbstractC7129d.m29392p(byteArrayOutputStream, m29387k);
                i7 = i7 + 14 + m29387k;
                AbstractC7129d.m29390n(byteArrayOutputStream, m29422j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i7 == byteArray.length) {
                C7139n c7139n = new C7139n(EnumC7130e.DEX_FILES, i7, byteArray, false);
                byteArrayOutputStream.close();
                return c7139n;
            }
            throw AbstractC7129d.m29379c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: E */
    public static void m29402E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f25366a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    public static void m29403F(OutputStream outputStream, C7128c c7128c) {
        m29406I(outputStream, c7128c);
        m29400C(outputStream, c7128c);
        m29405H(outputStream, c7128c);
    }

    /* renamed from: G */
    public static void m29404G(OutputStream outputStream, C7128c c7128c, String str) {
        AbstractC7129d.m29392p(outputStream, AbstractC7129d.m29387k(str));
        AbstractC7129d.m29392p(outputStream, c7128c.f25346e);
        AbstractC7129d.m29393q(outputStream, c7128c.f25347f);
        AbstractC7129d.m29393q(outputStream, c7128c.f25344c);
        AbstractC7129d.m29393q(outputStream, c7128c.f25348g);
        AbstractC7129d.m29390n(outputStream, str);
    }

    /* renamed from: H */
    public static void m29405H(OutputStream outputStream, C7128c c7128c) {
        byte[] bArr = new byte[m29423k(c7128c.f25348g)];
        for (Map.Entry entry : c7128c.f25350i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                m29438z(bArr, 2, intValue, c7128c);
            }
            if ((intValue2 & 4) != 0) {
                m29438z(bArr, 4, intValue, c7128c);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    public static void m29406I(OutputStream outputStream, C7128c c7128c) {
        int i7 = 0;
        for (Map.Entry entry : c7128c.f25350i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC7129d.m29392p(outputStream, intValue - i7);
                AbstractC7129d.m29392p(outputStream, 0);
                i7 = intValue;
            }
        }
    }

    /* renamed from: J */
    public static void m29407J(OutputStream outputStream, C7128c[] c7128cArr) {
        AbstractC7129d.m29392p(outputStream, c7128cArr.length);
        for (C7128c c7128c : c7128cArr) {
            String m29422j = m29422j(c7128c.f25342a, c7128c.f25343b, AbstractC7138m.f25372e);
            AbstractC7129d.m29392p(outputStream, AbstractC7129d.m29387k(m29422j));
            AbstractC7129d.m29392p(outputStream, c7128c.f25350i.size());
            AbstractC7129d.m29392p(outputStream, c7128c.f25349h.length);
            AbstractC7129d.m29393q(outputStream, c7128c.f25344c);
            AbstractC7129d.m29390n(outputStream, m29422j);
            Iterator it = c7128c.f25350i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC7129d.m29392p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i7 : c7128c.f25349h) {
                AbstractC7129d.m29392p(outputStream, i7);
            }
        }
    }

    /* renamed from: K */
    public static void m29408K(OutputStream outputStream, C7128c[] c7128cArr) {
        AbstractC7129d.m29394r(outputStream, c7128cArr.length);
        for (C7128c c7128c : c7128cArr) {
            int size = c7128c.f25350i.size() * 4;
            String m29422j = m29422j(c7128c.f25342a, c7128c.f25343b, AbstractC7138m.f25371d);
            AbstractC7129d.m29392p(outputStream, AbstractC7129d.m29387k(m29422j));
            AbstractC7129d.m29392p(outputStream, c7128c.f25349h.length);
            AbstractC7129d.m29393q(outputStream, size);
            AbstractC7129d.m29393q(outputStream, c7128c.f25344c);
            AbstractC7129d.m29390n(outputStream, m29422j);
            Iterator it = c7128c.f25350i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC7129d.m29392p(outputStream, ((Integer) it.next()).intValue());
                AbstractC7129d.m29392p(outputStream, 0);
            }
            for (int i7 : c7128c.f25349h) {
                AbstractC7129d.m29392p(outputStream, i7);
            }
        }
    }

    /* renamed from: L */
    public static void m29409L(OutputStream outputStream, C7128c[] c7128cArr) {
        byte[] m29414b = m29414b(c7128cArr, AbstractC7138m.f25370c);
        AbstractC7129d.m29394r(outputStream, c7128cArr.length);
        AbstractC7129d.m29389m(outputStream, m29414b);
    }

    /* renamed from: M */
    public static void m29410M(OutputStream outputStream, C7128c[] c7128cArr) {
        byte[] m29414b = m29414b(c7128cArr, AbstractC7138m.f25369b);
        AbstractC7129d.m29394r(outputStream, c7128cArr.length);
        AbstractC7129d.m29389m(outputStream, m29414b);
    }

    /* renamed from: N */
    public static void m29411N(OutputStream outputStream, C7128c[] c7128cArr) {
        m29412O(outputStream, c7128cArr);
    }

    /* renamed from: O */
    public static void m29412O(OutputStream outputStream, C7128c[] c7128cArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m29401D(c7128cArr));
        arrayList.add(m29415c(c7128cArr));
        arrayList.add(m29416d(c7128cArr));
        long length2 = AbstractC7138m.f25368a.length + f25366a.length + 4 + (arrayList.size() * 16);
        AbstractC7129d.m29393q(outputStream, arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C7139n c7139n = (C7139n) arrayList.get(i7);
            AbstractC7129d.m29393q(outputStream, c7139n.f25375a.m29396f());
            AbstractC7129d.m29393q(outputStream, length2);
            if (c7139n.f25378d) {
                byte[] bArr = c7139n.f25377c;
                long length3 = bArr.length;
                byte[] m29378b = AbstractC7129d.m29378b(bArr);
                arrayList2.add(m29378b);
                AbstractC7129d.m29393q(outputStream, m29378b.length);
                AbstractC7129d.m29393q(outputStream, length3);
                length = m29378b.length;
            } else {
                arrayList2.add(c7139n.f25377c);
                AbstractC7129d.m29393q(outputStream, c7139n.f25377c.length);
                AbstractC7129d.m29393q(outputStream, 0L);
                length = c7139n.f25377c.length;
            }
            length2 += length;
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            outputStream.write((byte[]) arrayList2.get(i8));
        }
    }

    /* renamed from: a */
    public static int m29413a(C7128c c7128c) {
        Iterator it = c7128c.f25350i.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i7;
    }

    /* renamed from: b */
    public static byte[] m29414b(C7128c[] c7128cArr, byte[] bArr) {
        int i7 = 0;
        int i8 = 0;
        for (C7128c c7128c : c7128cArr) {
            i8 += AbstractC7129d.m29387k(m29422j(c7128c.f25342a, c7128c.f25343b, bArr)) + 16 + (c7128c.f25346e * 2) + c7128c.f25347f + m29423k(c7128c.f25348g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        if (Arrays.equals(bArr, AbstractC7138m.f25370c)) {
            int length = c7128cArr.length;
            while (i7 < length) {
                C7128c c7128c2 = c7128cArr[i7];
                m29404G(byteArrayOutputStream, c7128c2, m29422j(c7128c2.f25342a, c7128c2.f25343b, bArr));
                m29403F(byteArrayOutputStream, c7128c2);
                i7++;
            }
        } else {
            for (C7128c c7128c3 : c7128cArr) {
                m29404G(byteArrayOutputStream, c7128c3, m29422j(c7128c3.f25342a, c7128c3.f25343b, bArr));
            }
            int length2 = c7128cArr.length;
            while (i7 < length2) {
                m29403F(byteArrayOutputStream, c7128cArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == i8) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC7129d.m29379c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i8);
    }

    /* renamed from: c */
    public static C7139n m29415c(C7128c[] c7128cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < c7128cArr.length; i8++) {
            try {
                C7128c c7128c = c7128cArr[i8];
                AbstractC7129d.m29392p(byteArrayOutputStream, i8);
                AbstractC7129d.m29392p(byteArrayOutputStream, c7128c.f25346e);
                i7 = i7 + 4 + (c7128c.f25346e * 2);
                m29400C(byteArrayOutputStream, c7128c);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            C7139n c7139n = new C7139n(EnumC7130e.CLASSES, i7, byteArray, true);
            byteArrayOutputStream.close();
            return c7139n;
        }
        throw AbstractC7129d.m29379c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    public static C7139n m29416d(C7128c[] c7128cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < c7128cArr.length; i8++) {
            try {
                C7128c c7128c = c7128cArr[i8];
                int m29413a = m29413a(c7128c);
                byte[] m29417e = m29417e(c7128c);
                byte[] m29418f = m29418f(c7128c);
                AbstractC7129d.m29392p(byteArrayOutputStream, i8);
                int length = m29417e.length + 2 + m29418f.length;
                AbstractC7129d.m29393q(byteArrayOutputStream, length);
                AbstractC7129d.m29392p(byteArrayOutputStream, m29413a);
                byteArrayOutputStream.write(m29417e);
                byteArrayOutputStream.write(m29418f);
                i7 = i7 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            C7139n c7139n = new C7139n(EnumC7130e.METHODS, i7, byteArray, true);
            byteArrayOutputStream.close();
            return c7139n;
        }
        throw AbstractC7129d.m29379c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    public static byte[] m29417e(C7128c c7128c) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m29405H(byteArrayOutputStream, c7128c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static byte[] m29418f(C7128c c7128c) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m29406I(byteArrayOutputStream, c7128c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static String m29419g(String str, String str2) {
        return "!".equals(str2) ? str.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!") : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(str2) ? str.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER) : str;
    }

    /* renamed from: h */
    public static String m29420h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    /* renamed from: i */
    public static C7128c m29421i(C7128c[] c7128cArr, String str) {
        if (c7128cArr.length <= 0) {
            return null;
        }
        String m29420h = m29420h(str);
        for (int i7 = 0; i7 < c7128cArr.length; i7++) {
            if (c7128cArr[i7].f25343b.equals(m29420h)) {
                return c7128cArr[i7];
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m29422j(String str, String str2, byte[] bArr) {
        String m29439a = AbstractC7138m.m29439a(bArr);
        if (str.length() <= 0) {
            return m29419g(str2, m29439a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            return m29419g(str2, m29439a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + AbstractC7138m.m29439a(bArr) + str2;
    }

    /* renamed from: k */
    public static int m29423k(int i7) {
        return m29437y(i7 * 2) / 8;
    }

    /* renamed from: l */
    public static int m29424l(int i7, int i8, int i9) {
        if (i7 == 1) {
            throw AbstractC7129d.m29379c("HOT methods are not stored in the bitmap");
        }
        if (i7 == 2) {
            return i8;
        }
        if (i7 == 4) {
            return i8 + i9;
        }
        throw AbstractC7129d.m29379c("Unexpected flag: " + i7);
    }

    /* renamed from: m */
    public static int[] m29425m(InputStream inputStream, int i7) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += AbstractC7129d.m29384h(inputStream);
            iArr[i9] = i8;
        }
        return iArr;
    }

    /* renamed from: n */
    public static int m29426n(BitSet bitSet, int i7, int i8) {
        int i9 = bitSet.get(m29424l(2, i7, i8)) ? 2 : 0;
        return bitSet.get(m29424l(4, i7, i8)) ? i9 | 4 : i9;
    }

    /* renamed from: o */
    public static byte[] m29427o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC7129d.m29380d(inputStream, bArr.length))) {
            return AbstractC7129d.m29380d(inputStream, AbstractC7138m.f25369b.length);
        }
        throw AbstractC7129d.m29379c("Invalid magic");
    }

    /* renamed from: p */
    public static void m29428p(InputStream inputStream, C7128c c7128c) {
        int available = inputStream.available() - c7128c.f25347f;
        int i7 = 0;
        while (inputStream.available() > available) {
            i7 += AbstractC7129d.m29384h(inputStream);
            c7128c.f25350i.put(Integer.valueOf(i7), 1);
            for (int m29384h = AbstractC7129d.m29384h(inputStream); m29384h > 0; m29384h--) {
                m29398A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw AbstractC7129d.m29379c("Read too much data during profile line parse");
        }
    }

    /* renamed from: q */
    public static C7128c[] m29429q(InputStream inputStream, byte[] bArr, byte[] bArr2, C7128c[] c7128cArr) {
        if (Arrays.equals(bArr, AbstractC7138m.f25373f)) {
            if (Arrays.equals(AbstractC7138m.f25368a, bArr2)) {
                throw AbstractC7129d.m29379c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m29430r(inputStream, bArr, c7128cArr);
        }
        if (Arrays.equals(bArr, AbstractC7138m.f25374g)) {
            return m29432t(inputStream, bArr2, c7128cArr);
        }
        throw AbstractC7129d.m29379c("Unsupported meta version");
    }

    /* renamed from: r */
    public static C7128c[] m29430r(InputStream inputStream, byte[] bArr, C7128c[] c7128cArr) {
        if (!Arrays.equals(bArr, AbstractC7138m.f25373f)) {
            throw AbstractC7129d.m29379c("Unsupported meta version");
        }
        int m29386j = AbstractC7129d.m29386j(inputStream);
        byte[] m29381e = AbstractC7129d.m29381e(inputStream, (int) AbstractC7129d.m29385i(inputStream), (int) AbstractC7129d.m29385i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC7129d.m29379c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m29381e);
        try {
            C7128c[] m29431s = m29431s(byteArrayInputStream, m29386j, c7128cArr);
            byteArrayInputStream.close();
            return m29431s;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static C7128c[] m29431s(InputStream inputStream, int i7, C7128c[] c7128cArr) {
        if (inputStream.available() == 0) {
            return new C7128c[0];
        }
        if (i7 != c7128cArr.length) {
            throw AbstractC7129d.m29379c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m29384h = AbstractC7129d.m29384h(inputStream);
            iArr[i8] = AbstractC7129d.m29384h(inputStream);
            strArr[i8] = AbstractC7129d.m29382f(inputStream, m29384h);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C7128c c7128c = c7128cArr[i9];
            if (!c7128c.f25343b.equals(strArr[i9])) {
                throw AbstractC7129d.m29379c("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            c7128c.f25346e = i10;
            c7128c.f25349h = m29425m(inputStream, i10);
        }
        return c7128cArr;
    }

    /* renamed from: t */
    public static C7128c[] m29432t(InputStream inputStream, byte[] bArr, C7128c[] c7128cArr) {
        int m29384h = AbstractC7129d.m29384h(inputStream);
        byte[] m29381e = AbstractC7129d.m29381e(inputStream, (int) AbstractC7129d.m29385i(inputStream), (int) AbstractC7129d.m29385i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC7129d.m29379c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m29381e);
        try {
            C7128c[] m29433u = m29433u(byteArrayInputStream, bArr, m29384h, c7128cArr);
            byteArrayInputStream.close();
            return m29433u;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: u */
    public static C7128c[] m29433u(InputStream inputStream, byte[] bArr, int i7, C7128c[] c7128cArr) {
        if (inputStream.available() == 0) {
            return new C7128c[0];
        }
        if (i7 != c7128cArr.length) {
            throw AbstractC7129d.m29379c("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            AbstractC7129d.m29384h(inputStream);
            String m29382f = AbstractC7129d.m29382f(inputStream, AbstractC7129d.m29384h(inputStream));
            long m29385i = AbstractC7129d.m29385i(inputStream);
            int m29384h = AbstractC7129d.m29384h(inputStream);
            C7128c m29421i = m29421i(c7128cArr, m29382f);
            if (m29421i == null) {
                throw AbstractC7129d.m29379c("Missing profile key: " + m29382f);
            }
            m29421i.f25345d = m29385i;
            int[] m29425m = m29425m(inputStream, m29384h);
            if (Arrays.equals(bArr, AbstractC7138m.f25372e)) {
                m29421i.f25346e = m29384h;
                m29421i.f25349h = m29425m;
            }
        }
        return c7128cArr;
    }

    /* renamed from: v */
    public static void m29434v(InputStream inputStream, C7128c c7128c) {
        BitSet valueOf = BitSet.valueOf(AbstractC7129d.m29380d(inputStream, AbstractC7129d.m29377a(c7128c.f25348g * 2)));
        int i7 = 0;
        while (true) {
            int i8 = c7128c.f25348g;
            if (i7 >= i8) {
                return;
            }
            int m29426n = m29426n(valueOf, i7, i8);
            if (m29426n != 0) {
                Integer num = (Integer) c7128c.f25350i.get(Integer.valueOf(i7));
                if (num == null) {
                    num = 0;
                }
                c7128c.f25350i.put(Integer.valueOf(i7), Integer.valueOf(m29426n | num.intValue()));
            }
            i7++;
        }
    }

    /* renamed from: w */
    public static C7128c[] m29435w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, AbstractC7138m.f25369b)) {
            throw AbstractC7129d.m29379c("Unsupported version");
        }
        int m29386j = AbstractC7129d.m29386j(inputStream);
        byte[] m29381e = AbstractC7129d.m29381e(inputStream, (int) AbstractC7129d.m29385i(inputStream), (int) AbstractC7129d.m29385i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC7129d.m29379c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m29381e);
        try {
            C7128c[] m29436x = m29436x(byteArrayInputStream, str, m29386j);
            byteArrayInputStream.close();
            return m29436x;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: x */
    public static C7128c[] m29436x(InputStream inputStream, String str, int i7) {
        if (inputStream.available() == 0) {
            return new C7128c[0];
        }
        C7128c[] c7128cArr = new C7128c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m29384h = AbstractC7129d.m29384h(inputStream);
            int m29384h2 = AbstractC7129d.m29384h(inputStream);
            c7128cArr[i8] = new C7128c(str, AbstractC7129d.m29382f(inputStream, m29384h), AbstractC7129d.m29385i(inputStream), 0L, m29384h2, (int) AbstractC7129d.m29385i(inputStream), (int) AbstractC7129d.m29385i(inputStream), new int[m29384h2], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C7128c c7128c = c7128cArr[i9];
            m29428p(inputStream, c7128c);
            c7128c.f25349h = m29425m(inputStream, c7128c.f25346e);
            m29434v(inputStream, c7128c);
        }
        return c7128cArr;
    }

    /* renamed from: y */
    public static int m29437y(int i7) {
        return (i7 + 7) & (-8);
    }

    /* renamed from: z */
    public static void m29438z(byte[] bArr, int i7, int i8, C7128c c7128c) {
        int m29424l = m29424l(i7, i8, c7128c.f25348g);
        int i9 = m29424l / 8;
        bArr[i9] = (byte) ((1 << (m29424l % 8)) | bArr[i9]);
    }
}
