package p197b5;

import java.util.ArrayList;
import java.util.Iterator;
import p061I4.C0652d;

/* renamed from: b5.q */
/* loaded from: classes2.dex */
public final class C3546q implements C0652d.b {

    /* renamed from: a */
    public C0652d.b f11969a;

    /* renamed from: b */
    public final ArrayList f11970b = new ArrayList();

    /* renamed from: c */
    public boolean f11971c = false;

    /* renamed from: b5.q$a */
    public static class a {
    }

    /* renamed from: b5.q$b */
    public static class b {

        /* renamed from: a */
        public String f11972a;

        /* renamed from: b */
        public String f11973b;

        /* renamed from: c */
        public Object f11974c;

        public b(String str, String str2, Object obj) {
            this.f11972a = str;
            this.f11973b = str2;
            this.f11974c = obj;
        }
    }

    @Override // p061I4.C0652d.b
    /* renamed from: a */
    public void mo2629a(Object obj) {
        m14305d(obj);
        m14306e();
    }

    @Override // p061I4.C0652d.b
    /* renamed from: b */
    public void mo2630b(String str, String str2, Object obj) {
        m14305d(new b(str, str2, obj));
        m14306e();
    }

    @Override // p061I4.C0652d.b
    /* renamed from: c */
    public void mo2631c() {
        m14305d(new a());
        m14306e();
        this.f11971c = true;
    }

    /* renamed from: d */
    public final void m14305d(Object obj) {
        if (this.f11971c) {
            return;
        }
        this.f11970b.add(obj);
    }

    /* renamed from: e */
    public final void m14306e() {
        if (this.f11969a == null) {
            return;
        }
        Iterator it = this.f11970b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof a) {
                this.f11969a.mo2631c();
            } else if (next instanceof b) {
                b bVar = (b) next;
                this.f11969a.mo2630b(bVar.f11972a, bVar.f11973b, bVar.f11974c);
            } else {
                this.f11969a.mo2629a(next);
            }
        }
        this.f11970b.clear();
    }

    /* renamed from: f */
    public void m14307f(C0652d.b bVar) {
        this.f11969a = bVar;
        m14306e();
    }
}
