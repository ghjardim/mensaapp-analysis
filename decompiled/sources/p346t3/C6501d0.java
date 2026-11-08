package p346t3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: t3.d0 */
/* loaded from: classes.dex */
public class C6501d0 extends AbstractC7065a {
    public static final Parcelable.Creator<C6501d0> CREATOR = new C6539w0();

    /* renamed from: a */
    public String f23408a;

    /* renamed from: b */
    public String f23409b;

    /* renamed from: c */
    public boolean f23410c;

    /* renamed from: d */
    public boolean f23411d;

    /* renamed from: e */
    public Uri f23412e;

    /* renamed from: t3.d0$a */
    public static class a {

        /* renamed from: a */
        public String f23413a;

        /* renamed from: b */
        public Uri f23414b;

        /* renamed from: c */
        public boolean f23415c;

        /* renamed from: d */
        public boolean f23416d;

        /* renamed from: a */
        public C6501d0 m27072a() {
            String str = this.f23413a;
            Uri uri = this.f23414b;
            return new C6501d0(str, uri == null ? null : uri.toString(), this.f23415c, this.f23416d);
        }

        /* renamed from: b */
        public a m27073b(String str) {
            if (str == null) {
                this.f23415c = true;
            } else {
                this.f23413a = str;
            }
            return this;
        }

        /* renamed from: c */
        public a m27074c(Uri uri) {
            if (uri == null) {
                this.f23416d = true;
            } else {
                this.f23414b = uri;
            }
            return this;
        }
    }

    public C6501d0(String str, String str2, boolean z6, boolean z7) {
        this.f23408a = str;
        this.f23409b = str2;
        this.f23410c = z6;
        this.f23411d = z7;
        this.f23412e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* renamed from: M */
    public String m27069M() {
        return this.f23408a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m27069M(), false);
        AbstractC7067c.m29108E(parcel, 3, this.f23409b, false);
        AbstractC7067c.m29123g(parcel, 4, this.f23410c);
        AbstractC7067c.m29123g(parcel, 5, this.f23411d);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public Uri m27070x0() {
        return this.f23412e;
    }

    /* renamed from: y0 */
    public final boolean m27071y0() {
        return this.f23410c;
    }

    public final String zza() {
        return this.f23409b;
    }

    public final boolean zzc() {
        return this.f23411d;
    }
}
