package p212d4;

import android.content.Context;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

/* renamed from: d4.h */
/* loaded from: classes.dex */
public abstract class AbstractC4126h {

    /* renamed from: d4.h$a */
    public interface a {
        /* renamed from: a */
        String mo17316a(Object obj);
    }

    /* renamed from: b */
    public static C6755c m17313b(String str, String str2) {
        return C6755c.m27722l(AbstractC4124f.m17311a(str, str2), AbstractC4124f.class);
    }

    /* renamed from: c */
    public static C6755c m17314c(final String str, final a aVar) {
        return C6755c.m27723m(AbstractC4124f.class).m27737b(C6770r.m27798k(Context.class)).m27741f(new InterfaceC6760h() { // from class: d4.g
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                AbstractC4124f m17315d;
                m17315d = AbstractC4126h.m17315d(str, aVar, interfaceC6757e);
                return m17315d;
            }
        }).m27739d();
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC4124f m17315d(String str, a aVar, InterfaceC6757e interfaceC6757e) {
        return AbstractC4124f.m17311a(str, aVar.mo17316a((Context) interfaceC6757e.mo27707a(Context.class)));
    }
}
