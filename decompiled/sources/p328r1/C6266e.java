package p328r1;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0868c;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p249i1.InterfaceC4529t;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.e */
/* loaded from: classes.dex */
public final class C6266e implements InterfaceC0883r {

    /* renamed from: d */
    public static final InterfaceC0889x f22489d = new InterfaceC0889x() { // from class: r1.d
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m26195e;
            m26195e = C6266e.m26195e();
            return m26195e;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: a */
    public final C6267f f22490a = new C6267f();

    /* renamed from: b */
    public final C5357z f22491b = new C5357z(16384);

    /* renamed from: c */
    public boolean f22492c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC0883r[] m26195e() {
        return new InterfaceC0883r[]{new C6266e()};
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f22492c = false;
        this.f22490a.mo26187b();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f22490a.mo26188c(interfaceC0885t, new InterfaceC6259K.d(0, 1));
        interfaceC0885t.mo472q();
        interfaceC0885t.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int read = interfaceC0884s.read(this.f22491b.m21946e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f22491b.m21939T(0);
        this.f22491b.m21938S(read);
        if (!this.f22492c) {
            this.f22490a.mo26190e(0L, 4);
            this.f22492c = true;
        }
        this.f22490a.mo26186a(this.f22491b);
        return 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        C5357z c5357z = new C5357z(10);
        int i7 = 0;
        while (true) {
            interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 10);
            c5357z.m21939T(0);
            if (c5357z.m21929J() != 4801587) {
                break;
            }
            c5357z.m21940U(3);
            int m21925F = c5357z.m21925F();
            i7 += m21925F + 10;
            interfaceC0884s.mo3515k(m21925F);
        }
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3515k(i7);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 7);
            c5357z.m21939T(0);
            int m21932M = c5357z.m21932M();
            if (m21932M == 44096 || m21932M == 44097) {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                int m3603e = AbstractC0868c.m3603e(c5357z.m21946e(), m21932M);
                if (m3603e == -1) {
                    return false;
                }
                interfaceC0884s.mo3515k(m3603e - 7);
            } else {
                interfaceC0884s.mo3518p();
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                interfaceC0884s.mo3515k(i9);
                i8 = 0;
            }
        }
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
