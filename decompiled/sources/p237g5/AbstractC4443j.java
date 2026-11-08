package p237g5;

import java.util.Iterator;
import java.util.List;
import p171Y2.AbstractC2932o;
import p207d.AbstractC4094d;
import p237g5.AbstractC4437g;

/* renamed from: g5.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4443j {

    /* renamed from: a */
    public static final AbstractC4437g f15783a = new a();

    /* renamed from: g5.j$b */
    public static class b extends AbstractC4431d {

        /* renamed from: a */
        public final AbstractC4431d f15784a;

        public /* synthetic */ b(AbstractC4431d abstractC4431d, InterfaceC4439h interfaceC4439h, AbstractC4441i abstractC4441i) {
            this(abstractC4431d, interfaceC4439h);
        }

        @Override // p237g5.AbstractC4431d
        /* renamed from: a */
        public String mo18909a() {
            return this.f15784a.mo18909a();
        }

        @Override // p237g5.AbstractC4431d
        /* renamed from: h */
        public AbstractC4437g mo18910h(C4426a0 c4426a0, C4429c c4429c) {
            throw null;
        }

        public b(AbstractC4431d abstractC4431d, InterfaceC4439h interfaceC4439h) {
            this.f15784a = abstractC4431d;
            AbstractC4094d.m17162a(AbstractC2932o.m10573p(interfaceC4439h, "interceptor"));
        }
    }

    /* renamed from: a */
    public static AbstractC4431d m18927a(AbstractC4431d abstractC4431d, List list) {
        AbstractC2932o.m10573p(abstractC4431d, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4094d.m17162a(it.next());
            AbstractC4441i abstractC4441i = null;
            abstractC4431d = new b(abstractC4431d, abstractC4441i, abstractC4441i);
        }
        return abstractC4431d;
    }

    /* renamed from: g5.j$a */
    public class a extends AbstractC4437g {
        @Override // p237g5.AbstractC4437g
        /* renamed from: b */
        public void mo6932b() {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: c */
        public void mo18625c(int i7) {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: d */
        public void mo18626d(Object obj) {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: a */
        public void mo18624a(String str, Throwable th) {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: e */
        public void mo18627e(AbstractC4437g.a aVar, C4424Z c4424z) {
        }
    }
}
