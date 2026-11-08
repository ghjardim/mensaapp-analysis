package p212d4;

import java.util.Iterator;
import java.util.Set;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

/* renamed from: d4.c */
/* loaded from: classes.dex */
public class C4121c implements InterfaceC4127i {

    /* renamed from: a */
    public final String f13829a;

    /* renamed from: b */
    public final C4122d f13830b;

    public C4121c(Set set, C4122d c4122d) {
        this.f13829a = m17306e(set);
        this.f13830b = c4122d;
    }

    /* renamed from: c */
    public static C6755c m17304c() {
        return C6755c.m27718c(InterfaceC4127i.class).m27737b(C6770r.m27801n(AbstractC4124f.class)).m27741f(new InterfaceC6760h() { // from class: d4.b
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                InterfaceC4127i m17305d;
                m17305d = C4121c.m17305d(interfaceC6757e);
                return m17305d;
            }
        }).m27739d();
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC4127i m17305d(InterfaceC6757e interfaceC6757e) {
        return new C4121c(interfaceC6757e.mo27711e(AbstractC4124f.class), C4122d.m17308a());
    }

    /* renamed from: e */
    public static String m17306e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC4124f abstractC4124f = (AbstractC4124f) it.next();
            sb.append(abstractC4124f.mo17301b());
            sb.append('/');
            sb.append(abstractC4124f.mo17302c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p212d4.InterfaceC4127i
    /* renamed from: a */
    public String mo17307a() {
        if (this.f13830b.m17309b().isEmpty()) {
            return this.f13829a;
        }
        return this.f13829a + ' ' + m17306e(this.f13830b.m17309b());
    }
}
