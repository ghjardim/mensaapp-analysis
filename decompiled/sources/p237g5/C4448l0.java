package p237g5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import p171Y2.AbstractC2922e;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.AbstractC2942y;
import p237g5.C4424Z;
import p256j$.util.DesugarCollections;

/* renamed from: g5.l0 */
/* loaded from: classes2.dex */
public final class C4448l0 {

    /* renamed from: d */
    public static final List f15794d = m18949f();

    /* renamed from: e */
    public static final C4448l0 f15795e = b.OK.m18965f();

    /* renamed from: f */
    public static final C4448l0 f15796f = b.CANCELLED.m18965f();

    /* renamed from: g */
    public static final C4448l0 f15797g = b.UNKNOWN.m18965f();

    /* renamed from: h */
    public static final C4448l0 f15798h = b.INVALID_ARGUMENT.m18965f();

    /* renamed from: i */
    public static final C4448l0 f15799i = b.DEADLINE_EXCEEDED.m18965f();

    /* renamed from: j */
    public static final C4448l0 f15800j = b.NOT_FOUND.m18965f();

    /* renamed from: k */
    public static final C4448l0 f15801k = b.ALREADY_EXISTS.m18965f();

    /* renamed from: l */
    public static final C4448l0 f15802l = b.PERMISSION_DENIED.m18965f();

    /* renamed from: m */
    public static final C4448l0 f15803m = b.UNAUTHENTICATED.m18965f();

    /* renamed from: n */
    public static final C4448l0 f15804n = b.RESOURCE_EXHAUSTED.m18965f();

    /* renamed from: o */
    public static final C4448l0 f15805o = b.FAILED_PRECONDITION.m18965f();

    /* renamed from: p */
    public static final C4448l0 f15806p = b.ABORTED.m18965f();

    /* renamed from: q */
    public static final C4448l0 f15807q = b.OUT_OF_RANGE.m18965f();

    /* renamed from: r */
    public static final C4448l0 f15808r = b.UNIMPLEMENTED.m18965f();

    /* renamed from: s */
    public static final C4448l0 f15809s = b.INTERNAL.m18965f();

    /* renamed from: t */
    public static final C4448l0 f15810t = b.UNAVAILABLE.m18965f();

    /* renamed from: u */
    public static final C4448l0 f15811u = b.DATA_LOSS.m18965f();

    /* renamed from: v */
    public static final C4424Z.g f15812v;

    /* renamed from: w */
    public static final C4424Z.j f15813w;

    /* renamed from: x */
    public static final C4424Z.g f15814x;

    /* renamed from: a */
    public final b f15815a;

    /* renamed from: b */
    public final String f15816b;

    /* renamed from: c */
    public final Throwable f15817c;

    /* renamed from: g5.l0$b */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: a */
        public final int f15836a;

        /* renamed from: b */
        public final byte[] f15837b;

        b(int i7) {
            this.f15836a = i7;
            this.f15837b = Integer.toString(i7).getBytes(AbstractC2922e.f9008a);
        }

        /* renamed from: f */
        public C4448l0 m18965f() {
            return (C4448l0) C4448l0.f15794d.get(this.f15836a);
        }

        /* renamed from: g */
        public int m18966g() {
            return this.f15836a;
        }

