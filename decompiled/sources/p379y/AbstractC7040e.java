package p379y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.metadata.Font;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p028E.C0201f;
import p358v.AbstractC6702d;

/* renamed from: y.e */
/* loaded from: classes.dex */
public abstract class AbstractC7040e {

    /* renamed from: y.e$a */
    public static class a {
        /* renamed from: a */
        public static int m28968a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    /* renamed from: y.e$b */
    public interface b {
    }

    /* renamed from: y.e$c */
    public static final class c implements b {

        /* renamed from: a */
        public final d[] f25104a;

        public c(d[] dVarArr) {
            this.f25104a = dVarArr;
        }

        /* renamed from: a */
        public d[] m28969a() {
            return this.f25104a;
        }
    }

    /* renamed from: y.e$d */
    public static final class d {

        /* renamed from: a */
        public final String f25105a;

        /* renamed from: b */
        public final int f25106b;

        /* renamed from: c */
        public final boolean f25107c;

        /* renamed from: d */
        public final String f25108d;

        /* renamed from: e */
        public final int f25109e;

        /* renamed from: f */
        public final int f25110f;

        public d(String str, int i7, boolean z6, String str2, int i8, int i9) {
            this.f25105a = str;
            this.f25106b = i7;
            this.f25107c = z6;
            this.f25108d = str2;
            this.f25109e = i8;
            this.f25110f = i9;
        }

        /* renamed from: a */
        public String m28970a() {
            return this.f25105a;
        }

        /* renamed from: b */
        public int m28971b() {
            return this.f25110f;
        }

        /* renamed from: c */
        public int m28972c() {
            return this.f25109e;
        }

        /* renamed from: d */
        public String m28973d() {
            return this.f25108d;
        }

        /* renamed from: e */
        public int m28974e() {
            return this.f25106b;
        }

        /* renamed from: f */
        public boolean m28975f() {
            return this.f25107c;
        }
    }

    /* renamed from: y.e$e */
    public static final class e implements b {

        /* renamed from: a */
        public final C0201f f25111a;

        /* renamed from: b */
        public final C0201f f25112b;

        /* renamed from: c */
        public final int f25113c;

        /* renamed from: d */
        public final int f25114d;

        /* renamed from: e */
        public final String f25115e;

        public e(C0201f c0201f, C0201f c0201f2, int i7, int i8, String str) {
            this.f25111a = c0201f;
            this.f25112b = c0201f2;
            this.f25114d = i7;
            this.f25113c = i8;
            this.f25115e = str;
        }

        /* renamed from: a */
        public C0201f m28976a() {
            return this.f25112b;
        }

        /* renamed from: b */
        public int m28977b() {
            return this.f25114d;
        }

        /* renamed from: c */
        public C0201f m28978c() {
            return this.f25111a;
        }

        /* renamed from: d */
        public String m28979d() {
            return this.f25115e;
        }

        /* renamed from: e */
        public int m28980e() {
            return this.f25113c;
        }
    }

    /* renamed from: a */
    public static int m28960a(TypedArray typedArray, int i7) {
        return a.m28968a(typedArray, i7);
    }

    /* renamed from: b */
    public static b m28961b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m28963d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List m28962c(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m28960a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(m28967h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m28967h(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static b m28963d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m28964e(xmlPullParser, resources);
        }
        m28966g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static b m28964e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC6702d.f24180h);
        String string = obtainAttributes.getString(AbstractC6702d.f24181i);
        String string2 = obtainAttributes.getString(AbstractC6702d.f24186n);
        String string3 = obtainAttributes.getString(AbstractC6702d.f24187o);
        String string4 = obtainAttributes.getString(AbstractC6702d.f24183k);
        int resourceId = obtainAttributes.getResourceId(AbstractC6702d.f24182j, 0);
        int integer = obtainAttributes.getInteger(AbstractC6702d.f24184l, 1);
        int integer2 = obtainAttributes.getInteger(AbstractC6702d.f24185m, 500);
        String string5 = obtainAttributes.getString(AbstractC6702d.f24188p);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m28966g(xmlPullParser);
            }
            List m28962c = m28962c(resources, resourceId);
            return new e(new C0201f(string, string2, string3, m28962c), string4 != null ? new C0201f(string, string2, string4, m28962c) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(Font.PREFIX_FONT_META)) {
                    arrayList.add(m28965f(xmlPullParser, resources));
                } else {
                    m28966g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: f */
    public static d m28965f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC6702d.f24189q);
        int i7 = obtainAttributes.getInt(obtainAttributes.hasValue(AbstractC6702d.f24198z) ? AbstractC6702d.f24198z : AbstractC6702d.f24191s, 400);
        boolean z6 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(AbstractC6702d.f24196x) ? AbstractC6702d.f24196x : AbstractC6702d.f24192t, 0);
        int i8 = obtainAttributes.hasValue(AbstractC6702d.f24156A) ? AbstractC6702d.f24156A : AbstractC6702d.f24193u;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(AbstractC6702d.f24197y) ? AbstractC6702d.f24197y : AbstractC6702d.f24194v);
        int i9 = obtainAttributes.getInt(i8, 0);
        int i10 = obtainAttributes.hasValue(AbstractC6702d.f24195w) ? AbstractC6702d.f24195w : AbstractC6702d.f24190r;
        int resourceId = obtainAttributes.getResourceId(i10, 0);
        String string2 = obtainAttributes.getString(i10);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m28966g(xmlPullParser);
        }
        return new d(string2, i7, z6, string, i9, resourceId);
    }

    /* renamed from: g */
    public static void m28966g(XmlPullParser xmlPullParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    /* renamed from: h */
    public static List m28967h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
