package p028E;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p028E.AbstractC0200e;

/* renamed from: E.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0199d {
    /* renamed from: a */
    public static AbstractC0200e.a m800a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new AbstractC0200e.b(context, uri) : new AbstractC0200e.c(context, uri);
    }
}
