package p244h4;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p362v3.C6755c;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;
import p362v3.InterfaceC6762j;

/* renamed from: h4.b */
/* loaded from: classes.dex */
public class C4488b implements InterfaceC6762j {
    /* renamed from: c */
    public static /* synthetic */ Object m19102c(String str, C6755c c6755c, InterfaceC6757e interfaceC6757e) {
        try {
            AbstractC4489c.m19105b(str);
            return c6755c.m27728h().mo1598a(interfaceC6757e);
        } finally {
            AbstractC4489c.m19104a();
        }
    }

    @Override // p362v3.InterfaceC6762j
    /* renamed from: a */
    public List mo19103a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C6755c c6755c : componentRegistrar.getComponents()) {
            final String m27729i = c6755c.m27729i();
            if (m27729i != null) {
                c6755c = c6755c.m27735t(new InterfaceC6760h() { // from class: h4.a
                    @Override // p362v3.InterfaceC6760h
                    /* renamed from: a */
                    public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                        Object m19102c;
                        m19102c = C4488b.m19102c(m27729i, c6755c, interfaceC6757e);
                        return m19102c;
                    }
                });
            }
            arrayList.add(c6755c);
        }
        return arrayList;
    }
}
