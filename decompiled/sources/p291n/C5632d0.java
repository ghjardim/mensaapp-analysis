package p291n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p239h.AbstractC4474a;
import p379y.AbstractC7043h;

/* renamed from: n.d0 */
/* loaded from: classes.dex */
public class C5632d0 {

    /* renamed from: a */
    public final Context f20420a;

    /* renamed from: b */
    public final TypedArray f20421b;

    /* renamed from: c */
    public TypedValue f20422c;

    public C5632d0(Context context, TypedArray typedArray) {
        this.f20420a = context;
        this.f20421b = typedArray;
    }

    /* renamed from: p */
    public static C5632d0 m23635p(Context context, int i7, int[] iArr) {
        return new C5632d0(context, context.obtainStyledAttributes(i7, iArr));
    }

    /* renamed from: q */
    public static C5632d0 m23636q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C5632d0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: r */
    public static C5632d0 m23637r(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new C5632d0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    /* renamed from: a */
    public boolean m23638a(int i7, boolean z6) {
        return this.f20421b.getBoolean(i7, z6);
    }

    /* renamed from: b */
    public int m23639b(int i7, int i8) {
        return this.f20421b.getColor(i7, i8);
    }

    /* renamed from: c */
    public ColorStateList m23640c(int i7) {
        int resourceId;
        ColorStateList m19043a;
        return (!this.f20421b.hasValue(i7) || (resourceId = this.f20421b.getResourceId(i7, 0)) == 0 || (m19043a = AbstractC4474a.m19043a(this.f20420a, resourceId)) == null) ? this.f20421b.getColorStateList(i7) : m19043a;
    }

    /* renamed from: d */
    public int m23641d(int i7, int i8) {
        return this.f20421b.getDimensionPixelOffset(i7, i8);
    }

    /* renamed from: e */
    public int m23642e(int i7, int i8) {
        return this.f20421b.getDimensionPixelSize(i7, i8);
    }

    /* renamed from: f */
    public Drawable m23643f(int i7) {
        int resourceId;
        return (!this.f20421b.hasValue(i7) || (resourceId = this.f20421b.getResourceId(i7, 0)) == 0) ? this.f20421b.getDrawable(i7) : AbstractC4474a.m19044b(this.f20420a, resourceId);
    }

    /* renamed from: g */
    public float m23644g(int i7, float f7) {
        return this.f20421b.getFloat(i7, f7);
    }

    /* renamed from: h */
    public Typeface m23645h(int i7, int i8, AbstractC7043h.e eVar) {
        int resourceId = this.f20421b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f20422c == null) {
            this.f20422c = new TypedValue();
        }
        return AbstractC7043h.m28992e(this.f20420a, resourceId, this.f20422c, i8, eVar);
    }

    /* renamed from: i */
    public int m23646i(int i7, int i8) {
        return this.f20421b.getInt(i7, i8);
    }

    /* renamed from: j */
    public int m23647j(int i7, int i8) {
        return this.f20421b.getInteger(i7, i8);
    }

    /* renamed from: k */
    public int m23648k(int i7, int i8) {
        return this.f20421b.getLayoutDimension(i7, i8);
    }

    /* renamed from: l */
    public int m23649l(int i7, int i8) {
        return this.f20421b.getResourceId(i7, i8);
    }

    /* renamed from: m */
    public String m23650m(int i7) {
        return this.f20421b.getString(i7);
    }

    /* renamed from: n */
    public CharSequence m23651n(int i7) {
        return this.f20421b.getText(i7);
    }

    /* renamed from: o */
    public boolean m23652o(int i7) {
        return this.f20421b.hasValue(i7);
    }

    /* renamed from: s */
    public void m23653s() {
        this.f20421b.recycle();
    }
}
