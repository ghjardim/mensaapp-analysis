package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.b */
/* loaded from: classes.dex */
public final class C6107b extends AbstractC7065a {
    public static final Parcelable.Creator<C6107b> CREATOR = new C6123r();

    /* renamed from: a */
    public final e f21807a;

    /* renamed from: b */
    public final b f21808b;

    /* renamed from: c */
    public final String f21809c;

    /* renamed from: d */
    public final boolean f21810d;

    /* renamed from: e */
    public final int f21811e;

    /* renamed from: f */
    public final d f21812f;

    /* renamed from: n */
    public final c f21813n;

    /* renamed from: p2.b$a */
    public static final class a {

        /* renamed from: a */
        public e f21814a;

        /* renamed from: b */
        public b f21815b;

        /* renamed from: c */
        public d f21816c;

        /* renamed from: d */
        public c f21817d;

        /* renamed from: e */
        public String f21818e;

        /* renamed from: f */
        public boolean f21819f;

        /* renamed from: g */
        public int f21820g;

        public a() {
            e.a m25484x0 = e.m25484x0();
            m25484x0.m25487b(false);
            this.f21814a = m25484x0.m25486a();
            b.a m25463x0 = b.m25463x0();
            m25463x0.m25472b(false);
            this.f21815b = m25463x0.m25471a();
            d.a m25478x0 = d.m25478x0();
            m25478x0.m25483b(false);
            this.f21816c = m25478x0.m25482a();
            c.a m25473x0 = c.m25473x0();
            m25473x0.m25477b(false);
            this.f21817d = m25473x0.m25476a();
        }

        /* renamed from: a */
        public C6107b m25455a() {
            return new C6107b(this.f21814a, this.f21815b, this.f21818e, this.f21819f, this.f21820g, this.f21816c, this.f21817d);
        }

        /* renamed from: b */
        public a m25456b(boolean z6) {
            this.f21819f = z6;
            return this;
        }

        /* renamed from: c */
        public a m25457c(b bVar) {
            this.f21815b = (b) AbstractC3802r.m15129k(bVar);
            return this;
        }

        /* renamed from: d */
        public a m25458d(c cVar) {
            this.f21817d = (c) AbstractC3802r.m15129k(cVar);
            return this;
        }

        /* renamed from: e */
        public a m25459e(d dVar) {
            this.f21816c = (d) AbstractC3802r.m15129k(dVar);
            return this;
        }

        /* renamed from: f */
        public a m25460f(e eVar) {
            this.f21814a = (e) AbstractC3802r.m15129k(eVar);
            return this;
        }

        /* renamed from: g */
        public final a m25461g(String str) {
            this.f21818e = str;
            return this;
        }

        /* renamed from: h */
        public final a m25462h(int i7) {
            this.f21820g = i7;
            return this;
        }
    }

    /* renamed from: p2.b$b */
    public static final class b extends AbstractC7065a {
        public static final Parcelable.Creator<b> CREATOR = new C6128w();

        /* renamed from: a */
        public final boolean f21821a;

        /* renamed from: b */
        public final String f21822b;

        /* renamed from: c */
        public final String f21823c;

        /* renamed from: d */
        public final boolean f21824d;

        /* renamed from: e */
        public final String f21825e;

        /* renamed from: f */
        public final List f21826f;

        /* renamed from: n */
        public final boolean f21827n;

        /* renamed from: p2.b$b$a */
        public static final class a {

            /* renamed from: a */
            public boolean f21828a = false;

            /* renamed from: b */
            public String f21829b = null;

            /* renamed from: c */
            public String f21830c = null;

            /* renamed from: d */
            public boolean f21831d = true;

            /* renamed from: e */
            public String f21832e = null;

            /* renamed from: f */
            public List f21833f = null;

            /* renamed from: g */
            public boolean f21834g = false;

            /* renamed from: a */
            public b m25471a() {
                return new b(this.f21828a, this.f21829b, this.f21830c, this.f21831d, this.f21832e, this.f21833f, this.f21834g);
            }

            /* renamed from: b */
            public a m25472b(boolean z6) {
                this.f21828a = z6;
                return this;
            }
        }

