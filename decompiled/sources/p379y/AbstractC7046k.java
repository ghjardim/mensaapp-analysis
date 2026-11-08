package p379y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: y.k */
/* loaded from: classes.dex */
public abstract class AbstractC7046k {
    /* renamed from: a */
    public static int m29007a(Context context, int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId != 0 ? i7 : i8;
    }

    /* renamed from: b */
    public static boolean m29008b(TypedArray typedArray, int i7, int i8, boolean z6) {
        return typedArray.getBoolean(i7, typedArray.getBoolean(i8, z6));
    }

    /* renamed from: c */
    public static Drawable m29009c(TypedArray typedArray, int i7, int i8) {
        Drawable drawable = typedArray.getDrawable(i7);
        return drawable == null ? typedArray.getDrawable(i8) : drawable;
    }

    /* renamed from: d */
    public static int m29010d(TypedArray typedArray, int i7, int i8, int i9) {
        return typedArray.getInt(i7, typedArray.getInt(i8, i9));
    }

    /* renamed from: e */
    public static boolean m29011e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, boolean z6) {
        return !m29024r(xmlPullParser, str) ? z6 : typedArray.getBoolean(i7, z6);
    }

    /* renamed from: f */
    public static int m29012f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !m29024r(xmlPullParser, str) ? i8 : typedArray.getColor(i7, i8);
    }

    /* renamed from: g */
    public static ColorStateList m29013g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        if (!m29024r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i7, typedValue);
        int i8 = typedValue.type;
        if (i8 != 2) {
            return (i8 < 28 || i8 > 31) ? AbstractC7038c.m28943d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme) : m29014h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i7 + ": " + typedValue);
    }

    /* renamed from: h */
    public static ColorStateList m29014h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static C7039d m29015i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7, int i8) {
        if (m29024r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i9 = typedValue.type;
            if (i9 >= 28 && i9 <= 31) {
                return C7039d.m28949b(typedValue.data);
            }
            C7039d m28952g = C7039d.m28952g(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            if (m28952g != null) {
                return m28952g;
            }
        }
        return C7039d.m28949b(i8);
    }

    /* renamed from: j */
    public static float m29016j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, float f7) {
        return !m29024r(xmlPullParser, str) ? f7 : typedArray.getFloat(i7, f7);
    }

    /* renamed from: k */
    public static int m29017k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !m29024r(xmlPullParser, str) ? i8 : typedArray.getInt(i7, i8);
    }

    /* renamed from: l */
    public static int m29018l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !m29024r(xmlPullParser, str) ? i8 : typedArray.getResourceId(i7, i8);
    }

    /* renamed from: m */
    public static String m29019m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7) {
        if (m29024r(xmlPullParser, str)) {
            return typedArray.getString(i7);
        }
        return null;
    }

    /* renamed from: n */
    public static int m29020n(TypedArray typedArray, int i7, int i8, int i9) {
        return typedArray.getResourceId(i7, typedArray.getResourceId(i8, i9));
    }

    /* renamed from: o */
    public static String m29021o(TypedArray typedArray, int i7, int i8) {
        String string = typedArray.getString(i7);
        return string == null ? typedArray.getString(i8) : string;
    }

    /* renamed from: p */
    public static CharSequence m29022p(TypedArray typedArray, int i7, int i8) {
        CharSequence text = typedArray.getText(i7);
        return text == null ? typedArray.getText(i8) : text;
    }

    /* renamed from: q */
    public static CharSequence[] m29023q(TypedArray typedArray, int i7, int i8) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        return textArray == null ? typedArray.getTextArray(i8) : textArray;
    }

    /* renamed from: r */
    public static boolean m29024r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: s */
    public static TypedArray m29025s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: t */
    public static TypedValue m29026t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7) {
        if (m29024r(xmlPullParser, str)) {
            return typedArray.peekValue(i7);
        }
        return null;
    }
}
