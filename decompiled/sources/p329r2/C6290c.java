package p329r2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: r2.c */
/* loaded from: classes.dex */
public class C6290c extends AbstractC7065a {
    public static final Parcelable.Creator<C6290c> CREATOR = new C6292e();

    /* renamed from: a */
    public final int f22798a;

    /* renamed from: b */
    public final PendingIntent f22799b;

    /* renamed from: c */
    public final int f22800c;

    /* renamed from: d */
    public final byte[] f22801d;

    /* renamed from: e */
    public final int f22802e;

    /* renamed from: f */
    public final Bundle f22803f;

    public C6290c(int i7, int i8, PendingIntent pendingIntent, int i9, Bundle bundle, byte[] bArr) {
        this.f22802e = i7;
        this.f22798a = i8;
        this.f22800c = i9;
        this.f22803f = bundle;
        this.f22801d = bArr;
        this.f22799b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f22798a);
        AbstractC7067c.m29106C(parcel, 2, this.f22799b, i7, false);
        AbstractC7067c.m29136t(parcel, 3, this.f22800c);
        AbstractC7067c.m29126j(parcel, 4, this.f22803f, false);
        AbstractC7067c.m29127k(parcel, 5, this.f22801d, false);
        AbstractC7067c.m29136t(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, this.f22802e);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
