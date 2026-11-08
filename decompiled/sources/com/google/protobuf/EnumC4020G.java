package com.google.protobuf;

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
/* renamed from: com.google.protobuf.G */
/* loaded from: classes.dex */
public final class EnumC4020G {

    /* renamed from: d */
    public static final EnumC4020G f13294d;

    /* renamed from: e */
    public static final EnumC4020G f13295e;

    /* renamed from: f */
    public static final EnumC4020G f13296f;

    /* renamed from: n */
    public static final EnumC4020G f13297n;

    /* renamed from: o */
    public static final EnumC4020G f13298o;

    /* renamed from: p */
    public static final EnumC4020G f13299p;

    /* renamed from: q */
    public static final EnumC4020G f13300q;

    /* renamed from: r */
    public static final EnumC4020G f13301r;

    /* renamed from: s */
    public static final EnumC4020G f13302s;

    /* renamed from: t */
    public static final EnumC4020G f13303t;

    /* renamed from: u */
    public static final /* synthetic */ EnumC4020G[] f13304u;

    /* renamed from: a */
    public final Class f13305a;

    /* renamed from: b */
    public final Class f13306b;

    /* renamed from: c */
    public final Object f13307c;

    static {
        EnumC4020G enumC4020G = new EnumC4020G("VOID", 0, Void.class, Void.class, null);
        f13294d = enumC4020G;
        Class cls = Integer.TYPE;
        EnumC4020G enumC4020G2 = new EnumC4020G("INT", 1, cls, Integer.class, 0);
        f13295e = enumC4020G2;
        EnumC4020G enumC4020G3 = new EnumC4020G("LONG", 2, Long.TYPE, Long.class, 0L);
        f13296f = enumC4020G3;
        EnumC4020G enumC4020G4 = new EnumC4020G("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f13297n = enumC4020G4;
        EnumC4020G enumC4020G5 = new EnumC4020G("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f13298o = enumC4020G5;
        EnumC4020G enumC4020G6 = new EnumC4020G("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f13299p = enumC4020G6;
        EnumC4020G enumC4020G7 = new EnumC4020G("STRING", 6, String.class, String.class, StringUtils.EMPTY);
        f13300q = enumC4020G7;
        EnumC4020G enumC4020G8 = new EnumC4020G("BYTE_STRING", 7, AbstractC4055i.class, AbstractC4055i.class, AbstractC4055i.f13379b);
        f13301r = enumC4020G8;
        EnumC4020G enumC4020G9 = new EnumC4020G("ENUM", 8, cls, Integer.class, null);
        f13302s = enumC4020G9;
        EnumC4020G enumC4020G10 = new EnumC4020G("MESSAGE", 9, Object.class, Object.class, null);
        f13303t = enumC4020G10;
        f13304u = new EnumC4020G[]{enumC4020G, enumC4020G2, enumC4020G3, enumC4020G4, enumC4020G5, enumC4020G6, enumC4020G7, enumC4020G8, enumC4020G9, enumC4020G10};
    }

    public EnumC4020G(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f13305a = cls;
        this.f13306b = cls2;
        this.f13307c = obj;
    }

    public static EnumC4020G valueOf(String str) {
        return (EnumC4020G) Enum.valueOf(EnumC4020G.class, str);
    }

    public static EnumC4020G[] values() {
        return (EnumC4020G[]) f13304u.clone();
    }

    /* renamed from: b */
    public Class m16254b() {
        return this.f13306b;
    }
}
