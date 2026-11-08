package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: t3.e */
/* loaded from: classes.dex */
public class C6502e extends AbstractC7065a {
    public static final Parcelable.Creator<C6502e> CREATOR = new C6541x0();

    /* renamed from: a */
    public final String f23417a;

    /* renamed from: b */
    public final String f23418b;

    /* renamed from: c */
    public final String f23419c;

    /* renamed from: d */
    public final String f23420d;

    /* renamed from: e */
    public final boolean f23421e;

    /* renamed from: f */
    public final String f23422f;

    /* renamed from: n */
    public final boolean f23423n;

    /* renamed from: o */
    public String f23424o;

    /* renamed from: p */
    public int f23425p;

    /* renamed from: q */
    public String f23426q;

    /* renamed from: r */
    public final String f23427r;

    /* renamed from: t3.e$a */
    public static class a {

        /* renamed from: a */
        public String f23428a;

        /* renamed from: b */
        public String f23429b;

        /* renamed from: c */
        public String f23430c;

        /* renamed from: d */
        public boolean f23431d;

        /* renamed from: e */
        public String f23432e;

        /* renamed from: f */
        public boolean f23433f;

        /* renamed from: g */
        public String f23434g;

        /* renamed from: h */
        public String f23435h;

        /* renamed from: a */
        public C6502e m27095a() {
            if (this.f23428a != null) {
                return new C6502e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        /* renamed from: b */
        public a m27096b(String str, boolean z6, String str2) {
            this.f23430c = str;
            this.f23431d = z6;
            this.f23432e = str2;
            return this;
        }

        /* renamed from: c */
        public a m27097c(String str) {
            this.f23434g = str;
            return this;
        }

        /* renamed from: d */
        public a m27098d(boolean z6) {
            this.f23433f = z6;
            return this;
        }

        /* renamed from: e */
        public a m27099e(String str) {
            this.f23429b = str;
            return this;
        }

        /* renamed from: f */
        public a m27100f(String str) {
            this.f23435h = str;
            return this;
        }

        /* renamed from: g */
        public a m27101g(String str) {
            this.f23428a = str;
            return this;
        }

        public a() {
            this.f23433f = false;
        }
    }

    /* renamed from: E0 */
    public static a m27075E0() {
        return new a();
    }

    /* renamed from: I0 */
    public static C6502e m27076I0() {
        return new C6502e(new a());
    }

    /* renamed from: A0 */
    public String m27077A0() {
        return this.f23420d;
    }

    /* renamed from: B0 */
    public String m27078B0() {
        return this.f23418b;
    }

    /* renamed from: C0 */
    public String m27079C0() {
        return this.f23427r;
    }

    /* renamed from: D0 */
    public String m27080D0() {
        return this.f23417a;
    }

    /* renamed from: F0 */
    public final int m27081F0() {
        return this.f23425p;
    }

    /* renamed from: G0 */
    public final void m27082G0(int i7) {
        this.f23425p = i7;
    }

    /* renamed from: H0 */
    public final void m27083H0(String str) {
        this.f23424o = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m27080D0(), false);
        AbstractC7067c.m29108E(parcel, 2, m27078B0(), false);
        AbstractC7067c.m29108E(parcel, 3, this.f23419c, false);
        AbstractC7067c.m29108E(parcel, 4, m27077A0(), false);
        AbstractC7067c.m29123g(parcel, 5, m27085y0());
        AbstractC7067c.m29108E(parcel, 6, m27086z0(), false);
        AbstractC7067c.m29123g(parcel, 7, m27084x0());
        AbstractC7067c.m29108E(parcel, 8, this.f23424o, false);
        AbstractC7067c.m29136t(parcel, 9, this.f23425p);
        AbstractC7067c.m29108E(parcel, 10, this.f23426q, false);
        AbstractC7067c.m29108E(parcel, 11, m27079C0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public boolean m27084x0() {
        return this.f23423n;
    }

    /* renamed from: y0 */
    public boolean m27085y0() {
        return this.f23421e;
    }

    /* renamed from: z0 */
    public String m27086z0() {
        return this.f23422f;
    }

    public final String zzc() {
        return this.f23426q;
    }

    public final String zzd() {
        return this.f23419c;
    }

    public final String zze() {
        return this.f23424o;
    }

    public C6502e(a aVar) {
        this.f23417a = aVar.f23428a;
        this.f23418b = aVar.f23429b;
        this.f23419c = null;
        this.f23420d = aVar.f23430c;
        this.f23421e = aVar.f23431d;
        this.f23422f = aVar.f23432e;
        this.f23423n = aVar.f23433f;
        this.f23426q = aVar.f23434g;
        this.f23427r = aVar.f23435h;
    }

    public C6502e(String str, String str2, String str3, String str4, boolean z6, String str5, boolean z7, String str6, int i7, String str7, String str8) {
        this.f23417a = str;
        this.f23418b = str2;
        this.f23419c = str3;
        this.f23420d = str4;
        this.f23421e = z6;
        this.f23422f = str5;
        this.f23423n = z7;
        this.f23424o = str6;
        this.f23425p = i7;
        this.f23426q = str7;
        this.f23427r = str8;
    }
}
