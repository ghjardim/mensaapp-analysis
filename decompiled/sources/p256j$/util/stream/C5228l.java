package p256j$.util.stream;

import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.l */
/* loaded from: classes3.dex */
final class C5228l extends AbstractC5243n2 {

    /* renamed from: b */
    public final /* synthetic */ int f18645b = 2;

    /* renamed from: c */
    boolean f18646c;

    /* renamed from: d */
    Object f18647d;

    public /* synthetic */ C5228l(InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5228l(C5112P3 c5112p3, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18647d = c5112p3;
        this.f18646c = true;
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        switch (this.f18645b) {
            case 0:
                this.f18646c = false;
                this.f18647d = null;
                this.f18663a.mo21460l(-1L);
                break;
            case 1:
                this.f18663a.mo21460l(-1L);
                break;
            default:
                this.f18663a.mo21460l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        switch (this.f18645b) {
            case 0:
                InterfaceC5264r2 interfaceC5264r2 = this.f18663a;
                if (obj == null) {
                    if (this.f18646c) {
                        return;
                    }
                    this.f18646c = true;
                    this.f18647d = null;
                    interfaceC5264r2.m21477p((InterfaceC5264r2) null);
                    return;
                }
                Object obj2 = this.f18647d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f18647d = obj;
                    interfaceC5264r2.m21477p((InterfaceC5264r2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C5162a) ((C5271t) this.f18647d).f18701n).apply((C5162a) obj);
                if (stream != null) {
                    try {
                        boolean z6 = this.f18646c;
                        InterfaceC5264r2 interfaceC5264r22 = this.f18663a;
                        if (!z6) {
                            ((Stream) stream.sequential()).forEach(interfaceC5264r22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC5264r22.mo21455n() && spliterator.tryAdvance(interfaceC5264r22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f18646c) {
                    boolean test = ((C5112P3) this.f18647d).f18450m.test(obj);
                    this.f18646c = test;
                    if (test) {
                        this.f18663a.m21477p((InterfaceC5264r2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public boolean mo21455n() {
        switch (this.f18645b) {
            case 1:
                this.f18646c = true;
                return this.f18663a.mo21455n();
            case 2:
                return !this.f18646c || this.f18663a.mo21455n();
            default:
                return super.mo21455n();
        }
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public void mo21459k() {
        switch (this.f18645b) {
            case 0:
                this.f18646c = false;
                this.f18647d = null;
                this.f18663a.mo21459k();
                break;
            default:
                super.mo21459k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5228l(C5271t c5271t, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18647d = c5271t;
    }
}
