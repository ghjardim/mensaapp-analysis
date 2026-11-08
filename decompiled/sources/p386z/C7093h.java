package p386z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p028E.AbstractC0206k;
import p379y.AbstractC7040e;

/* renamed from: z.h */
/* loaded from: classes.dex */
public class C7093h extends AbstractC7098m {

    /* renamed from: b */
    public static Class f25190b = null;

    /* renamed from: c */
    public static Constructor f25191c = null;

    /* renamed from: d */
    public static Method f25192d = null;

    /* renamed from: e */
    public static Method f25193e = null;

    /* renamed from: f */
    public static boolean f25194f = false;

    /* renamed from: i */
    public static boolean m29229i(Object obj, String str, int i7, boolean z6) {
        m29231l();
        try {
            return ((Boolean) f25192d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: j */
    private static Typeface m29230j(Object obj) {
        m29231l();
        try {
            Object newInstance = Array.newInstance((Class<?>) f25190b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f25193e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: l */
    public static void m29231l() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f25194f) {
            return;
        }
        f25194f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f25191c = constructor;
        f25190b = cls;
        f25192d = method2;
        f25193e = method;
    }

    /* renamed from: m */
    private static Object m29232m() {
        m29231l();
        try {
            return f25191c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: a */
    public Typeface mo29233a(Context context, AbstractC7040e.c cVar, Resources resources, int i7) {
        Object m29232m = m29232m();
        for (AbstractC7040e.d dVar : cVar.m28969a()) {
            File m29271e = AbstractC7099n.m29271e(context);
            if (m29271e == null) {
                return null;
            }
            try {
                if (!AbstractC7099n.m29269c(m29271e, resources, dVar.m28971b())) {
                    return null;
                }
                if (!m29229i(m29232m, m29271e.getPath(), dVar.m28974e(), dVar.m28975f())) {
                    return null;
                }
                m29271e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m29271e.delete();
            }
        }
        return m29230j(m29232m);
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: b */
    public Typeface mo29234b(Context context, CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, int i7) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m29235k = m29235k(openFileDescriptor);
                if (m29235k != null && m29235k.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m29235k);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface m29262d = super.m29262d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m29262d;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final File m29235k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
