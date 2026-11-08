package p386z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import p023D1.AbstractC0181a;
import p028E.AbstractC0206k;
import p334s.C6317j;
import p379y.AbstractC7040e;
import p379y.AbstractC7043h;

/* renamed from: z.g */
/* loaded from: classes.dex */
public abstract class AbstractC7092g {

    /* renamed from: a */
    public static final AbstractC7098m f25187a;

    /* renamed from: b */
    public static final C6317j f25188b;

    /* renamed from: z.g$a */
    public static class a extends AbstractC0206k.c {

        /* renamed from: a */
        public AbstractC7043h.e f25189a;

        public a(AbstractC7043h.e eVar) {
            this.f25189a = eVar;
        }

        @Override // p028E.AbstractC0206k.c
        /* renamed from: a */
        public void mo843a(int i7) {
            AbstractC7043h.e eVar = this.f25189a;
            if (eVar != null) {
                eVar.m29005f(i7);
            }
        }

        @Override // p028E.AbstractC0206k.c
        /* renamed from: b */
        public void mo844b(Typeface typeface) {
            AbstractC7043h.e eVar = this.f25189a;
            if (eVar != null) {
                eVar.m29006g(typeface);
            }
        }
    }

    static {
        AbstractC0181a.m729c("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f25187a = new C7097l();
        } else if (i7 >= 28) {
            f25187a = new C7096k();
        } else if (i7 >= 26) {
            f25187a = new C7095j();
        } else if (i7 < 24 || !C7094i.m29238k()) {
            f25187a = new C7093h();
        } else {
            f25187a = new C7094i();
        }
        f25188b = new C6317j(16);
        AbstractC0181a.m732f();
    }

    /* renamed from: a */
    public static Typeface m29221a(Context context, Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m29222b(Context context, CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, int i7) {
        AbstractC0181a.m729c("TypefaceCompat.createFromFontInfo");
        try {
            return f25187a.mo29234b(context, cancellationSignal, bVarArr, i7);
        } finally {
            AbstractC0181a.m732f();
        }
    }

    /* renamed from: c */
    public static Typeface m29223c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        AbstractC0181a.m729c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f25187a.mo29240c(context, cancellationSignal, list, i7);
        } finally {
            AbstractC0181a.m732f();
        }
    }

    /* renamed from: d */
    public static Typeface m29224d(Context context, AbstractC7040e.b bVar, Resources resources, int i7, String str, int i8, int i9, AbstractC7043h.e eVar, Handler handler, boolean z6) {
        Typeface mo29233a;
        if (bVar instanceof AbstractC7040e.e) {
            AbstractC7040e.e eVar2 = (AbstractC7040e.e) bVar;
            Typeface m29228h = m29228h(eVar2.m28979d());
            if (m29228h != null) {
                if (eVar != null) {
                    eVar.m29004d(m29228h, handler);
                }
                return m29228h;
            }
            mo29233a = AbstractC0206k.m830a(context, eVar2.m28976a() != null ? AbstractC7091f.m29220a(new Object[]{eVar2.m28978c(), eVar2.m28976a()}) : AbstractC7091f.m29220a(new Object[]{eVar2.m28978c()}), i9, !z6 ? eVar != null : eVar2.m28977b() != 0, z6 ? eVar2.m28980e() : -1, AbstractC7043h.e.m29002e(handler), new a(eVar));
        } else {
            mo29233a = f25187a.mo29233a(context, (AbstractC7040e.c) bVar, resources, i9);
            if (eVar != null) {
                if (mo29233a != null) {
                    eVar.m29004d(mo29233a, handler);
                } else {
                    eVar.m29003c(-3, handler);
                }
            }
        }
        if (mo29233a != null) {
            f25188b.put(m29226f(resources, i7, str, i8, i9), mo29233a);
        }
        return mo29233a;
    }

    /* renamed from: e */
    public static Typeface m29225e(Context context, Resources resources, int i7, String str, int i8, int i9) {
        Typeface mo29241e = f25187a.mo29241e(context, resources, i7, str, i9);
        if (mo29241e != null) {
            f25188b.put(m29226f(resources, i7, str, i8, i9), mo29241e);
        }
        return mo29241e;
    }

    /* renamed from: f */
    public static String m29226f(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    /* renamed from: g */
    public static Typeface m29227g(Resources resources, int i7, String str, int i8, int i9) {
        return (Typeface) f25188b.get(m29226f(resources, i7, str, i8, i9));
    }

    /* renamed from: h */
    public static Typeface m29228h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
