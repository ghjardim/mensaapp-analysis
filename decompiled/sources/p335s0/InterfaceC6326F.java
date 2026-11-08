package p335s0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p284m0.InterfaceC5554b;
import p300o0.C5912w1;

/* renamed from: s0.F */
/* loaded from: classes.dex */
public interface InterfaceC6326F {

    /* renamed from: s0.F$a */
    public static final class a {

        /* renamed from: a */
        public final byte[] f22887a;

        /* renamed from: b */
        public final String f22888b;

        /* renamed from: c */
        public final int f22889c;

        public a(byte[] bArr, String str, int i7) {
            this.f22887a = bArr;
            this.f22888b = str;
            this.f22889c = i7;
        }

        /* renamed from: a */
        public byte[] m26504a() {
            return this.f22887a;
        }

        /* renamed from: b */
        public String m26505b() {
            return this.f22888b;
        }
    }

    /* renamed from: s0.F$b */
    public interface b {
        /* renamed from: a */
        void mo26506a(InterfaceC6326F interfaceC6326F, byte[] bArr, int i7, int i8, byte[] bArr2);
    }

    /* renamed from: s0.F$c */
    public interface c {
        /* renamed from: a */
        InterfaceC6326F mo26507a(UUID uuid);
    }

    /* renamed from: s0.F$d */
    public static final class d {

        /* renamed from: a */
        public final byte[] f22890a;

        /* renamed from: b */
        public final String f22891b;

        public d(byte[] bArr, String str) {
            this.f22890a = bArr;
            this.f22891b = str;
        }

        /* renamed from: a */
        public byte[] m26508a() {
            return this.f22890a;
        }

        /* renamed from: b */
        public String m26509b() {
            return this.f22891b;
        }
    }

    /* renamed from: a */
    void mo26481a(byte[] bArr, C5912w1 c5912w1);

    /* renamed from: b */
    Map mo26482b(byte[] bArr);

    /* renamed from: c */
    d mo26483c();

    /* renamed from: d */
    InterfaceC5554b mo26484d(byte[] bArr);

    /* renamed from: e */
    byte[] mo26485e();

    /* renamed from: f */
    boolean mo26486f(byte[] bArr, String str);

    /* renamed from: g */
    void mo26487g(byte[] bArr, byte[] bArr2);

    /* renamed from: h */
    void mo26488h(byte[] bArr);

    /* renamed from: i */
    byte[] mo26489i(byte[] bArr, byte[] bArr2);

    /* renamed from: j */
    void mo26490j(b bVar);

    /* renamed from: k */
    void mo26491k(byte[] bArr);

    /* renamed from: l */
    a mo26492l(byte[] bArr, List list, int i7, HashMap hashMap);

    /* renamed from: m */
    int mo26493m();

    void release();
}
