package p220e4;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.AbstractC3694i;
import com.google.android.gms.common.api.internal.C3692h;
import com.google.android.gms.common.api.internal.InterfaceC3696j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public class C4189a {

    /* renamed from: c */
    public static final C4189a f14031c = new C4189a();

    /* renamed from: a */
    public final Map f14032a = new HashMap();

    /* renamed from: b */
    public final Object f14033b = new Object();

    /* renamed from: e4.a$a */
    public static class a {

        /* renamed from: a */
        public final Activity f14034a;

        /* renamed from: b */
        public final Runnable f14035b;

        /* renamed from: c */
        public final Object f14036c;

        public a(Activity activity, Runnable runnable, Object obj) {
            this.f14034a = activity;
            this.f14035b = runnable;
            this.f14036c = obj;
        }

        /* renamed from: a */
        public Activity m17578a() {
            return this.f14034a;
        }

        /* renamed from: b */
        public Object m17579b() {
            return this.f14036c;
        }

        /* renamed from: c */
        public Runnable m17580c() {
            return this.f14035b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f14036c.equals(this.f14036c) && aVar.f14035b == this.f14035b && aVar.f14034a == this.f14034a;
        }

        public int hashCode() {
            return this.f14036c.hashCode();
        }
    }

    /* renamed from: e4.a$b */
    public static class b extends AbstractC3694i {

        /* renamed from: a */
        public final List f14037a;

        public b(InterfaceC3696j interfaceC3696j) {
            super(interfaceC3696j);
            this.f14037a = new ArrayList();
            this.mLifecycleFragment.mo14970b("StorageOnStopCallback", this);
        }

        /* renamed from: b */
        public static b m17581b(Activity activity) {
            InterfaceC3696j fragment = AbstractC3694i.getFragment(new C3692h(activity));
            b bVar = (b) fragment.mo14971c("StorageOnStopCallback", b.class);
            return bVar == null ? new b(fragment) : bVar;
        }

        /* renamed from: a */
        public void m17582a(a aVar) {
            synchronized (this.f14037a) {
                this.f14037a.add(aVar);
            }
        }

        /* renamed from: c */
        public void m17583c(a aVar) {
            synchronized (this.f14037a) {
                this.f14037a.remove(aVar);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC3694i
        public void onStop() {
            ArrayList arrayList;
            synchronized (this.f14037a) {
                arrayList = new ArrayList(this.f14037a);
                this.f14037a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.m17580c().run();
                    C4189a.m17575a().m17576b(aVar.m17579b());
                }
            }
        }
    }

    /* renamed from: a */
    public static C4189a m17575a() {
        return f14031c;
    }

    /* renamed from: b */
    public void m17576b(Object obj) {
        synchronized (this.f14033b) {
            try {
                a aVar = (a) this.f14032a.get(obj);
                if (aVar != null) {
                    b.m17581b(aVar.m17578a()).m17583c(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void m17577c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f14033b) {
            a aVar = new a(activity, runnable, obj);
            b.m17581b(activity).m17582a(aVar);
            this.f14032a.put(obj, aVar);
        }
    }
}
