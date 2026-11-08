package p206c6;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p206c6.C3601M;
import p214d6.AbstractC4133c;
import p214d6.C4138h;

/* renamed from: c6.j */
/* loaded from: classes2.dex */
public abstract class AbstractC3622j {

    /* renamed from: a */
    public static final a f12140a = new a(null);

    /* renamed from: b */
    public static final AbstractC3622j f12141b;

    /* renamed from: c */
    public static final C3601M f12142c;

    /* renamed from: d */
    public static final AbstractC3622j f12143d;

    /* renamed from: c6.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    static {
        AbstractC3622j c3627o;
        try {
            Class.forName("java.nio.file.Files");
            c3627o = new C3595G();
        } catch (ClassNotFoundException unused) {
            c3627o = new C3627o();
        }
        f12141b = c3627o;
        C3601M.a aVar = C3601M.f12052b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC5469l.m23027d(property, "getProperty(\"java.io.tmpdir\")");
        f12142c = C3601M.a.m14500e(aVar, property, false, 1, null);
        ClassLoader classLoader = C4138h.class.getClassLoader();
        AbstractC5469l.m23027d(classLoader, "ResourceFileSystem::class.java.classLoader");
        f12143d = new C4138h(classLoader, false);
    }

    /* renamed from: a */
    public abstract void mo14465a(C3601M c3601m, C3601M c3601m2);

    /* renamed from: b */
    public final void m14677b(C3601M dir, boolean z6) {
        AbstractC5469l.m23028e(dir, "dir");
        AbstractC4133c.m17329a(this, dir, z6);
    }

    /* renamed from: c */
    public final void m14678c(C3601M dir) {
        AbstractC5469l.m23028e(dir, "dir");
        mo14555d(dir, false);
    }

    /* renamed from: d */
    public abstract void mo14555d(C3601M c3601m, boolean z6);

    /* renamed from: e */
    public final void m14679e(C3601M path) {
        AbstractC5469l.m23028e(path, "path");
        mo14556f(path, false);
    }

    /* renamed from: f */
    public abstract void mo14556f(C3601M c3601m, boolean z6);

    /* renamed from: g */
    public final boolean m14680g(C3601M path) {
        AbstractC5469l.m23028e(path, "path");
        return AbstractC4133c.m17330b(this, path);
    }

    /* renamed from: h */
    public abstract C3621i mo14466h(C3601M c3601m);

    /* renamed from: i */
    public abstract AbstractC3620h mo14557i(C3601M c3601m);

    /* renamed from: j */
    public final AbstractC3620h m14681j(C3601M file) {
        AbstractC5469l.m23028e(file, "file");
        return mo14558k(file, false, false);
    }

    /* renamed from: k */
    public abstract AbstractC3620h mo14558k(C3601M c3601m, boolean z6, boolean z7);

    /* renamed from: l */
    public abstract InterfaceC3609V mo14559l(C3601M c3601m);
}
