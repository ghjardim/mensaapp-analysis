package p291n;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.C3643a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p223f.AbstractC4224i;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: n.A */
/* loaded from: classes.dex */
public class C5600A {

    /* renamed from: k */
    public static final RectF f20251k = new RectF();

    /* renamed from: l */
    public static ConcurrentHashMap f20252l = new ConcurrentHashMap();

    /* renamed from: m */
    public static ConcurrentHashMap f20253m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f20254a = 0;

    /* renamed from: b */
    public boolean f20255b = false;

    /* renamed from: c */
    public float f20256c = -1.0f;

    /* renamed from: d */
    public float f20257d = -1.0f;

    /* renamed from: e */
    public float f20258e = -1.0f;

    /* renamed from: f */
    public int[] f20259f = new int[0];

    /* renamed from: g */
    public boolean f20260g = false;

    /* renamed from: h */
    public TextPaint f20261h;

    /* renamed from: i */
    public final TextView f20262i;

    /* renamed from: j */
    public final Context f20263j;

    public C5600A(TextView textView) {
        this.f20262i = textView;
        this.f20263j = textView.getContext();
    }

    /* renamed from: l */
    public static Method m23463l(String str) {
        try {
            Method method = (Method) f20252l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                f20252l.put(str, method);
            }
            return method;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    /* renamed from: n */
    public static Object m23464n(Object obj, String str, Object obj2) {
        try {
            return m23463l(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    /* renamed from: A */
    public final void m23465A(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f20254a = 1;
        this.f20257d = f7;
        this.f20258e = f8;
        this.f20256c = f9;
        this.f20260g = false;
    }

    /* renamed from: a */
    public void m23466a() {
        if (m23478o()) {
            if (this.f20255b) {
                if (this.f20262i.getMeasuredHeight() <= 0 || this.f20262i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f20262i.isHorizontallyScrollable() : ((Boolean) m23464n(this.f20262i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f20262i.getMeasuredWidth() - this.f20262i.getTotalPaddingLeft()) - this.f20262i.getTotalPaddingRight();
                int height = (this.f20262i.getHeight() - this.f20262i.getCompoundPaddingBottom()) - this.f20262i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f20251k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m23471f = m23471f(rectF);
                        if (m23471f != this.f20262i.getTextSize()) {
                            m23484u(0, m23471f);
                        }
                    } finally {
                    }
                }
            }
            this.f20255b = true;
        }
    }

    /* renamed from: b */
    public final int[] m23467b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void m23468c() {
        this.f20254a = 0;
        this.f20257d = -1.0f;
        this.f20258e = -1.0f;
        this.f20256c = -1.0f;
        this.f20259f = new int[0];
        this.f20255b = false;
    }

    /* renamed from: d */
    public StaticLayout m23469d(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        return m23470e(charSequence, alignment, i7, i8);
    }

    /* renamed from: e */
    public final StaticLayout m23470e(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f20261h, i7);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f20262i.getLineSpacingExtra(), this.f20262i.getLineSpacingMultiplier()).setIncludePad(this.f20262i.getIncludeFontPadding()).setBreakStrategy(this.f20262i.getBreakStrategy()).setHyphenationFrequency(this.f20262i.getHyphenationFrequency());
        if (i8 == -1) {
            i8 = C3643a.e.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i8);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f20262i.getTextDirectionHeuristic() : (TextDirectionHeuristic) m23464n(this.f20262i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: f */
    public final int m23471f(RectF rectF) {
        int length = this.f20259f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = 1;
        int i8 = length - 1;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = (i7 + i8) / 2;
            if (m23488y(this.f20259f[i10], rectF)) {
                int i11 = i10 + 1;
                i9 = i7;
                i7 = i11;
            } else {
                i9 = i10 - 1;
                i8 = i9;
            }
        }
        return this.f20259f[i9];
    }

    /* renamed from: g */
    public int m23472g() {
        return Math.round(this.f20258e);
    }

    /* renamed from: h */
    public int m23473h() {
        return Math.round(this.f20257d);
    }

    /* renamed from: i */
    public int m23474i() {
        return Math.round(this.f20256c);
    }

    /* renamed from: j */
    public int[] m23475j() {
        return this.f20259f;
    }

    /* renamed from: k */
    public int m23476k() {
        return this.f20254a;
    }

    /* renamed from: m */
    public void m23477m(int i7) {
        TextPaint textPaint = this.f20261h;
        if (textPaint == null) {
            this.f20261h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f20261h.set(this.f20262i.getPaint());
        this.f20261h.setTextSize(i7);
    }

    /* renamed from: o */
    public boolean m23478o() {
        return m23489z() && this.f20254a != 0;
    }

    /* renamed from: p */
    public void m23479p(AttributeSet attributeSet, int i7) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f20263j.obtainStyledAttributes(attributeSet, AbstractC4224i.f14291U, i7, 0);
        if (obtainStyledAttributes.hasValue(AbstractC4224i.f14311Z)) {
            this.f20254a = obtainStyledAttributes.getInt(AbstractC4224i.f14311Z, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(AbstractC4224i.f14307Y) ? obtainStyledAttributes.getDimension(AbstractC4224i.f14307Y, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(AbstractC4224i.f14299W) ? obtainStyledAttributes.getDimension(AbstractC4224i.f14299W, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(AbstractC4224i.f14295V) ? obtainStyledAttributes.getDimension(AbstractC4224i.f14295V, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(AbstractC4224i.f14303X) && (resourceId = obtainStyledAttributes.getResourceId(AbstractC4224i.f14303X, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m23486w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m23489z()) {
            this.f20254a = 0;
            return;
        }
        if (this.f20254a == 1) {
            if (!this.f20260g) {
                DisplayMetrics displayMetrics = this.f20263j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m23465A(dimension2, dimension3, dimension);
            }
            m23485v();
        }
    }

    /* renamed from: q */
    public void m23480q(int i7, int i8, int i9, int i10) {
        if (m23489z()) {
            DisplayMetrics displayMetrics = this.f20263j.getResources().getDisplayMetrics();
            m23465A(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (m23485v()) {
                m23466a();
            }
        }
    }

    /* renamed from: r */
    public void m23481r(int[] iArr, int i7) {
        if (m23489z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f20263j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f20259f = m23467b(iArr2);
                if (!m23487x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f20260g = false;
            }
            if (m23485v()) {
                m23466a();
            }
        }
    }

    /* renamed from: s */
    public void m23482s(int i7) {
        if (m23489z()) {
            if (i7 == 0) {
                m23468c();
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            }
            DisplayMetrics displayMetrics = this.f20263j.getResources().getDisplayMetrics();
            m23465A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m23485v()) {
                m23466a();
            }
        }
    }

    /* renamed from: t */
    public final void m23483t(float f7) {
        if (f7 != this.f20262i.getPaint().getTextSize()) {
            this.f20262i.getPaint().setTextSize(f7);
            boolean isInLayout = this.f20262i.isInLayout();
            if (this.f20262i.getLayout() != null) {
                this.f20255b = false;
                try {
                    Method m23463l = m23463l("nullLayouts");
                    if (m23463l != null) {
                        m23463l.invoke(this.f20262i, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (isInLayout) {
                    this.f20262i.forceLayout();
                } else {
                    this.f20262i.requestLayout();
                }
                this.f20262i.invalidate();
            }
        }
    }

    /* renamed from: u */
    public void m23484u(int i7, float f7) {
        Context context = this.f20263j;
        m23483t(TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* renamed from: v */
    public final boolean m23485v() {
        if (m23489z() && this.f20254a == 1) {
            if (!this.f20260g || this.f20259f.length == 0) {
                int floor = ((int) Math.floor((this.f20258e - this.f20257d) / this.f20256c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round(this.f20257d + (i7 * this.f20256c));
                }
                this.f20259f = m23467b(iArr);
            }
            this.f20255b = true;
        } else {
            this.f20255b = false;
        }
        return this.f20255b;
    }

    /* renamed from: w */
    public final void m23486w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f20259f = m23467b(iArr);
            m23487x();
        }
    }

    /* renamed from: x */
    public final boolean m23487x() {
        boolean z6 = this.f20259f.length > 0;
        this.f20260g = z6;
        if (z6) {
            this.f20254a = 1;
            this.f20257d = r0[0];
            this.f20258e = r0[r1 - 1];
            this.f20256c = -1.0f;
        }
        return z6;
    }

    /* renamed from: y */
    public final boolean m23488y(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f20262i.getText();
        TransformationMethod transformationMethod = this.f20262i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f20262i)) != null) {
            text = transformation;
        }
        int maxLines = this.f20262i.getMaxLines();
        m23477m(i7);
        StaticLayout m23469d = m23469d(text, (Layout.Alignment) m23464n(this.f20262i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m23469d.getLineCount() <= maxLines && m23469d.getLineEnd(m23469d.getLineCount() - 1) == text.length())) && ((float) m23469d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: z */
    public final boolean m23489z() {
        return true;
    }
}
