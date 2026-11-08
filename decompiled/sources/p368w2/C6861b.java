package p368w2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import org.apache.tika.utils.XMLReaderUtils;
import p272k4.C5413D;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public final class C6861b extends AbstractC7065a {

    /* renamed from: a */
    public final int f24675a;

    /* renamed from: b */
    public final int f24676b;

    /* renamed from: c */
    public final PendingIntent f24677c;

    /* renamed from: d */
    public final String f24678d;

    /* renamed from: e */
    public static final C6861b f24674e = new C6861b(0);
    public static final Parcelable.Creator<C6861b> CREATOR = new C6880u();

    public C6861b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f24675a = i7;
        this.f24676b = i8;
        this.f24677c = pendingIntent;
        this.f24678d = str;
    }

    /* renamed from: C0 */
    public static String m28239C0(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i7 + ")";
                }
        }
    }

    /* renamed from: A0 */
    public boolean m28240A0() {
        return (this.f24676b == 0 || this.f24677c == null) ? false : true;
    }

    /* renamed from: B0 */
    public boolean m28241B0() {
        return this.f24676b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6861b)) {
            return false;
        }
        C6861b c6861b = (C6861b) obj;
        return this.f24676b == c6861b.f24676b && AbstractC3798p.m15099b(this.f24677c, c6861b.f24677c) && AbstractC3798p.m15099b(this.f24678d, c6861b.f24678d);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f24676b), this.f24677c, this.f24678d);
    }

    public String toString() {
        AbstractC3798p.a m15101d = AbstractC3798p.m15101d(this);
        m15101d.m15102a("statusCode", m28239C0(this.f24676b));
        m15101d.m15102a("resolution", this.f24677c);
        m15101d.m15102a("message", this.f24678d);
        return m15101d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f24675a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29136t(parcel, 2, m28242x0());
        AbstractC7067c.m29106C(parcel, 3, m28244z0(), i7, false);
        AbstractC7067c.m29108E(parcel, 4, m28243y0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m28242x0() {
        return this.f24676b;
    }

    /* renamed from: y0 */
    public String m28243y0() {
        return this.f24678d;
    }

    /* renamed from: z0 */
    public PendingIntent m28244z0() {
        return this.f24677c;
    }

    public C6861b(int i7) {
        this(i7, null, null);
    }

    public C6861b(int i7, PendingIntent pendingIntent) {
        this(i7, pendingIntent, null);
    }

    public C6861b(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str);
    }
}
