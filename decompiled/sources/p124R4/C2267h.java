package p124R4;

import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3952f;
import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.C3957k;
import java.util.ArrayList;
import java.util.Iterator;
import p046G3.C0425g;
import p046G3.C0450s0;
import p046G3.EnumC0406T;
import p046G3.EnumC0418c0;
import p046G3.InterfaceC0407U;
import p046G3.InterfaceC0447r;
import p061I4.C0652d;
import p131S4.AbstractC2314a;
import p131S4.AbstractC2315b;

/* renamed from: R4.h */
/* loaded from: classes2.dex */
public class C2267h implements C0652d.d {

    /* renamed from: a */
    public InterfaceC0407U f6894a;

    /* renamed from: b */
    public C3955i f6895b;

    /* renamed from: c */
    public EnumC0418c0 f6896c;

    /* renamed from: d */
    public C3950d.a f6897d;

    /* renamed from: e */
    public EnumC0406T f6898e;

    public C2267h(C3955i c3955i, Boolean bool, C3950d.a aVar, EnumC0406T enumC0406T) {
        this.f6895b = c3955i;
        this.f6896c = bool.booleanValue() ? EnumC0418c0.INCLUDE : EnumC0418c0.EXCLUDE;
        this.f6897d = aVar;
        this.f6898e = enumC0406T;
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        InterfaceC0407U interfaceC0407U = this.f6894a;
        if (interfaceC0407U != null) {
            interfaceC0407U.remove();
            this.f6894a = null;
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        C0450s0.b bVar2 = new C0450s0.b();
        bVar2.m1670f(this.f6896c);
        bVar2.m1671g(this.f6898e);
        this.f6894a = this.f6895b.m15640g(bVar2.m1669e(), new InterfaceC0447r() { // from class: R4.g
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj2, C3952f c3952f) {
                C2267h.this.m7699d(bVar, (C3957k) obj2, c3952f);
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ void m7699d(C0652d.b bVar, C3957k c3957k, C3952f c3952f) {
        if (c3952f != null) {
            bVar.mo2630b("firebase_firestore", c3952f.getMessage(), AbstractC2314a.m7829a(c3952f));
            bVar.mo2631c();
            mo2635a(null);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(c3957k.m15663g().size());
        ArrayList arrayList3 = new ArrayList(c3957k.m15661e().size());
        Iterator it = c3957k.m15663g().iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC2315b.m7841k((C3950d) it.next(), this.f6897d).m7536e());
        }
        Iterator it2 = c3957k.m15661e().iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC2315b.m7838h((C0425g) it2.next(), this.f6897d).m7520f());
        }
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(AbstractC2315b.m7844n(c3957k.m15664h()).m7590d());
        bVar.mo2629a(arrayList);
    }
}
