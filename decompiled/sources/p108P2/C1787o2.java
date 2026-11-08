package p108P2;

import java.util.List;

/* renamed from: P2.o2 */
/* loaded from: classes.dex */
public final class C1787o2 {

    /* renamed from: g */
    public static final Object f5266g = new Object();

    /* renamed from: a */
    public final String f5267a;

    /* renamed from: b */
    public final InterfaceC1769m2 f5268b;

    /* renamed from: c */
    public final Object f5269c;

    /* renamed from: d */
    public final Object f5270d = new Object();

    /* renamed from: e */
    public volatile Object f5271e = null;

    /* renamed from: f */
    public volatile Object f5272f = null;

    public /* synthetic */ C1787o2(String str, Object obj, Object obj2, InterfaceC1769m2 interfaceC1769m2, AbstractC1796p2 abstractC1796p2) {
        this.f5267a = str;
        this.f5269c = obj;
        this.f5268b = interfaceC1769m2;
    }

    /* renamed from: a */
    public final Object m6159a(Object obj) {
        List<C1787o2> list;
        synchronized (this.f5270d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC1778n2.f5245a == null) {
            return this.f5269c;
        }
        synchronized (f5266g) {
            try {
                if (C1712g.m6076a()) {
                    return this.f5272f == null ? this.f5269c : this.f5272f;
                }
                try {
                    list = AbstractC1805q2.f5368a;
                    for (C1787o2 c1787o2 : list) {
                        if (C1712g.m6076a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            InterfaceC1769m2 interfaceC1769m2 = c1787o2.f5268b;
                            if (interfaceC1769m2 != null) {
                                obj2 = interfaceC1769m2.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f5266g) {
                            c1787o2.f5272f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC1769m2 interfaceC1769m22 = this.f5268b;
                if (interfaceC1769m22 != null) {
                    try {
                        return interfaceC1769m22.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f5269c;
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final String m6160b() {
        return this.f5267a;
    }
}
