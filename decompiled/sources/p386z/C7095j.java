package p386z;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p028E.AbstractC0206k;
import p379y.AbstractC7040e;

/* renamed from: z.j */
/* loaded from: classes.dex */
public class C7095j extends C7093h {

    /* renamed from: g */
    public final Class f25199g;

    /* renamed from: h */
    public final Constructor f25200h;

    /* renamed from: i */
    public final Method f25201i;

    /* renamed from: j */
    public final Method f25202j;

    /* renamed from: k */
    public final Method f25203k;

    /* renamed from: l */
    public final Method f25204l;

    /* renamed from: m */
    public final Method f25205m;

    public C7095j() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m29253w();
            constructor = m29254x(cls);
            method = m29250t(cls);
            method2 = m29251u(cls);
            method3 = m29255y(cls);
            method4 = m29249s(cls);
            method5 = mo29252v(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e7.getClass().getName(), e7);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f25199g = cls;
        this.f25200h = constructor;
        this.f25201i = method;
        this.f25202j = method2;
        this.f25203k = method3;
        this.f25204l = method4;
        this.f25205m = method5;
    }

    @Override // p386z.C7093h, p386z.AbstractC7098m
    /* renamed from: a */
    public Typeface mo29233a(Context context, AbstractC7040e.c cVar, Resources resources, int i7) {
        if (!m29248r()) {
            return super.mo29233a(context, cVar, resources, i7);
        }
        Object m29243m = m29243m();
        if (m29243m == null) {
            return null;
        }
        for (AbstractC7040e.d dVar : cVar.m28969a()) {
            if (!m29245o(context, m29243m, dVar.m28970a(), dVar.m28972c(), dVar.m28974e(), dVar.m28975f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m28973d()))) {
                m29244n(m29243m);
                return null;
            }
        }
        if (m29247q(m29243m)) {
            return mo29242j(m29243m);
        }
        return null;
    }

    @Override // p386z.C7093h, p386z.AbstractC7098m
    /* renamed from: b */
    public Typeface mo29234b(Context context, CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, int i7) {
        Typeface mo29242j;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m29248r()) {
            AbstractC0206k.b mo29258h = mo29258h(bVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo29258h.m840d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo29258h.m841e()).setItalic(mo29258h.m842f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map m29274h = AbstractC7099n.m29274h(context, bVarArr, cancellationSignal);
        Object m29243m = m29243m();
        if (m29243m == null) {
            return null;
        }
        boolean z6 = false;
        for (AbstractC0206k.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) m29274h.get(bVar.m840d());
            if (byteBuffer != null) {
                if (!m29246p(m29243m, byteBuffer, bVar.m839c(), bVar.m841e(), bVar.m842f() ? 1 : 0)) {
                    m29244n(m29243m);
                    return null;
                }
                z6 = true;
            }
        }
        if (!z6) {
            m29244n(m29243m);
            return null;
        }
        if (m29247q(m29243m) && (mo29242j = mo29242j(m29243m)) != null) {
            return Typeface.create(mo29242j, i7);
        }
        return null;
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Typeface mo29240c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        return super.mo29240c(context, cancellationSignal, list, i7);
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: e */
    public Typeface mo29241e(Context context, Resources resources, int i7, String str, int i8) {
        if (!m29248r()) {
            return super.mo29241e(context, resources, i7, str, i8);
        }
        Object m29243m = m29243m();
        if (m29243m == null) {
            return null;
        }
        if (!m29245o(context, m29243m, str, 0, -1, -1, null)) {
            m29244n(m29243m);
            return null;
        }
        if (m29247q(m29243m)) {
            return mo29242j(m29243m);
        }
        return null;
    }

    /* renamed from: j */
    public Typeface mo29242j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f25199g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f25205m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final Object m29243m() {
        try {
            return this.f25200h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final void m29244n(Object obj) {
        try {
            this.f25204l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: o */
    public final boolean m29245o(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f25201i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public final boolean m29246p(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f25202j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m29247q(Object obj) {
        try {
            return ((Boolean) this.f25203k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean m29248r() {
        if (this.f25201i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f25201i != null;
    }

    /* renamed from: s */
    public Method m29249s(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    /* renamed from: t */
    public Method m29250t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: u */
    public Method m29251u(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: v */
    public Method mo29252v(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: w */
    public Class m29253w() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: x */
    public Constructor m29254x(Class cls) {
        return cls.getConstructor(null);
    }

    /* renamed from: y */
    public Method m29255y(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
