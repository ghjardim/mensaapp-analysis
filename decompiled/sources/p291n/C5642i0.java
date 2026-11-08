package p291n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: n.i0 */
/* loaded from: classes.dex */
public class C5642i0 extends Resources {

    /* renamed from: b */
    public static boolean f20460b = false;

    /* renamed from: a */
    public final WeakReference f20461a;

    public C5642i0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f20461a = new WeakReference(context);
    }

    /* renamed from: a */
    public static boolean m23694a() {
        return f20460b;
    }

    /* renamed from: b */
    public static boolean m23695b() {
        m23694a();
        return false;
    }

    /* renamed from: c */
    public final Drawable m23696c(int i7) {
        return super.getDrawable(i7);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Context context = (Context) this.f20461a.get();
        return context != null ? C5619U.m23557h().m23574s(context, this, i7) : super.getDrawable(i7);
    }
}
