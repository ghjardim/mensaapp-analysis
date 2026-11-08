package p006A5;

import p020C5.AbstractC0091b;
import p020C5.InterfaceC0090a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: A5.a */
/* loaded from: classes2.dex */
public final class EnumC0022a {

    /* renamed from: a */
    public static final EnumC0022a f132a = new EnumC0022a("COROUTINE_SUSPENDED", 0);

    /* renamed from: b */
    public static final EnumC0022a f133b = new EnumC0022a("UNDECIDED", 1);

    /* renamed from: c */
    public static final EnumC0022a f134c = new EnumC0022a("RESUMED", 2);

    /* renamed from: d */
    public static final /* synthetic */ EnumC0022a[] f135d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC0090a f136e;

    static {
        EnumC0022a[] m71b = m71b();
        f135d = m71b;
        f136e = AbstractC0091b.m239a(m71b);
    }

    public EnumC0022a(String str, int i7) {
    }

    /* renamed from: b */
    public static final /* synthetic */ EnumC0022a[] m71b() {
        return new EnumC0022a[]{f132a, f133b, f134c};
    }

    public static EnumC0022a valueOf(String str) {
        return (EnumC0022a) Enum.valueOf(EnumC0022a.class, str);
    }

    public static EnumC0022a[] values() {
        return (EnumC0022a[]) f135d.clone();
    }
}
