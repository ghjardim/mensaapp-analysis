package p079L1;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.sidecar.C3473b;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import kotlin.jvm.internal.AbstractC5481x;
import p058I1.C0620d;
import p069J5.InterfaceC0789a;
import p086M1.InterfaceC1145a;
import p093N1.AbstractC1250a;
import p153V5.InterfaceC2631d;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;

/* renamed from: L1.f */
/* loaded from: classes.dex */
public interface InterfaceC0897f {

    /* renamed from: a */
    public static final a f3132a = a.f3133a;

    /* renamed from: L1.f$a */
    public static final class a {

        /* renamed from: b */
        public static final boolean f3134b = false;

        /* renamed from: a */
        public static final /* synthetic */ a f3133a = new a();

        /* renamed from: c */
        public static final String f3135c = AbstractC5481x.m23040b(InterfaceC0897f.class).mo7022b();

        /* renamed from: d */
        public static final InterfaceC6923f f3136d = AbstractC6924g.m28367a(C7175a.f3138a);

        /* renamed from: e */
        public static InterfaceC0898g f3137e = C0893b.f3108a;

        /* renamed from: L1.f$a$a, reason: collision with other inner class name */
        public static final class C7175a extends AbstractC5470m implements InterfaceC0789a {

            /* renamed from: a */
            public static final C7175a f3138a = new C7175a();

            public C7175a() {
                super(0);
            }

            @Override // p069J5.InterfaceC0789a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC1145a invoke() {
                WindowLayoutComponent m3733g;
                try {
                    ClassLoader loader = InterfaceC0897f.class.getClassLoader();
                    C0896e c0896e = loader != null ? new C0896e(loader, new C0620d(loader)) : null;
                    if (c0896e == null || (m3733g = c0896e.m3733g()) == null) {
                        return null;
                    }
                    AbstractC1250a.a aVar = AbstractC1250a.f3965a;
                    AbstractC5469l.m23027d(loader, "loader");
                    return aVar.m4797a(m3733g, new C0620d(loader));
                } catch (Throwable unused) {
                    if (!a.f3134b) {
                        return null;
                    }
                    Log.d(a.f3135c, "Failed to load WindowExtensions");
                    return null;
                }
            }
        }

        /* renamed from: c */
        public final InterfaceC1145a m3748c() {
            return (InterfaceC1145a) f3136d.getValue();
        }

        /* renamed from: d */
        public final InterfaceC0897f m3749d(Context context) {
            AbstractC5469l.m23028e(context, "context");
            InterfaceC1145a m3748c = m3748c();
            if (m3748c == null) {
                m3748c = C3473b.f11650c.m13966a(context);
            }
            return f3137e.mo3719a(new C0900i(C0907p.f3155b, m3748c));
        }
    }

    /* renamed from: a */
    InterfaceC2631d mo3440a(Activity activity);
}
