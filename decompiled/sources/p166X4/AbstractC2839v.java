package p166X4;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p166X4.AbstractC2834q;

/* renamed from: X4.v */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2839v {

    /* renamed from: X4.v$a */
    public class a implements AbstractC2834q.j {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8797a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8798b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f8797a = arrayList;
            this.f8798b = eVar;
        }

        @Override // p166X4.AbstractC2834q.j
        /* renamed from: b */
        public void mo10227b(Throwable th) {
            this.f8798b.mo2187a(AbstractC2834q.m10188a(th));
        }

        @Override // p166X4.AbstractC2834q.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo10226a(List list) {
            this.f8797a.add(0, list);
            this.f8798b.mo2187a(this.f8797a);
        }
    }

    /* renamed from: X4.v$b */
    public class b implements AbstractC2834q.j {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8799a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8800b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f8799a = arrayList;
            this.f8800b = eVar;
        }

        @Override // p166X4.AbstractC2834q.j
        /* renamed from: b */
        public void mo10227b(Throwable th) {
            this.f8800b.mo2187a(AbstractC2834q.m10188a(th));
        }

        @Override // p166X4.AbstractC2834q.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo10226a(List list) {
            this.f8799a.add(0, list);
            this.f8800b.mo2187a(this.f8799a);
        }
    }

    /* renamed from: X4.v$c */
    public class c implements AbstractC2834q.j {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8801a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8802b;

        public c(ArrayList arrayList, C0649a.e eVar) {
            this.f8801a = arrayList;
            this.f8802b = eVar;
        }

        @Override // p166X4.AbstractC2834q.j
        /* renamed from: b */
        public void mo10227b(Throwable th) {
            this.f8802b.mo2187a(AbstractC2834q.m10188a(th));
        }

        @Override // p166X4.AbstractC2834q.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo10226a(List list) {
            this.f8801a.add(0, list);
            this.f8802b.mo2187a(this.f8801a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m10240a() {
        return AbstractC2834q.i.f8781d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m10241b(AbstractC2834q.f fVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.mo10158c((AbstractC2834q.l) arrayList.get(0), (AbstractC2834q.g) arrayList.get(1), (AbstractC2834q.e) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    /* renamed from: c */
    public static /* synthetic */ void m10242c(AbstractC2834q.f fVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.mo10159d((AbstractC2834q.l) arrayList.get(0), (AbstractC2834q.n) arrayList.get(1), (AbstractC2834q.e) arrayList.get(2), new b(new ArrayList(), eVar));
    }

    /* renamed from: d */
    public static /* synthetic */ void m10243d(AbstractC2834q.f fVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.mo10156a((AbstractC2834q.h) arrayList.get(0), (AbstractC2834q.e) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    /* renamed from: e */
    public static /* synthetic */ void m10244e(AbstractC2834q.f fVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, fVar.mo10157b());
        } catch (Throwable th) {
            arrayList = AbstractC2834q.m10188a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: f */
    public static void m10245f(InterfaceC0651c interfaceC0651c, AbstractC2834q.f fVar) {
        m10246g(interfaceC0651c, StringUtils.EMPTY, fVar);
    }

    /* renamed from: g */
    public static void m10246g(InterfaceC0651c interfaceC0651c, String str, final AbstractC2834q.f fVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        InterfaceC0651c.c mo2619b = interfaceC0651c.mo2619b();
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages" + str2, m10240a(), mo2619b);
        if (fVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: X4.r
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2839v.m10241b(AbstractC2834q.f.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos" + str2, m10240a(), mo2619b);
        if (fVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: X4.s
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2839v.m10242c(AbstractC2834q.f.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia" + str2, m10240a());
        if (fVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: X4.t
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2839v.m10243d(AbstractC2834q.f.this, obj, eVar);
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults" + str2, m10240a(), mo2619b);
        if (fVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: X4.u
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2839v.m10244e(AbstractC2834q.f.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
    }
}
