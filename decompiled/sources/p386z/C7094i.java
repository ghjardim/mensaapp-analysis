package p386z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p028E.AbstractC0206k;
import p334s.C6318k;
import p379y.AbstractC7040e;

/* renamed from: z.i */
/* loaded from: classes.dex */
public class C7094i extends AbstractC7098m {

    /* renamed from: b */
    public static final Class f25195b;

    /* renamed from: c */
    public static final Constructor f25196c;

    /* renamed from: d */
    public static final Method f25197d;

    /* renamed from: e */
    public static final Method f25198e;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f25196c = constructor;
        f25195b = cls;
        f25197d = method2;
        f25198e = method;
    }

    /* renamed from: i */
    public static boolean m29236i(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z6) {
        try {
            return ((Boolean) f25197d.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    private static Typeface m29237j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f25195b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f25198e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static boolean m29238k() {
        Method method = f25197d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: l */
    private static Object m29239l() {
        try {
            return f25196c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: a */
    public Typeface mo29233a(Context context, AbstractC7040e.c cVar, Resources resources, int i7) {
        Object m29239l = m29239l();
        if (m29239l == null) {
            return null;
        }
        for (AbstractC7040e.d dVar : cVar.m28969a()) {
            ByteBuffer m29268b = AbstractC7099n.m29268b(context, resources, dVar.m28971b());
            if (m29268b == null || !m29236i(m29239l, m29268b, dVar.m28972c(), dVar.m28974e(), dVar.m28975f())) {
                return null;
            }
        }
        return m29237j(m29239l);
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: b */
    public Typeface mo29234b(Context context, CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, int i7) {
        Object m29239l = m29239l();
        if (m29239l == null) {
            return null;
        }
        C6318k c6318k = new C6318k();
        for (AbstractC0206k.b bVar : bVarArr) {
            Uri m840d = bVar.m840d();
            ByteBuffer byteBuffer = (ByteBuffer) c6318k.get(m840d);
            if (byteBuffer == null) {
                byteBuffer = AbstractC7099n.m29272f(context, cancellationSignal, m840d);
                c6318k.put(m840d, byteBuffer);
            }
            if (byteBuffer == null || !m29236i(m29239l, byteBuffer, bVar.m839c(), bVar.m841e(), bVar.m842f())) {
                return null;
            }
        }
        Typeface m29237j = m29237j(m29239l);
        if (m29237j == null) {
            return null;
        }
        return Typeface.create(m29237j, i7);
    }
}
