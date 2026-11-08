package androidx.datastore.preferences.protobuf;

import org.apache.tika.utils.StringUtils;

/* renamed from: androidx.datastore.preferences.protobuf.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC3301k0 {

    /* renamed from: a */
    public static final int f10530a = m12747c(1, 3);

    /* renamed from: b */
    public static final int f10531b = m12747c(1, 4);

    /* renamed from: c */
    public static final int f10532c = m12747c(2, 0);

    /* renamed from: d */
    public static final int f10533d = m12747c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: androidx.datastore.preferences.protobuf.k0$b */
    public static class b {

        /* renamed from: A */
        public static final b f10534A;

        /* renamed from: B */
        public static final /* synthetic */ b[] f10535B;

        /* renamed from: c */
        public static final b f10536c;

        /* renamed from: d */
        public static final b f10537d;

        /* renamed from: e */
        public static final b f10538e;

        /* renamed from: f */
        public static final b f10539f;

        /* renamed from: n */
        public static final b f10540n;

        /* renamed from: o */
        public static final b f10541o;

        /* renamed from: p */
        public static final b f10542p;

        /* renamed from: q */
        public static final b f10543q;

        /* renamed from: r */
        public static final b f10544r;

        /* renamed from: s */
        public static final b f10545s;

        /* renamed from: t */
        public static final b f10546t;

        /* renamed from: u */
        public static final b f10547u;

        /* renamed from: v */
        public static final b f10548v;

        /* renamed from: w */
        public static final b f10549w;

        /* renamed from: x */
        public static final b f10550x;

        /* renamed from: y */
        public static final b f10551y;

        /* renamed from: z */
        public static final b f10552z;

        /* renamed from: a */
        public final c f10553a;

        /* renamed from: b */
        public final int f10554b;

        /* renamed from: androidx.datastore.preferences.protobuf.k0$b$a */
        public enum a extends b {
            public a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.k0$b$b, reason: collision with other inner class name */
        public enum C7208b extends b {
            public C7208b(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.k0$b$c */
        public enum c extends b {
            public c(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.k0$b$d */
        public enum d extends b {
            public d(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f10536c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f10537d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f10538e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f10539f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f10540n = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f10541o = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f10542p = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f10543q = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f10544r = aVar;
            c cVar3 = c.MESSAGE;
            C7208b c7208b = new C7208b("GROUP", 9, cVar3, 3);
            f10545s = c7208b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f10546t = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f10547u = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f10548v = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f10549w = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f10550x = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f10551y = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f10552z = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f10534A = bVar14;
            f10535B = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c7208b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10535B.clone();
        }

        /* renamed from: b */
        public c m12748b() {
            return this.f10553a;
        }

        /* renamed from: f */
        public int m12749f() {
            return this.f10554b;
        }

        public b(String str, int i7, c cVar, int i8) {
            this.f10553a = cVar;
            this.f10554b = i8;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k0$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(StringUtils.EMPTY),
        BYTE_STRING(AbstractC3290f.f10449b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a */
        public final Object f10565a;

        c(Object obj) {
            this.f10565a = obj;
        }
    }

    /* renamed from: a */
    public static int m12745a(int i7) {
        return i7 >>> 3;
    }

    /* renamed from: b */
    public static int m12746b(int i7) {
        return i7 & 7;
    }

    /* renamed from: c */
    public static int m12747c(int i7, int i8) {
        return (i7 << 3) | i8;
    }
}
