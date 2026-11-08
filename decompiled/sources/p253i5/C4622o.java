package p253i5;

import java.text.MessageFormat;
import java.util.logging.Level;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4435f;
import p237g5.C4405F;
import p237g5.C4410K;

/* renamed from: i5.o */
/* loaded from: classes2.dex */
public final class C4622o extends AbstractC4435f {

    /* renamed from: a */
    public final C4624p f17145a;

    /* renamed from: b */
    public final InterfaceC4581S0 f17146b;

    /* renamed from: i5.o$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17147a;

        static {
            int[] iArr = new int[AbstractC4435f.a.values().length];
            f17147a = iArr;
            try {
                iArr[AbstractC4435f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17147a[AbstractC4435f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17147a[AbstractC4435f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4622o(C4624p c4624p, InterfaceC4581S0 interfaceC4581S0) {
        this.f17145a = (C4624p) AbstractC2932o.m10573p(c4624p, "tracer");
        this.f17146b = (InterfaceC4581S0) AbstractC2932o.m10573p(interfaceC4581S0, "time");
    }

    /* renamed from: d */
    public static void m20051d(C4410K c4410k, AbstractC4435f.a aVar, String str) {
        Level m20053f = m20053f(aVar);
        if (C4624p.f17159f.isLoggable(m20053f)) {
            C4624p.m20060d(c4410k, m20053f, str);
        }
    }

    /* renamed from: e */
    public static void m20052e(C4410K c4410k, AbstractC4435f.a aVar, String str, Object... objArr) {
        Level m20053f = m20053f(aVar);
        if (C4624p.f17159f.isLoggable(m20053f)) {
            C4624p.m20060d(c4410k, m20053f, MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: f */
    public static Level m20053f(AbstractC4435f.a aVar) {
        int i7 = a.f17147a[aVar.ordinal()];
        return (i7 == 1 || i7 == 2) ? Level.FINE : i7 != 3 ? Level.FINEST : Level.FINER;
    }

    /* renamed from: g */
    public static C4405F.b m20054g(AbstractC4435f.a aVar) {
        int i7 = a.f17147a[aVar.ordinal()];
        return i7 != 1 ? i7 != 2 ? C4405F.b.CT_INFO : C4405F.b.CT_WARNING : C4405F.b.CT_ERROR;
    }

    @Override // p237g5.AbstractC4435f
    /* renamed from: a */
    public void mo18924a(AbstractC4435f.a aVar, String str) {
        m20051d(this.f17145a.m20061b(), aVar, str);
        if (m20055c(aVar)) {
            m20056h(aVar, str);
        }
    }

    @Override // p237g5.AbstractC4435f
    /* renamed from: b */
    public void mo18925b(AbstractC4435f.a aVar, String str, Object... objArr) {
        mo18924a(aVar, (m20055c(aVar) || C4624p.f17159f.isLoggable(m20053f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }

    /* renamed from: c */
    public final boolean m20055c(AbstractC4435f.a aVar) {
        return aVar != AbstractC4435f.a.DEBUG && this.f17145a.m20062c();
    }

    /* renamed from: h */
    public final void m20056h(AbstractC4435f.a aVar, String str) {
        if (aVar == AbstractC4435f.a.DEBUG) {
            return;
        }
        this.f17145a.m20064f(new C4405F.a().m18651b(str).m18652c(m20054g(aVar)).m18654e(this.f17146b.mo19625a()).m18650a());
    }
}
