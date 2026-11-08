package p107P1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: P1.c */
/* loaded from: classes.dex */
public final class C1426c {

    /* renamed from: a */
    public static final C1426c f4477a = new C1426c();

    /* renamed from: a */
    public final Context m5538a(Context context) {
        AbstractC5469l.m23028e(context, "context");
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof Activity) {
                return context2;
            }
            if (context2 instanceof InputMethodService) {
                return context2;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                return context2;
            }
            context2 = contextWrapper.getBaseContext();
            AbstractC5469l.m23027d(context2, "iterator.baseContext");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}
