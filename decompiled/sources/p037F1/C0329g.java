package p037F1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;
import p334s.C6308a;
import p379y.AbstractC7043h;
import p379y.AbstractC7046k;
import p379y.C7039d;
import p386z.AbstractC7088c;

/* renamed from: F1.g */
/* loaded from: classes.dex */
public class C0329g extends AbstractC0328f {

    /* renamed from: r */
    public static final PorterDuff.Mode f1210r = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public h f1211b;

    /* renamed from: c */
    public PorterDuffColorFilter f1212c;

    /* renamed from: d */
    public ColorFilter f1213d;

    /* renamed from: e */
    public boolean f1214e;

    /* renamed from: f */
    public boolean f1215f;

    /* renamed from: n */
    public Drawable.ConstantState f1216n;

    /* renamed from: o */
    public final float[] f1217o;

    /* renamed from: p */
    public final Matrix f1218p;

    /* renamed from: q */
    public final Rect f1219q;

    /* renamed from: F1.g$b */
    public static class b extends f {
        public b() {
        }

        /* renamed from: f */
        private void m1305f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1246b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1245a = AbstractC7088c.m29201d(string2);
            }
            this.f1247c = AbstractC7046k.m29017k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p037F1.C0329g.f
        /* renamed from: c */
        public boolean mo1306c() {
            return true;
        }

        /* renamed from: e */
        public void m1307e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (AbstractC7046k.m29024r(xmlPullParser, "pathData")) {
                TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1185d);
                m1305f(m29025s, xmlPullParser);
                m29025s.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* renamed from: F1.g$e */
    public static abstract class e {
        public e() {
        }

        /* renamed from: a */
        public boolean mo1308a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1309b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: F1.g$h */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f1266a;

        /* renamed from: b */
        public g f1267b;

        /* renamed from: c */
        public ColorStateList f1268c;

        /* renamed from: d */
        public PorterDuff.Mode f1269d;

        /* renamed from: e */
        public boolean f1270e;

        /* renamed from: f */
        public Bitmap f1271f;

        /* renamed from: g */
        public ColorStateList f1272g;

        /* renamed from: h */
        public PorterDuff.Mode f1273h;

        /* renamed from: i */
        public int f1274i;

        /* renamed from: j */
        public boolean f1275j;

        /* renamed from: k */
        public boolean f1276k;

        /* renamed from: l */
        public Paint f1277l;

        public h(h hVar) {
            this.f1268c = null;
            this.f1269d = C0329g.f1210r;
            if (hVar != null) {
                this.f1266a = hVar.f1266a;
                g gVar = new g(hVar.f1267b);
                this.f1267b = gVar;
                if (hVar.f1267b.f1254e != null) {
                    gVar.f1254e = new Paint(hVar.f1267b.f1254e);
                }
                if (hVar.f1267b.f1253d != null) {
                    this.f1267b.f1253d = new Paint(hVar.f1267b.f1253d);
                }
                this.f1268c = hVar.f1268c;
                this.f1269d = hVar.f1269d;
                this.f1270e = hVar.f1270e;
            }
        }

        /* renamed from: a */
        public boolean m1325a(int i7, int i8) {
            return i7 == this.f1271f.getWidth() && i8 == this.f1271f.getHeight();
        }

        /* renamed from: b */
        public boolean m1326b() {
            return !this.f1276k && this.f1272g == this.f1268c && this.f1273h == this.f1269d && this.f1275j == this.f1270e && this.f1274i == this.f1267b.getRootAlpha();
        }

        /* renamed from: c */
        public void m1327c(int i7, int i8) {
            if (this.f1271f == null || !m1325a(i7, i8)) {
                this.f1271f = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                this.f1276k = true;
            }
        }

