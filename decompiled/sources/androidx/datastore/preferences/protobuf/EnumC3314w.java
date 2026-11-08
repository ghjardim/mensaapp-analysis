package androidx.datastore.preferences.protobuf;

import org.apache.tika.utils.StringUtils;

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
/* renamed from: androidx.datastore.preferences.protobuf.w */
/* loaded from: classes.dex */
public final class EnumC3314w {

    /* renamed from: d */
    public static final EnumC3314w f10670d;

    /* renamed from: e */
    public static final EnumC3314w f10671e;

    /* renamed from: f */
    public static final EnumC3314w f10672f;

    /* renamed from: n */
    public static final EnumC3314w f10673n;

    /* renamed from: o */
    public static final EnumC3314w f10674o;

    /* renamed from: p */
    public static final EnumC3314w f10675p;

    /* renamed from: q */
    public static final EnumC3314w f10676q;

    /* renamed from: r */
    public static final EnumC3314w f10677r;

    /* renamed from: s */
    public static final EnumC3314w f10678s;

    /* renamed from: t */
    public static final EnumC3314w f10679t;

    /* renamed from: u */
    public static final /* synthetic */ EnumC3314w[] f10680u;

    /* renamed from: a */
    public final Class f10681a;

    /* renamed from: b */
    public final Class f10682b;

    /* renamed from: c */
    public final Object f10683c;

    static {
        EnumC3314w enumC3314w = new EnumC3314w("VOID", 0, Void.class, Void.class, null);
        f10670d = enumC3314w;
        Class cls = Integer.TYPE;
        EnumC3314w enumC3314w2 = new EnumC3314w("INT", 1, cls, Integer.class, 0);
        f10671e = enumC3314w2;
        EnumC3314w enumC3314w3 = new EnumC3314w("LONG", 2, Long.TYPE, Long.class, 0L);
        f10672f = enumC3314w3;
        EnumC3314w enumC3314w4 = new EnumC3314w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f10673n = enumC3314w4;
        EnumC3314w enumC3314w5 = new EnumC3314w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f10674o = enumC3314w5;
        EnumC3314w enumC3314w6 = new EnumC3314w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f10675p = enumC3314w6;
        EnumC3314w enumC3314w7 = new EnumC3314w("STRING", 6, String.class, String.class, StringUtils.EMPTY);
        f10676q = enumC3314w7;
        EnumC3314w enumC3314w8 = new EnumC3314w("BYTE_STRING", 7, AbstractC3290f.class, AbstractC3290f.class, AbstractC3290f.f10449b);
        f10677r = enumC3314w8;
        EnumC3314w enumC3314w9 = new EnumC3314w("ENUM", 8, cls, Integer.class, null);
        f10678s = enumC3314w9;
        EnumC3314w enumC3314w10 = new EnumC3314w("MESSAGE", 9, Object.class, Object.class, null);
        f10679t = enumC3314w10;
        f10680u = new EnumC3314w[]{enumC3314w, enumC3314w2, enumC3314w3, enumC3314w4, enumC3314w5, enumC3314w6, enumC3314w7, enumC3314w8, enumC3314w9, enumC3314w10};
    }

    public EnumC3314w(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f10681a = cls;
        this.f10682b = cls2;
        this.f10683c = obj;
    }

    public static EnumC3314w valueOf(String str) {
        return (EnumC3314w) Enum.valueOf(EnumC3314w.class, str);
    }

    public static EnumC3314w[] values() {
        return (EnumC3314w[]) f10680u.clone();
    }

    /* renamed from: b */
    public Class m12855b() {
        return this.f10682b;
    }
}
