package p049H;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.C3643a;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* renamed from: H.e */
/* loaded from: classes.dex */
public class C0507e {

    /* renamed from: a */
    public final Context f1683a;

    /* renamed from: b */
    public final InterfaceC0509f f1684b;

    /* renamed from: c */
    public final b f1685c;

    /* renamed from: d */
    public final a f1686d;

    /* renamed from: e */
    public VelocityTracker f1687e;

    /* renamed from: f */
    public float f1688f;

    /* renamed from: g */
    public int f1689g;

    /* renamed from: h */
    public int f1690h;

    /* renamed from: i */
    public int f1691i;

    /* renamed from: j */
    public final int[] f1692j;

    /* renamed from: H.e$a */
    public interface a {
        /* renamed from: a */
        float mo1926a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7);
    }

    /* renamed from: H.e$b */
    public interface b {
        /* renamed from: a */
        void mo1924a(Context context, int[] iArr, MotionEvent motionEvent, int i7);
    }

    public C0507e(Context context, InterfaceC0509f interfaceC0509f) {
        this(context, interfaceC0509f, new b() { // from class: H.c
            @Override // p049H.C0507e.b
            /* renamed from: a */
            public final void mo1924a(Context context2, int[] iArr, MotionEvent motionEvent, int i7) {
                C0507e.m1930c(context2, iArr, motionEvent, i7);
            }
        }, new a() { // from class: H.d
            @Override // p049H.C0507e.a
            /* renamed from: a */
            public final float mo1926a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
                float m1931f;
                m1931f = C0507e.m1931f(velocityTracker, motionEvent, i7);
                return m1931f;
            }
        });
    }

    /* renamed from: c */
    public static void m1930c(Context context, int[] iArr, MotionEvent motionEvent, int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC0478E.m1810i(context, viewConfiguration, motionEvent.getDeviceId(), i7, motionEvent.getSource());
        iArr[1] = AbstractC0478E.m1809h(context, viewConfiguration, motionEvent.getDeviceId(), i7, motionEvent.getSource());
    }

    /* renamed from: f */
    public static float m1931f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
        AbstractC0530y.m2027a(velocityTracker, motionEvent);
        AbstractC0530y.m2028b(velocityTracker, PipesIterator.DEFAULT_QUEUE_SIZE);
        return AbstractC0530y.m2030d(velocityTracker, i7);
    }

    /* renamed from: d */
    public final boolean m1932d(MotionEvent motionEvent, int i7) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1690h == source && this.f1691i == deviceId && this.f1689g == i7) {
            return false;
        }
        this.f1685c.mo1924a(this.f1683a, this.f1692j, motionEvent, i7);
        this.f1690h = source;
        this.f1691i = deviceId;
        this.f1689g = i7;
        return true;
    }

    /* renamed from: e */
    public final float m1933e(MotionEvent motionEvent, int i7) {
        if (this.f1687e == null) {
            this.f1687e = VelocityTracker.obtain();
        }
        return this.f1686d.mo1926a(this.f1687e, motionEvent, i7);
    }

    /* renamed from: g */
    public void m1934g(MotionEvent motionEvent, int i7) {
        boolean m1932d = m1932d(motionEvent, i7);
        if (this.f1692j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1687e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1687e = null;
                return;
            }
            return;
        }
        float m1933e = m1933e(motionEvent, i7) * this.f1684b.mo1946b();
        float signum = Math.signum(m1933e);
        if (m1932d || (signum != Math.signum(this.f1688f) && signum != 0.0f)) {
            this.f1684b.mo1947c();
        }
        float abs = Math.abs(m1933e);
        int[] iArr = this.f1692j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(m1933e, iArr[1]));
        this.f1688f = this.f1684b.mo1945a(max) ? max : 0.0f;
    }

    public C0507e(Context context, InterfaceC0509f interfaceC0509f, b bVar, a aVar) {
        this.f1689g = -1;
        this.f1690h = -1;
        this.f1691i = -1;
        this.f1692j = new int[]{C3643a.e.API_PRIORITY_OTHER, 0};
        this.f1683a = context;
        this.f1684b = interfaceC0509f;
        this.f1685c = bVar;
        this.f1686d = aVar;
    }
}
