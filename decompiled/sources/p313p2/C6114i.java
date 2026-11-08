package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.i */
/* loaded from: classes.dex */
public class C6114i extends AbstractC7065a {
    public static final Parcelable.Creator<C6114i> CREATOR = new C6101C();

    /* renamed from: a */
    public final C6118m f21862a;

    /* renamed from: b */
    public final String f21863b;

    /* renamed from: c */
    public final int f21864c;

    /* renamed from: p2.i$a */
    public static final class a {

        /* renamed from: a */
        public C6118m f21865a;

        /* renamed from: b */
        public String f21866b;

        /* renamed from: c */
        public int f21867c;

        /* renamed from: a */
        public C6114i m25508a() {
            return new C6114i(this.f21865a, this.f21866b, this.f21867c);
        }

        /* renamed from: b */
        public a m25509b(C6118m c6118m) {
            this.f21865a = c6118m;
            return this;
        }

        /* renamed from: c */
        public final a m25510c(String str) {
            this.f21866b = str;
            return this;
        }

        /* renamed from: d */
        public final a m25511d(int i7) {
            this.f21867c = i7;
            return this;
        }
    }

    public C6114i(C6118m c6118m, String str, int i7) {
        this.f21862a = (C6118m) AbstractC3802r.m15129k(c6118m);
        this.f21863b = str;
        this.f21864c = i7;
    }

    /* renamed from: x0 */
    public static a m25505x0() {
        return new a();
    }

    /* renamed from: z0 */
    public static a m25506z0(C6114i c6114i) {
        AbstractC3802r.m15129k(c6114i);
        a m25505x0 = m25505x0();
        m25505x0.m25509b(c6114i.m25507y0());
        m25505x0.m25511d(c6114i.f21864c);
        String str = c6114i.f21863b;
        if (str != null) {
            m25505x0.m25510c(str);
        }
        return m25505x0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6114i)) {
            return false;
        }
        C6114i c6114i = (C6114i) obj;
        return AbstractC3798p.m15099b(this.f21862a, c6114i.f21862a) && AbstractC3798p.m15099b(this.f21863b, c6114i.f21863b) && this.f21864c == c6114i.f21864c;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21862a, this.f21863b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m25507y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 2, this.f21863b, false);
        AbstractC7067c.m29136t(parcel, 3, this.f21864c);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: y0 */
    public C6118m m25507y0() {
        return this.f21862a;
    }
}
