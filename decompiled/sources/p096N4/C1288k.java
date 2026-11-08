package p096N4;

import java.util.HashMap;
import p061I4.C0652d;
import p262j3.AbstractC5367c;
import p262j3.AbstractC5369e;

/* renamed from: N4.k */
/* loaded from: classes2.dex */
public class C1288k implements C0652d.d {

    /* renamed from: a */
    public final AbstractC5369e f4040a;

    /* renamed from: b */
    public AbstractC5369e.a f4041b;

    public C1288k(AbstractC5369e abstractC5369e) {
        this.f4040a = abstractC5369e;
    }

    /* renamed from: d */
    public static /* synthetic */ void m4903d(C0652d.b bVar, AbstractC5367c abstractC5367c) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", abstractC5367c.mo22072b());
        bVar.mo2629a(hashMap);
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        AbstractC5369e.a aVar = this.f4041b;
        if (aVar != null) {
            this.f4040a.mo22080i(aVar);
            this.f4041b = null;
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        AbstractC5369e.a aVar = new AbstractC5369e.a() { // from class: N4.j
            @Override // p262j3.AbstractC5369e.a
            /* renamed from: a */
            public final void mo4901a(AbstractC5367c abstractC5367c) {
                C1288k.m4903d(C0652d.b.this, abstractC5367c);
            }
        };
        this.f4041b = aVar;
        this.f4040a.mo22076d(aVar);
    }
}
