package p037F1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p379y.AbstractC7046k;
import p386z.AbstractC7088c;

/* renamed from: F1.d */
/* loaded from: classes.dex */
public abstract class AbstractC0326d {

    /* renamed from: F1.d$a */
    public static class a implements TypeEvaluator {

        /* renamed from: a */
        public AbstractC7088c.b[] f1207a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC7088c.b[] evaluate(float f7, AbstractC7088c.b[] bVarArr, AbstractC7088c.b[] bVarArr2) {
            if (!AbstractC7088c.m29199b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!AbstractC7088c.m29199b(this.f1207a, bVarArr)) {
                this.f1207a = AbstractC7088c.m29203f(bVarArr);
            }
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                this.f1207a[i7].m29217h(bVarArr[i7], bVarArr2[i7], f7);
            }
            return this.f1207a;
        }
    }

    /* renamed from: a */
    public static Animator m1274a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f7) {
        return m1275b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator m1275b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p037F1.AbstractC0326d.m1275b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    public static Keyframe m1276c(Keyframe keyframe, float f7) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f7) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f7) : Keyframe.ofObject(f7);
    }

    /* renamed from: d */
    public static void m1277d(Keyframe[] keyframeArr, float f7, int i7, int i8) {
        float f8 = f7 / ((i8 - i7) + 2);
        while (i7 <= i8) {
            keyframeArr[i7].setFraction(keyframeArr[i7 - 1].getFraction() + f8);
            i7++;
        }
    }

    /* renamed from: e */
    public static PropertyValuesHolder m1278e(TypedArray typedArray, int i7, int i8, int i9, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z6 = peekValue != null;
        int i10 = z6 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i9);
        boolean z7 = peekValue2 != null;
        int i11 = z7 ? peekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z6 && m1281h(i10)) || (z7 && m1281h(i11))) ? 3 : 0;
        }
        boolean z8 = i7 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 != 2) {
            C0327e m1294a = i7 == 3 ? C0327e.m1294a() : null;
            if (z8) {
                if (z6) {
                    float dimension = i10 == 5 ? typedArray.getDimension(i8, 0.0f) : typedArray.getFloat(i8, 0.0f);
                    if (z7) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z6) {
                int dimension2 = i10 == 5 ? (int) typedArray.getDimension(i8, 0.0f) : m1281h(i10) ? typedArray.getColor(i8, 0) : typedArray.getInt(i8, 0);
                if (z7) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : m1281h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z7) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : m1281h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
            }
            if (propertyValuesHolder == null || m1294a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m1294a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i8);
        String string2 = typedArray.getString(i9);
        AbstractC7088c.b[] m29201d = AbstractC7088c.m29201d(string);
        AbstractC7088c.b[] m29201d2 = AbstractC7088c.m29201d(string2);
        if (m29201d == null && m29201d2 == null) {
            return null;
        }
        if (m29201d == null) {
            if (m29201d2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m29201d2);
            }
            return null;
        }
        a aVar = new a();
        if (m29201d2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m29201d);
        } else {
            if (!AbstractC7088c.m29199b(m29201d, m29201d2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m29201d, m29201d2);
        }
        return ofObject;
    }

    /* renamed from: f */
    public static int m1279f(TypedArray typedArray, int i7, int i8) {
        TypedValue peekValue = typedArray.peekValue(i7);
        boolean z6 = peekValue != null;
        int i9 = z6 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i8);
        boolean z7 = peekValue2 != null;
        return ((z6 && m1281h(i9)) || (z7 && m1281h(z7 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    public static int m1280g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1191j);
        int i7 = 0;
        TypedValue m29026t = AbstractC7046k.m29026t(m29025s, xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, 0);
        if (m29026t != null && m1281h(m29026t.type)) {
            i7 = 3;
        }
        m29025s.recycle();
        return i7;
    }

    /* renamed from: h */
    public static boolean m1281h(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    /* renamed from: i */
    public static Animator m1282i(Context context, int i7) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i7) : m1283j(context, context.getResources(), context.getTheme(), i7);
    }

    /* renamed from: j */
    public static Animator m1283j(Context context, Resources resources, Resources.Theme theme, int i7) {
        return m1284k(context, resources, theme, i7, 1.0f);
    }

    /* renamed from: k */
    public static Animator m1284k(Context context, Resources resources, Resources.Theme theme, int i7, float f7) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i7);
                    return m1274a(context, resources, theme, xmlResourceParser, f7);
                } catch (IOException e7) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                    notFoundException.initCause(e7);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e8) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                notFoundException2.initCause(e8);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    public static ValueAnimator m1285l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f7, XmlPullParser xmlPullParser) {
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1188g);
        TypedArray m29025s2 = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1192k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m1290q(valueAnimator, m29025s, m29025s2, f7, xmlPullParser);
        int m29018l = AbstractC7046k.m29018l(m29025s, xmlPullParser, "interpolator", 0, 0);
        if (m29018l > 0) {
            valueAnimator.setInterpolator(AbstractC0325c.m1273a(context, m29018l));
        }
        m29025s.recycle();
        if (m29025s2 != null) {
            m29025s2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    public static Keyframe m1286m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i7, XmlPullParser xmlPullParser) {
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1191j);
        float m29016j = AbstractC7046k.m29016j(m29025s, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m29026t = AbstractC7046k.m29026t(m29025s, xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, 0);
        boolean z6 = m29026t != null;
        if (i7 == 4) {
            i7 = (z6 && m1281h(m29026t.type)) ? 3 : 0;
        }
        Keyframe ofInt = z6 ? i7 != 0 ? (i7 == 1 || i7 == 3) ? Keyframe.ofInt(m29016j, AbstractC7046k.m29017k(m29025s, xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, 0, 0)) : null : Keyframe.ofFloat(m29016j, AbstractC7046k.m29016j(m29025s, xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, 0, 0.0f)) : i7 == 0 ? Keyframe.ofFloat(m29016j) : Keyframe.ofInt(m29016j);
        int m29018l = AbstractC7046k.m29018l(m29025s, xmlPullParser, "interpolator", 1, 0);
        if (m29018l > 0) {
            ofInt.setInterpolator(AbstractC0325c.m1273a(context, m29018l));
        }
        m29025s.recycle();
        return ofInt;
    }

    /* renamed from: n */
    public static ObjectAnimator m1287n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f7, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m1285l(context, resources, theme, attributeSet, objectAnimator, f7, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    public static PropertyValuesHolder m1288o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i7) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i7 == 4) {
                    i7 = m1280g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m1286m = m1286m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i7, xmlPullParser);
                if (m1286m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m1286m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m1276c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m1276c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i8 = 0; i8 < size; i8++) {
                Keyframe keyframe3 = keyframeArr[i8];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i8 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i9 = size - 1;
                        if (i8 == i9) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i10 = i8;
                            for (int i11 = i8 + 1; i11 < i9 && keyframeArr[i11].getFraction() < 0.0f; i11++) {
                                i10 = i11;
                            }
                            m1277d(keyframeArr, keyframeArr[i10 + 1].getFraction() - keyframeArr[i8 - 1].getFraction(), i8, i10);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i7 == 3) {
                propertyValuesHolder.setEvaluator(C0327e.m1294a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    public static PropertyValuesHolder[] m1289p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i7;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1190i);
                    String m29019m = AbstractC7046k.m29019m(m29025s, xmlPullParser, "propertyName", 3);
                    int m29017k = AbstractC7046k.m29017k(m29025s, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m1288o = m1288o(context, resources, theme, xmlPullParser, m29019m, m29017k);
                    if (m1288o == null) {
                        m1288o = m1278e(m29025s, m29017k, 0, 1, m29019m);
                    }
                    if (m1288o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m1288o);
                    }
                    m29025s.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i7 = 0; i7 < size; i7++) {
                propertyValuesHolderArr[i7] = (PropertyValuesHolder) arrayList.get(i7);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    public static void m1290q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f7, XmlPullParser xmlPullParser) {
        long m29017k = AbstractC7046k.m29017k(typedArray, xmlPullParser, "duration", 1, 300);
        long m29017k2 = AbstractC7046k.m29017k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m29017k3 = AbstractC7046k.m29017k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (AbstractC7046k.m29024r(xmlPullParser, "valueFrom") && AbstractC7046k.m29024r(xmlPullParser, "valueTo")) {
            if (m29017k3 == 4) {
                m29017k3 = m1279f(typedArray, 5, 6);
            }
            PropertyValuesHolder m1278e = m1278e(typedArray, m29017k3, 5, 6, StringUtils.EMPTY);
            if (m1278e != null) {
                valueAnimator.setValues(m1278e);
            }
        }
        valueAnimator.setDuration(m29017k);
        valueAnimator.setStartDelay(m29017k2);
        valueAnimator.setRepeatCount(AbstractC7046k.m29017k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(AbstractC7046k.m29017k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m1291r(valueAnimator, typedArray2, m29017k3, f7, xmlPullParser);
        }
    }

    /* renamed from: r */
    public static void m1291r(ValueAnimator valueAnimator, TypedArray typedArray, int i7, float f7, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m29019m = AbstractC7046k.m29019m(typedArray, xmlPullParser, "pathData", 1);
        if (m29019m == null) {
            objectAnimator.setPropertyName(AbstractC7046k.m29019m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m29019m2 = AbstractC7046k.m29019m(typedArray, xmlPullParser, "propertyXName", 2);
        String m29019m3 = AbstractC7046k.m29019m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i7 != 2) {
        }
        if (m29019m2 != null || m29019m3 != null) {
            m1292s(AbstractC7088c.m29202e(m29019m), objectAnimator, f7 * 0.5f, m29019m2, m29019m3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    public static void m1292s(Path path, ObjectAnimator objectAnimator, float f7, String str, String str2) {
        int i7 = 1;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f8 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f9 = 0.0f;
        do {
            f9 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f9));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f9 / f7)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f10 = f9 / (min - 1);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f8 - ((Float) arrayList.get(i9)).floatValue(), fArr3, null);
            fArr[i8] = fArr3[0];
            fArr2[i8] = fArr3[1];
            f8 += f10;
            int i10 = i9 + 1;
            if (i10 < arrayList.size() && f8 > ((Float) arrayList.get(i10)).floatValue()) {
                pathMeasure2.nextContour();
                i9 = i10;
            }
            i7 = 1;
            i8++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i7];
            propertyValuesHolderArr[0] = ofFloat2;
            objectAnimator.setValues(propertyValuesHolderArr);
        } else if (ofFloat2 == null) {
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[i7];
            propertyValuesHolderArr2[0] = ofFloat;
            objectAnimator.setValues(propertyValuesHolderArr2);
        } else {
            PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = ofFloat;
            propertyValuesHolderArr3[i7] = ofFloat2;
            objectAnimator.setValues(propertyValuesHolderArr3);
        }
    }
}
