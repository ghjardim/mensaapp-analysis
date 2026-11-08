package p028E;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.apache.tika.pipes.PipesConfigBase;
import p023D1.AbstractC0181a;
import p028E.AbstractC0206k;
import p042G.InterfaceC0339a;
import p334s.C6317j;
import p334s.C6318k;
import p386z.AbstractC7091f;
import p386z.AbstractC7092g;

/* renamed from: E.j */
/* loaded from: classes.dex */
public abstract class AbstractC0205j {

    /* renamed from: a */
    public static final C6317j f810a = new C6317j(16);

    /* renamed from: b */
    public static final ExecutorService f811b = AbstractC0207l.m845a("fonts-androidx", 10, PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);

    /* renamed from: c */
    public static final Object f812c = new Object();

    /* renamed from: d */
    public static final C6318k f813d = new C6318k();

    /* renamed from: E.j$a */
    public class a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f814a;

        /* renamed from: b */
        public final /* synthetic */ Context f815b;

        /* renamed from: c */
        public final /* synthetic */ C0201f f816c;

        /* renamed from: d */
        public final /* synthetic */ int f817d;

        public a(String str, Context context, C0201f c0201f, int i7) {
            this.f814a = str;
            this.f815b = context;
            this.f816c = c0201f;
            this.f817d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            List m29220a;
            String str = this.f814a;
            Context context = this.f815b;
            m29220a = AbstractC7091f.m29220a(new Object[]{this.f816c});
            return AbstractC0205j.m822c(str, context, m29220a, this.f817d);
        }
    }

    /* renamed from: E.j$b */
    public class b implements InterfaceC0339a {

        /* renamed from: a */
        public final /* synthetic */ C0196a f818a;

        public b(C0196a c0196a) {
            this.f818a = c0196a;
        }

        @Override // p042G.InterfaceC0339a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f818a.m797b(eVar);
        }
    }

    /* renamed from: E.j$c */
    public class c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f819a;

        /* renamed from: b */
        public final /* synthetic */ Context f820b;

        /* renamed from: c */
        public final /* synthetic */ List f821c;

        /* renamed from: d */
        public final /* synthetic */ int f822d;

        public c(String str, Context context, List list, int i7) {
            this.f819a = str;
            this.f820b = context;
            this.f821c = list;
            this.f822d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return AbstractC0205j.m822c(this.f819a, this.f820b, this.f821c, this.f822d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* renamed from: E.j$d */
    public class d implements InterfaceC0339a {

        /* renamed from: a */
        public final /* synthetic */ String f823a;

        public d(String str) {
            this.f823a = str;
        }

        @Override // p042G.InterfaceC0339a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (AbstractC0205j.f812c) {
                try {
                    C6318k c6318k = AbstractC0205j.f813d;
                    ArrayList arrayList = (ArrayList) c6318k.get(this.f823a);
                    if (arrayList == null) {
                        return;
                    }
                    c6318k.remove(this.f823a);
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((InterfaceC0339a) arrayList.get(i7)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m820a(List list, int i7) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((C0201f) list.get(i8)).m813d());
            sb.append("-");
            sb.append(i7);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static int m821b(AbstractC0206k.a aVar) {
        int i7 = 1;
        if (aVar.m835e() != 0) {
            return aVar.m835e() != 1 ? -3 : -2;
        }
        AbstractC0206k.b[] m833c = aVar.m833c();
        if (m833c != null && m833c.length != 0) {
            i7 = 0;
            for (AbstractC0206k.b bVar : m833c) {
                int m838b = bVar.m838b();
                if (m838b != 0) {
                    if (m838b < 0) {
                        return -3;
                    }
                    return m838b;
                }
            }
        }
        return i7;
    }

    /* renamed from: c */
    public static e m822c(String str, Context context, List list, int i7) {
        AbstractC0181a.m729c("getFontSync");
        try {
            C6317j c6317j = f810a;
            Typeface typeface = (Typeface) c6317j.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            AbstractC0206k.a m805e = AbstractC0200e.m805e(context, list, null);
            int m821b = m821b(m805e);
            if (m821b != 0) {
                return new e(m821b);
            }
            Typeface m29222b = (!m805e.m836f() || Build.VERSION.SDK_INT < 29) ? AbstractC7092g.m29222b(context, null, m805e.m833c(), i7) : AbstractC7092g.m29223c(context, null, m805e.m834d(), i7);
            if (m29222b == null) {
                return new e(-3);
            }
            c6317j.put(str, m29222b);
            return new e(m29222b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            AbstractC0181a.m732f();
        }
    }

    /* renamed from: d */
    public static Typeface m823d(Context context, List list, int i7, Executor executor, C0196a c0196a) {
        String m820a = m820a(list, i7);
        Typeface typeface = (Typeface) f810a.get(m820a);
        if (typeface != null) {
            c0196a.m797b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c0196a);
        synchronized (f812c) {
            try {
                C6318k c6318k = f813d;
                ArrayList arrayList = (ArrayList) c6318k.get(m820a);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c6318k.put(m820a, arrayList2);
                c cVar = new c(m820a, context, list, i7);
                if (executor == null) {
                    executor = f811b;
                }
                AbstractC0207l.m847c(executor, cVar, new d(m820a));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static Typeface m824e(Context context, C0201f c0201f, C0196a c0196a, int i7, int i8) {
        List m29220a;
        List m29220a2;
        m29220a = AbstractC7091f.m29220a(new Object[]{c0201f});
        String m820a = m820a(m29220a, i7);
        Typeface typeface = (Typeface) f810a.get(m820a);
        if (typeface != null) {
            c0196a.m797b(new e(typeface));
            return typeface;
        }
        if (i8 == -1) {
            m29220a2 = AbstractC7091f.m29220a(new Object[]{c0201f});
            e m822c = m822c(m820a, context, m29220a2, i7);
            c0196a.m797b(m822c);
            return m822c.f824a;
        }
        try {
            e eVar = (e) AbstractC0207l.m848d(f811b, new a(m820a, context, c0201f, i7), i8);
            c0196a.m797b(eVar);
            return eVar.f824a;
        } catch (InterruptedException unused) {
            c0196a.m797b(new e(-3));
            return null;
        }
    }

    /* renamed from: E.j$e */
    public static final class e {

        /* renamed from: a */
        public final Typeface f824a;

        /* renamed from: b */
        public final int f825b;

        public e(int i7) {
            this.f824a = null;
            this.f825b = i7;
        }

        /* renamed from: a */
        public boolean m829a() {
            return this.f825b == 0;
        }

        public e(Typeface typeface) {
            this.f824a = typeface;
            this.f825b = 0;
        }
    }
}
