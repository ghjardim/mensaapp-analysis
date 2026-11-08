package p111P5;

import p020C5.AbstractC0091b;
import p020C5.InterfaceC0090a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: P5.k */
/* loaded from: classes2.dex */
public final class EnumC1977k {

    /* renamed from: a */
    public static final EnumC1977k f5974a = new EnumC1977k("PUBLIC", 0);

    /* renamed from: b */
    public static final EnumC1977k f5975b = new EnumC1977k("PROTECTED", 1);

    /* renamed from: c */
    public static final EnumC1977k f5976c = new EnumC1977k("INTERNAL", 2);

    /* renamed from: d */
    public static final EnumC1977k f5977d = new EnumC1977k("PRIVATE", 3);

    /* renamed from: e */
    public static final /* synthetic */ EnumC1977k[] f5978e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC0090a f5979f;

    static {
        EnumC1977k[] m7026b = m7026b();
        f5978e = m7026b;
        f5979f = AbstractC0091b.m239a(m7026b);
    }

    public EnumC1977k(String str, int i7) {
    }

    /* renamed from: b */
    public static final /* synthetic */ EnumC1977k[] m7026b() {
        return new EnumC1977k[]{f5974a, f5975b, f5976c, f5977d};
    }

    public static EnumC1977k valueOf(String str) {
        return (EnumC1977k) Enum.valueOf(EnumC1977k.class, str);
    }

    public static EnumC1977k[] values() {
        return (EnumC1977k[]) f5978e.clone();
    }
}
