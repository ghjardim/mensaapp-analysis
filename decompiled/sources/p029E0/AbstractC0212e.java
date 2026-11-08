package p029E0;

import android.net.Uri;
import java.util.Map;
import p022D0.C0179y;
import p050H0.C0545n;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;

/* renamed from: E0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0212e implements C0545n.e {

    /* renamed from: a */
    public final long f872a = C0179y.m716a();

    /* renamed from: b */
    public final C5497k f873b;

    /* renamed from: c */
    public final int f874c;

    /* renamed from: d */
    public final C4327q f875d;

    /* renamed from: e */
    public final int f876e;

    /* renamed from: f */
    public final Object f877f;

    /* renamed from: g */
    public final long f878g;

    /* renamed from: h */
    public final long f879h;

    /* renamed from: i */
    public final C5510x f880i;

    public AbstractC0212e(InterfaceC5493g interfaceC5493g, C5497k c5497k, int i7, C4327q c4327q, int i8, Object obj, long j7, long j8) {
        this.f880i = new C5510x(interfaceC5493g);
        this.f873b = (C5497k) AbstractC5332a.m21800e(c5497k);
        this.f874c = i7;
        this.f875d = c4327q;
        this.f876e = i8;
        this.f877f = obj;
        this.f878g = j7;
        this.f879h = j8;
    }

    /* renamed from: a */
    public final long m870a() {
        return this.f880i.m23136g();
    }

    /* renamed from: d */
    public final long m871d() {
        return this.f879h - this.f878g;
    }

    /* renamed from: e */
    public final Map m872e() {
        return this.f880i.m23138w();
    }

    /* renamed from: f */
    public final Uri m873f() {
        return this.f880i.m23137v();
    }
}
