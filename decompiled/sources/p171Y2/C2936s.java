package p171Y2;

import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p256j$.util.DesugarCollections;

/* renamed from: Y2.s */
/* loaded from: classes.dex */
public final class C2936s {

    /* renamed from: a */
    public final AbstractC2921d f9026a;

    /* renamed from: b */
    public final boolean f9027b;

    /* renamed from: c */
    public final c f9028c;

    /* renamed from: d */
    public final int f9029d;

    /* renamed from: Y2.s$a */
    public class a implements c {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2921d f9030a;

        /* renamed from: Y2.s$a$a, reason: collision with other inner class name */
        public class C7191a extends b {
            public C7191a(C2936s c2936s, CharSequence charSequence) {
                super(c2936s, charSequence);
            }

            @Override // p171Y2.C2936s.b
            /* renamed from: f */
            public int mo10597f(int i7) {
                return i7 + 1;
            }

            @Override // p171Y2.C2936s.b
            /* renamed from: g */
            public int mo10598g(int i7) {
                return a.this.f9030a.mo10523c(this.f9032c, i7);
            }
        }

        public a(AbstractC2921d abstractC2921d) {
            this.f9030a = abstractC2921d;
        }

        @Override // p171Y2.C2936s.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo10595a(C2936s c2936s, CharSequence charSequence) {
            return new C7191a(c2936s, charSequence);
        }
    }

    /* renamed from: Y2.s$b */
    public static abstract class b extends AbstractC2919b {

        /* renamed from: c */
        public final CharSequence f9032c;

        /* renamed from: d */
        public final AbstractC2921d f9033d;

        /* renamed from: e */
        public final boolean f9034e;

        /* renamed from: f */
        public int f9035f = 0;

        /* renamed from: n */
        public int f9036n;

        public b(C2936s c2936s, CharSequence charSequence) {
            this.f9033d = c2936s.f9026a;
            this.f9034e = c2936s.f9027b;
            this.f9036n = c2936s.f9029d;
            this.f9032c = charSequence;
        }

        @Override // p171Y2.AbstractC2919b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String mo10507a() {
            int mo10598g;
            int i7 = this.f9035f;
            while (true) {
                int i8 = this.f9035f;
                if (i8 == -1) {
                    return (String) m10508c();
                }
                mo10598g = mo10598g(i8);
                if (mo10598g == -1) {
                    mo10598g = this.f9032c.length();
                    this.f9035f = -1;
                } else {
                    this.f9035f = mo10597f(mo10598g);
                }
                int i9 = this.f9035f;
                if (i9 == i7) {
                    int i10 = i9 + 1;
                    this.f9035f = i10;
                    if (i10 > this.f9032c.length()) {
                        this.f9035f = -1;
                    }
                } else {
                    while (i7 < mo10598g && this.f9033d.mo10524e(this.f9032c.charAt(i7))) {
                        i7++;
                    }
                    while (mo10598g > i7 && this.f9033d.mo10524e(this.f9032c.charAt(mo10598g - 1))) {
                        mo10598g--;
                    }
                    if (!this.f9034e || i7 != mo10598g) {
                        break;
                    }
                    i7 = this.f9035f;
                }
            }
            int i11 = this.f9036n;
            if (i11 == 1) {
                mo10598g = this.f9032c.length();
                this.f9035f = -1;
                while (mo10598g > i7 && this.f9033d.mo10524e(this.f9032c.charAt(mo10598g - 1))) {
                    mo10598g--;
                }
            } else {
                this.f9036n = i11 - 1;
            }
            return this.f9032c.subSequence(i7, mo10598g).toString();
        }

        /* renamed from: f */
        public abstract int mo10597f(int i7);

        /* renamed from: g */
        public abstract int mo10598g(int i7);
    }

    /* renamed from: Y2.s$c */
    public interface c {
        /* renamed from: a */
        Iterator mo10595a(C2936s c2936s, CharSequence charSequence);
    }

    public C2936s(c cVar) {
        this(cVar, false, AbstractC2921d.m10519f(), C3643a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: d */
    public static C2936s m10589d(char c7) {
        return m10590e(AbstractC2921d.m10518d(c7));
    }

    /* renamed from: e */
    public static C2936s m10590e(AbstractC2921d abstractC2921d) {
        AbstractC2932o.m10572o(abstractC2921d);
        return new C2936s(new a(abstractC2921d));
    }

    /* renamed from: f */
    public List m10591f(CharSequence charSequence) {
        AbstractC2932o.m10572o(charSequence);
        Iterator m10592g = m10592g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m10592g.hasNext()) {
            arrayList.add((String) m10592g.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public final Iterator m10592g(CharSequence charSequence) {
        return this.f9028c.mo10595a(this, charSequence);
    }

    /* renamed from: h */
    public C2936s m10593h() {
        return m10594i(AbstractC2921d.m10521h());
    }

    /* renamed from: i */
    public C2936s m10594i(AbstractC2921d abstractC2921d) {
        AbstractC2932o.m10572o(abstractC2921d);
        return new C2936s(this.f9028c, this.f9027b, abstractC2921d, this.f9029d);
    }

    public C2936s(c cVar, boolean z6, AbstractC2921d abstractC2921d, int i7) {
        this.f9028c = cVar;
        this.f9027b = z6;
        this.f9026a = abstractC2921d;
        this.f9029d = i7;
    }
}
