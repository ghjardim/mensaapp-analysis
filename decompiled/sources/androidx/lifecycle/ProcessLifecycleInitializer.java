package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C3359x;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p016C1.C0072a;
import p016C1.InterfaceC0073b;
import p378x5.AbstractC7024o;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0073b {
    @Override // p016C1.InterfaceC0073b
    /* renamed from: a */
    public List mo207a() {
        return AbstractC7024o.m28861g();
    }

    @Override // p016C1.InterfaceC0073b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3349n mo208b(Context context) {
        AbstractC5469l.m23028e(context, "context");
        C0072a m202d = C0072a.m202d(context);
        AbstractC5469l.m23027d(m202d, "getInstance(context)");
        if (!m202d.m206e(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C3346k.m12936a(context);
        C3359x.b bVar = C3359x.f10786p;
        bVar.m12990b(context);
        return bVar.m12989a();
    }
}
