package p329r2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: r2.b */
/* loaded from: classes.dex */
public class C6289b extends AbstractC7065a {
    public static final Parcelable.Creator<C6289b> CREATOR = new C6291d();

    /* renamed from: n */
    public static final int f22783n = 0;

    /* renamed from: o */
    public static final int f22784o = 1;

    /* renamed from: p */
    public static final int f22785p = 2;

    /* renamed from: q */
    public static final int f22786q = 3;

    /* renamed from: r */
    public static final int f22787r = 4;

    /* renamed from: s */
    public static final int f22788s = 5;

    /* renamed from: t */
    public static final int f22789t = 6;

    /* renamed from: u */
    public static final int f22790u = 7;

    /* renamed from: v */
    public static final int f22791v = 7;

    /* renamed from: a */
    public final String f22792a;

    /* renamed from: b */
    public final int f22793b;

    /* renamed from: c */
    public final long f22794c;

    /* renamed from: d */
    public final byte[] f22795d;

    /* renamed from: e */
    public final int f22796e;

    /* renamed from: f */
    public final Bundle f22797f;

    public C6289b(int i7, String str, int i8, long j7, byte[] bArr, Bundle bundle) {
        this.f22796e = i7;
        this.f22792a = str;
        this.f22793b = i8;
        this.f22794c = j7;
        this.f22795d = bArr;
        this.f22797f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f22792a + ", method: " + this.f22793b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f22792a, false);
        AbstractC7067c.m29136t(parcel, 2, this.f22793b);
        AbstractC7067c.m29140x(parcel, 3, this.f22794c);
        AbstractC7067c.m29127k(parcel, 4, this.f22795d, false);
        AbstractC7067c.m29126j(parcel, 5, this.f22797f, false);
        AbstractC7067c.m29136t(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, this.f22796e);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
