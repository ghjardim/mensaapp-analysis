package p081L3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p067J3.C0747h0;
import p081L3.InterfaceC1096m;
import p088M3.AbstractC1175q;
import p088M3.C1179u;
import p116Q3.AbstractC2133b;
import p376x3.AbstractC6948c;

/* renamed from: L3.X */
/* loaded from: classes.dex */
public class C1054X implements InterfaceC1096m {

    /* renamed from: a */
    public final a f3478a = new a();

    /* renamed from: L3.X$a */
    public static class a {

        /* renamed from: a */
        public final HashMap f3479a = new HashMap();

        /* renamed from: a */
        public boolean m4159a(C1179u c1179u) {
            AbstractC2133b.m7217d(c1179u.m4471q() % 2 == 1, "Expected a collection path.", new Object[0]);
            String m4467l = c1179u.m4467l();
            C1179u c1179u2 = (C1179u) c1179u.m4473s();
            HashSet hashSet = (HashSet) this.f3479a.get(m4467l);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f3479a.put(m4467l, hashSet);
            }
            return hashSet.add(c1179u2);
        }

        /* renamed from: b */
        public List m4160b(String str) {
            HashSet hashSet = (HashSet) this.f3479a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: c */
    public Collection mo3963c() {
        return Collections.emptyList();
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: d */
    public String mo3964d() {
        return null;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: e */
    public List mo3965e(String str) {
        return this.f3478a.m4160b(str);
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: g */
    public AbstractC1175q.a mo3967g(C0747h0 c0747h0) {
        return AbstractC1175q.a.f3767a;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: i */
    public InterfaceC1096m.a mo3969i(C0747h0 c0747h0) {
        return InterfaceC1096m.a.NONE;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: j */
    public void mo3970j(C1179u c1179u) {
        this.f3478a.m4159a(c1179u);
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: k */
    public AbstractC1175q.a mo3971k(String str) {
        return AbstractC1175q.a.f3767a;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: l */
    public List mo3972l(C0747h0 c0747h0) {
        return null;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: f */
    public void mo3966f() {
    }

    @Override // p081L3.InterfaceC1096m
    public void start() {
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: b */
    public void mo3962b(AbstractC1175q abstractC1175q) {
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: h */
    public void mo3968h(AbstractC1175q abstractC1175q) {
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: m */
    public void mo3973m(C0747h0 c0747h0) {
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: n */
    public void mo3974n(AbstractC6948c abstractC6948c) {
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: a */
    public void mo3961a(String str, AbstractC1175q.a aVar) {
    }
}
