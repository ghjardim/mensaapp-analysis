package p022D0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p276l0.C5497k;

/* renamed from: D0.y */
/* loaded from: classes.dex */
public final class C0179y {

    /* renamed from: h */
    public static final AtomicLong f737h = new AtomicLong();

    /* renamed from: a */
    public final long f738a;

    /* renamed from: b */
    public final C5497k f739b;

    /* renamed from: c */
    public final Uri f740c;

    /* renamed from: d */
    public final Map f741d;

    /* renamed from: e */
    public final long f742e;

    /* renamed from: f */
    public final long f743f;

    /* renamed from: g */
    public final long f744g;

    public C0179y(long j7, C5497k c5497k, long j8) {
        this(j7, c5497k, c5497k.f19781a, Collections.emptyMap(), j8, 0L, 0L);
    }

    /* renamed from: a */
    public static long m716a() {
        return f737h.getAndIncrement();
    }

    public C0179y(long j7, C5497k c5497k, Uri uri, Map map, long j8, long j9, long j10) {
        this.f738a = j7;
        this.f739b = c5497k;
        this.f740c = uri;
        this.f741d = map;
        this.f742e = j8;
        this.f743f = j9;
        this.f744g = j10;
    }
}
