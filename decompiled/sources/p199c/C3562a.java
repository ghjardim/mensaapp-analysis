package p199c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c.a */
/* loaded from: classes.dex */
public final class C3562a {

    /* renamed from: a */
    public final Set f12021a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f12022b;

    /* renamed from: a */
    public final void m14382a(InterfaceC3563b listener) {
        AbstractC5469l.m23028e(listener, "listener");
        Context context = this.f12022b;
        if (context != null) {
            listener.mo9920a(context);
        }
        this.f12021a.add(listener);
    }

    /* renamed from: b */
    public final void m14383b() {
        this.f12022b = null;
    }

    /* renamed from: c */
    public final void m14384c(Context context) {
        AbstractC5469l.m23028e(context, "context");
        this.f12022b = context;
        Iterator it = this.f12021a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3563b) it.next()).mo9920a(context);
        }
    }
}
