package p118Q5;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0023b;
import p069J5.InterfaceC0804p;

/* renamed from: Q5.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2213f {

    /* renamed from: Q5.f$a */
    public static final class a implements InterfaceC2210c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0804p f6791a;

        public a(InterfaceC0804p interfaceC0804p) {
            this.f6791a = interfaceC0804p;
        }

        @Override // p118Q5.InterfaceC2210c
        public Iterator iterator() {
            return AbstractC2213f.m7615a(this.f6791a);
        }
    }

    /* renamed from: a */
    public static Iterator m7615a(InterfaceC0804p block) {
        AbstractC5469l.m23028e(block, "block");
        C2211d c2211d = new C2211d();
        c2211d.m7614e(AbstractC0023b.m72a(block, c2211d, c2211d));
        return c2211d;
    }

    /* renamed from: b */
    public static InterfaceC2210c m7616b(InterfaceC0804p block) {
        AbstractC5469l.m23028e(block, "block");
        return new a(block);
    }
}
