package p206c6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p206c6.C3601M;
import p214d6.AbstractC4140j;
import p214d6.C4137g;
import p214d6.C4139i;
import p371w5.AbstractC6918a;

/* renamed from: c6.X */
/* loaded from: classes2.dex */
public final class C3611X extends AbstractC3622j {

    /* renamed from: i */
    public static final a f12084i = new a(null);

    /* renamed from: j */
    public static final C3601M f12085j = C3601M.a.m14500e(C3601M.f12052b, "/", false, 1, null);

    /* renamed from: e */
    public final C3601M f12086e;

    /* renamed from: f */
    public final AbstractC3622j f12087f;

    /* renamed from: g */
    public final Map f12088g;

    /* renamed from: h */
    public final String f12089h;

    /* renamed from: c6.X$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C3611X(C3601M zipPath, AbstractC3622j fileSystem, Map entries, String str) {
        AbstractC5469l.m23028e(zipPath, "zipPath");
        AbstractC5469l.m23028e(fileSystem, "fileSystem");
        AbstractC5469l.m23028e(entries, "entries");
        this.f12086e = zipPath;
        this.f12087f = fileSystem;
        this.f12088g = entries;
        this.f12089h = str;
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: a */
    public void mo14465a(C3601M source, C3601M target) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: d */
    public void mo14555d(C3601M dir, boolean z6) {
        AbstractC5469l.m23028e(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: f */
    public void mo14556f(C3601M path, boolean z6) {
        AbstractC5469l.m23028e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: h */
    public C3621i mo14466h(C3601M path) {
        InterfaceC3618f interfaceC3618f;
        AbstractC5469l.m23028e(path, "path");
        C4139i c4139i = (C4139i) this.f12088g.get(m14560m(path));
        Throwable th = null;
        if (c4139i == null) {
            return null;
        }
        C3621i c3621i = new C3621i(!c4139i.m17376h(), c4139i.m17376h(), null, c4139i.m17376h() ? null : Long.valueOf(c4139i.m17375g()), null, c4139i.m17373e(), null, null, 128, null);
        if (c4139i.m17374f() == -1) {
            return c3621i;
        }
        AbstractC3620h mo14557i = this.f12087f.mo14557i(this.f12086e);
        try {
            interfaceC3618f = AbstractC3596H.m14470b(mo14557i.m14664G(c4139i.m17374f()));
            if (mo14557i != null) {
                try {
                    mo14557i.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (mo14557i != null) {
                try {
                    mo14557i.close();
                } catch (Throwable th4) {
                    AbstractC6918a.m28362a(th3, th4);
                }
            }
            th = th3;
            interfaceC3618f = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC5469l.m23025b(interfaceC3618f);
        return AbstractC4140j.m17384h(interfaceC3618f, c3621i);
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: i */
    public AbstractC3620h mo14557i(C3601M file) {
        AbstractC5469l.m23028e(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: k */
    public AbstractC3620h mo14558k(C3601M file, boolean z6, boolean z7) {
        AbstractC5469l.m23028e(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: l */
    public InterfaceC3609V mo14559l(C3601M file) {
        InterfaceC3618f interfaceC3618f;
        AbstractC5469l.m23028e(file, "file");
        C4139i c4139i = (C4139i) this.f12088g.get(m14560m(file));
        if (c4139i == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC3620h mo14557i = this.f12087f.mo14557i(this.f12086e);
        Throwable th = null;
        try {
            interfaceC3618f = AbstractC3596H.m14470b(mo14557i.m14664G(c4139i.m17374f()));
            if (mo14557i != null) {
                try {
                    mo14557i.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (mo14557i != null) {
                try {
                    mo14557i.close();
                } catch (Throwable th4) {
                    AbstractC6918a.m28362a(th3, th4);
                }
            }
            interfaceC3618f = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        AbstractC5469l.m23025b(interfaceC3618f);
        AbstractC4140j.m17387k(interfaceC3618f);
        return c4139i.m17372d() == 0 ? new C4137g(interfaceC3618f, c4139i.m17375g(), true) : new C4137g(new C3624l(new C4137g(interfaceC3618f, c4139i.m17371c(), true), new Inflater(true)), c4139i.m17375g(), false);
    }

    /* renamed from: m */
    public final C3601M m14560m(C3601M c3601m) {
        return f12085j.m14494o(c3601m, true);
    }
}
