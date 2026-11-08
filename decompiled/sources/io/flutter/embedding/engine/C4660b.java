package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.embedding.engine.C4659a;
import io.flutter.plugin.platform.C4783y;
import java.util.ArrayList;
import java.util.List;
import p012B4.C0055f;
import p370w4.C6916a;
import p391z4.C7146a;

/* renamed from: io.flutter.embedding.engine.b */
/* loaded from: classes.dex */
public class C4660b {

    /* renamed from: a */
    public final List f17333a = new ArrayList();

    /* renamed from: io.flutter.embedding.engine.b$a */
    public class a implements C4659a.b {

        /* renamed from: a */
        public final /* synthetic */ C4659a f17334a;

        public a(C4659a c4659a) {
            this.f17334a = c4659a;
        }

        @Override // io.flutter.embedding.engine.C4659a.b
        /* renamed from: a */
        public void mo20222a() {
            C4660b.this.f17333a.remove(this.f17334a);
        }

        @Override // io.flutter.embedding.engine.C4659a.b
        /* renamed from: b */
        public void mo20223b() {
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b */
    public static class b {

        /* renamed from: a */
        public Context f17336a;

        /* renamed from: b */
        public C7146a.c f17337b;

        /* renamed from: c */
        public String f17338c;

        /* renamed from: d */
        public List f17339d;

        /* renamed from: e */
        public C4783y f17340e;

        /* renamed from: f */
        public boolean f17341f = true;

        /* renamed from: g */
        public boolean f17342g = false;

        public b(Context context) {
            this.f17336a = context;
        }

        /* renamed from: a */
        public boolean m20226a() {
            return this.f17341f;
        }

        /* renamed from: b */
        public Context m20227b() {
            return this.f17336a;
        }

        /* renamed from: c */
        public C7146a.c m20228c() {
            return this.f17337b;
        }

        /* renamed from: d */
        public List m20229d() {
            return this.f17339d;
        }

        /* renamed from: e */
        public String m20230e() {
            return this.f17338c;
        }

        /* renamed from: f */
        public C4783y m20231f() {
            return this.f17340e;
        }

        /* renamed from: g */
        public boolean m20232g() {
            return this.f17342g;
        }

        /* renamed from: h */
        public b m20233h(boolean z6) {
            this.f17341f = z6;
            return this;
        }

        /* renamed from: i */
        public b m20234i(C7146a.c cVar) {
            this.f17337b = cVar;
            return this;
        }

        /* renamed from: j */
        public b m20235j(List list) {
            this.f17339d = list;
            return this;
        }

        /* renamed from: k */
        public b m20236k(String str) {
            this.f17338c = str;
            return this;
        }

        /* renamed from: l */
        public b m20237l(boolean z6) {
            this.f17342g = z6;
            return this;
        }
    }

    public C4660b(Context context, String[] strArr) {
        C0055f m28349c = C6916a.m28346e().m28349c();
        if (m28349c.m140o()) {
            return;
        }
        m28349c.m143s(context.getApplicationContext());
        m28349c.m133h(context.getApplicationContext(), strArr);
    }

    /* renamed from: a */
    public C4659a m20224a(b bVar) {
        C4659a m20200D;
        Context m20227b = bVar.m20227b();
        C7146a.c m20228c = bVar.m20228c();
        String m20230e = bVar.m20230e();
        List m20229d = bVar.m20229d();
        C4783y m20231f = bVar.m20231f();
        if (m20231f == null) {
            m20231f = new C4783y();
        }
        C4783y c4783y = m20231f;
        boolean m20226a = bVar.m20226a();
        boolean m20232g = bVar.m20232g();
        C7146a.c m29449a = m20228c == null ? C7146a.c.m29449a() : m20228c;
        if (this.f17333a.size() == 0) {
            m20200D = m20225b(m20227b, c4783y, m20226a, m20232g);
            if (m20230e != null) {
                m20200D.m20211p().m2214c(m20230e);
            }
            m20200D.m20207l().m29444j(m29449a, m20229d);
        } else {
            m20200D = ((C4659a) this.f17333a.get(0)).m20200D(m20227b, m29449a, m20230e, m20229d, c4783y, m20226a, m20232g);
        }
        this.f17333a.add(m20200D);
        m20200D.m20201f(new a(m20200D));
        return m20200D;
    }

    /* renamed from: b */
    public C4659a m20225b(Context context, C4783y c4783y, boolean z6, boolean z7) {
        return new C4659a(context, null, null, c4783y, null, z6, z7, this);
    }
}
