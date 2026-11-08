package p146U5;

import p020C5.AbstractC0091b;
import p020C5.InterfaceC0090a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: U5.a */
/* loaded from: classes2.dex */
public final class EnumC2583a {

    /* renamed from: a */
    public static final EnumC2583a f7562a = new EnumC2583a("SUSPEND", 0);

    /* renamed from: b */
    public static final EnumC2583a f7563b = new EnumC2583a("DROP_OLDEST", 1);

    /* renamed from: c */
    public static final EnumC2583a f7564c = new EnumC2583a("DROP_LATEST", 2);

    /* renamed from: d */
    public static final /* synthetic */ EnumC2583a[] f7565d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC0090a f7566e;

    static {
        EnumC2583a[] m8709b = m8709b();
        f7565d = m8709b;
        f7566e = AbstractC0091b.m239a(m8709b);
    }

    public EnumC2583a(String str, int i7) {
    }

    /* renamed from: b */
    public static final /* synthetic */ EnumC2583a[] m8709b() {
        return new EnumC2583a[]{f7562a, f7563b, f7564c};
    }

    public static EnumC2583a valueOf(String str) {
        return (EnumC2583a) Enum.valueOf(EnumC2583a.class, str);
    }

    public static EnumC2583a[] values() {
        return (EnumC2583a[]) f7565d.clone();
    }
}
