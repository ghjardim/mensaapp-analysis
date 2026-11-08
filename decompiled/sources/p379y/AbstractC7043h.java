package p379y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p042G.AbstractC0340b;
import p379y.AbstractC7043h;

/* renamed from: y.h */
/* loaded from: classes.dex */
public abstract class AbstractC7043h {

    /* renamed from: a */
    public static final ThreadLocal f25118a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f25119b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f25120c = new Object();

    /* renamed from: y.h$a */
    public static class a {
        /* renamed from: a */
        public static Drawable m28998a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }
    }

    /* renamed from: y.h$b */
    public static class b {
        /* renamed from: a */
        public static ColorStateList m28999a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColorStateList(i7, theme);
        }
    }

    /* renamed from: y.h$c */
    public static class c {

        /* renamed from: a */
        public final ColorStateList f25121a;

        /* renamed from: b */
        public final Configuration f25122b;

        /* renamed from: c */
        public final int f25123c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f25121a = colorStateList;
            this.f25122b = configuration;
            this.f25123c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: y.h$d */
    public static final class d {

        /* renamed from: a */
        public final Resources f25124a;

        /* renamed from: b */
        public final Resources.Theme f25125b;

        public d(Resources resources, Resources.Theme theme) {
            this.f25124a = resources;
            this.f25125b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f25124a.equals(dVar.f25124a) && AbstractC0340b.m1344a(this.f25125b, dVar.f25125b);
        }

        public int hashCode() {
            return AbstractC0340b.m1345b(this.f25124a, this.f25125b);
        }
    }

    /* renamed from: y.h$e */
    public static abstract class e {
        /* renamed from: e */
        public static Handler m29002e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m29003c(final int i7, Handler handler) {
            m29002e(handler).post(new Runnable() { // from class: y.j
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC7043h.e.this.m29005f(i7);
                }
            });
        }

        /* renamed from: d */
        public final void m29004d(final Typeface typeface, Handler handler) {
            m29002e(handler).post(new Runnable() { // from class: y.i
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC7043h.e.this.m29006g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void m29005f(int i7);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void m29006g(Typeface typeface);
    }

    /* renamed from: a */
    public static void m28988a(d dVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f25120c) {
            try {
                WeakHashMap weakHashMap = f25119b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i7, new c(colorStateList, dVar.f25124a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f25123c == r5.hashCode()) goto L22;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m28989b(p379y.AbstractC7043h.d r5, int r6) {
        /*
            java.lang.Object r0 = p379y.AbstractC7043h.f25120c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p379y.AbstractC7043h.f25119b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            y.h$c r2 = (p379y.AbstractC7043h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f25122b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f25124a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f25125b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f25123c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f25123c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f25121a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p379y.AbstractC7043h.m28989b(y.h$d, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m28990c(Resources resources, int i7, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList m28989b = m28989b(dVar, i7);
        if (m28989b != null) {
            return m28989b;
        }
        ColorStateList m28994g = m28994g(resources, i7, theme);
        if (m28994g == null) {
            return b.m28999a(resources, i7, theme);
        }
        m28988a(dVar, i7, m28994g, theme);
        return m28994g;
    }

    /* renamed from: d */
    public static Drawable m28991d(Resources resources, int i7, Resources.Theme theme) {
        return a.m28998a(resources, i7, theme);
    }

    /* renamed from: e */
    public static Typeface m28992e(Context context, int i7, TypedValue typedValue, int i8, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m28996i(context, i7, typedValue, i8, eVar, null, true, false);
    }

    /* renamed from: f */
    public static TypedValue m28993f() {
        ThreadLocal threadLocal = f25118a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: g */
    public static ColorStateList m28994g(Resources resources, int i7, Resources.Theme theme) {
        if (m28995h(resources, i7)) {
            return null;
        }
        try {
            return AbstractC7038c.m28940a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m28995h(Resources resources, int i7) {
        TypedValue m28993f = m28993f();
        resources.getValue(i7, m28993f, true);
        int i8 = m28993f.type;
        return i8 >= 28 && i8 <= 31;
    }

    /* renamed from: i */
    public static Typeface m28996i(Context context, int i7, TypedValue typedValue, int i8, e eVar, Handler handler, boolean z6, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface m28997j = m28997j(context, resources, typedValue, i7, i8, eVar, handler, z6, z7);
        if (m28997j != null || eVar != null || z7) {
            return m28997j;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m28997j(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, p379y.AbstractC7043h.e r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p379y.AbstractC7043h.m28997j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, y.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
