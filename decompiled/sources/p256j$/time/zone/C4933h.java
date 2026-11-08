package p256j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* renamed from: j$.time.zone.h */
/* loaded from: classes3.dex */
final class C4933h implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ ArrayList f18130a;

    C4933h(ArrayList arrayList) {
        this.f18130a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                AbstractC4935j abstractC4935j = (AbstractC4935j) AbstractC4935j.class.cast(Class.forName(property, true, AbstractC4935j.class.getClassLoader()).newInstance());
                AbstractC4935j.m21253d(abstractC4935j);
                this.f18130a.add(abstractC4935j);
                return null;
            } catch (Exception e7) {
                throw new Error(e7);
            }
        }
        AbstractC4935j.m21253d(new C4934i());
        return null;
    }
}
