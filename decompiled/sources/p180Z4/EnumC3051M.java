package p180Z4;

import kotlin.jvm.internal.AbstractC5464g;
import p020C5.AbstractC0091b;
import p020C5.InterfaceC0090a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Z4.M */
/* loaded from: classes2.dex */
public final class EnumC3051M {

    /* renamed from: b */
    public static final a f9483b;

    /* renamed from: c */
    public static final EnumC3051M f9484c = new EnumC3051M("PLATFORM_ENCODED", 0, 0);

    /* renamed from: d */
    public static final EnumC3051M f9485d = new EnumC3051M("JSON_ENCODED", 1, 1);

    /* renamed from: e */
    public static final EnumC3051M f9486e = new EnumC3051M("UNEXPECTED_STRING", 2, 2);

    /* renamed from: f */
    public static final /* synthetic */ EnumC3051M[] f9487f;

    /* renamed from: n */
    public static final /* synthetic */ InterfaceC0090a f9488n;

    /* renamed from: a */
    public final int f9489a;

    /* renamed from: Z4.M$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final EnumC3051M m11210a(int i7) {
            for (EnumC3051M enumC3051M : EnumC3051M.values()) {
                if (enumC3051M.m11209f() == i7) {
                    return enumC3051M;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        EnumC3051M[] m11208b = m11208b();
        f9487f = m11208b;
        f9488n = AbstractC0091b.m239a(m11208b);
        f9483b = new a(null);
    }

    public EnumC3051M(String str, int i7, int i8) {
        this.f9489a = i8;
    }

    /* renamed from: b */
    public static final /* synthetic */ EnumC3051M[] m11208b() {
        return new EnumC3051M[]{f9484c, f9485d, f9486e};
    }

    public static EnumC3051M valueOf(String str) {
        return (EnumC3051M) Enum.valueOf(EnumC3051M.class, str);
    }

    public static EnumC3051M[] values() {
        return (EnumC3051M[]) f9487f.clone();
    }

    /* renamed from: f */
    public final int m11209f() {
        return this.f9489a;
    }
}
