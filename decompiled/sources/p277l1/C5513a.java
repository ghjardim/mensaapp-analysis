package p277l1;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import org.apache.tika.utils.XMLReaderUtils;
import p248i0.C4503a;
import p249i1.AbstractC4528s;
import p249i1.C4514e;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C5513a implements InterfaceC4529t {

    /* renamed from: a */
    public final C5357z f19876a = new C5357z();

    /* renamed from: b */
    public final C5357z f19877b = new C5357z();

    /* renamed from: c */
    public final a f19878c = new a();

    /* renamed from: d */
    public Inflater f19879d;

    /* renamed from: l1.a$a */
    public static final class a {

        /* renamed from: a */
        public final C5357z f19880a = new C5357z();

        /* renamed from: b */
        public final int[] f19881b = new int[256];

        /* renamed from: c */
        public boolean f19882c;

        /* renamed from: d */
        public int f19883d;

        /* renamed from: e */
        public int f19884e;

        /* renamed from: f */
        public int f19885f;

        /* renamed from: g */
        public int f19886g;

        /* renamed from: h */
        public int f19887h;

        /* renamed from: i */
        public int f19888i;

        /* renamed from: d */
        public C4503a m23146d() {
            int i7;
            if (this.f19883d == 0 || this.f19884e == 0 || this.f19887h == 0 || this.f19888i == 0 || this.f19880a.m21948g() == 0 || this.f19880a.m21947f() != this.f19880a.m21948g() || !this.f19882c) {
                return null;
            }
            this.f19880a.m21939T(0);
            int i8 = this.f19887h * this.f19888i;
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int m21926G = this.f19880a.m21926G();
                if (m21926G != 0) {
                    i7 = i9 + 1;
                    iArr[i9] = this.f19881b[m21926G];
                } else {
                    int m21926G2 = this.f19880a.m21926G();
                    if (m21926G2 != 0) {
                        i7 = ((m21926G2 & 64) == 0 ? m21926G2 & 63 : ((m21926G2 & 63) << 8) | this.f19880a.m21926G()) + i9;
                        Arrays.fill(iArr, i9, i7, (m21926G2 & 128) == 0 ? this.f19881b[0] : this.f19881b[this.f19880a.m21926G()]);
                    }
                }
                i9 = i7;
            }
            return new C4503a.b().m19192f(Bitmap.createBitmap(iArr, this.f19887h, this.f19888i, Bitmap.Config.ARGB_8888)).m19197k(this.f19885f / this.f19883d).m19198l(0).m19194h(this.f19886g / this.f19884e, 0).m19195i(0).m19200n(this.f19887h / this.f19883d).m19193g(this.f19888i / this.f19884e).m19187a();
        }

        /* renamed from: e */
        public final void m23147e(C5357z c5357z, int i7) {
            int m21929J;
            if (i7 < 4) {
                return;
            }
            c5357z.m21940U(3);
            int i8 = i7 - 4;
            if ((c5357z.m21926G() & 128) != 0) {
                if (i8 < 7 || (m21929J = c5357z.m21929J()) < 4) {
                    return;
                }
                this.f19887h = c5357z.m21932M();
                this.f19888i = c5357z.m21932M();
                this.f19880a.m21935P(m21929J - 4);
                i8 = i7 - 11;
            }
            int m21947f = this.f19880a.m21947f();
            int m21948g = this.f19880a.m21948g();
            if (m21947f >= m21948g || i8 <= 0) {
                return;
            }
            int min = Math.min(i8, m21948g - m21947f);
            c5357z.m21953l(this.f19880a.m21946e(), m21947f, min);
            this.f19880a.m21939T(m21947f + min);
        }

        /* renamed from: f */
        public final void m23148f(C5357z c5357z, int i7) {
            if (i7 < 19) {
                return;
            }
            this.f19883d = c5357z.m21932M();
            this.f19884e = c5357z.m21932M();
            c5357z.m21940U(11);
            this.f19885f = c5357z.m21932M();
            this.f19886g = c5357z.m21932M();
        }

        /* renamed from: g */
        public final void m23149g(C5357z c5357z, int i7) {
            if (i7 % 5 != 2) {
                return;
            }
            c5357z.m21940U(2);
            Arrays.fill(this.f19881b, 0);
            int i8 = i7 / 5;
            for (int i9 = 0; i9 < i8; i9++) {
                int m21926G = c5357z.m21926G();
                int m21926G2 = c5357z.m21926G();
                int m21926G3 = c5357z.m21926G();
                int m21926G4 = c5357z.m21926G();
                double d7 = m21926G2;
                double d8 = m21926G3 - 128;
                double d9 = m21926G4 - 128;
                this.f19881b[m21926G] = (AbstractC5330M.m21766p((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255) << 8) | (c5357z.m21926G() << 24) | (AbstractC5330M.m21766p((int) ((1.402d * d8) + d7), 0, 255) << 16) | AbstractC5330M.m21766p((int) (d7 + (d9 * 1.772d)), 0, 255);
            }
            this.f19882c = true;
        }

        /* renamed from: h */
        public void m23150h() {
            this.f19883d = 0;
            this.f19884e = 0;
            this.f19885f = 0;
            this.f19886g = 0;
            this.f19887h = 0;
            this.f19888i = 0;
            this.f19880a.m21935P(0);
            this.f19882c = false;
        }
    }

    /* renamed from: e */
    public static C4503a m23141e(C5357z c5357z, a aVar) {
        int m21948g = c5357z.m21948g();
        int m21926G = c5357z.m21926G();
        int m21932M = c5357z.m21932M();
        int m21947f = c5357z.m21947f() + m21932M;
        C4503a c4503a = null;
        if (m21947f > m21948g) {
            c5357z.m21939T(m21948g);
            return null;
        }
        if (m21926G != 128) {
            switch (m21926G) {
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    aVar.m23149g(c5357z, m21932M);
                    break;
                case 21:
                    aVar.m23147e(c5357z, m21932M);
                    break;
                case 22:
                    aVar.m23148f(c5357z, m21932M);
                    break;
            }
        } else {
            c4503a = aVar.m23146d();
            aVar.m23150h();
        }
        c5357z.m21939T(m21947f);
        return c4503a;
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        this.f19876a.m21937R(bArr, i8 + i7);
        this.f19876a.m21939T(i7);
        m23142d(this.f19876a);
        this.f19878c.m23150h();
        ArrayList arrayList = new ArrayList();
        while (this.f19876a.m21942a() >= 3) {
            C4503a m23141e = m23141e(this.f19876a, this.f19878c);
            if (m23141e != null) {
                arrayList.add(m23141e);
            }
        }
        interfaceC5338g.accept(new C4514e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 2;
    }

    /* renamed from: d */
    public final void m23142d(C5357z c5357z) {
        if (c5357z.m21942a() <= 0 || c5357z.m21951j() != 120) {
            return;
        }
        if (this.f19879d == null) {
            this.f19879d = new Inflater();
        }
        if (AbstractC5330M.m21781w0(c5357z, this.f19877b, this.f19879d)) {
            c5357z.m21937R(this.f19877b.m21946e(), this.f19877b.m21948g());
        }
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