        /* renamed from: d */
        public void m1328d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1271f, (Rect) null, rect, m1329e(colorFilter));
        }

        /* renamed from: e */
        public Paint m1329e(ColorFilter colorFilter) {
            if (!m1330f() && colorFilter == null) {
                return null;
            }
            if (this.f1277l == null) {
                Paint paint = new Paint();
                this.f1277l = paint;
                paint.setFilterBitmap(true);
            }
            this.f1277l.setAlpha(this.f1267b.getRootAlpha());
            this.f1277l.setColorFilter(colorFilter);
            return this.f1277l;
        }

        /* renamed from: f */
        public boolean m1330f() {
            return this.f1267b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m1331g() {
            return this.f1267b.m1323f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1266a;
        }

        /* renamed from: h */
        public boolean m1332h(int[] iArr) {
            boolean m1324g = this.f1267b.m1324g(iArr);
            this.f1276k |= m1324g;
            return m1324g;
        }

        /* renamed from: i */
        public void m1333i() {
            this.f1272g = this.f1268c;
            this.f1273h = this.f1269d;
            this.f1274i = this.f1267b.getRootAlpha();
            this.f1275j = this.f1270e;
            this.f1276k = false;
        }

        /* renamed from: j */
        public void m1334j(int i7, int i8) {
            this.f1271f.eraseColor(0);
            this.f1267b.m1319b(new Canvas(this.f1271f), i7, i8, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0329g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0329g(this);
        }

        public h() {
            this.f1268c = null;
            this.f1269d = C0329g.f1210r;
            this.f1267b = new g();
        }
    }

    public C0329g() {
        this.f1215f = true;
        this.f1217o = new float[9];
        this.f1218p = new Matrix();
        this.f1219q = new Rect();
        this.f1211b = new h();
    }

    /* renamed from: a */
    public static int m1295a(int i7, float f7) {
        return (i7 & 16777215) | (((int) (Color.alpha(i7) * f7)) << 24);
    }

    /* renamed from: b */
    public static C0329g m1296b(Resources resources, int i7, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0329g c0329g = new C0329g();
            c0329g.f1209a = AbstractC7043h.m28991d(resources, i7, theme);
            c0329g.f1216n = new i(c0329g.f1209a.getConstantState());
            return c0329g;
        }
        try {
            XmlResourceParser xml = resources.getXml(i7);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m1297c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e7) {
            Log.e("VectorDrawableCompat", "parser error", e7);
            return null;
        } catch (XmlPullParserException e8) {
            Log.e("VectorDrawableCompat", "parser error", e8);
            return null;
        }
    }

    /* renamed from: c */
    public static C0329g m1297c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0329g c0329g = new C0329g();
        c0329g.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0329g;
    }

    /* renamed from: g */
    public static PorterDuff.Mode m1298g(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1209a;
        if (drawable == null) {
            return false;
        }
        AbstractC0000a.m1b(drawable);
        return false;
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public Object m1299d(String str) {
        return this.f1211b.f1267b.f1265p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f1219q);
        if (this.f1219q.width() <= 0 || this.f1219q.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1213d;
        if (colorFilter == null) {
            colorFilter = this.f1212c;
        }
        canvas.getMatrix(this.f1218p);
        this.f1218p.getValues(this.f1217o);
        float abs = Math.abs(this.f1217o[0]);
        float abs2 = Math.abs(this.f1217o[4]);
        float abs3 = Math.abs(this.f1217o[1]);
        float abs4 = Math.abs(this.f1217o[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f1219q.width() * abs));
        int min2 = Math.min(2048, (int) (this.f1219q.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f1219q;
        canvas.translate(rect.left, rect.top);
        if (m1301f()) {
            canvas.translate(this.f1219q.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f1219q.offsetTo(0, 0);
        this.f1211b.m1327c(min, min2);
        if (!this.f1215f) {
            this.f1211b.m1334j(min, min2);
        } else if (!this.f1211b.m1326b()) {
            this.f1211b.m1334j(min, min2);
            this.f1211b.m1333i();
        }
        this.f1211b.m1328d(canvas, colorFilter, this.f1219q);
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public final void m1300e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f1211b;
        g gVar = hVar.f1267b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f1257h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z6 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m1312g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1233b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f1265p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f1266a = cVar.f1248d | hVar.f1266a;
                    z6 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m1307e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1233b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f1265p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f1266a = bVar.f1248d | hVar.f1266a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m1314c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1233b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f1265p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f1266a = dVar2.f1242k | hVar.f1266a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z6) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    public final boolean m1301f() {
        return isAutoMirrored() && AbstractC0000a.m4e(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1209a;
        return drawable != null ? AbstractC0000a.m2c(drawable) : this.f1211b.f1267b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1211b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1209a;
        return drawable != null ? AbstractC0000a.m3d(drawable) : this.f1213d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1209a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f1209a.getConstantState());
        }
        this.f1211b.f1266a = getChangingConfigurations();
        return this.f1211b;
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1211b.f1267b.f1259j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1211b.f1267b.f1258i;
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public void m1302h(boolean z6) {
        this.f1215f = z6;
    }

    /* renamed from: i */
    public final void m1303i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f1211b;
        g gVar = hVar.f1267b;
        hVar.f1269d = m1298g(AbstractC7046k.m29017k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m29013g = AbstractC7046k.m29013g(typedArray, xmlPullParser, theme, "tint", 1);
        if (m29013g != null) {
            hVar.f1268c = m29013g;
        }
        hVar.f1270e = AbstractC7046k.m29011e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f1270e);
        gVar.f1260k = AbstractC7046k.m29016j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f1260k);
        float m29016j = AbstractC7046k.m29016j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f1261l);
        gVar.f1261l = m29016j;
        if (gVar.f1260k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (m29016j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f1258i = typedArray.getDimension(3, gVar.f1258i);
        float dimension = typedArray.getDimension(2, gVar.f1259j);
        gVar.f1259j = dimension;
        if (gVar.f1258i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(AbstractC7046k.m29016j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f1263n = string;
            gVar.f1265p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1209a;
        return drawable != null ? AbstractC0000a.m6g(drawable) : this.f1211b.f1270e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f1211b) != null && (hVar.m1331g() || ((colorStateList = this.f1211b.f1268c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    public PorterDuffColorFilter m1304j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1214e && super.mutate() == this) {
            this.f1211b = new h(this.f1211b);
            this.f1214e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f1211b;
        ColorStateList colorStateList = hVar.f1268c;
        if (colorStateList == null || (mode = hVar.f1269d) == null) {
            z6 = false;
        } else {
            this.f1212c = m1304j(this.f1212c, colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        if (!hVar.m1331g() || !hVar.m1332h(iArr)) {
            return z6;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f1211b.f1267b.getRootAlpha() != i7) {
            this.f1211b.f1267b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m8i(drawable, z6);
        } else {
            this.f1211b.f1270e = z6;
        }
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z6) {
        super.setFilterBitmap(z6);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m11l(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m12m(drawable, colorStateList);
            return;
        }
        h hVar = this.f1211b;
        if (hVar.f1268c != colorStateList) {
            hVar.f1268c = colorStateList;
            this.f1212c = m1304j(this.f1212c, colorStateList, hVar.f1269d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m13n(drawable, mode);
            return;
        }
        h hVar = this.f1211b;
        if (hVar.f1269d != mode) {
            hVar.f1269d = mode;
            this.f1212c = m1304j(this.f1212c, hVar.f1268c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.setVisible(z6, z7) : super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: F1.g$i */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f1278a;

        public i(Drawable.ConstantState constantState) {
            this.f1278a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1278a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1278a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0329g c0329g = new C0329g();
            c0329g.f1209a = (VectorDrawable) this.f1278a.newDrawable();
            return c0329g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0329g c0329g = new C0329g();
            c0329g.f1209a = (VectorDrawable) this.f1278a.newDrawable(resources);
            return c0329g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0329g c0329g = new C0329g();
            c0329g.f1209a = (VectorDrawable) this.f1278a.newDrawable(resources, theme);
            return c0329g;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1213d = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: F1.g$f */
    public static abstract class f extends e {

        /* renamed from: a */
        public AbstractC7088c.b[] f1245a;

        /* renamed from: b */
        public String f1246b;

        /* renamed from: c */
        public int f1247c;

        /* renamed from: d */
        public int f1248d;

        public f() {
            super();
            this.f1245a = null;
            this.f1247c = 0;
        }

        /* renamed from: c */
        public boolean mo1306c() {
            return false;
        }

        /* renamed from: d */
        public void m1317d(Path path) {
            path.reset();
            AbstractC7088c.b[] bVarArr = this.f1245a;
            if (bVarArr != null) {
                AbstractC7088c.b.m29216i(bVarArr, path);
            }
        }

        public AbstractC7088c.b[] getPathData() {
            return this.f1245a;
        }

        public String getPathName() {
            return this.f1246b;
        }

        public void setPathData(AbstractC7088c.b[] bVarArr) {
            if (AbstractC7088c.m29199b(this.f1245a, bVarArr)) {
                AbstractC7088c.m29208k(this.f1245a, bVarArr);
            } else {
                this.f1245a = AbstractC7088c.m29203f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f1245a = null;
            this.f1247c = 0;
            this.f1246b = fVar.f1246b;
            this.f1248d = fVar.f1248d;
            this.f1245a = AbstractC7088c.m29203f(fVar.f1245a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m5f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f1211b;
        hVar.f1267b = new g();
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1182a);
        m1303i(m29025s, xmlPullParser, theme);
        m29025s.recycle();
        hVar.f1266a = getChangingConfigurations();
        hVar.f1276k = true;
        m1300e(resources, xmlPullParser, attributeSet, theme);
        this.f1212c = m1304j(this.f1212c, hVar.f1268c, hVar.f1269d);
    }

    public C0329g(h hVar) {
        this.f1215f = true;
        this.f1217o = new float[9];
        this.f1218p = new Matrix();
        this.f1219q = new Rect();
        this.f1211b = hVar;
        this.f1212c = m1304j(this.f1212c, hVar.f1268c, hVar.f1269d);
    }

    /* renamed from: F1.g$c */
    public static class c extends f {

        /* renamed from: e */
        public int[] f1220e;

        /* renamed from: f */
        public C7039d f1221f;

        /* renamed from: g */
        public float f1222g;

        /* renamed from: h */
        public C7039d f1223h;

        /* renamed from: i */
        public float f1224i;

        /* renamed from: j */
        public float f1225j;

        /* renamed from: k */
        public float f1226k;

        /* renamed from: l */
        public float f1227l;

        /* renamed from: m */
        public float f1228m;

        /* renamed from: n */
        public Paint.Cap f1229n;

        /* renamed from: o */
        public Paint.Join f1230o;

        /* renamed from: p */
        public float f1231p;

        public c() {
            this.f1222g = 0.0f;
            this.f1224i = 1.0f;
            this.f1225j = 1.0f;
            this.f1226k = 0.0f;
            this.f1227l = 1.0f;
            this.f1228m = 0.0f;
            this.f1229n = Paint.Cap.BUTT;
            this.f1230o = Paint.Join.MITER;
            this.f1231p = 4.0f;
        }

        @Override // p037F1.C0329g.e
        /* renamed from: a */
        public boolean mo1308a() {
            return this.f1223h.m28956i() || this.f1221f.m28956i();
        }

        @Override // p037F1.C0329g.e
        /* renamed from: b */
        public boolean mo1309b(int[] iArr) {
            return this.f1221f.m28957j(iArr) | this.f1223h.m28957j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m1310e(int i7, Paint.Cap cap) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m1311f(int i7, Paint.Join join) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m1312g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1184c);
            m1313h(m29025s, xmlPullParser, theme);
            m29025s.recycle();
        }

        public float getFillAlpha() {
            return this.f1225j;
        }

        public int getFillColor() {
            return this.f1223h.m28953e();
        }

        public float getStrokeAlpha() {
            return this.f1224i;
        }

        public int getStrokeColor() {
            return this.f1221f.m28953e();
        }

        public float getStrokeWidth() {
            return this.f1222g;
        }

        public float getTrimPathEnd() {
            return this.f1227l;
        }

        public float getTrimPathOffset() {
            return this.f1228m;
        }

        public float getTrimPathStart() {
            return this.f1226k;
        }

        /* renamed from: h */
        public final void m1313h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f1220e = null;
            if (AbstractC7046k.m29024r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1246b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1245a = AbstractC7088c.m29201d(string2);
                }
                this.f1223h = AbstractC7046k.m29015i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f1225j = AbstractC7046k.m29016j(typedArray, xmlPullParser, "fillAlpha", 12, this.f1225j);
                this.f1229n = m1310e(AbstractC7046k.m29017k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1229n);
                this.f1230o = m1311f(AbstractC7046k.m29017k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1230o);
                this.f1231p = AbstractC7046k.m29016j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f1231p);
                this.f1221f = AbstractC7046k.m29015i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f1224i = AbstractC7046k.m29016j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1224i);
                this.f1222g = AbstractC7046k.m29016j(typedArray, xmlPullParser, "strokeWidth", 4, this.f1222g);
                this.f1227l = AbstractC7046k.m29016j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1227l);
                this.f1228m = AbstractC7046k.m29016j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1228m);
                this.f1226k = AbstractC7046k.m29016j(typedArray, xmlPullParser, "trimPathStart", 5, this.f1226k);
                this.f1247c = AbstractC7046k.m29017k(typedArray, xmlPullParser, "fillType", 13, this.f1247c);
            }
        }

        public void setFillAlpha(float f7) {
            this.f1225j = f7;
        }

        public void setFillColor(int i7) {
            this.f1223h.m28958k(i7);
        }

        public void setStrokeAlpha(float f7) {
            this.f1224i = f7;
        }

        public void setStrokeColor(int i7) {
            this.f1221f.m28958k(i7);
        }

        public void setStrokeWidth(float f7) {
            this.f1222g = f7;
        }

        public void setTrimPathEnd(float f7) {
            this.f1227l = f7;
        }

        public void setTrimPathOffset(float f7) {
            this.f1228m = f7;
        }

        public void setTrimPathStart(float f7) {
            this.f1226k = f7;
        }

        public c(c cVar) {
            super(cVar);
            this.f1222g = 0.0f;
            this.f1224i = 1.0f;
            this.f1225j = 1.0f;
            this.f1226k = 0.0f;
            this.f1227l = 1.0f;
            this.f1228m = 0.0f;
            this.f1229n = Paint.Cap.BUTT;
            this.f1230o = Paint.Join.MITER;
            this.f1231p = 4.0f;
            this.f1220e = cVar.f1220e;
            this.f1221f = cVar.f1221f;
            this.f1222g = cVar.f1222g;
            this.f1224i = cVar.f1224i;
            this.f1223h = cVar.f1223h;
            this.f1247c = cVar.f1247c;
            this.f1225j = cVar.f1225j;
            this.f1226k = cVar.f1226k;
            this.f1227l = cVar.f1227l;
            this.f1228m = cVar.f1228m;
            this.f1229n = cVar.f1229n;
            this.f1230o = cVar.f1230o;
            this.f1231p = cVar.f1231p;
        }
    }

    /* renamed from: F1.g$g */
    public static class g {

        /* renamed from: q */
        public static final Matrix f1249q = new Matrix();

        /* renamed from: a */
        public final Path f1250a;

        /* renamed from: b */
        public final Path f1251b;

        /* renamed from: c */
        public final Matrix f1252c;

        /* renamed from: d */
        public Paint f1253d;

        /* renamed from: e */
        public Paint f1254e;

        /* renamed from: f */
        public PathMeasure f1255f;

        /* renamed from: g */
        public int f1256g;

        /* renamed from: h */
        public final d f1257h;

        /* renamed from: i */
        public float f1258i;

        /* renamed from: j */
        public float f1259j;

        /* renamed from: k */
        public float f1260k;

        /* renamed from: l */
        public float f1261l;

        /* renamed from: m */
        public int f1262m;

        /* renamed from: n */
        public String f1263n;

        /* renamed from: o */
        public Boolean f1264o;

        /* renamed from: p */
        public final C6308a f1265p;

        public g() {
            this.f1252c = new Matrix();
            this.f1258i = 0.0f;
            this.f1259j = 0.0f;
            this.f1260k = 0.0f;
            this.f1261l = 0.0f;
            this.f1262m = 255;
            this.f1263n = null;
            this.f1264o = null;
            this.f1265p = new C6308a();
            this.f1257h = new d();
            this.f1250a = new Path();
            this.f1251b = new Path();
        }

        /* renamed from: a */
        public static float m1318a(float f7, float f8, float f9, float f10) {
            return (f7 * f10) - (f8 * f9);
        }

        /* renamed from: b */
        public void m1319b(Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            m1320c(this.f1257h, f1249q, canvas, i7, i8, colorFilter);
        }

        /* renamed from: c */
        public final void m1320c(d dVar, Matrix matrix, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            dVar.f1232a.set(matrix);
            dVar.f1232a.preConcat(dVar.f1241j);
            canvas.save();
            for (int i9 = 0; i9 < dVar.f1233b.size(); i9++) {
                e eVar = (e) dVar.f1233b.get(i9);
                if (eVar instanceof d) {
                    m1320c((d) eVar, dVar.f1232a, canvas, i7, i8, colorFilter);
                } else if (eVar instanceof f) {
                    m1321d(dVar, (f) eVar, canvas, i7, i8, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m1321d(d dVar, f fVar, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            float f7 = i7 / this.f1260k;
            float f8 = i8 / this.f1261l;
            float min = Math.min(f7, f8);
            Matrix matrix = dVar.f1232a;
            this.f1252c.set(matrix);
            this.f1252c.postScale(f7, f8);
            float m1322e = m1322e(matrix);
            if (m1322e == 0.0f) {
                return;
            }
            fVar.m1317d(this.f1250a);
            Path path = this.f1250a;
            this.f1251b.reset();
            if (fVar.mo1306c()) {
                this.f1251b.setFillType(fVar.f1247c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f1251b.addPath(path, this.f1252c);
                canvas.clipPath(this.f1251b);
                return;
            }
            c cVar = (c) fVar;
            float f9 = cVar.f1226k;
            if (f9 != 0.0f || cVar.f1227l != 1.0f) {
                float f10 = cVar.f1228m;
                float f11 = (f9 + f10) % 1.0f;
                float f12 = (cVar.f1227l + f10) % 1.0f;
                if (this.f1255f == null) {
                    this.f1255f = new PathMeasure();
                }
                this.f1255f.setPath(this.f1250a, false);
                float length = this.f1255f.getLength();
                float f13 = f11 * length;
                float f14 = f12 * length;
                path.reset();
                if (f13 > f14) {
                    this.f1255f.getSegment(f13, length, path, true);
                    this.f1255f.getSegment(0.0f, f14, path, true);
                } else {
                    this.f1255f.getSegment(f13, f14, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1251b.addPath(path, this.f1252c);
            if (cVar.f1223h.m28959l()) {
                C7039d c7039d = cVar.f1223h;
                if (this.f1254e == null) {
                    Paint paint = new Paint(1);
                    this.f1254e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f1254e;
                if (c7039d.m28955h()) {
                    Shader m28954f = c7039d.m28954f();
                    m28954f.setLocalMatrix(this.f1252c);
                    paint2.setShader(m28954f);
                    paint2.setAlpha(Math.round(cVar.f1225j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C0329g.m1295a(c7039d.m28953e(), cVar.f1225j));
                }
                paint2.setColorFilter(colorFilter);
                this.f1251b.setFillType(cVar.f1247c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1251b, paint2);
            }
            if (cVar.f1221f.m28959l()) {
                C7039d c7039d2 = cVar.f1221f;
                if (this.f1253d == null) {
                    Paint paint3 = new Paint(1);
                    this.f1253d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f1253d;
                Paint.Join join = cVar.f1230o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f1229n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f1231p);
                if (c7039d2.m28955h()) {
                    Shader m28954f2 = c7039d2.m28954f();
                    m28954f2.setLocalMatrix(this.f1252c);
                    paint4.setShader(m28954f2);
                    paint4.setAlpha(Math.round(cVar.f1224i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C0329g.m1295a(c7039d2.m28953e(), cVar.f1224i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f1222g * min * m1322e);
                canvas.drawPath(this.f1251b, paint4);
            }
        }

        /* renamed from: e */
        public final float m1322e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m1318a = m1318a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(m1318a) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean m1323f() {
            if (this.f1264o == null) {
                this.f1264o = Boolean.valueOf(this.f1257h.mo1308a());
            }
            return this.f1264o.booleanValue();
        }

        /* renamed from: g */
        public boolean m1324g(int[] iArr) {
            return this.f1257h.mo1309b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1262m;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f1262m = i7;
        }

        public g(g gVar) {
            this.f1252c = new Matrix();
            this.f1258i = 0.0f;
            this.f1259j = 0.0f;
            this.f1260k = 0.0f;
            this.f1261l = 0.0f;
            this.f1262m = 255;
            this.f1263n = null;
            this.f1264o = null;
            C6308a c6308a = new C6308a();
            this.f1265p = c6308a;
            this.f1257h = new d(gVar.f1257h, c6308a);
            this.f1250a = new Path(gVar.f1250a);
            this.f1251b = new Path(gVar.f1251b);
            this.f1258i = gVar.f1258i;
            this.f1259j = gVar.f1259j;
            this.f1260k = gVar.f1260k;
            this.f1261l = gVar.f1261l;
            this.f1256g = gVar.f1256g;
            this.f1262m = gVar.f1262m;
            this.f1263n = gVar.f1263n;
            String str = gVar.f1263n;
            if (str != null) {
                c6308a.put(str, this);
            }
            this.f1264o = gVar.f1264o;
        }
    }

    /* renamed from: F1.g$d */
    public static class d extends e {

        /* renamed from: a */
        public final Matrix f1232a;

        /* renamed from: b */
        public final ArrayList f1233b;

        /* renamed from: c */
        public float f1234c;

        /* renamed from: d */
        public float f1235d;

        /* renamed from: e */
        public float f1236e;

        /* renamed from: f */
        public float f1237f;

        /* renamed from: g */
        public float f1238g;

        /* renamed from: h */
        public float f1239h;

        /* renamed from: i */
        public float f1240i;

        /* renamed from: j */
        public final Matrix f1241j;

        /* renamed from: k */
        public int f1242k;

        /* renamed from: l */
        public int[] f1243l;

        /* renamed from: m */
        public String f1244m;

        public d(d dVar, C6308a c6308a) {
            super();
            f bVar;
            this.f1232a = new Matrix();
            this.f1233b = new ArrayList();
            this.f1234c = 0.0f;
            this.f1235d = 0.0f;
            this.f1236e = 0.0f;
            this.f1237f = 1.0f;
            this.f1238g = 1.0f;
            this.f1239h = 0.0f;
            this.f1240i = 0.0f;
            Matrix matrix = new Matrix();
            this.f1241j = matrix;
            this.f1244m = null;
            this.f1234c = dVar.f1234c;
            this.f1235d = dVar.f1235d;
            this.f1236e = dVar.f1236e;
            this.f1237f = dVar.f1237f;
            this.f1238g = dVar.f1238g;
            this.f1239h = dVar.f1239h;
            this.f1240i = dVar.f1240i;
            this.f1243l = dVar.f1243l;
            String str = dVar.f1244m;
            this.f1244m = str;
            this.f1242k = dVar.f1242k;
            if (str != null) {
                c6308a.put(str, this);
            }
            matrix.set(dVar.f1241j);
            ArrayList arrayList = dVar.f1233b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof d) {
                    this.f1233b.add(new d((d) obj, c6308a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f1233b.add(bVar);
                    Object obj2 = bVar.f1246b;
                    if (obj2 != null) {
                        c6308a.put(obj2, bVar);
                    }
                }
            }
        }

        @Override // p037F1.C0329g.e
        /* renamed from: a */
        public boolean mo1308a() {
            for (int i7 = 0; i7 < this.f1233b.size(); i7++) {
                if (((e) this.f1233b.get(i7)).mo1308a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p037F1.C0329g.e
        /* renamed from: b */
        public boolean mo1309b(int[] iArr) {
            boolean z6 = false;
            for (int i7 = 0; i7 < this.f1233b.size(); i7++) {
                z6 |= ((e) this.f1233b.get(i7)).mo1309b(iArr);
            }
            return z6;
        }

        /* renamed from: c */
        public void m1314c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1183b);
            m1316e(m29025s, xmlPullParser);
            m29025s.recycle();
        }

        /* renamed from: d */
        public final void m1315d() {
            this.f1241j.reset();
            this.f1241j.postTranslate(-this.f1235d, -this.f1236e);
            this.f1241j.postScale(this.f1237f, this.f1238g);
            this.f1241j.postRotate(this.f1234c, 0.0f, 0.0f);
            this.f1241j.postTranslate(this.f1239h + this.f1235d, this.f1240i + this.f1236e);
        }

        /* renamed from: e */
        public final void m1316e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1243l = null;
            this.f1234c = AbstractC7046k.m29016j(typedArray, xmlPullParser, "rotation", 5, this.f1234c);
            this.f1235d = typedArray.getFloat(1, this.f1235d);
            this.f1236e = typedArray.getFloat(2, this.f1236e);
            this.f1237f = AbstractC7046k.m29016j(typedArray, xmlPullParser, "scaleX", 3, this.f1237f);
            this.f1238g = AbstractC7046k.m29016j(typedArray, xmlPullParser, "scaleY", 4, this.f1238g);
            this.f1239h = AbstractC7046k.m29016j(typedArray, xmlPullParser, "translateX", 6, this.f1239h);
            this.f1240i = AbstractC7046k.m29016j(typedArray, xmlPullParser, "translateY", 7, this.f1240i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1244m = string;
            }
            m1315d();
        }

        public String getGroupName() {
            return this.f1244m;
        }

        public Matrix getLocalMatrix() {
            return this.f1241j;
        }

        public float getPivotX() {
            return this.f1235d;
        }

        public float getPivotY() {
            return this.f1236e;
        }

        public float getRotation() {
            return this.f1234c;
        }

        public float getScaleX() {
            return this.f1237f;
        }

        public float getScaleY() {
            return this.f1238g;
        }

        public float getTranslateX() {
            return this.f1239h;
        }

        public float getTranslateY() {
            return this.f1240i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f1235d) {
                this.f1235d = f7;
                m1315d();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f1236e) {
                this.f1236e = f7;
                m1315d();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f1234c) {
                this.f1234c = f7;
                m1315d();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f1237f) {
                this.f1237f = f7;
                m1315d();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f1238g) {
                this.f1238g = f7;
                m1315d();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f1239h) {
                this.f1239h = f7;
                m1315d();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f1240i) {
                this.f1240i = f7;
                m1315d();
            }
        }

        public d() {
            super();
            this.f1232a = new Matrix();
            this.f1233b = new ArrayList();
            this.f1234c = 0.0f;
            this.f1235d = 0.0f;
            this.f1236e = 0.0f;
            this.f1237f = 1.0f;
            this.f1238g = 1.0f;
            this.f1239h = 0.0f;
            this.f1240i = 0.0f;
            this.f1241j = new Matrix();
            this.f1244m = null;
        }
    }
}
