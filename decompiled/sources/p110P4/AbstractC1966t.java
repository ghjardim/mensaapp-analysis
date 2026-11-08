package p110P4;

import java.util.ArrayList;
import java.util.List;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p110P4.AbstractC1962p;
import p110P4.AbstractC1966t;

/* renamed from: P4.t */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1966t {

    /* renamed from: P4.t$a */
    public class a implements AbstractC1962p.f {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5968a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f5969b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f5968a = arrayList;
            this.f5969b = eVar;
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: b */
        public void mo6965b(Throwable th) {
            this.f5969b.mo2187a(AbstractC1962p.m6969a(th));
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6964a(AbstractC1962p.e eVar) {
            this.f5968a.add(0, eVar);
            this.f5969b.mo2187a(this.f5968a);
        }
    }

    /* renamed from: P4.t$b */
    public class b implements AbstractC1962p.f {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5970a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f5971b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f5970a = arrayList;
            this.f5971b = eVar;
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: b */
        public void mo6965b(Throwable th) {
            this.f5971b.mo2187a(AbstractC1962p.m6969a(th));
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6964a(List list) {
            this.f5970a.add(0, list);
            this.f5971b.mo2187a(this.f5970a);
        }
    }

    /* renamed from: P4.t$c */
    public class c implements AbstractC1962p.f {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5972a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f5973b;

        public c(ArrayList arrayList, C0649a.e eVar) {
            this.f5972a = arrayList;
            this.f5973b = eVar;
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: b */
        public void mo6965b(Throwable th) {
            this.f5973b.mo2187a(AbstractC1962p.m6969a(th));
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6964a(AbstractC1962p.d dVar) {
            this.f5972a.add(0, dVar);
            this.f5973b.mo2187a(this.f5972a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m7013a() {
        return AbstractC1962p.c.f5928d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m7014b(AbstractC1962p.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        bVar.mo6947b((String) arrayList.get(0), (AbstractC1962p.d) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    /* renamed from: e */
    public static void m7017e(InterfaceC0651c interfaceC0651c, final AbstractC1962p.b bVar) {
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", m7013a());
        if (bVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: P4.q
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1966t.m7014b(AbstractC1962p.b.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", m7013a());
        if (bVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: P4.r
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1962p.b.this.mo6946a(new AbstractC1966t.b(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", m7013a());
        if (bVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: P4.s
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1962p.b.this.mo6949d(new AbstractC1966t.c(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
    }
}
