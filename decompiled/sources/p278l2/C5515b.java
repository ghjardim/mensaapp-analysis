package p278l2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: l2.b */
/* loaded from: classes.dex */
public class C5515b extends AbstractC7065a {
    public static final Parcelable.Creator<C5515b> CREATOR = new C5521h();

    /* renamed from: a */
    public final int f19895a;

    /* renamed from: b */
    public int f19896b;

    /* renamed from: c */
    public String f19897c;

    /* renamed from: d */
    public Account f19898d;

    public C5515b(int i7, int i8, String str, Account account) {
        this.f19895a = i7;
        this.f19896b = i8;
        this.f19897c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f19898d = account;
        } else {
            this.f19898d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f19895a);
        AbstractC7067c.m29136t(parcel, 2, this.f19896b);
        AbstractC7067c.m29108E(parcel, 3, this.f19897c, false);
        AbstractC7067c.m29106C(parcel, 4, this.f19898d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
