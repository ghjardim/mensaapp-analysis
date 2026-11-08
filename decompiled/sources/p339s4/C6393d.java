package p339s4;

import p061I4.C0658j;
import p061I4.C0659k;

/* renamed from: s4.d */
/* loaded from: classes.dex */
public class C6393d extends AbstractC6390a {

    /* renamed from: a */
    public final a f23091a;

    /* renamed from: b */
    public final C0658j f23092b;

    /* renamed from: s4.d$a */
    public class a implements InterfaceC6395f {

        /* renamed from: a */
        public final C0659k.d f23093a;

        public a(C0659k.d dVar) {
            this.f23093a = dVar;
        }

        @Override // p339s4.InterfaceC6395f
        /* renamed from: a */
        public void mo26698a(Object obj) {
            this.f23093a.mo2314a(obj);
        }

        @Override // p339s4.InterfaceC6395f
        /* renamed from: b */
        public void mo26699b(String str, String str2, Object obj) {
            this.f23093a.mo2315b(str, str2, obj);
        }
    }

    public C6393d(C0658j c0658j, C0659k.d dVar) {
        this.f23092b = c0658j;
        this.f23091a = new a(dVar);
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: c */
    public Object mo26710c(String str) {
        return this.f23092b.m2647a(str);
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: h */
    public String mo26711h() {
        return this.f23092b.f2254a;
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: i */
    public boolean mo26712i(String str) {
        return this.f23092b.m2649c(str);
    }

    @Override // p339s4.AbstractC6390a
    /* renamed from: o */
    public InterfaceC6395f mo26700o() {
        return this.f23091a;
    }
}
