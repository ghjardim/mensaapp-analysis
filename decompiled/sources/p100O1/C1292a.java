package p100O1;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p058I1.AbstractC0624h;
import p058I1.C0618b;
import p058I1.EnumC0626j;
import p069J5.InterfaceC0800l;
import p079L1.C0895d;
import p079L1.C0901j;
import p079L1.InterfaceC0892a;
import p079L1.InterfaceC0894c;
import p378x5.AbstractC7024o;

/* renamed from: O1.a */
/* loaded from: classes.dex */
public final class C1292a {

    /* renamed from: b */
    public static final a f4046b = new a(null);

    /* renamed from: c */
    public static final String f4047c = C1292a.class.getSimpleName();

    /* renamed from: a */
    public final EnumC0626j f4048a;

    /* renamed from: O1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final int m4916a(SidecarDeviceState sidecarDeviceState) {
            AbstractC5469l.m23028e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    AbstractC5469l.m23026c(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        /* renamed from: b */
        public final int m4917b(SidecarDeviceState sidecarDeviceState) {
            AbstractC5469l.m23028e(sidecarDeviceState, "sidecarDeviceState");
            int m4916a = m4916a(sidecarDeviceState);
            if (m4916a < 0 || m4916a > 4) {
                return 0;
            }
            return m4916a;
        }

        /* renamed from: c */
        public final List m4918c(SidecarWindowLayoutInfo info) {
            AbstractC5469l.m23028e(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? AbstractC7024o.m28861g() : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    AbstractC5469l.m23026c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) invoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return AbstractC7024o.m28861g();
            }
        }

        /* renamed from: d */
        public final void m4919d(SidecarDeviceState sidecarDeviceState, int i7) {
            AbstractC5469l.m23028e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i7;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i7));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public a() {
        }
    }

    /* renamed from: O1.a$b */
    public static final class b extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public static final b f4049a = new b();

        public b() {
            super(1);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5469l.m23028e(require, "$this$require");
            boolean z6 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* renamed from: O1.a$c */
    public static final class c extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public static final c f4050a = new c();

        public c() {
            super(1);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5469l.m23028e(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* renamed from: O1.a$d */
    public static final class d extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public static final d f4051a = new d();

        public d() {
            super(1);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5469l.m23028e(require, "$this$require");
            boolean z6 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* renamed from: O1.a$e */
    public static final class e extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public static final e f4052a = new e();

        public e() {
            super(1);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5469l.m23028e(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    public C1292a(EnumC0626j verificationMode) {
        AbstractC5469l.m23028e(verificationMode, "verificationMode");
        this.f4048a = verificationMode;
    }

    /* renamed from: a */
    public final boolean m4909a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AbstractC5469l.m23024a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f4046b;
        return aVar.m4917b(sidecarDeviceState) == aVar.m4917b(sidecarDeviceState2);
    }

    /* renamed from: b */
    public final boolean m4910b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC5469l.m23024a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC5469l.m23024a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* renamed from: c */
    public final boolean m4911c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!m4910b((SidecarDisplayFeature) list.get(i7), (SidecarDisplayFeature) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m4912d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AbstractC5469l.m23024a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f4046b;
        return m4911c(aVar.m4918c(sidecarWindowLayoutInfo), aVar.m4918c(sidecarWindowLayoutInfo2));
    }

    /* renamed from: e */
    public final C0901j m4913e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        AbstractC5469l.m23028e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new C0901j(AbstractC7024o.m28861g());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        a aVar = f4046b;
        aVar.m4919d(sidecarDeviceState, aVar.m4917b(state));
        return new C0901j(m4914f(aVar.m4918c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    /* renamed from: f */
    public final List m4914f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        AbstractC5469l.m23028e(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        AbstractC5469l.m23028e(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            InterfaceC0892a m4915g = m4915g((SidecarDisplayFeature) it.next(), deviceState);
            if (m4915g != null) {
                arrayList.add(m4915g);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final InterfaceC0892a m4915g(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        C0895d.b m3725a;
        InterfaceC0894c.b bVar;
        AbstractC5469l.m23028e(feature, "feature");
        AbstractC5469l.m23028e(deviceState, "deviceState");
        AbstractC0624h.a aVar = AbstractC0624h.f2176a;
        String TAG = f4047c;
        AbstractC5469l.m23027d(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) AbstractC0624h.a.m2521b(aVar, feature, TAG, this.f4048a, null, 4, null).mo2519c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f4049a).mo2519c("Feature bounds must not be 0", c.f4050a).mo2519c("TYPE_FOLD must have 0 area", d.f4051a).mo2519c("Feature be pinned to either left or top", e.f4052a).mo2518a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            m3725a = C0895d.b.f3121b.m3725a();
        } else {
            if (type != 2) {
                return null;
            }
            m3725a = C0895d.b.f3121b.m3726b();
        }
        int m4917b = f4046b.m4917b(deviceState);
        if (m4917b == 0 || m4917b == 1) {
            return null;
        }
        if (m4917b == 2) {
            bVar = InterfaceC0894c.b.f3115d;
        } else if (m4917b == 3) {
            bVar = InterfaceC0894c.b.f3114c;
        } else {
            if (m4917b == 4) {
                return null;
            }
            bVar = InterfaceC0894c.b.f3114c;
        }
        Rect rect = feature.getRect();
        AbstractC5469l.m23027d(rect, "feature.rect");
        return new C0895d(new C0618b(rect), m3725a, bVar);
    }

    public /* synthetic */ C1292a(EnumC0626j enumC0626j, int i7, AbstractC5464g abstractC5464g) {
        this((i7 & 1) != 0 ? EnumC0626j.QUIET : enumC0626j);
    }
}
