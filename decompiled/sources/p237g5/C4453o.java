package p237g5;

import java.util.concurrent.ConcurrentMap;
import p237g5.InterfaceC4447l;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: g5.o */
/* loaded from: classes2.dex */
public final class C4453o {

    /* renamed from: b */
    public static final C4453o f15854b = new C4453o(new InterfaceC4447l.a(), InterfaceC4447l.b.f15793a);

    /* renamed from: a */
    public final ConcurrentMap f15855a = new ConcurrentHashMap();

    public C4453o(InterfaceC4451n... interfaceC4451nArr) {
        for (InterfaceC4451n interfaceC4451n : interfaceC4451nArr) {
            this.f15855a.put(interfaceC4451n.mo18944a(), interfaceC4451n);
        }
    }

    /* renamed from: a */
    public static C4453o m18978a() {
        return f15854b;
    }

    /* renamed from: b */
    public InterfaceC4451n m18979b(String str) {
        return (InterfaceC4451n) this.f15855a.get(str);
    }
}
