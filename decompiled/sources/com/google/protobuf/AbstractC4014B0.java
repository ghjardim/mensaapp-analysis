package com.google.protobuf;

import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.protobuf.B0 */
/* loaded from: classes.dex */
public abstract class AbstractC4014B0 {

    /* renamed from: a */
    public static final int f13238a = m16180c(1, 3);

    /* renamed from: b */
    public static final int f13239b = m16180c(1, 4);

    /* renamed from: c */
    public static final int f13240c = m16180c(2, 0);

    /* renamed from: d */
    public static final int f13241d = m16180c(3, 2);

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
    /* renamed from: com.google.protobuf.B0$b */
    public static class b {

        /* renamed from: A */
        public static final b f13242A;

        /* renamed from: B */
        public static final /* synthetic */ b[] f13243B;

        /* renamed from: c */
        public static final b f13244c;

        /* renamed from: d */
        public static final b f13245d;

        /* renamed from: e */
        public static final b f13246e;

        /* renamed from: f */
        public static final b f13247f;

        /* renamed from: n */
        public static final b f13248n;

        /* renamed from: o */
        public static final b f13249o;

        /* renamed from: p */
        public static final b f13250p;

        /* renamed from: q */
        public static final b f13251q;

        /* renamed from: r */
        public static final b f13252r;

        /* renamed from: s */
        public static final b f13253s;

        /* renamed from: t */
        public static final b f13254t;

        /* renamed from: u */
        public static final b f13255u;

        /* renamed from: v */
        public static final b f13256v;

        /* renamed from: w */
        public static final b f13257w;

        /* renamed from: x */
        public static final b f13258x;

        /* renamed from: y */
        public static final b f13259y;

        /* renamed from: z */
        public static final b f13260z;

        /* renamed from: a */
        public final c f13261a;

        /* renamed from: b */
        public final int f13262b;

        /* renamed from: com.google.protobuf.B0$b$a */
        public enum a extends b {
            public a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: com.google.protobuf.B0$b$b, reason: collision with other inner class name */
        public enum C7217b extends b {
            public C7217b(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: com.google.protobuf.B0$b$c */
        public enum c extends b {
            public c(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: com.google.protobuf.B0$b$d */
        public enum d extends b {
            public d(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f13244c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f13245d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f13246e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f13247f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f13248n = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f13249o = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f13250p = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f13251q = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f13252r = aVar;
            c cVar3 = c.MESSAGE;
            C7217b c7217b = new C7217b("GROUP", 9, cVar3, 3);
            f13253s = c7217b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f13254t = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f13255u = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f13256v = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f13257w = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f13258x = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f13259y = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f13260z = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f13242A = bVar14;
            f13243B = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c7217b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f13243B.clone();
        }

        /* renamed from: b */
        public c m16181b() {
            return this.f13261a;
        }

        /* renamed from: f */
        public int m16182f() {
            return this.f13262b;
        }

        public b(String str, int i7, c cVar, int i8) {
            this.f13261a = cVar;
            this.f13262b = i8;
        }
    }

    /* renamed from: com.google.protobuf.B0$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(StringUtils.EMPTY),
        BYTE_STRING(AbstractC4055i.f13379b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a */
        public final Object f13273a;

        c(Object obj) {
            this.f13273a = obj;
        }
    }

    /* renamed from: a */
    public static int m16178a(int i7) {
        return i7 >>> 3;
    }

    /* renamed from: b */
    public static int m16179b(int i7) {
        return i7 & 7;
    }

    /* renamed from: c */
    public static int m16180c(int i7, int i8) {
        return (i7 << 3) | i8;
    }
}
