package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public class FragmentC3361z extends Fragment {

    /* renamed from: b */
    public static final b f10800b = new b(null);

    /* renamed from: a */
    public a f10801a;

    /* renamed from: androidx.lifecycle.z$a */
    public interface a {
        /* renamed from: a */
        void mo12991a();

        /* renamed from: b */
        void mo12992b();

        /* renamed from: c */
        void mo12993c();
    }

    /* renamed from: androidx.lifecycle.z$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m12999a(Activity activity, AbstractC3345j.a event) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(event, "event");
            if (activity instanceof InterfaceC3349n) {
                AbstractC3345j mo9642a = ((InterfaceC3349n) activity).mo9642a();
                if (mo9642a instanceof C3350o) {
                    ((C3350o) mo9642a).m12941h(event);
                }
            }
        }

        /* renamed from: b */
        public final FragmentC3361z m13000b(Activity activity) {
            AbstractC5469l.m23028e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC5469l.m23026c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC3361z) findFragmentByTag;
        }

        /* renamed from: c */
        public final void m13001c(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m13002a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC3361z(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public b() {
        }
    }

    /* renamed from: androidx.lifecycle.z$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* renamed from: androidx.lifecycle.z$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC5464g abstractC5464g) {
                this();
            }

            /* renamed from: a */
            public final void m13002a(Activity activity) {
                AbstractC5469l.m23028e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m13002a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m12999a(activity, AbstractC3345j.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m12999a(activity, AbstractC3345j.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m12999a(activity, AbstractC3345j.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m12999a(activity, AbstractC3345j.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m12999a(activity, AbstractC3345j.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m12999a(activity, AbstractC3345j.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m12994a(AbstractC3345j.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f10800b;
            Activity activity = getActivity();
            AbstractC5469l.m23027d(activity, "activity");
            bVar.m12999a(activity, aVar);
        }
    }

    /* renamed from: b */
    public final void m12995b(a aVar) {
        if (aVar != null) {
            aVar.mo12991a();
        }
    }

    /* renamed from: c */
    public final void m12996c(a aVar) {
        if (aVar != null) {
            aVar.mo12992b();
        }
    }

    /* renamed from: d */
    public final void m12997d(a aVar) {
        if (aVar != null) {
            aVar.mo12993c();
        }
    }

    /* renamed from: e */
    public final void m12998e(a aVar) {
        this.f10801a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m12995b(this.f10801a);
        m12994a(AbstractC3345j.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m12994a(AbstractC3345j.a.ON_DESTROY);
        this.f10801a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m12994a(AbstractC3345j.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m12996c(this.f10801a);
        m12994a(AbstractC3345j.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m12997d(this.f10801a);
        m12994a(AbstractC3345j.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m12994a(AbstractC3345j.a.ON_STOP);
    }
}
