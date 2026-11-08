package p382y2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p031E2.AbstractC0267c;

/* renamed from: y2.e */
/* loaded from: classes.dex */
public abstract class AbstractC7069e {
    /* renamed from: a */
    public static InterfaceC7068d m29143a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC3802r.m15129k(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        InterfaceC7068d interfaceC7068d = (InterfaceC7068d) creator.createFromParcel(obtain);
        obtain.recycle();
        return interfaceC7068d;
    }

    /* renamed from: b */
    public static InterfaceC7068d m29144b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m29143a(byteArrayExtra, creator);
    }

    /* renamed from: c */
    public static InterfaceC7068d m29145c(String str, Parcelable.Creator creator) {
        return m29143a(AbstractC0267c.m1105a(str), creator);
    }

    /* renamed from: d */
    public static byte[] m29146d(InterfaceC7068d interfaceC7068d) {
        Parcel obtain = Parcel.obtain();
        interfaceC7068d.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: e */
    public static void m29147e(InterfaceC7068d interfaceC7068d, Intent intent, String str) {
        intent.putExtra(str, m29146d(interfaceC7068d));
    }

    /* renamed from: f */
    public static String m29148f(InterfaceC7068d interfaceC7068d) {
        return AbstractC0267c.m1108d(m29146d(interfaceC7068d));
    }
}
