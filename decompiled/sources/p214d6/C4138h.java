package p214d6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import org.apache.tika.utils.StringUtils;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p125R5.AbstractC2291q;
import p125R5.AbstractC2294t;
import p206c6.AbstractC3620h;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p206c6.C3621i;
import p206c6.InterfaceC3609V;
import p371w5.AbstractC6924g;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p371w5.InterfaceC6923f;
import p378x5.AbstractC7032w;

/* renamed from: d6.h */
/* loaded from: classes2.dex */
public final class C4138h extends AbstractC3622j {

    /* renamed from: f */
    public static final a f13852f = new a(null);

    /* renamed from: g */
    public static final C3601M f13853g = C3601M.a.m14500e(C3601M.f12052b, "/", false, 1, null);

    /* renamed from: e */
    public final InterfaceC6923f f13854e;

    /* renamed from: d6.h$a */
    public static final class a {

        /* renamed from: d6.h$a$a, reason: collision with other inner class name */
        public static final class C7218a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public static final C7218a f13855a = new C7218a();

            public C7218a() {
                super(1);
            }

            @Override // p069J5.InterfaceC0800l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C4139i entry) {
                AbstractC5469l.m23028e(entry, "entry");
                return Boolean.valueOf(C4138h.f13852f.m17363c(entry.m17369a()));
            }
        }

        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: b */
        public final C3601M m17362b() {
            return C4138h.f13853g;
        }

        /* renamed from: c */
        public final boolean m17363c(C3601M c3601m) {
            return !AbstractC2291q.m7738n(c3601m.m14489j(), ".class", true);
        }

        /* renamed from: d */
        public final List m17364d(ClassLoader classLoader) {
            AbstractC5469l.m23028e(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources(StringUtils.EMPTY);
            AbstractC5469l.m23027d(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            AbstractC5469l.m23027d(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL it : list) {
                a aVar = C4138h.f13852f;
                AbstractC5469l.m23027d(it, "it");
                C6926i m17365e = aVar.m17365e(it);
                if (m17365e != null) {
                    arrayList.add(m17365e);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            AbstractC5469l.m23027d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            AbstractC5469l.m23027d(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL it2 : list2) {
                a aVar2 = C4138h.f13852f;
                AbstractC5469l.m23027d(it2, "it");
                C6926i m17366f = aVar2.m17366f(it2);
                if (m17366f != null) {
                    arrayList2.add(m17366f);
                }
            }
            return AbstractC7032w.m28881G(arrayList, arrayList2);
        }

        /* renamed from: e */
        public final C6926i m17365e(URL url) {
            AbstractC5469l.m23028e(url, "<this>");
            if (AbstractC5469l.m23024a(url.getProtocol(), "file")) {
                return AbstractC6930m.m28383a(AbstractC3622j.f12141b, C3601M.a.m14499d(C3601M.f12052b, new File(url.toURI()), false, 1, null));
            }
            return null;
        }

        /* renamed from: f */
        public final C6926i m17366f(URL url) {
            int m7760O;
            AbstractC5469l.m23028e(url, "<this>");
            String url2 = url.toString();
            AbstractC5469l.m23027d(url2, "toString()");
            if (!AbstractC2291q.m7745u(url2, "jar:file:", false, 2, null) || (m7760O = AbstractC2294t.m7760O(url2, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            C3601M.a aVar = C3601M.f12052b;
            String substring = url2.substring(4, m7760O);
            AbstractC5469l.m23027d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return AbstractC6930m.m28383a(AbstractC4140j.m17380d(C3601M.a.m14499d(aVar, new File(URI.create(substring)), false, 1, null), AbstractC3622j.f12141b, C7218a.f13855a), m17362b());
        }

        public a() {
        }
    }

    /* renamed from: d6.h$b */
    public static final class b extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f13856a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ClassLoader classLoader) {
            super(0);
            this.f13856a = classLoader;
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C4138h.f13852f.m17364d(this.f13856a);
        }
    }

    public C4138h(ClassLoader classLoader, boolean z6) {
        AbstractC5469l.m23028e(classLoader, "classLoader");
        this.f13854e = AbstractC6924g.m28367a(new b(classLoader));
        if (z6) {
            m17359p().size();
        }
    }

    /* renamed from: o */
    private final C3601M m17358o(C3601M c3601m) {
        return f13853g.m14494o(c3601m, true);
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: a */
    public void mo14465a(C3601M source, C3601M target) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: d */
    public void mo14555d(C3601M dir, boolean z6) {
        AbstractC5469l.m23028e(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: f */
    public void mo14556f(C3601M path, boolean z6) {
        AbstractC5469l.m23028e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: h */
    public C3621i mo14466h(C3601M path) {
        AbstractC5469l.m23028e(path, "path");
        if (!f13852f.m17363c(path)) {
            return null;
        }
        String m17360q = m17360q(path);
        for (C6926i c6926i : m17359p()) {
            C3621i mo14466h = ((AbstractC3622j) c6926i.m28368a()).mo14466h(((C3601M) c6926i.m28369b()).m14495p(m17360q));
            if (mo14466h != null) {
                return mo14466h;
            }
        }
        return null;
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: i */
    public AbstractC3620h mo14557i(C3601M file) {
        AbstractC5469l.m23028e(file, "file");
        if (!f13852f.m17363c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String m17360q = m17360q(file);
        for (C6926i c6926i : m17359p()) {
            try {
                return ((AbstractC3622j) c6926i.m28368a()).mo14557i(((C3601M) c6926i.m28369b()).m14495p(m17360q));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: k */
    public AbstractC3620h mo14558k(C3601M file, boolean z6, boolean z7) {
        AbstractC5469l.m23028e(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: l */
    public InterfaceC3609V mo14559l(C3601M file) {
        AbstractC5469l.m23028e(file, "file");
        if (!f13852f.m17363c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String m17360q = m17360q(file);
        for (C6926i c6926i : m17359p()) {
            try {
                return ((AbstractC3622j) c6926i.m28368a()).mo14559l(((C3601M) c6926i.m28369b()).m14495p(m17360q));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    /* renamed from: p */
    public final List m17359p() {
        return (List) this.f13854e.getValue();
    }

    /* renamed from: q */
    public final String m17360q(C3601M c3601m) {
        return m17358o(c3601m).m14493n(f13853g).toString();
    }
}
