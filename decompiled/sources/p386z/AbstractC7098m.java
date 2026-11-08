package p386z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.C3643a;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import p028E.AbstractC0206k;
import p256j$.util.concurrent.ConcurrentHashMap;
import p379y.AbstractC7040e;

/* renamed from: z.m */
/* loaded from: classes.dex */
public abstract class AbstractC7098m {

    /* renamed from: a */
    public ConcurrentHashMap f25206a = new ConcurrentHashMap();

    /* renamed from: z.m$a */
    public class a implements b {
        public a() {
        }

        @Override // p386z.AbstractC7098m.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo29263a(AbstractC0206k.b bVar) {
            return bVar.m841e();
        }

        @Override // p386z.AbstractC7098m.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo29264b(AbstractC0206k.b bVar) {
            return bVar.m842f();
        }
    }

    /* renamed from: z.m$b */
    public interface b {
        /* renamed from: a */
        int mo29263a(Object obj);

        /* renamed from: b */
        boolean mo29264b(Object obj);
    }

    /* renamed from: f */
    public static Object m29260f(Object[] objArr, int i7, b bVar) {
        return m29261g(objArr, (i7 & 1) == 0 ? 400 : 700, (i7 & 2) != 0, bVar);
    }

    /* renamed from: g */
    public static Object m29261g(Object[] objArr, int i7, boolean z6, b bVar) {
        Object obj = null;
        int i8 = C3643a.e.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.mo29263a(obj2) - i7) * 2) + (bVar.mo29264b(obj2) == z6 ? 0 : 1);
            if (obj == null || i8 > abs) {
                obj = obj2;
                i8 = abs;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public abstract Typeface mo29233a(Context context, AbstractC7040e.c cVar, Resources resources, int i7);

    /* renamed from: b */
    public abstract Typeface mo29234b(Context context, CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, int i7);

    /* renamed from: c */
    public Typeface mo29240c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* renamed from: d */
    public Typeface m29262d(Context context, InputStream inputStream) {
        File m29271e = AbstractC7099n.m29271e(context);
        if (m29271e == null) {
            return null;
        }
        try {
            if (AbstractC7099n.m29270d(m29271e, inputStream)) {
                return Typeface.createFromFile(m29271e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m29271e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo29241e(Context context, Resources resources, int i7, String str, int i8) {
        File m29271e = AbstractC7099n.m29271e(context);
        if (m29271e == null) {
            return null;
        }
        try {
            if (AbstractC7099n.m29269c(m29271e, resources, i7)) {
                return Typeface.createFromFile(m29271e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m29271e.delete();
        }
    }

    /* renamed from: h */
    public AbstractC0206k.b mo29258h(AbstractC0206k.b[] bVarArr, int i7) {
        return (AbstractC0206k.b) m29260f(bVarArr, i7, new a());
    }
}
