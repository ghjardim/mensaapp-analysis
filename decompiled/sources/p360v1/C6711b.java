package p360v1;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C6711b {

    /* renamed from: a */
    public static final C6711b f24233a = new C6711b();

    /* renamed from: a */
    public final Object m27649a(Context context, String tag, InterfaceC0800l manager) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(tag, "tag");
        AbstractC5469l.m23028e(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + C6710a.f24230a.m27646b());
            return null;
        }
    }
}