        /* renamed from: h */
        public final byte[] m18967h() {
            return this.f15837b;
        }
    }

    /* renamed from: g5.l0$c */
    public static final class c implements C4424Z.j {
        public c() {
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C4448l0 mo18816b(byte[] bArr) {
            return C4448l0.m18952i(bArr);
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo18815a(C4448l0 c4448l0) {
            return c4448l0.m18959m().m18967h();
        }
    }

    /* renamed from: g5.l0$d */
    public static final class d implements C4424Z.j {

        /* renamed from: a */
        public static final byte[] f15838a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        public d() {
        }

        /* renamed from: c */
        public static boolean m18970c(byte b7) {
            return b7 < 32 || b7 >= 126 || b7 == 37;
        }

        /* renamed from: e */
        public static String m18971e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i7 = 0;
            while (i7 < bArr.length) {
                if (bArr[i7] == 37 && i7 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i7 + 1, 2, AbstractC2922e.f9008a), 16));
                        i7 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i7]);
                i7++;
            }
            return new String(allocate.array(), 0, allocate.position(), AbstractC2922e.f9010c);
        }

        /* renamed from: g */
        public static byte[] m18972g(byte[] bArr, int i7) {
            byte[] bArr2 = new byte[((bArr.length - i7) * 3) + i7];
            if (i7 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i7);
            }
            int i8 = i7;
            while (i7 < bArr.length) {
                byte b7 = bArr[i7];
                if (m18970c(b7)) {
                    bArr2[i8] = 37;
                    byte[] bArr3 = f15838a;
                    bArr2[i8 + 1] = bArr3[(b7 >> 4) & 15];
                    bArr2[i8 + 2] = bArr3[b7 & 15];
                    i8 += 3;
                } else {
                    bArr2[i8] = b7;
                    i8++;
                }
                i7++;
            }
            return Arrays.copyOf(bArr2, i8);
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo18816b(byte[] bArr) {
            for (int i7 = 0; i7 < bArr.length; i7++) {
                byte b7 = bArr[i7];
                if (b7 < 32 || b7 >= 126 || (b7 == 37 && i7 + 2 < bArr.length)) {
                    return m18971e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] mo18815a(String str) {
            byte[] bytes = str.getBytes(AbstractC2922e.f9010c);
            for (int i7 = 0; i7 < bytes.length; i7++) {
                if (m18970c(bytes[i7])) {
                    return m18972g(bytes, i7);
                }
            }
            return bytes;
        }
    }

    static {
        f15812v = C4424Z.g.m18804g("grpc-status", false, new c());
        d dVar = new d();
        f15813w = dVar;
        f15814x = C4424Z.g.m18804g("grpc-message", false, dVar);
    }

    public C4448l0(b bVar) {
        this(bVar, null, null);
    }

    /* renamed from: f */
    public static List m18949f() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            C4448l0 c4448l0 = (C4448l0) treeMap.put(Integer.valueOf(bVar.m18966g()), new C4448l0(bVar));
            if (c4448l0 != null) {
                throw new IllegalStateException("Code value duplication between " + c4448l0.m18959m().name() + " & " + bVar.name());
            }
        }
        return DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* renamed from: g */
    public static String m18950g(C4448l0 c4448l0) {
        if (c4448l0.f15816b == null) {
            return c4448l0.f15815a.toString();
        }
        return c4448l0.f15815a + ": " + c4448l0.f15816b;
    }

    /* renamed from: h */
    public static C4448l0 m18951h(int i7) {
        if (i7 >= 0) {
            List list = f15794d;
            if (i7 < list.size()) {
                return (C4448l0) list.get(i7);
            }
        }
        return f15797g.m18963q("Unknown code " + i7);
    }

    /* renamed from: i */
    public static C4448l0 m18952i(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f15795e : m18953j(bArr);
    }

    /* renamed from: j */
    public static C4448l0 m18953j(byte[] bArr) {
        int i7;
        byte b7;
        int length = bArr.length;
        char c7 = 1;
        if (length != 1) {
            i7 = (length == 2 && (b7 = bArr[0]) >= 48 && b7 <= 57) ? (b7 - 48) * 10 : 0;
            return f15797g.m18963q("Unknown code " + new String(bArr, AbstractC2922e.f9008a));
        }
        c7 = 0;
        byte b8 = bArr[c7];
        if (b8 >= 48 && b8 <= 57) {
            int i8 = i7 + (b8 - 48);
            List list = f15794d;
            if (i8 < list.size()) {
                return (C4448l0) list.get(i8);
            }
        }
        return f15797g.m18963q("Unknown code " + new String(bArr, AbstractC2922e.f9008a));
    }

    /* renamed from: k */
    public static C4448l0 m18954k(Throwable th) {
        for (Throwable th2 = (Throwable) AbstractC2932o.m10573p(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof C4450m0) {
                return ((C4450m0) th2).m18976a();
            }
            if (th2 instanceof C4452n0) {
                return ((C4452n0) th2).m18977a();
            }
        }
        return f15797g.m18962p(th);
    }

    /* renamed from: c */
    public C4450m0 m18955c() {
        return new C4450m0(this);
    }

    /* renamed from: d */
    public C4452n0 m18956d() {
        return new C4452n0(this);
    }

    /* renamed from: e */
    public C4448l0 m18957e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f15816b == null) {
            return new C4448l0(this.f15815a, str, this.f15817c);
        }
        return new C4448l0(this.f15815a, this.f15816b + "\n" + str, this.f15817c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public Throwable m18958l() {
        return this.f15817c;
    }

    /* renamed from: m */
    public b m18959m() {
        return this.f15815a;
    }

    /* renamed from: n */
    public String m18960n() {
        return this.f15816b;
    }

    /* renamed from: o */
    public boolean m18961o() {
        return b.OK == this.f15815a;
    }

    /* renamed from: p */
    public C4448l0 m18962p(Throwable th) {
        return AbstractC2928k.m10550a(this.f15817c, th) ? this : new C4448l0(this.f15815a, this.f15816b, th);
    }

    /* renamed from: q */
    public C4448l0 m18963q(String str) {
        return AbstractC2928k.m10550a(this.f15816b, str) ? this : new C4448l0(this.f15815a, str, this.f15817c);
    }

    public String toString() {
        AbstractC2926i.b m10540d = AbstractC2926i.m10535c(this).m10540d("code", this.f15815a.name()).m10540d("description", this.f15816b);
        Throwable th = this.f15817c;
        Object obj = th;
        if (th != null) {
            obj = AbstractC2942y.m10619e(th);
        }
        return m10540d.m10540d("cause", obj).toString();
    }

    public C4448l0(b bVar, String str, Throwable th) {
        this.f15815a = (b) AbstractC2932o.m10573p(bVar, "code");
        this.f15816b = str;
        this.f15817c = th;
    }
}
