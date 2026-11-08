package p291n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: n.a0 */
/* loaded from: classes.dex */
public class C5626a0 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f20401c = new Object();

    /* renamed from: d */
    public static ArrayList f20402d;

    /* renamed from: a */
    public final Resources f20403a;

    /* renamed from: b */
    public final Resources.Theme f20404b;

    public C5626a0(Context context) {
        super(context);
        if (!C5642i0.m23695b()) {
            this.f20403a = new C5630c0(this, context.getResources());
            this.f20404b = null;
            return;
        }
        C5642i0 c5642i0 = new C5642i0(this, context.getResources());
        this.f20403a = c5642i0;
        Resources.Theme newTheme = c5642i0.newTheme();
        this.f20404b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    public static boolean m23621a(Context context) {
        if ((context instanceof C5626a0) || (context.getResources() instanceof C5630c0) || (context.getResources() instanceof C5642i0)) {
            return false;
        }
        return C5642i0.m23695b();
    }

    /* renamed from: b */
    public static Context m23622b(Context context) {
        if (!m23621a(context)) {
            return context;
        }
        synchronized (f20401c) {
            try {
                ArrayList arrayList = f20402d;
                if (arrayList == null) {
                    f20402d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f20402d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f20402d.remove(size);
                        }
                    }
                    for (int size2 = f20402d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f20402d.get(size2);
                        C5626a0 c5626a0 = weakReference2 != null ? (C5626a0) weakReference2.get() : null;
                        if (c5626a0 != null && c5626a0.getBaseContext() == context) {
                            return c5626a0;
                        }
                    }
                }
                C5626a0 c5626a02 = new C5626a0(context);
                f20402d.add(new WeakReference(c5626a02));
                return c5626a02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f20403a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f20403a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f20404b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        Resources.Theme theme = this.f20404b;
        if (theme == null) {
            super.setTheme(i7);
        } else {
            theme.applyStyle(i7, true);
        }
    }
}
