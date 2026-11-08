package p237g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4446k0;
import p256j$.util.DesugarCollections;
import p264j5.C5378g;

/* renamed from: g5.Y */
/* loaded from: classes2.dex */
public final class C4423Y {

    /* renamed from: c */
    public static final Logger f15670c = Logger.getLogger(C4423Y.class.getName());

    /* renamed from: d */
    public static C4423Y f15671d;

    /* renamed from: a */
    public final LinkedHashSet f15672a = new LinkedHashSet();

    /* renamed from: b */
    public List f15673b = Collections.emptyList();

    /* renamed from: g5.Y$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC4422X abstractC4422X, AbstractC4422X abstractC4422X2) {
            return abstractC4422X.mo18762c() - abstractC4422X2.mo18762c();
        }
    }

    /* renamed from: g5.Y$b */
    public static final class b implements AbstractC4446k0.b {
        public b() {
        }

        @Override // p237g5.AbstractC4446k0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo18746b(AbstractC4422X abstractC4422X) {
            return abstractC4422X.mo18762c();
        }

        @Override // p237g5.AbstractC4446k0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo18745a(AbstractC4422X abstractC4422X) {
            return abstractC4422X.mo18761b();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: b */
    public static synchronized C4423Y m18763b() {
        C4423Y c4423y;
        synchronized (C4423Y.class) {
            try {
                if (f15671d == null) {
                    List<AbstractC4422X> m18943e = AbstractC4446k0.m18943e(AbstractC4422X.class, m18764c(), AbstractC4422X.class.getClassLoader(), new b(null));
                    f15671d = new C4423Y();
                    for (AbstractC4422X abstractC4422X : m18943e) {
                        f15670c.fine("Service loader found " + abstractC4422X);
                        f15671d.m18765a(abstractC4422X);
                    }
                    f15671d.m18768f();
                }
                c4423y = f15671d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4423y;
    }

    /* renamed from: c */
    public static List m18764c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C5378g.class);
        } catch (ClassNotFoundException e7) {
            f15670c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e7);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e8) {
            f15670c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e8);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e9) {
            f15670c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e9);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final synchronized void m18765a(AbstractC4422X abstractC4422X) {
        AbstractC2932o.m10562e(abstractC4422X.mo18761b(), "isAvailable() returned false");
        this.f15672a.add(abstractC4422X);
    }

    /* renamed from: d */
    public AbstractC4422X m18766d() {
        List m18767e = m18767e();
        if (m18767e.isEmpty()) {
            return null;
        }
        return (AbstractC4422X) m18767e.get(0);
    }

    /* renamed from: e */
    public synchronized List m18767e() {
        return this.f15673b;
    }

    /* renamed from: f */
    public final synchronized void m18768f() {
        ArrayList arrayList = new ArrayList(this.f15672a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f15673b = DesugarCollections.unmodifiableList(arrayList);
    }
}
