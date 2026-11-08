package p237g5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g5.r */
/* loaded from: classes2.dex */
public class C4459r {

    /* renamed from: b */
    public static final Logger f15881b = Logger.getLogger(C4459r.class.getName());

    /* renamed from: c */
    public static final C4459r f15882c = new C4459r();

    /* renamed from: a */
    public final int f15883a = 0;

    /* renamed from: g5.r$a */
    public interface a {
    }

    /* renamed from: g5.r$b */
    public static final class b {

        /* renamed from: a */
        public static final c f15884a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f15884a = m19014a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C4459r.f15881b.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* renamed from: a */
        public static c m19014a(AtomicReference atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e7) {
                atomicReference.set(e7);
                return new C4458q0();
            } catch (Exception e8) {
                throw new RuntimeException("Storage override failed to initialize", e8);
            }
        }
    }

    /* renamed from: g5.r$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract C4459r mo19000a();

        /* renamed from: b */
        public abstract void mo19001b(C4459r c4459r, C4459r c4459r2);

        /* renamed from: c */
        public abstract C4459r mo19002c(C4459r c4459r);
    }

    public C4459r() {
        m19006k(0);
    }

    /* renamed from: d */
    public static Object m19003d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: e */
    public static C4459r m19004e() {
        C4459r mo19000a = m19005j().mo19000a();
        return mo19000a == null ? f15882c : mo19000a;
    }

    /* renamed from: j */
    public static c m19005j() {
        return b.f15884a;
    }

    /* renamed from: k */
    public static void m19006k(int i7) {
        if (i7 == 1000) {
            f15881b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    /* renamed from: a */
    public void m19007a(a aVar, Executor executor) {
        m19003d(aVar, "cancellationListener");
        m19003d(executor, "executor");
    }

    /* renamed from: b */
    public C4459r m19008b() {
        C4459r mo19002c = m19005j().mo19002c(this);
        return mo19002c == null ? f15882c : mo19002c;
    }

    /* renamed from: c */
    public Throwable m19009c() {
        return null;
    }

    /* renamed from: f */
    public void m19010f(C4459r c4459r) {
        m19003d(c4459r, "toAttach");
        m19005j().mo19001b(this, c4459r);
    }

    /* renamed from: g */
    public C4462t m19011g() {
        return null;
    }

    /* renamed from: h */
    public boolean m19012h() {
        return false;
    }

    /* renamed from: i */
    public void m19013i(a aVar) {
    }
}
