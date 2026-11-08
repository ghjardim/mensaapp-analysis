package p050H0;

import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import p022D0.C0179y;
import p050H0.C0545n;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5495i;
import p276l0.C5497k;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;

/* renamed from: H0.p */
/* loaded from: classes.dex */
public final class C0547p implements C0545n.e {

    /* renamed from: a */
    public final long f1805a;

    /* renamed from: b */
    public final C5497k f1806b;

    /* renamed from: c */
    public final int f1807c;

    /* renamed from: d */
    public final C5510x f1808d;

    /* renamed from: e */
    public final a f1809e;

    /* renamed from: f */
    public volatile Object f1810f;

    /* renamed from: H0.p$a */
    public interface a {
        /* renamed from: a */
        Object mo175a(Uri uri, InputStream inputStream);
    }

    public C0547p(InterfaceC5493g interfaceC5493g, Uri uri, int i7, a aVar) {
        this(interfaceC5493g, new C5497k.b().m23094i(uri).m23087b(1).m23086a(), i7, aVar);
    }

    /* renamed from: a */
    public long m2115a() {
        return this.f1808d.m23136g();
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public final void mo481b() {
        this.f1808d.m23139x();
        C5495i c5495i = new C5495i(this.f1808d, this.f1806b);
        try {
            c5495i.m23078c();
            this.f1810f = this.f1809e.mo175a((Uri) AbstractC5332a.m21800e(this.f1808d.mo715s()), c5495i);
        } finally {
            AbstractC5330M.m21759m(c5495i);
        }
    }

    /* renamed from: d */
    public Map m2116d() {
        return this.f1808d.m23138w();
    }

    /* renamed from: e */
    public final Object m2117e() {
        return this.f1810f;
    }

    /* renamed from: f */
    public Uri m2118f() {
        return this.f1808d.m23137v();
    }

    public C0547p(InterfaceC5493g interfaceC5493g, C5497k c5497k, int i7, a aVar) {
        this.f1808d = new C5510x(interfaceC5493g);
        this.f1806b = c5497k;
        this.f1807c = i7;
        this.f1809e = aVar;
        this.f1805a = C0179y.m716a();
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public final void mo482c() {
    }
}
