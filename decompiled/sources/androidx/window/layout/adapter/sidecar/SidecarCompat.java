package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.InterfaceC3472a;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p042G.InterfaceC0339a;
import p058I1.C0627k;
import p079L1.C0901j;
import p100O1.C1292a;
import p371w5.C6934q;
import p372x.InterfaceC6937c;
import p378x5.AbstractC7024o;

/* loaded from: classes.dex */
public final class SidecarCompat implements InterfaceC3472a {

    /* renamed from: f */
    public static final C3469a f11638f = new C3469a(null);

    /* renamed from: a */
    public final SidecarInterface f11639a;

    /* renamed from: b */
    public final C1292a f11640b;

    /* renamed from: c */
    public final Map f11641c;

    /* renamed from: d */
    public final Map f11642d;

    /* renamed from: e */
    public C3470b f11643e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface m13949h;
            AbstractC5469l.m23028e(newDeviceState, "newDeviceState");
            Collection<Activity> values = SidecarCompat.this.f11641c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder m13955a = SidecarCompat.f11638f.m13955a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (m13955a != null && (m13949h = sidecarCompat.m13949h()) != null) {
                    sidecarWindowLayoutInfo = m13949h.getWindowLayoutInfo(m13955a);
                }
                C3470b c3470b = sidecarCompat.f11643e;
                if (c3470b != null) {
                    c3470b.mo13958a(activity, sidecarCompat.f11640b.m4913e(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            AbstractC5469l.m23028e(windowToken, "windowToken");
            AbstractC5469l.m23028e(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f11641c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            C1292a c1292a = SidecarCompat.this.f11640b;
            SidecarInterface m13949h = SidecarCompat.this.m13949h();
            if (m13949h == null || (sidecarDeviceState = m13949h.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            C0901j m4913e = c1292a.m4913e(newLayout, sidecarDeviceState);
            C3470b c3470b = SidecarCompat.this.f11643e;
            if (c3470b != null) {
                c3470b.mo13958a(activity, m4913e);
            }
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.SidecarCompat$a */
    public static final class C3469a {
        public /* synthetic */ C3469a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final IBinder m13955a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        /* renamed from: b */
        public final SidecarInterface m13956b(Context context) {
            AbstractC5469l.m23028e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        /* renamed from: c */
        public final C0627k m13957c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return C0627k.f2185f.m2531b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public C3469a() {
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.SidecarCompat$b */
    public static final class C3470b implements InterfaceC3472a.a {

        /* renamed from: a */
        public final InterfaceC3472a.a f11645a;

        /* renamed from: b */
        public final ReentrantLock f11646b;

        /* renamed from: c */
        public final WeakHashMap f11647c;

        public C3470b(InterfaceC3472a.a callbackInterface) {
            AbstractC5469l.m23028e(callbackInterface, "callbackInterface");
            this.f11645a = callbackInterface;
            this.f11646b = new ReentrantLock();
            this.f11647c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.InterfaceC3472a.a
        /* renamed from: a */
        public void mo13958a(Activity activity, C0901j newLayout) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f11646b;
            reentrantLock.lock();
            try {
                if (AbstractC5469l.m23024a(newLayout, (C0901j) this.f11647c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f11645a.mo13958a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final void m13959b(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            ReentrantLock reentrantLock = this.f11646b;
            reentrantLock.lock();
            try {
                this.f11647c.put(activity, null);
                C6934q c6934q = C6934q.f24811a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.SidecarCompat$c */
    public static final class ViewOnAttachStateChangeListenerC3471c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final SidecarCompat f11648a;

        /* renamed from: b */
        public final WeakReference f11649b;

        public ViewOnAttachStateChangeListenerC3471c(SidecarCompat sidecarCompat, Activity activity) {
            AbstractC5469l.m23028e(sidecarCompat, "sidecarCompat");
            AbstractC5469l.m23028e(activity, "activity");
            this.f11648a = sidecarCompat;
            this.f11649b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC5469l.m23028e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f11649b.get();
            IBinder m13955a = SidecarCompat.f11638f.m13955a(activity);
            if (activity == null || m13955a == null) {
                return;
            }
            this.f11648a.m13951j(m13955a, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC5469l.m23028e(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C1292a sidecarAdapter) {
        AbstractC5469l.m23028e(sidecarAdapter, "sidecarAdapter");
        this.f11639a = sidecarInterface;
        this.f11640b = sidecarAdapter;
        this.f11641c = new LinkedHashMap();
        this.f11642d = new LinkedHashMap();
    }

    /* renamed from: l */
    public static final void m13945l(SidecarCompat this$0, Activity activity, Configuration configuration) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(activity, "$activity");
        C3470b c3470b = this$0.f11643e;
        if (c3470b != null) {
            c3470b.mo13958a(activity, this$0.m13950i(activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.InterfaceC3472a
    /* renamed from: a */
    public void mo13946a(InterfaceC3472a.a extensionCallback) {
        AbstractC5469l.m23028e(extensionCallback, "extensionCallback");
        this.f11643e = new C3470b(extensionCallback);
        SidecarInterface sidecarInterface = this.f11639a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f11640b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.InterfaceC3472a
    /* renamed from: b */
    public void mo13947b(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        IBinder m13955a = f11638f.m13955a(activity);
        if (m13955a != null) {
            m13951j(m13955a, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3471c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.InterfaceC3472a
    /* renamed from: c */
    public void mo13948c(Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC5469l.m23028e(activity, "activity");
        IBinder m13955a = f11638f.m13955a(activity);
        if (m13955a == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f11639a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(m13955a);
        }
        m13953m(activity);
        C3470b c3470b = this.f11643e;
        if (c3470b != null) {
            c3470b.m13959b(activity);
        }
        boolean z6 = this.f11641c.size() == 1;
        this.f11641c.remove(m13955a);
        if (!z6 || (sidecarInterface = this.f11639a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* renamed from: h */
    public final SidecarInterface m13949h() {
        return this.f11639a;
    }

    /* renamed from: i */
    public final C0901j m13950i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        AbstractC5469l.m23028e(activity, "activity");
        IBinder m13955a = f11638f.m13955a(activity);
        if (m13955a == null) {
            return new C0901j(AbstractC7024o.m28861g());
        }
        SidecarInterface sidecarInterface = this.f11639a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(m13955a) : null;
        C1292a c1292a = this.f11640b;
        SidecarInterface sidecarInterface2 = this.f11639a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return c1292a.m4913e(windowLayoutInfo, sidecarDeviceState);
    }

    /* renamed from: j */
    public final void m13951j(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC5469l.m23028e(windowToken, "windowToken");
        AbstractC5469l.m23028e(activity, "activity");
        this.f11641c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f11639a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f11641c.size() == 1 && (sidecarInterface = this.f11639a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C3470b c3470b = this.f11643e;
        if (c3470b != null) {
            c3470b.mo13958a(activity, m13950i(activity));
        }
        m13952k(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m13952k(final Activity activity) {
        if (this.f11642d.get(activity) == null && (activity instanceof InterfaceC6937c)) {
            InterfaceC0339a interfaceC0339a = new InterfaceC0339a() { // from class: O1.b
                @Override // p042G.InterfaceC0339a
                public final void accept(Object obj) {
                    SidecarCompat.m13945l(SidecarCompat.this, activity, (Configuration) obj);
                }
            };
            this.f11642d.put(activity, interfaceC0339a);
            ((InterfaceC6937c) activity).mo9948p(interfaceC0339a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final void m13953m(Activity activity) {
        InterfaceC0339a interfaceC0339a = (InterfaceC0339a) this.f11642d.get(activity);
        if (interfaceC0339a == null) {
            return;
        }
        if (activity instanceof InterfaceC6937c) {
            ((InterfaceC6937c) activity).mo9946l(interfaceC0339a);
        }
        this.f11642d.remove(activity);
    }

    /* renamed from: n */
    public boolean m13954n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f11639a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!AbstractC5469l.m23024a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f11639a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f11639a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f11639a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!AbstractC5469l.m23024a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f11639a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!AbstractC5469l.m23024a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f11639a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!AbstractC5469l.m23024a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC5469l.m23026c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            AbstractC5469l.m23027d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                AbstractC5469l.m23026c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!AbstractC5469l.m23024a(arrayList, (List) invoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f11638f.m13956b(context), new C1292a(null, 1, null));
        AbstractC5469l.m23028e(context, "context");
    }
}
