package p161X;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC3345j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p168Y.C2884c;

/* renamed from: X.Q */
/* loaded from: classes.dex */
public abstract class AbstractC2760Q {

    /* renamed from: a */
    public final AbstractC2796z f8212a;

    /* renamed from: b */
    public final ClassLoader f8213b;

    /* renamed from: d */
    public int f8215d;

    /* renamed from: e */
    public int f8216e;

    /* renamed from: f */
    public int f8217f;

    /* renamed from: g */
    public int f8218g;

    /* renamed from: h */
    public int f8219h;

    /* renamed from: i */
    public boolean f8220i;

    /* renamed from: k */
    public String f8222k;

    /* renamed from: l */
    public int f8223l;

    /* renamed from: m */
    public CharSequence f8224m;

    /* renamed from: n */
    public int f8225n;

    /* renamed from: o */
    public CharSequence f8226o;

    /* renamed from: p */
    public ArrayList f8227p;

    /* renamed from: q */
    public ArrayList f8228q;

    /* renamed from: s */
    public ArrayList f8230s;

    /* renamed from: c */
    public ArrayList f8214c = new ArrayList();

    /* renamed from: j */
    public boolean f8221j = true;

    /* renamed from: r */
    public boolean f8229r = false;

    /* renamed from: X.Q$a */
    public static final class a {

        /* renamed from: a */
        public int f8231a;

        /* renamed from: b */
        public AbstractComponentCallbacksC2786p f8232b;

        /* renamed from: c */
        public boolean f8233c;

        /* renamed from: d */
        public int f8234d;

        /* renamed from: e */
        public int f8235e;

        /* renamed from: f */
        public int f8236f;

        /* renamed from: g */
        public int f8237g;

        /* renamed from: h */
        public AbstractC3345j.b f8238h;

        /* renamed from: i */
        public AbstractC3345j.b f8239i;

        public a() {
        }

        public a(int i7, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
            this.f8231a = i7;
            this.f8232b = abstractComponentCallbacksC2786p;
            this.f8233c = false;
            AbstractC3345j.b bVar = AbstractC3345j.b.RESUMED;
            this.f8238h = bVar;
            this.f8239i = bVar;
        }

        public a(int i7, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, boolean z6) {
            this.f8231a = i7;
            this.f8232b = abstractComponentCallbacksC2786p;
            this.f8233c = z6;
            AbstractC3345j.b bVar = AbstractC3345j.b.RESUMED;
            this.f8238h = bVar;
            this.f8239i = bVar;
        }
    }

    public AbstractC2760Q(AbstractC2796z abstractC2796z, ClassLoader classLoader) {
        this.f8212a = abstractC2796z;
        this.f8213b = classLoader;
    }

    /* renamed from: b */
    public AbstractC2760Q m9611b(int i7, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, String str) {
        mo9620k(i7, abstractComponentCallbacksC2786p, str, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC2760Q m9612c(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, String str) {
        mo9620k(0, abstractComponentCallbacksC2786p, str, 1);
        return this;
    }

    /* renamed from: d */
    public AbstractC2760Q m9613d(ViewGroup viewGroup, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, String str) {
        abstractComponentCallbacksC2786p.f8434P = viewGroup;
        return m9611b(viewGroup.getId(), abstractComponentCallbacksC2786p, str);
    }

    /* renamed from: e */
    public void m9614e(a aVar) {
        this.f8214c.add(aVar);
        aVar.f8234d = this.f8215d;
        aVar.f8235e = this.f8216e;
        aVar.f8236f = this.f8217f;
        aVar.f8237g = this.f8218g;
    }

    /* renamed from: f */
    public abstract int mo9615f();

    /* renamed from: g */
    public abstract int mo9616g();

    /* renamed from: h */
    public abstract void mo9617h();

    /* renamed from: i */
    public abstract void mo9618i();

    /* renamed from: j */
    public AbstractC2760Q m9619j() {
        if (this.f8220i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8221j = false;
        return this;
    }

    /* renamed from: k */
    public void mo9620k(int i7, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, String str, int i8) {
        String str2 = abstractComponentCallbacksC2786p.f8444Z;
        if (str2 != null) {
            C2884c.m10402f(abstractComponentCallbacksC2786p, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2786p.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC2786p.f8426H;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC2786p + ": was " + abstractComponentCallbacksC2786p.f8426H + " now " + str);
            }
            abstractComponentCallbacksC2786p.f8426H = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2786p + " with tag " + str + " to container view with no id");
            }
            int i9 = abstractComponentCallbacksC2786p.f8424F;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC2786p + ": was " + abstractComponentCallbacksC2786p.f8424F + " now " + i7);
            }
            abstractComponentCallbacksC2786p.f8424F = i7;
            abstractComponentCallbacksC2786p.f8425G = i7;
        }
        m9614e(new a(i8, abstractComponentCallbacksC2786p));
    }

    /* renamed from: l */
    public AbstractC2760Q mo9621l(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        m9614e(new a(3, abstractComponentCallbacksC2786p));
        return this;
    }

    /* renamed from: m */
    public AbstractC2760Q m9622m(boolean z6) {
        this.f8229r = z6;
        return this;
    }
}
