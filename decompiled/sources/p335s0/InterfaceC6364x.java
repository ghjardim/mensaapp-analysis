package p335s0;

import android.os.Looper;
import p232g0.C4327q;
import p300o0.C5912w1;
import p335s0.InterfaceC6354n;
import p335s0.InterfaceC6362v;

/* renamed from: s0.x */
/* loaded from: classes.dex */
public interface InterfaceC6364x {

    /* renamed from: a */
    public static final InterfaceC6364x f23018a = new a();

    /* renamed from: s0.x$b */
    public interface b {

        /* renamed from: a */
        public static final b f23019a = new b() { // from class: s0.y
            @Override // p335s0.InterfaceC6364x.b
            public final void release() {
                AbstractC6366z.m26656a();
            }
        };

        void release();
    }

    /* renamed from: a */
    b mo26605a(InterfaceC6362v.a aVar, C4327q c4327q);

    /* renamed from: b */
    InterfaceC6354n mo26606b(InterfaceC6362v.a aVar, C4327q c4327q);

    /* renamed from: c */
    void mo26607c(Looper looper, C5912w1 c5912w1);

    /* renamed from: d */
    int mo26608d(C4327q c4327q);

    /* renamed from: f */
    void mo26609f();

    void release();

    /* renamed from: s0.x$a */
    public class a implements InterfaceC6364x {
        @Override // p335s0.InterfaceC6364x
        /* renamed from: a */
        public /* synthetic */ b mo26605a(InterfaceC6362v.a aVar, C4327q c4327q) {
            return AbstractC6363w.m26653a(this, aVar, c4327q);
        }

        @Override // p335s0.InterfaceC6364x
        /* renamed from: b */
        public InterfaceC6354n mo26606b(InterfaceC6362v.a aVar, C4327q c4327q) {
            if (c4327q.f15142r == null) {
                return null;
            }
            return new C6324D(new InterfaceC6354n.a(new C6339T(1), 6001));
        }

        @Override // p335s0.InterfaceC6364x
        /* renamed from: d */
        public int mo26608d(C4327q c4327q) {
            return c4327q.f15142r != null ? 1 : 0;
        }

        @Override // p335s0.InterfaceC6364x
        /* renamed from: f */
        public /* synthetic */ void mo26609f() {
            AbstractC6363w.m26654b(this);
        }

        @Override // p335s0.InterfaceC6364x
        public /* synthetic */ void release() {
            AbstractC6363w.m26655c(this);
        }

        @Override // p335s0.InterfaceC6364x
        /* renamed from: c */
        public void mo26607c(Looper looper, C5912w1 c5912w1) {
        }
    }
}
