package p379y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p014C.AbstractC0069a;
import p358v.AbstractC6699a;
import p358v.AbstractC6702d;

/* renamed from: y.c */
/* loaded from: classes.dex */
public abstract class AbstractC7038c {

    /* renamed from: a */
    public static final ThreadLocal f25100a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m28940a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m28941b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m28941b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m28944e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    public static TypedValue m28942c() {
        ThreadLocal threadLocal = f25100a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m28943d(Resources resources, int i7, Resources.Theme theme) {
        try {
            return m28940a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
            return null;
        }
    }

    /* renamed from: e */
    public static ColorStateList m28944e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        Resources resources2 = resources;
        int i7 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i8 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i7 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m28947h = m28947h(resources2, theme, attributeSet, AbstractC6702d.f24174b);
                int resourceId = m28947h.getResourceId(AbstractC6702d.f24175c, -1);
                if (resourceId == -1 || m28945f(resources2, resourceId)) {
                    color = m28947h.getColor(AbstractC6702d.f24175c, -65281);
                } else {
                    try {
                        color = m28940a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = m28947h.getColor(AbstractC6702d.f24175c, -65281);
                    }
                }
                float f7 = 1.0f;
                if (m28947h.hasValue(AbstractC6702d.f24176d)) {
                    f7 = m28947h.getFloat(AbstractC6702d.f24176d, 1.0f);
                } else if (m28947h.hasValue(AbstractC6702d.f24178f)) {
                    f7 = m28947h.getFloat(AbstractC6702d.f24178f, 1.0f);
                }
                float f8 = (Build.VERSION.SDK_INT < 31 || !m28947h.hasValue(AbstractC6702d.f24177e)) ? m28947h.getFloat(AbstractC6702d.f24179g, -1.0f) : m28947h.getFloat(AbstractC6702d.f24177e, -1.0f);
                m28947h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i9 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC6699a.f24110a && attributeNameResource != AbstractC6699a.f24111b) {
                        int i11 = i9 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i9] = attributeNameResource;
                        i9 = i11;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i9);
                iArr2 = AbstractC7042g.m28985a(iArr2, i8, m28946g(color, f7, f8));
                iArr = (int[][]) AbstractC7042g.m28986b(iArr, i8, trimStateSet);
                i8++;
            }
            i7 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i8];
        int[][] iArr5 = new int[i8][];
        System.arraycopy(iArr2, 0, iArr4, 0, i8);
        System.arraycopy(iArr, 0, iArr5, 0, i8);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: f */
    public static boolean m28945f(Resources resources, int i7) {
        TypedValue m28942c = m28942c();
        resources.getValue(i7, m28942c, true);
        int i8 = m28942c.type;
        return i8 >= 28 && i8 <= 31;
    }

    /* renamed from: g */
    public static int m28946g(int i7, float f7, float f8) {
        boolean z6 = f8 >= 0.0f && f8 <= 100.0f;
        if (f7 == 1.0f && !z6) {
            return i7;
        }
        int m167a = AbstractC0069a.m167a((int) ((Color.alpha(i7) * f7) + 0.5f), 0, 255);
        if (z6) {
            C7036a m28917c = C7036a.m28917c(i7);
            i7 = C7036a.m28921m(m28917c.m28927j(), m28917c.m28926i(), f8);
        }
        return (i7 & 16777215) | (m167a << 24);
    }

    /* renamed from: h */
    public static TypedArray m28947h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
