package p361v2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v2.l */
/* loaded from: classes.dex */
public final class C6731l implements Parcelable {
    public static final Parcelable.Creator<C6731l> CREATOR = new C6729j();

    /* renamed from: a */
    public Messenger f24271a;

    public C6731l(IBinder iBinder) {
        this.f24271a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder m27682a() {
        Messenger messenger = this.f24271a;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void m27683b(Message message) {
        Messenger messenger = this.f24271a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m27682a().equals(((C6731l) obj).m27682a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m27682a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Messenger messenger = this.f24271a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
