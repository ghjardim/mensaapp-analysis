package p110P4;

import java.util.ArrayList;
import p061I4.C0649a;
import p061I4.C0664p;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p110P4.AbstractC1961o;
import p110P4.AbstractC1962p;

/* renamed from: P4.o */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1961o {

    /* renamed from: P4.o$a */
    public class a implements AbstractC1962p.f {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5922a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f5923b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f5922a = arrayList;
            this.f5923b = eVar;
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: b */
        public void mo6965b(Throwable th) {
            this.f5923b.mo2187a(AbstractC1962p.m6969a(th));
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6964a(Void r32) {
            this.f5922a.add(0, null);
            this.f5923b.mo2187a(this.f5922a);
        }
    }

    /* renamed from: P4.o$b */
    public class b implements AbstractC1962p.f {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5924a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f5925b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f5924a = arrayList;
            this.f5925b = eVar;
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: b */
        public void mo6965b(Throwable th) {
            this.f5925b.mo2187a(AbstractC1962p.m6969a(th));
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6964a(Void r32) {
            this.f5924a.add(0, null);
            this.f5925b.mo2187a(this.f5924a);
        }
    }

    /* renamed from: P4.o$c */
    public class c implements AbstractC1962p.f {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5926a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f5927b;

        public c(ArrayList arrayList, C0649a.e eVar) {
            this.f5926a = arrayList;
            this.f5927b = eVar;
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: b */
        public void mo6965b(Throwable th) {
            this.f5927b.mo2187a(AbstractC1962p.m6969a(th));
        }

        @Override // p110P4.AbstractC1962p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6964a(Void r32) {
            this.f5926a.add(0, null);
            this.f5927b.mo2187a(this.f5926a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m6959a() {
        return new C0664p();
    }

    /* renamed from: b */
    public static /* synthetic */ void m6960b(AbstractC1962p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.mo6948c((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    /* renamed from: c */
    public static /* synthetic */ void m6961c(AbstractC1962p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.mo6950e((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    /* renamed from: e */
    public static void m6963e(InterfaceC0651c interfaceC0651c, final AbstractC1962p.a aVar) {
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", m6959a());
        if (aVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: P4.l
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1961o.m6960b(AbstractC1962p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", m6959a());
        if (aVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: P4.m
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1961o.m6961c(AbstractC1962p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.FirebaseAppHostApi.delete", m6959a());
        if (aVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: P4.n
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1962p.a.this.mo6951f((String) ((ArrayList) obj).get(0), new AbstractC1961o.c(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
    }
}
