package p368w2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3819z0;
import p052H2.BinderC0553b;
import p052H2.InterfaceC0552a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: w2.L */
/* loaded from: classes.dex */
public final class C6854L extends AbstractC7065a {
    public static final Parcelable.Creator<C6854L> CREATOR = new C6855M();

    /* renamed from: a */
    public final String f24662a;

    /* renamed from: b */
    public final AbstractBinderC6845C f24663b;

    /* renamed from: c */
    public final boolean f24664c;

    /* renamed from: d */
    public final boolean f24665d;

    public C6854L(String str, AbstractBinderC6845C abstractBinderC6845C, boolean z6, boolean z7) {
        this.f24662a = str;
        this.f24663b = abstractBinderC6845C;
        this.f24664c = z6;
        this.f24665d = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f24662a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, str, false);
        AbstractBinderC6845C abstractBinderC6845C = this.f24663b;
        if (abstractBinderC6845C == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC6845C = null;
        }
        AbstractC7067c.m29135s(parcel, 2, abstractBinderC6845C, false);
        AbstractC7067c.m29123g(parcel, 3, this.f24664c);
        AbstractC7067c.m29123g(parcel, 4, this.f24665d);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C6854L(String str, IBinder iBinder, boolean z6, boolean z7) {
        this.f24662a = str;
        BinderC6846D binderC6846D = null;
        if (iBinder != null) {
            try {
                InterfaceC0552a zzd = AbstractBinderC3819z0.m15162a(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) BinderC0553b.m2137b(zzd);
                if (bArr != null) {
                    binderC6846D = new BinderC6846D(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.f24663b = binderC6846D;
        this.f24664c = z6;
        this.f24665d = z7;
    }
}
