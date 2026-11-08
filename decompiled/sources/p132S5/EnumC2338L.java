package p132S5;

import p020C5.AbstractC0091b;
import p020C5.InterfaceC0090a;
import p069J5.InterfaceC0804p;
import p174Y5.AbstractC2956a;
import p174Y5.AbstractC2957b;
import p371w5.C6925h;
import p392z5.AbstractC7159g;
import p392z5.InterfaceC7157e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: S5.L */
/* loaded from: classes2.dex */
public final class EnumC2338L {

    /* renamed from: a */
    public static final EnumC2338L f7068a = new EnumC2338L("DEFAULT", 0);

    /* renamed from: b */
    public static final EnumC2338L f7069b = new EnumC2338L("LAZY", 1);

    /* renamed from: c */
    public static final EnumC2338L f7070c = new EnumC2338L("ATOMIC", 2);

    /* renamed from: d */
    public static final EnumC2338L f7071d = new EnumC2338L("UNDISPATCHED", 3);

    /* renamed from: e */
    public static final /* synthetic */ EnumC2338L[] f7072e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC0090a f7073f;

    /* renamed from: S5.L$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7074a;

        static {
            int[] iArr = new int[EnumC2338L.values().length];
            try {
                iArr[EnumC2338L.f7068a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2338L.f7070c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2338L.f7071d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2338L.f7069b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7074a = iArr;
        }
    }

    static {
        EnumC2338L[] m8001b = m8001b();
        f7072e = m8001b;
        f7073f = AbstractC0091b.m239a(m8001b);
    }

    public EnumC2338L(String str, int i7) {
    }

    /* renamed from: b */
    public static final /* synthetic */ EnumC2338L[] m8001b() {
        return new EnumC2338L[]{f7068a, f7069b, f7070c, f7071d};
    }

    public static EnumC2338L valueOf(String str) {
        return (EnumC2338L) Enum.valueOf(EnumC2338L.class, str);
    }

    public static EnumC2338L[] values() {
        return (EnumC2338L[]) f7072e.clone();
    }

    /* renamed from: f */
    public final void m8002f(InterfaceC0804p interfaceC0804p, Object obj, InterfaceC7157e interfaceC7157e) {
        int i7 = a.f7074a[ordinal()];
        if (i7 == 1) {
            AbstractC2956a.m10658d(interfaceC0804p, obj, interfaceC7157e, null, 4, null);
            return;
        }
        if (i7 == 2) {
            AbstractC7159g.m29472a(interfaceC0804p, obj, interfaceC7157e);
        } else if (i7 == 3) {
            AbstractC2957b.m10659a(interfaceC0804p, obj, interfaceC7157e);
        } else if (i7 != 4) {
            throw new C6925h();
        }
    }

    /* renamed from: g */
    public final boolean m8003g() {
        return this == f7069b;
    }
}