        public b(boolean z6, String str, String str2, boolean z7, String str3, List list, boolean z8) {
            boolean z9 = true;
            if (z7 && z8) {
                z9 = false;
            }
            AbstractC3802r.m15120b(z9, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f21821a = z6;
            if (z6) {
                AbstractC3802r.m15130l(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f21822b = str;
            this.f21823c = str2;
            this.f21824d = z7;
            Parcelable.Creator<C6107b> creator = C6107b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f21826f = arrayList;
            this.f21825e = str3;
            this.f21827n = z8;
        }

        /* renamed from: x0 */
        public static a m25463x0() {
            return new a();
        }

        /* renamed from: A0 */
        public String m25464A0() {
            return this.f21825e;
        }

        /* renamed from: B0 */
        public String m25465B0() {
            return this.f21823c;
        }

        /* renamed from: C0 */
        public String m25466C0() {
            return this.f21822b;
        }

        /* renamed from: D0 */
        public boolean m25467D0() {
            return this.f21821a;
        }

        /* renamed from: E0 */
        public boolean m25468E0() {
            return this.f21827n;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f21821a == bVar.f21821a && AbstractC3798p.m15099b(this.f21822b, bVar.f21822b) && AbstractC3798p.m15099b(this.f21823c, bVar.f21823c) && this.f21824d == bVar.f21824d && AbstractC3798p.m15099b(this.f21825e, bVar.f21825e) && AbstractC3798p.m15099b(this.f21826f, bVar.f21826f) && this.f21827n == bVar.f21827n;
        }

        public int hashCode() {
            return AbstractC3798p.m15100c(Boolean.valueOf(this.f21821a), this.f21822b, this.f21823c, Boolean.valueOf(this.f21824d), this.f21825e, this.f21826f, Boolean.valueOf(this.f21827n));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int m29117a = AbstractC7067c.m29117a(parcel);
            AbstractC7067c.m29123g(parcel, 1, m25467D0());
            AbstractC7067c.m29108E(parcel, 2, m25466C0(), false);
            AbstractC7067c.m29108E(parcel, 3, m25465B0(), false);
            AbstractC7067c.m29123g(parcel, 4, m25469y0());
            AbstractC7067c.m29108E(parcel, 5, m25464A0(), false);
            AbstractC7067c.m29110G(parcel, 6, m25470z0(), false);
            AbstractC7067c.m29123g(parcel, 7, m25468E0());
            AbstractC7067c.m29118b(parcel, m29117a);
        }

        /* renamed from: y0 */
        public boolean m25469y0() {
            return this.f21824d;
        }

        /* renamed from: z0 */
        public List m25470z0() {
            return this.f21826f;
        }
    }

    /* renamed from: p2.b$c */
    public static final class c extends AbstractC7065a {
        public static final Parcelable.Creator<c> CREATOR = new C6129x();

        /* renamed from: a */
        public final boolean f21835a;

        /* renamed from: b */
        public final String f21836b;

        /* renamed from: p2.b$c$a */
        public static final class a {

            /* renamed from: a */
            public boolean f21837a = false;

            /* renamed from: b */
            public String f21838b;

            /* renamed from: a */
            public c m25476a() {
                return new c(this.f21837a, this.f21838b);
            }

            /* renamed from: b */
            public a m25477b(boolean z6) {
                this.f21837a = z6;
                return this;
            }
        }

        public c(boolean z6, String str) {
            if (z6) {
                AbstractC3802r.m15129k(str);
            }
            this.f21835a = z6;
            this.f21836b = str;
        }

        /* renamed from: x0 */
        public static a m25473x0() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21835a == cVar.f21835a && AbstractC3798p.m15099b(this.f21836b, cVar.f21836b);
        }

        public int hashCode() {
            return AbstractC3798p.m15100c(Boolean.valueOf(this.f21835a), this.f21836b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int m29117a = AbstractC7067c.m29117a(parcel);
            AbstractC7067c.m29123g(parcel, 1, m25475z0());
            AbstractC7067c.m29108E(parcel, 2, m25474y0(), false);
            AbstractC7067c.m29118b(parcel, m29117a);
        }

        /* renamed from: y0 */
        public String m25474y0() {
            return this.f21836b;
        }

        /* renamed from: z0 */
        public boolean m25475z0() {
            return this.f21835a;
        }
    }

    /* renamed from: p2.b$d */
    public static final class d extends AbstractC7065a {
        public static final Parcelable.Creator<d> CREATOR = new C6130y();

        /* renamed from: a */
        public final boolean f21839a;

        /* renamed from: b */
        public final byte[] f21840b;

        /* renamed from: c */
        public final String f21841c;

        /* renamed from: p2.b$d$a */
        public static final class a {

            /* renamed from: a */
            public boolean f21842a = false;

            /* renamed from: b */
            public byte[] f21843b;

            /* renamed from: c */
            public String f21844c;

            /* renamed from: a */
            public d m25482a() {
                return new d(this.f21842a, this.f21843b, this.f21844c);
            }

            /* renamed from: b */
            public a m25483b(boolean z6) {
                this.f21842a = z6;
                return this;
            }
        }

        public d(boolean z6, byte[] bArr, String str) {
            if (z6) {
                AbstractC3802r.m15129k(bArr);
                AbstractC3802r.m15129k(str);
            }
            this.f21839a = z6;
            this.f21840b = bArr;
            this.f21841c = str;
        }

        /* renamed from: x0 */
        public static a m25478x0() {
            return new a();
        }

        /* renamed from: A0 */
        public boolean m25479A0() {
            return this.f21839a;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21839a == dVar.f21839a && Arrays.equals(this.f21840b, dVar.f21840b) && ((str = this.f21841c) == (str2 = dVar.f21841c) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f21839a), this.f21841c}) * 31) + Arrays.hashCode(this.f21840b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int m29117a = AbstractC7067c.m29117a(parcel);
            AbstractC7067c.m29123g(parcel, 1, m25479A0());
            AbstractC7067c.m29127k(parcel, 2, m25480y0(), false);
            AbstractC7067c.m29108E(parcel, 3, m25481z0(), false);
            AbstractC7067c.m29118b(parcel, m29117a);
        }

        /* renamed from: y0 */
        public byte[] m25480y0() {
            return this.f21840b;
        }

        /* renamed from: z0 */
        public String m25481z0() {
            return this.f21841c;
        }
    }

