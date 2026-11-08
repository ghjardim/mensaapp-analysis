package p379y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: y.d */
/* loaded from: classes.dex */
public final class C7039d {

    /* renamed from: a */
    public final Shader f25101a;

    /* renamed from: b */
    public final ColorStateList f25102b;

    /* renamed from: c */
    public int f25103c;

    public C7039d(Shader shader, ColorStateList colorStateList, int i7) {
        this.f25101a = shader;
        this.f25102b = colorStateList;
        this.f25103c = i7;
    }

    /* renamed from: a */
    public static C7039d m28948a(Resources resources, int i7, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m28951d(AbstractC7041f.m28982b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m28950c(AbstractC7038c.m28941b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: b */
    public static C7039d m28949b(int i7) {
        return new C7039d(null, null, i7);
    }

    /* renamed from: c */
    public static C7039d m28950c(ColorStateList colorStateList) {
        return new C7039d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static C7039d m28951d(Shader shader) {
        return new C7039d(shader, null, 0);
    }

    /* renamed from: g */
    public static C7039d m28952g(Resources resources, int i7, Resources.Theme theme) {
        try {
            return m28948a(resources, i7, theme);
        } catch (Exception e7) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
            return null;
        }
    }

    /* renamed from: e */
    public int m28953e() {
        return this.f25103c;
    }

    /* renamed from: f */
    public Shader m28954f() {
        return this.f25101a;
    }

    /* renamed from: h */
    public boolean m28955h() {
        return this.f25101a != null;
    }

    /* renamed from: i */
    public boolean m28956i() {
        ColorStateList colorStateList;
        return this.f25101a == null && (colorStateList = this.f25102b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m28957j(int[] iArr) {
        if (m28956i()) {
            ColorStateList colorStateList = this.f25102b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f25103c) {
                this.f25103c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m28958k(int i7) {
        this.f25103c = i7;
    }

    /* renamed from: l */
    public boolean m28959l() {
        return m28955h() || this.f25103c != 0;
    }
}
