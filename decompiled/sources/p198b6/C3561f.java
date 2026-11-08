package p198b6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p167X5.AbstractC2843D;
import p167X5.C2846G;
import p392z5.InterfaceC7161i;

/* renamed from: b6.f */
/* loaded from: classes2.dex */
public final class C3561f extends AbstractC2843D {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f12020e;

    public C3561f(long j7, C3561f c3561f, int i7) {
        super(j7, c3561f, i7);
        int i8;
        i8 = AbstractC3560e.f12019f;
        this.f12020e = new AtomicReferenceArray(i8);
    }

    @Override // p167X5.AbstractC2843D
    /* renamed from: r */
    public int mo8866r() {
        int i7;
        i7 = AbstractC3560e.f12019f;
        return i7;
    }

    @Override // p167X5.AbstractC2843D
    /* renamed from: s */
    public void mo8867s(int i7, Throwable th, InterfaceC7161i interfaceC7161i) {
        C2846G c2846g;
        c2846g = AbstractC3560e.f12018e;
        m14381v().set(i7, c2846g);
        m10256t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f8806c + ", hashCode=" + hashCode() + ']';
    }

    /* renamed from: v */
    public final /* synthetic */ AtomicReferenceArray m14381v() {
        return this.f12020e;
    }
}
