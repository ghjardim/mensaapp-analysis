package p237g5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC3035x;
import p237g5.AbstractC4430c0;
import p237g5.AbstractC4446k0;
import p253i5.C4553E;
import p256j$.util.DesugarCollections;

/* renamed from: g5.e0 */
/* loaded from: classes2.dex */
public final class C4434e0 {

    /* renamed from: e */
    public static final Logger f15767e = Logger.getLogger(C4434e0.class.getName());

    /* renamed from: f */
    public static C4434e0 f15768f;

    /* renamed from: a */
    public final AbstractC4430c0.c f15769a = new b();

    /* renamed from: b */
    public String f15770b = "unknown";

    /* renamed from: c */
    public final LinkedHashSet f15771c = new LinkedHashSet();

    /* renamed from: d */
    public AbstractC3035x f15772d = AbstractC3035x.m11072j();

    /* renamed from: g5.e0$b */
    public final class b extends AbstractC4430c0.c {
        public b() {
        }
    }

    /* renamed from: g5.e0$c */
    public static final class c implements AbstractC4446k0.b {
        public c() {
        }

        @Override // p237g5.AbstractC4446k0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo18746b(AbstractC4432d0 abstractC4432d0) {
            return abstractC4432d0.mo18914f();
        }

        @Override // p237g5.AbstractC4446k0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo18745a(AbstractC4432d0 abstractC4432d0) {
            return abstractC4432d0.mo18913e();
        }
    }

    /* renamed from: b */
    public static synchronized C4434e0 m18915b() {
        C4434e0 c4434e0;
        synchronized (C4434e0.class) {
            try {
                if (f15768f == null) {
                    List<AbstractC4432d0> m18943e = AbstractC4446k0.m18943e(AbstractC4432d0.class, m18916d(), AbstractC4432d0.class.getClassLoader(), new c());
                    if (m18943e.isEmpty()) {
                        f15767e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    f15768f = new C4434e0();
                    for (AbstractC4432d0 abstractC4432d0 : m18943e) {
                        f15767e.fine("Service loader found " + abstractC4432d0);
                        f15768f.m18917a(abstractC4432d0);
                    }
                    f15768f.m18921g();
                }
                c4434e0 = f15768f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4434e0;
    }

    /* renamed from: d */
    public static List m18916d() {
        ArrayList arrayList = new ArrayList();
        try {
            boolean z6 = C4553E.f16502a;
            arrayList.add(C4553E.class);
        } catch (ClassNotFoundException e7) {
            f15767e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e7);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final synchronized void m18917a(AbstractC4432d0 abstractC4432d0) {
        AbstractC2932o.m10562e(abstractC4432d0.mo18913e(), "isAvailable() returned false");
        this.f15771c.add(abstractC4432d0);
    }

    /* renamed from: c */
    public synchronized String m18918c() {
        return this.f15770b;
    }

    /* renamed from: e */
    public AbstractC4432d0 m18919e(String str) {
        if (str == null) {
            return null;
        }
        return (AbstractC4432d0) m18920f().get(str.toLowerCase(Locale.US));
    }

    /* renamed from: f */
    public synchronized Map m18920f() {
        return this.f15772d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0010 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m18921g() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "unknown"
            java.util.LinkedHashSet r2 = r9.f15771c     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L33
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L10:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L33
            g5.d0 r4 = (p237g5.AbstractC4432d0) r4     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r4.m18912d()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L33
            g5.d0 r6 = (p237g5.AbstractC4432d0) r6     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L35
            int r6 = r6.mo18914f()     // Catch: java.lang.Throwable -> L33
            int r7 = r4.mo18914f()     // Catch: java.lang.Throwable -> L33
            if (r6 >= r7) goto L38
            goto L35
        L33:
            r0 = move-exception
            goto L54
        L35:
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L33
        L38:
            int r5 = r4.mo18914f()     // Catch: java.lang.Throwable -> L33
            if (r3 >= r5) goto L10
            int r1 = r4.mo18914f()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r4.m18912d()     // Catch: java.lang.Throwable -> L33
            r8 = r3
            r3 = r1
            r1 = r8
            goto L10
        L4a:
            Z2.x r0 = p178Z2.AbstractC3035x.m11071c(r0)     // Catch: java.lang.Throwable -> L33
            r9.f15772d = r0     // Catch: java.lang.Throwable -> L33
            r9.f15770b = r1     // Catch: java.lang.Throwable -> L33
            monitor-exit(r9)
            return
        L54:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L33
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p237g5.C4434e0.m18921g():void");
    }
}
