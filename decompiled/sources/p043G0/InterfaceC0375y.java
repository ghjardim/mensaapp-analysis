package p043G0;

import java.util.List;
import p022D0.InterfaceC0120F;
import p029E0.AbstractC0212e;
import p029E0.InterfaceC0221n;
import p050H0.InterfaceC0536e;
import p232g0.AbstractC4303I;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5346o;

/* renamed from: G0.y */
/* loaded from: classes.dex */
public interface InterfaceC0375y extends InterfaceC0347B {

    /* renamed from: G0.y$a */
    public static final class a {

        /* renamed from: a */
        public final C4304J f1469a;

        /* renamed from: b */
        public final int[] f1470b;

        /* renamed from: c */
        public final int f1471c;

        public a(C4304J c4304j, int... iArr) {
            this(c4304j, iArr, 0);
        }

        public a(C4304J c4304j, int[] iArr, int i7) {
            if (iArr.length == 0) {
                AbstractC5346o.m21863d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f1469a = c4304j;
            this.f1470b = iArr;
            this.f1471c = i7;
        }
    }

    /* renamed from: G0.y$b */
    public interface b {
        /* renamed from: a */
        InterfaceC0375y[] mo1401a(a[] aVarArr, InterfaceC0536e interfaceC0536e, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I);
    }

    /* renamed from: h */
    void mo394h();

    /* renamed from: i */
    boolean mo395i(int i7, long j7);

    /* renamed from: j */
    boolean mo396j(long j7, AbstractC0212e abstractC0212e, List list);

    /* renamed from: k */
    int mo397k();

    /* renamed from: l */
    void mo398l(boolean z6);

    /* renamed from: m */
    void mo399m();

    /* renamed from: n */
    void mo400n(long j7, long j8, long j9, List list, InterfaceC0221n[] interfaceC0221nArr);

    /* renamed from: o */
    int mo401o(long j7, List list);

    /* renamed from: p */
    int mo402p();

    /* renamed from: q */
    C4327q mo403q();

    /* renamed from: r */
    int mo404r();

    /* renamed from: s */
    boolean mo405s(int i7, long j7);

    /* renamed from: t */
    void mo406t(float f7);

    /* renamed from: u */
    Object mo407u();

    /* renamed from: v */
    void mo408v();

    /* renamed from: w */
    void mo409w();
}
