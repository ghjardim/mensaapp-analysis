package p381y1;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p360v1.C6710a;
import p360v1.C6711b;
import p392z5.InterfaceC7157e;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public abstract class AbstractC7051b {

    /* renamed from: a */
    public static final a f25143a = new a(null);

    /* renamed from: y1.b$a */
    public static final class a {

        /* renamed from: y1.b$a$a, reason: collision with other inner class name */
        public static final class C7246a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public final /* synthetic */ Context f25144a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7246a(Context context) {
                super(1);
                this.f25144a = context;
            }

            @Override // p069J5.InterfaceC0800l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C7053d invoke(Context it) {
                AbstractC5469l.m23028e(it, "it");
                return new C7053d(this.f25144a);
            }
        }

        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7051b m29046a(Context context) {
            AbstractC5469l.m23028e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C6710a c6710a = C6710a.f24230a;
            sb.append(c6710a.m27645a());
            Log.d("MeasurementManager", sb.toString());
            if (c6710a.m27645a() >= 5) {
                return new C7056g(context);
            }
            if (c6710a.m27646b() >= 9) {
                return (AbstractC7051b) C6711b.f24233a.m27649a(context, "MeasurementManager", new C7246a(context));
            }
            return null;
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract Object mo29039a(AbstractC7050a abstractC7050a, InterfaceC7157e interfaceC7157e);

    /* renamed from: b */
    public abstract Object mo29040b(InterfaceC7157e interfaceC7157e);

    /* renamed from: c */
    public abstract Object mo29041c(Uri uri, InputEvent inputEvent, InterfaceC7157e interfaceC7157e);

    /* renamed from: d */
    public abstract Object mo29042d(AbstractC7062m abstractC7062m, InterfaceC7157e interfaceC7157e);

    /* renamed from: e */
    public abstract Object mo29043e(Uri uri, InterfaceC7157e interfaceC7157e);

    /* renamed from: f */
    public abstract Object mo29044f(AbstractC7063n abstractC7063n, InterfaceC7157e interfaceC7157e);

    /* renamed from: g */
    public abstract Object mo29045g(AbstractC7064o abstractC7064o, InterfaceC7157e interfaceC7157e);
}
