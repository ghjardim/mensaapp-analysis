package p339s4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p061I4.C0659k;

/* renamed from: s4.c */
/* loaded from: classes.dex */
public class C6392c extends AbstractC6390a {

    /* renamed from: a */
    public final Map f23083a;

    /* renamed from: b */
    public final a f23084b = new a();

    /* renamed from: c */
    public final boolean f23085c;

    /* renamed from: s4.c$a */
    public class a implements InterfaceC6395f {

        /* renamed from: a */
        public Object f23086a;

        /* renamed from: b */
        public String f23087b;

        /* renamed from: c */
        public String f23088c;

        /* renamed from: d */
        public Object f23089d;

        public a() {
        }

        @Override // p339s4.InterfaceC6395f
        /* renamed from: a */
        public void mo26698a(Object obj) {
            this.f23086a = obj;
        }

        @Override // p339s4.InterfaceC6395f
        /* renamed from: b */
        public void mo26699b(String str, String str2, Object obj) {
            this.f23087b = str;
            this.f23088c = str2;
            this.f23089d = obj;
        }
    }

    public C6392c(Map map, boolean z6) {
        this.f23083a = map;
        this.f23085c = z6;
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: c */
    public Object mo26710c(String str) {
        return this.f23083a.get(str);
    }

    @Override // p339s4.AbstractC6391b, p339s4.InterfaceC6394e
    /* renamed from: e */
    public boolean mo26702e() {
        return this.f23085c;
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: h */
    public String mo26711h() {
        return (String) this.f23083a.get("method");
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: i */
    public boolean mo26712i(String str) {
        return this.f23083a.containsKey(str);
    }

    @Override // p339s4.AbstractC6390a
    /* renamed from: o */
    public InterfaceC6395f mo26700o() {
        return this.f23084b;
    }

    /* renamed from: p */
    public Map m26713p() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f23084b.f23087b);
        hashMap2.put("message", this.f23084b.f23088c);
        hashMap2.put("data", this.f23084b.f23089d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    /* renamed from: q */
    public Map m26714q() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f23084b.f23086a);
        return hashMap;
    }

    /* renamed from: r */
    public void m26715r(C0659k.d dVar) {
        a aVar = this.f23084b;
        dVar.mo2315b(aVar.f23087b, aVar.f23088c, aVar.f23089d);
    }

    /* renamed from: s */
    public void m26716s(List list) {
        if (mo26702e()) {
            return;
        }
        list.add(m26713p());
    }

    /* renamed from: t */
    public void m26717t(List list) {
        if (mo26702e()) {
            return;
        }
        list.add(m26714q());
    }
}
