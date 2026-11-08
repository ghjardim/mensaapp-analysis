package p050H0;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p050H0.C0545n;
import p050H0.InterfaceC0544m;
import p232g0.C4295A;
import p276l0.C5494h;
import p276l0.C5503q;
import p276l0.C5506t;

/* renamed from: H0.k */
/* loaded from: classes.dex */
public class C0542k implements InterfaceC0544m {

    /* renamed from: a */
    public final int f1774a;

    public C0542k() {
        this(-1);
    }

    @Override // p050H0.InterfaceC0544m
    /* renamed from: a */
    public InterfaceC0544m.b mo2085a(InterfaceC0544m.a aVar, InterfaceC0544m.c cVar) {
        if (!m2089e(cVar.f1783c)) {
            return null;
        }
        if (aVar.m2091a(1)) {
            return new InterfaceC0544m.b(1, 300000L);
        }
        if (aVar.m2091a(2)) {
            return new InterfaceC0544m.b(2, 60000L);
        }
        return null;
    }

    @Override // p050H0.InterfaceC0544m
    /* renamed from: b */
    public /* synthetic */ void mo2086b(long j7) {
        AbstractC0543l.m2090a(this, j7);
    }

    @Override // p050H0.InterfaceC0544m
    /* renamed from: c */
    public long mo2087c(InterfaceC0544m.c cVar) {
        IOException iOException = cVar.f1783c;
        if ((iOException instanceof C4295A) || (iOException instanceof FileNotFoundException) || (iOException instanceof C5503q) || (iOException instanceof C0545n.h) || C5494h.m23076a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f1784d - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
    }

    @Override // p050H0.InterfaceC0544m
    /* renamed from: d */
    public int mo2088d(int i7) {
        int i8 = this.f1774a;
        return i8 == -1 ? i7 == 7 ? 6 : 3 : i8;
    }

    /* renamed from: e */
    public boolean m2089e(IOException iOException) {
        if (!(iOException instanceof C5506t)) {
            return false;
        }
        int i7 = ((C5506t) iOException).f19849d;
        return i7 == 403 || i7 == 404 || i7 == 410 || i7 == 416 || i7 == 500 || i7 == 503;
    }

    public C0542k(int i7) {
        this.f1774a = i7;
    }
}