    /* renamed from: p2.b$e */
    public static final class e extends AbstractC7065a {
        public static final Parcelable.Creator<e> CREATOR = new C6131z();

        /* renamed from: a */
        public final boolean f21845a;

        /* renamed from: p2.b$e$a */
        public static final class a {

            /* renamed from: a */
            public boolean f21846a = false;

            /* renamed from: a */
            public e m25486a() {
                return new e(this.f21846a);
            }

            /* renamed from: b */
            public a m25487b(boolean z6) {
                this.f21846a = z6;
                return this;
            }
        }

        public e(boolean z6) {
            this.f21845a = z6;
        }

        /* renamed from: x0 */
        public static a m25484x0() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f21845a == ((e) obj).f21845a;
        }

        public int hashCode() {
            return AbstractC3798p.m15100c(Boolean.valueOf(this.f21845a));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int m29117a = AbstractC7067c.m29117a(parcel);
            AbstractC7067c.m29123g(parcel, 1, m25485y0());
            AbstractC7067c.m29118b(parcel, m29117a);
        }

        /* renamed from: y0 */
        public boolean m25485y0() {
            return this.f21845a;
        }
    }

    public C6107b(e eVar, b bVar, String str, boolean z6, int i7, d dVar, c cVar) {
        this.f21807a = (e) AbstractC3802r.m15129k(eVar);
        this.f21808b = (b) AbstractC3802r.m15129k(bVar);
        this.f21809c = str;
        this.f21810d = z6;
        this.f21811e = i7;
        if (dVar == null) {
            d.a m25478x0 = d.m25478x0();
            m25478x0.m25483b(false);
            dVar = m25478x0.m25482a();
        }
        this.f21812f = dVar;
        if (cVar == null) {
            c.a m25473x0 = c.m25473x0();
            m25473x0.m25477b(false);
            cVar = m25473x0.m25476a();
        }
        this.f21813n = cVar;
    }

    /* renamed from: D0 */
    public static a m25448D0(C6107b c6107b) {
        AbstractC3802r.m15129k(c6107b);
        a m25449x0 = m25449x0();
        m25449x0.m25457c(c6107b.m25453y0());
        m25449x0.m25460f(c6107b.m25451B0());
        m25449x0.m25459e(c6107b.m25450A0());
        m25449x0.m25458d(c6107b.m25454z0());
        m25449x0.m25456b(c6107b.f21810d);
        m25449x0.m25462h(c6107b.f21811e);
        String str = c6107b.f21809c;
        if (str != null) {
            m25449x0.m25461g(str);
        }
        return m25449x0;
    }

    /* renamed from: x0 */
    public static a m25449x0() {
        return new a();
    }

    /* renamed from: A0 */
    public d m25450A0() {
        return this.f21812f;
    }

    /* renamed from: B0 */
    public e m25451B0() {
        return this.f21807a;
    }

    /* renamed from: C0 */
    public boolean m25452C0() {
        return this.f21810d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6107b)) {
            return false;
        }
        C6107b c6107b = (C6107b) obj;
        return AbstractC3798p.m15099b(this.f21807a, c6107b.f21807a) && AbstractC3798p.m15099b(this.f21808b, c6107b.f21808b) && AbstractC3798p.m15099b(this.f21812f, c6107b.f21812f) && AbstractC3798p.m15099b(this.f21813n, c6107b.f21813n) && AbstractC3798p.m15099b(this.f21809c, c6107b.f21809c) && this.f21810d == c6107b.f21810d && this.f21811e == c6107b.f21811e;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21807a, this.f21808b, this.f21812f, this.f21813n, this.f21809c, Boolean.valueOf(this.f21810d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m25451B0(), i7, false);
        AbstractC7067c.m29106C(parcel, 2, m25453y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 3, this.f21809c, false);
        AbstractC7067c.m29123g(parcel, 4, m25452C0());
        AbstractC7067c.m29136t(parcel, 5, this.f21811e);
        AbstractC7067c.m29106C(parcel, 6, m25450A0(), i7, false);
        AbstractC7067c.m29106C(parcel, 7, m25454z0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: y0 */
    public b m25453y0() {
        return this.f21808b;
    }

    /* renamed from: z0 */
    public c m25454z0() {
        return this.f21813n;
    }
}
