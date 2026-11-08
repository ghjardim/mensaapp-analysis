package p180Z4;

import android.util.Log;
import java.util.List;
import p378x5.AbstractC7024o;

/* renamed from: Z4.o */
/* loaded from: classes2.dex */
public abstract class AbstractC3068o {
    /* renamed from: b */
    public static final List m11238b(Throwable th) {
        return AbstractC7024o.m28864j(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
