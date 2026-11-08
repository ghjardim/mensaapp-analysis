package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C3257C;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.F */
/* loaded from: classes.dex */
public final class C3260F implements InterfaceC3259E {
    /* renamed from: i */
    public static int m12086i(int i7, Object obj, Object obj2) {
        C3258D c3258d = (C3258D) obj;
        C3257C c3257c = (C3257C) obj2;
        int i8 = 0;
        if (c3258d.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c3258d.entrySet()) {
            i8 += c3257c.m12065a(i7, entry.getKey(), entry.getValue());
        }
        return i8;
    }

    /* renamed from: j */
    public static C3258D m12087j(Object obj, Object obj2) {
        C3258D c3258d = (C3258D) obj;
        C3258D c3258d2 = (C3258D) obj2;
        if (!c3258d2.isEmpty()) {
            if (!c3258d.m12074i()) {
                c3258d = c3258d.m12077l();
            }
            c3258d.m12076k(c3258d2);
        }
        return c3258d;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: a */
    public Object mo12078a(Object obj, Object obj2) {
        return m12087j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: b */
    public Object mo12079b(Object obj) {
        ((C3258D) obj).m12075j();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: c */
    public C3257C.a mo12080c(Object obj) {
        return ((C3257C) obj).m12066c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: d */
    public Map mo12081d(Object obj) {
        return (C3258D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: e */
    public Object mo12082e(Object obj) {
        return C3258D.m12070d().m12077l();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: f */
    public int mo12083f(int i7, Object obj, Object obj2) {
        return m12086i(i7, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: g */
    public boolean mo12084g(Object obj) {
        return !((C3258D) obj).m12074i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3259E
    /* renamed from: h */
    public Map mo12085h(Object obj) {
        return (C3258D) obj;
    }
}
