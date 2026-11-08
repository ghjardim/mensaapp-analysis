package p351u0;

import android.net.Uri;
import java.io.IOException;
import p022D0.InterfaceC0127M;
import p050H0.InterfaceC0544m;
import p343t0.InterfaceC6413g;

/* renamed from: u0.k */
/* loaded from: classes.dex */
public interface InterfaceC6594k {

    /* renamed from: u0.k$a */
    public interface a {
        /* renamed from: a */
        InterfaceC6594k mo27357a(InterfaceC6413g interfaceC6413g, InterfaceC0544m interfaceC0544m, InterfaceC6593j interfaceC6593j);
    }

    /* renamed from: u0.k$b */
    public interface b {
        /* renamed from: b */
        void mo26834b();

        /* renamed from: c */
        boolean mo26835c(Uri uri, InterfaceC0544m.c cVar, boolean z6);
    }

    /* renamed from: u0.k$c */
    public static final class c extends IOException {

        /* renamed from: a */
        public final Uri f23777a;

        public c(Uri uri) {
            this.f23777a = uri;
        }
    }

    /* renamed from: u0.k$d */
    public static final class d extends IOException {

        /* renamed from: a */
        public final Uri f23778a;

        public d(Uri uri) {
            this.f23778a = uri;
        }
    }

    /* renamed from: u0.k$e */
    public interface e {
        /* renamed from: b */
        void mo13143b(C6589f c6589f);
    }

    /* renamed from: a */
    void mo27388a(b bVar);

    /* renamed from: b */
    boolean mo27389b(Uri uri);

    /* renamed from: c */
    void mo27390c(Uri uri, InterfaceC0127M.a aVar, e eVar);

    /* renamed from: d */
    void mo27391d(Uri uri);

    /* renamed from: e */
    void mo27392e(Uri uri);

    /* renamed from: f */
    long mo27393f();

    /* renamed from: g */
    boolean mo27394g();

    /* renamed from: h */
    C6590g mo27395h();

    /* renamed from: i */
    boolean mo27396i(Uri uri, long j7);

    /* renamed from: j */
    void mo27397j(b bVar);

    /* renamed from: l */
    void mo27398l();

    /* renamed from: n */
    void mo27399n(Uri uri);

    /* renamed from: o */
    C6589f mo27400o(Uri uri, boolean z6);

    void stop();
}
