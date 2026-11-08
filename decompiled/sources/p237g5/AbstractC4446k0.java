package p237g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import p256j$.util.DesugarCollections;

/* renamed from: g5.k0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4446k0 {

    /* renamed from: g5.k0$a */
    public class a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ b f15792a;

        public a(b bVar) {
            this.f15792a = bVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int mo18746b = this.f15792a.mo18746b(obj) - this.f15792a.mo18746b(obj2);
            return mo18746b != 0 ? mo18746b : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    /* renamed from: g5.k0$b */
    public interface b {
        /* renamed from: a */
        boolean mo18745a(Object obj);

        /* renamed from: b */
        int mo18746b(Object obj);
    }

    /* renamed from: a */
    public static Object m18939a(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(null).newInstance(null);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    /* renamed from: b */
    public static Iterable m18940b(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object m18939a = m18939a(cls, (Class) it.next());
            if (m18939a != null) {
                arrayList.add(m18939a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Iterable m18941c(Class cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* renamed from: d */
    public static boolean m18942d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static List m18943e(Class cls, Iterable iterable, ClassLoader classLoader, b bVar) {
        Iterable m18940b = m18942d(classLoader) ? m18940b(cls, iterable) : m18941c(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m18940b) {
            if (bVar.mo18745a(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
