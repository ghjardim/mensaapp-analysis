package p291n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: n.c0 */
/* loaded from: classes.dex */
public class C5630c0 extends AbstractC5620V {

    /* renamed from: b */
    public final WeakReference f20413b;

    public C5630c0(Context context, Resources resources) {
        super(resources);
        this.f20413b = new WeakReference(context);
    }

    @Override // p291n.AbstractC5620V, android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Drawable drawable = super.getDrawable(i7);
        Context context = (Context) this.f20413b.get();
        if (drawable != null && context != null) {
            C5619U.m23557h().m23577w(context, i7, drawable);
        }
        return drawable;
    }
}
