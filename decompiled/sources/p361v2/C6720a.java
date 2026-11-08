package p361v2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: v2.a */
/* loaded from: classes.dex */
public final class C6720a extends AbstractC7065a {
    public static final Parcelable.Creator<C6720a> CREATOR = new C6723d();

    /* renamed from: a */
    public final Intent f24250a;

    public C6720a(Intent intent) {
        this.f24250a = intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f24250a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public Intent m27663x0() {
        return this.f24250a;
    }

    /* renamed from: y0 */
    public String m27664y0() {
        String stringExtra = this.f24250a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f24250a.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: z0 */
    public final Integer m27665z0() {
        if (this.f24250a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f24250a.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
