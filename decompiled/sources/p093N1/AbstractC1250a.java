package p093N1;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p058I1.C0620d;
import p058I1.C0621e;
import p086M1.InterfaceC1145a;

/* renamed from: N1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1250a implements InterfaceC1145a {

    /* renamed from: a */
    public static final a f3965a = new a(null);

    /* renamed from: N1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC1145a m4797a(WindowLayoutComponent component, C0620d adapter) {
            AbstractC5469l.m23028e(component, "component");
            AbstractC5469l.m23028e(adapter, "adapter");
            int m2517a = C0621e.f2167a.m2517a();
            return m2517a >= 2 ? new C1254e(component) : m2517a == 1 ? new C1253d(component, adapter) : new C1252c();
        }

        public a() {
        }
    }
}
