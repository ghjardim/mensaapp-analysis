package p225f1;

import java.util.ArrayList;
import java.util.List;
import p078L0.C0854L;
import p078L0.InterfaceC0884s;
import p171Y2.C2936s;
import p184a1.C3099b;
import p232g0.C4295A;
import p259j0.C5357z;

/* renamed from: f1.p */
/* loaded from: classes.dex */
public final class C4241p {

    /* renamed from: d */
    public static final C2936s f14586d = C2936s.m10589d(':');

    /* renamed from: e */
    public static final C2936s f14587e = C2936s.m10589d('*');

    /* renamed from: a */
    public final List f14588a = new ArrayList();

    /* renamed from: b */
    public int f14589b = 0;

    /* renamed from: c */
    public int f14590c;

    /* renamed from: f1.p$a */
    public static final class a {

        /* renamed from: a */
        public final int f14591a;

        /* renamed from: b */
        public final long f14592b;

        /* renamed from: c */
        public final int f14593c;

        public a(int i7, long j7, int i8) {
            this.f14591a = i7;
            this.f14592b = j7;
            this.f14593c = i8;
        }
    }

    /* renamed from: b */
    public static int m17812b(String str) {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw C4295A.m17943a("Invalid SEF name", null);
        }
    }

    /* renamed from: f */
    public static C3099b m17813f(C5357z c5357z, int i7) {
        ArrayList arrayList = new ArrayList();
        List m10591f = f14587e.m10591f(c5357z.m21923D(i7));
        for (int i8 = 0; i8 < m10591f.size(); i8++) {
            List m10591f2 = f14586d.m10591f((CharSequence) m10591f.get(i8));
            if (m10591f2.size() != 3) {
                throw C4295A.m17943a(null, null);
            }
            try {
                arrayList.add(new C3099b.b(Long.parseLong((String) m10591f2.get(0)), Long.parseLong((String) m10591f2.get(1)), 1 << (Integer.parseInt((String) m10591f2.get(2)) - 1)));
            } catch (NumberFormatException e7) {
                throw C4295A.m17943a(null, e7);
            }
        }
        return new C3099b(arrayList);
    }

    /* renamed from: a */
    public final void m17814a(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        C5357z c5357z = new C5357z(8);
        interfaceC0884s.readFully(c5357z.m21946e(), 0, 8);
        this.f14590c = c5357z.m21961t() + 8;
        if (c5357z.m21957p() != 1397048916) {
            c0854l.f2935a = 0L;
        } else {
            c0854l.f2935a = interfaceC0884s.mo3522u() - (this.f14590c - 12);
            this.f14589b = 2;
        }
    }

    /* renamed from: c */
    public int m17815c(InterfaceC0884s interfaceC0884s, C0854L c0854l, List list) {
        int i7 = this.f14589b;
        long j7 = 0;
        if (i7 == 0) {
            long mo3511a = interfaceC0884s.mo3511a();
            if (mo3511a != -1 && mo3511a >= 8) {
                j7 = mo3511a - 8;
            }
            c0854l.f2935a = j7;
            this.f14589b = 1;
        } else if (i7 == 1) {
            m17814a(interfaceC0884s, c0854l);
        } else if (i7 == 2) {
            m17816d(interfaceC0884s, c0854l);
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            m17817e(interfaceC0884s, list);
            c0854l.f2935a = 0L;
        }
        return 1;
    }

    /* renamed from: d */
    public final void m17816d(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        long mo3511a = interfaceC0884s.mo3511a();
        int i7 = this.f14590c - 20;
        C5357z c5357z = new C5357z(i7);
        interfaceC0884s.readFully(c5357z.m21946e(), 0, i7);
        for (int i8 = 0; i8 < i7 / 12; i8++) {
            c5357z.m21940U(2);
            short m21963v = c5357z.m21963v();
            if (m21963v == 2192 || m21963v == 2816 || m21963v == 2817 || m21963v == 2819 || m21963v == 2820) {
                this.f14588a.add(new a(m21963v, (mo3511a - this.f14590c) - c5357z.m21961t(), c5357z.m21961t()));
            } else {
                c5357z.m21940U(8);
            }
        }
        if (this.f14588a.isEmpty()) {
            c0854l.f2935a = 0L;
        } else {
            this.f14589b = 3;
            c0854l.f2935a = ((a) this.f14588a.get(0)).f14592b;
        }
    }

    /* renamed from: e */
    public final void m17817e(InterfaceC0884s interfaceC0884s, List list) {
        long mo3522u = interfaceC0884s.mo3522u();
        int mo3511a = (int) ((interfaceC0884s.mo3511a() - interfaceC0884s.mo3522u()) - this.f14590c);
        C5357z c5357z = new C5357z(mo3511a);
        interfaceC0884s.readFully(c5357z.m21946e(), 0, mo3511a);
        for (int i7 = 0; i7 < this.f14588a.size(); i7++) {
            a aVar = (a) this.f14588a.get(i7);
            c5357z.m21939T((int) (aVar.f14592b - mo3522u));
            c5357z.m21940U(4);
            int m21961t = c5357z.m21961t();
            int m17812b = m17812b(c5357z.m21923D(m21961t));
            int i8 = aVar.f14593c - (m21961t + 8);
            if (m17812b == 2192) {
                list.add(m17813f(c5357z, i8));
            } else if (m17812b != 2816 && m17812b != 2817 && m17812b != 2819 && m17812b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public void m17818g() {
        this.f14588a.clear();
        this.f14589b = 0;
    }
}
