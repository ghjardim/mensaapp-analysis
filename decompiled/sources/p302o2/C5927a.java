package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: o2.a */
/* loaded from: classes.dex */
public class C5927a extends AbstractC7065a {
    public static final Parcelable.Creator<C5927a> CREATOR = new C5937k();

    /* renamed from: a */
    public final int f21395a;

    /* renamed from: b */
    public final boolean f21396b;

    /* renamed from: c */
    public final long f21397c;

    /* renamed from: d */
    public final boolean f21398d;

    public C5927a(int i7, boolean z6, long j7, boolean z7) {
        this.f21395a = i7;
        this.f21396b = z6;
        this.f21397c = j7;
        this.f21398d = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f21395a);
        AbstractC7067c.m29123g(parcel, 2, m24956z0());
        AbstractC7067c.m29140x(parcel, 3, m24954x0());
        AbstractC7067c.m29123g(parcel, 4, m24955y0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public long m24954x0() {
        return this.f21397c;
    }

    /* renamed from: y0 */
    public boolean m24955y0() {
        return this.f21398d;
    }

    /* renamed from: z0 */
    public boolean m24956z0() {
        return this.f21396b;
    }
}
