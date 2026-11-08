package p210d2;

/* renamed from: d2.b */
/* loaded from: classes.dex */
public abstract class AbstractC4109b {
    /* renamed from: a */
    public static Object m17288a(int i7, Object obj, InterfaceC4108a interfaceC4108a, InterfaceC4110c interfaceC4110c) {
        Object apply;
        if (i7 < 1) {
            return interfaceC4108a.apply(obj);
        }
        do {
            apply = interfaceC4108a.apply(obj);
            obj = interfaceC4110c.mo9117a(obj, apply);
            if (obj == null) {
                break;
            }
            i7--;
        } while (i7 >= 1);
        return apply;
    }
}
