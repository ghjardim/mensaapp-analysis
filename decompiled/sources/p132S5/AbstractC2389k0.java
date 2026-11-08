package p132S5;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p392z5.AbstractC7154b;
import p392z5.InterfaceC7161i;

/* renamed from: S5.k0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2389k0 extends AbstractC2328G implements Closeable {

    /* renamed from: c */
    public static final a f7136c = new a(null);

    /* renamed from: S5.k0$a */
    public static final class a extends AbstractC7154b {

        /* renamed from: S5.k0$a$a, reason: collision with other inner class name */
        public static final class C7186a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public static final C7186a f7137a = new C7186a();

            public C7186a() {
                super(1);
            }

            @Override // p069J5.InterfaceC0800l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2389k0 invoke(InterfaceC7161i.b bVar) {
                if (bVar instanceof AbstractC2389k0) {
                    return (AbstractC2389k0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
            super(AbstractC2328G.f7063b, C7186a.f7137a);
        }
    }
}
