package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.B1 */
/* loaded from: classes3.dex */
class C5040B1 extends CountedCompleter {

    /* renamed from: a */
    protected final InterfaceC5094M0 f18340a;

    /* renamed from: b */
    protected final int f18341b;

    /* renamed from: c */
    public final /* synthetic */ int f18342c;

    /* renamed from: d */
    private final Object f18343d;

    public C5040B1(InterfaceC5094M0 interfaceC5094M0, Object obj, int i7) {
        this.f18342c = i7;
        this.f18340a = interfaceC5094M0;
        this.f18341b = 0;
        this.f18343d = obj;
    }

    C5040B1(C5040B1 c5040b1, InterfaceC5094M0 interfaceC5094M0, int i7, byte b7) {
        super(c5040b1);
        this.f18340a = interfaceC5094M0;
        this.f18341b = i7;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C5040B1 c5040b1 = this;
        while (c5040b1.f18340a.mo21486q() != 0) {
            c5040b1.setPendingCount(c5040b1.f18340a.mo21486q() - 1);
            int i7 = 0;
            int i8 = 0;
            while (i7 < c5040b1.f18340a.mo21486q() - 1) {
                C5040B1 m21445a = c5040b1.m21445a(i7, c5040b1.f18341b + i8);
                i8 = (int) (i8 + m21445a.f18340a.count());
                m21445a.fork();
                i7++;
            }
            c5040b1 = c5040b1.m21445a(i7, c5040b1.f18341b + i8);
        }
        switch (c5040b1.f18342c) {
            case 0:
                ((InterfaceC5089L0) c5040b1.f18340a).mo21482r(c5040b1.f18341b, c5040b1.f18343d);
                break;
            default:
                c5040b1.f18340a.mo21484i((Object[]) c5040b1.f18343d, c5040b1.f18341b);
                break;
        }
        c5040b1.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5040B1(C5040B1 c5040b1, InterfaceC5094M0 interfaceC5094M0, int i7) {
        this(c5040b1, interfaceC5094M0, i7, (byte) 0);
        this.f18342c = 1;
        this.f18343d = (Object[]) c5040b1.f18343d;
    }

    /* renamed from: a */
    final C5040B1 m21445a(int i7, int i8) {
        switch (this.f18342c) {
            case 0:
                return new C5040B1(this, ((InterfaceC5089L0) this.f18340a).mo21478b(i7), i8);
            default:
                return new C5040B1(this, this.f18340a.mo21478b(i7), i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5040B1(C5040B1 c5040b1, InterfaceC5089L0 interfaceC5089L0, int i7) {
        this(c5040b1, interfaceC5089L0, i7, (byte) 0);
        this.f18342c = 0;
        this.f18343d = c5040b1.f18343d;
    }
}
