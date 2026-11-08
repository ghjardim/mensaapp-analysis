package p118Q5;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;

/* renamed from: Q5.i */
/* loaded from: classes2.dex */
public abstract class AbstractC2216i extends AbstractC2214g {

    /* renamed from: Q5.i$a */
    public static final class a implements InterfaceC2210c {

        /* renamed from: a */
        public final /* synthetic */ Iterator f6793a;

        public a(Iterator it) {
            this.f6793a = it;
        }

        @Override // p118Q5.InterfaceC2210c
        public Iterator iterator() {
            return this.f6793a;
        }
    }

    /* renamed from: d */
    public static InterfaceC2210c m7618d(Iterator it) {
        AbstractC5469l.m23028e(it, "<this>");
        return m7619e(new a(it));
    }

    /* renamed from: e */
    public static final InterfaceC2210c m7619e(InterfaceC2210c interfaceC2210c) {
        AbstractC5469l.m23028e(interfaceC2210c, "<this>");
        return interfaceC2210c instanceof C2208a ? interfaceC2210c : new C2208a(interfaceC2210c);
    }

    /* renamed from: f */
    public static InterfaceC2210c m7620f(final InterfaceC0789a nextFunction) {
        AbstractC5469l.m23028e(nextFunction, "nextFunction");
        return m7619e(new C2209b(nextFunction, new InterfaceC0800l() { // from class: Q5.h
            @Override // p069J5.InterfaceC0800l
            public final Object invoke(Object obj) {
                Object m7621g;
                m7621g = AbstractC2216i.m7621g(InterfaceC0789a.this, obj);
                return m7621g;
            }
        }));
    }

    /* renamed from: g */
    public static final Object m7621g(InterfaceC0789a interfaceC0789a, Object it) {
        AbstractC5469l.m23028e(it, "it");
        return interfaceC0789a.invoke();
    }
}
