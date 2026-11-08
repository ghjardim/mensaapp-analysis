package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.f */
/* loaded from: classes.dex */
public class C6111f extends AbstractC7065a {
    public static final Parcelable.Creator<C6111f> CREATOR = new C6127v();

    /* renamed from: a */
    public final String f21849a;

    /* renamed from: b */
    public final String f21850b;

    /* renamed from: c */
    public final String f21851c;

    /* renamed from: d */
    public final String f21852d;

    /* renamed from: e */
    public final boolean f21853e;

    /* renamed from: f */
    public final int f21854f;

    /* renamed from: p2.f$a */
    public static final class a {

        /* renamed from: a */
        public String f21855a;

        /* renamed from: b */
        public String f21856b;

        /* renamed from: c */
        public String f21857c;

        /* renamed from: d */
        public String f21858d;

        /* renamed from: e */
        public boolean f21859e;

        /* renamed from: f */
        public int f21860f;

        /* renamed from: a */
        public C6111f m25495a() {
            return new C6111f(this.f21855a, this.f21856b, this.f21857c, this.f21858d, this.f21859e, this.f21860f);
        }

        /* renamed from: b */
        public a m25496b(String str) {
            this.f21856b = str;
            return this;
        }

        /* renamed from: c */
        public a m25497c(String str) {
            this.f21858d = str;
            return this;
        }

        /* renamed from: d */
        public a m25498d(boolean z6) {
            this.f21859e = z6;
            return this;
        }

        /* renamed from: e */
        public a m25499e(String str) {
            AbstractC3802r.m15129k(str);
            this.f21855a = str;
            return this;
        }

        /* renamed from: f */
        public final a m25500f(String str) {
            this.f21857c = str;
            return this;
        }

        /* renamed from: g */
        public final a m25501g(int i7) {
            this.f21860f = i7;
            return this;
        }
    }

    public C6111f(String str, String str2, String str3, String str4, boolean z6, int i7) {
        AbstractC3802r.m15129k(str);
        this.f21849a = str;
        this.f21850b = str2;
        this.f21851c = str3;
        this.f21852d = str4;
        this.f21853e = z6;
        this.f21854f = i7;
    }

    /* renamed from: C0 */
    public static a m25489C0(C6111f c6111f) {
        AbstractC3802r.m15129k(c6111f);
        a m25490x0 = m25490x0();
        m25490x0.m25499e(c6111f.m25491A0());
        m25490x0.m25497c(c6111f.m25494z0());
        m25490x0.m25496b(c6111f.m25493y0());
        m25490x0.m25498d(c6111f.f21853e);
        m25490x0.m25501g(c6111f.f21854f);
        String str = c6111f.f21851c;
        if (str != null) {
            m25490x0.m25500f(str);
        }
        return m25490x0;
    }

    /* renamed from: x0 */
    public static a m25490x0() {
        return new a();
    }

    /* renamed from: A0 */
    public String m25491A0() {
        return this.f21849a;
    }

    /* renamed from: B0 */
    public boolean m25492B0() {
        return this.f21853e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6111f)) {
            return false;
        }
        C6111f c6111f = (C6111f) obj;
        return AbstractC3798p.m15099b(this.f21849a, c6111f.f21849a) && AbstractC3798p.m15099b(this.f21852d, c6111f.f21852d) && AbstractC3798p.m15099b(this.f21850b, c6111f.f21850b) && AbstractC3798p.m15099b(Boolean.valueOf(this.f21853e), Boolean.valueOf(c6111f.f21853e)) && this.f21854f == c6111f.f21854f;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21849a, this.f21850b, this.f21852d, Boolean.valueOf(this.f21853e), Integer.valueOf(this.f21854f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m25491A0(), false);
        AbstractC7067c.m29108E(parcel, 2, m25493y0(), false);
        AbstractC7067c.m29108E(parcel, 3, this.f21851c, false);
        AbstractC7067c.m29108E(parcel, 4, m25494z0(), false);
        AbstractC7067c.m29123g(parcel, 5, m25492B0());
        AbstractC7067c.m29136t(parcel, 6, this.f21854f);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: y0 */
    public String m25493y0() {
        return this.f21850b;
    }

    /* renamed from: z0 */
    public String m25494z0() {
        return this.f21852d;
    }
}
