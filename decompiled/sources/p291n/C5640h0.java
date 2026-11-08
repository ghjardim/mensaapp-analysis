package p291n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p223f.AbstractC4218c;
import p223f.AbstractC4220e;
import p223f.AbstractC4221f;
import p223f.AbstractC4223h;

/* renamed from: n.h0 */
/* loaded from: classes.dex */
public class C5640h0 {

    /* renamed from: a */
    public final Context f20451a;

    /* renamed from: b */
    public final View f20452b;

    /* renamed from: c */
    public final TextView f20453c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f20454d;

    /* renamed from: e */
    public final Rect f20455e;

    /* renamed from: f */
    public final int[] f20456f;

    /* renamed from: g */
    public final int[] f20457g;

    public C5640h0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f20454d = layoutParams;
        this.f20455e = new Rect();
        this.f20456f = new int[2];
        this.f20457g = new int[2];
        this.f20451a = context;
        View inflate = LayoutInflater.from(context).inflate(AbstractC4221f.f14197m, (ViewGroup) null);
        this.f20452b = inflate;
        this.f20453c = (TextView) inflate.findViewById(AbstractC4220e.f14171m);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC4223h.f14210a;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m23689b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void m23690a(View view, int i7, int i8, boolean z6, WindowManager.LayoutParams layoutParams) {
        int height;
        int i9;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f20451a.getResources().getDimensionPixelOffset(AbstractC4218c.f14108h);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f20451a.getResources().getDimensionPixelOffset(AbstractC4218c.f14107g);
            height = i8 + dimensionPixelOffset2;
            i9 = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f20451a.getResources().getDimensionPixelOffset(z6 ? AbstractC4218c.f14110j : AbstractC4218c.f14109i);
        View m23689b = m23689b(view);
        if (m23689b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m23689b.getWindowVisibleDisplayFrame(this.f20455e);
        Rect rect = this.f20455e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f20451a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f20455e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m23689b.getLocationOnScreen(this.f20457g);
        view.getLocationOnScreen(this.f20456f);
        int[] iArr = this.f20456f;
        int i10 = iArr[0];
        int[] iArr2 = this.f20457g;
        int i11 = i10 - iArr2[0];
        iArr[0] = i11;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i11 + i7) - (m23689b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f20452b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f20452b.getMeasuredHeight();
        int i12 = this.f20456f[1];
        int i13 = ((i9 + i12) - dimensionPixelOffset3) - measuredHeight;
        int i14 = i12 + height + dimensionPixelOffset3;
        if (z6) {
            if (i13 >= 0) {
                layoutParams.y = i13;
                return;
            } else {
                layoutParams.y = i14;
                return;
            }
        }
        if (measuredHeight + i14 <= this.f20455e.height()) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i13;
        }
    }

    /* renamed from: c */
    public void m23691c() {
        if (m23692d()) {
            ((WindowManager) this.f20451a.getSystemService("window")).removeView(this.f20452b);
        }
    }

    /* renamed from: d */
    public boolean m23692d() {
        return this.f20452b.getParent() != null;
    }

    /* renamed from: e */
    public void m23693e(View view, int i7, int i8, boolean z6, CharSequence charSequence) {
        if (m23692d()) {
            m23691c();
        }
        this.f20453c.setText(charSequence);
        m23690a(view, i7, i8, z6, this.f20454d);
        ((WindowManager) this.f20451a.getSystemService("window")).addView(this.f20452b, this.f20454d);
    }
}
