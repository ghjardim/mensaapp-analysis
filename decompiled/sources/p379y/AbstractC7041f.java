package p379y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p358v.AbstractC6702d;

/* renamed from: y.f */
/* loaded from: classes.dex */
public abstract class AbstractC7041f {
    /* renamed from: a */
    public static a m28981a(a aVar, int i7, int i8, boolean z6, int i9) {
        return aVar != null ? aVar : z6 ? new a(i7, i9, i8) : new a(i7, i8);
    }

    /* renamed from: b */
    public static Shader m28982b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC6702d.f24157B);
        float m29016j = AbstractC7046k.m29016j(m29025s, xmlPullParser, "startX", AbstractC6702d.f24166K, 0.0f);
        float m29016j2 = AbstractC7046k.m29016j(m29025s, xmlPullParser, "startY", AbstractC6702d.f24167L, 0.0f);
        float m29016j3 = AbstractC7046k.m29016j(m29025s, xmlPullParser, "endX", AbstractC6702d.f24168M, 0.0f);
        float m29016j4 = AbstractC7046k.m29016j(m29025s, xmlPullParser, "endY", AbstractC6702d.f24169N, 0.0f);
        float m29016j5 = AbstractC7046k.m29016j(m29025s, xmlPullParser, "centerX", AbstractC6702d.f24161F, 0.0f);
        float m29016j6 = AbstractC7046k.m29016j(m29025s, xmlPullParser, "centerY", AbstractC6702d.f24162G, 0.0f);
        int m29017k = AbstractC7046k.m29017k(m29025s, xmlPullParser, "type", AbstractC6702d.f24160E, 0);
        int m29012f = AbstractC7046k.m29012f(m29025s, xmlPullParser, "startColor", AbstractC6702d.f24158C, 0);
        boolean m29024r = AbstractC7046k.m29024r(xmlPullParser, "centerColor");
        int m29012f2 = AbstractC7046k.m29012f(m29025s, xmlPullParser, "centerColor", AbstractC6702d.f24165J, 0);
        int m29012f3 = AbstractC7046k.m29012f(m29025s, xmlPullParser, "endColor", AbstractC6702d.f24159D, 0);
        int m29017k2 = AbstractC7046k.m29017k(m29025s, xmlPullParser, "tileMode", AbstractC6702d.f24164I, 0);
        float m29016j7 = AbstractC7046k.m29016j(m29025s, xmlPullParser, "gradientRadius", AbstractC6702d.f24163H, 0.0f);
        m29025s.recycle();
        a m28981a = m28981a(m28983c(resources, xmlPullParser, attributeSet, theme), m29012f, m29012f3, m29024r, m29012f2);
        if (m29017k != 1) {
            return m29017k != 2 ? new LinearGradient(m29016j, m29016j2, m29016j3, m29016j4, m28981a.f25116a, m28981a.f25117b, m28984d(m29017k2)) : new SweepGradient(m29016j5, m29016j6, m28981a.f25116a, m28981a.f25117b);
        }
        if (m29016j7 > 0.0f) {
            return new RadialGradient(m29016j5, m29016j6, m29016j7, m28981a.f25116a, m28981a.f25117b, m28984d(m29017k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p379y.AbstractC7041f.a m28983c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p358v.AbstractC6702d.f24170O
            android.content.res.TypedArray r3 = p379y.AbstractC7046k.m29025s(r8, r11, r10, r3)
            int r5 = p358v.AbstractC6702d.f24171P
            boolean r5 = r3.hasValue(r5)
            int r6 = p358v.AbstractC6702d.f24172Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = p358v.AbstractC6702d.f24171P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p358v.AbstractC6702d.f24172Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            y.f$a r8 = new y.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p379y.AbstractC7041f.m28983c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):y.f$a");
    }

    /* renamed from: d */
    public static Shader.TileMode m28984d(int i7) {
        return i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* renamed from: y.f$a */
    public static final class a {

        /* renamed from: a */
        public final int[] f25116a;

        /* renamed from: b */
        public final float[] f25117b;

        public a(List list, List list2) {
            int size = list.size();
            this.f25116a = new int[size];
            this.f25117b = new float[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f25116a[i7] = ((Integer) list.get(i7)).intValue();
                this.f25117b[i7] = ((Float) list2.get(i7)).floatValue();
            }
        }

        public a(int i7, int i8) {
            this.f25116a = new int[]{i7, i8};
            this.f25117b = new float[]{0.0f, 1.0f};
        }

        public a(int i7, int i8, int i9) {
            this.f25116a = new int[]{i7, i8, i9};
            this.f25117b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
