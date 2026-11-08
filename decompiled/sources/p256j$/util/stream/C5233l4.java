package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import p256j$.util.Spliterator;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.l4 */
/* loaded from: classes3.dex */
final class C5233l4 extends AbstractC5239m4 implements Consumer {

    /* renamed from: e */
    final Predicate f18651e;

    /* renamed from: f */
    Object f18652f;

    /* renamed from: g */
    public final /* synthetic */ int f18653g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5233l4(Spliterator spliterator, Predicate predicate, int i7) {
        super(spliterator);
        this.f18653g = i7;
        this.f18651e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5233l4(Spliterator spliterator, C5233l4 c5233l4, int i7) {
        super(spliterator, c5233l4);
        this.f18653g = i7;
        this.f18651e = c5233l4.f18651e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18661d = (this.f18661d + 1) & 63;
        this.f18652f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r6.f18659b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r7.accept(r6.f18652f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r2;
     */
    @Override // p256j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdvance(java.util.function.Consumer r7) {
        /*
            r6 = this;
            int r0 = r6.f18653g
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            boolean r0 = r6.f18660c
            r1 = 1
            if (r0 == 0) goto L28
            boolean r0 = r6.m21581b()
            if (r0 == 0) goto L28
            j$.util.Spliterator r0 = r6.f18658a
            boolean r0 = r0.tryAdvance(r6)
            if (r0 == 0) goto L28
            java.util.function.Predicate r0 = r6.f18651e
            java.lang.Object r2 = r6.f18652f
            boolean r0 = r0.test(r2)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r6.f18652f
            r7.accept(r0)
            goto L34
        L28:
            r0 = r1
        L29:
            r7 = 0
            r6.f18660c = r7
            if (r0 != 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f18659b
            r0.set(r1)
        L33:
            r1 = r7
        L34:
            return r1
        L35:
            boolean r0 = r6.f18660c
            j$.util.Spliterator r1 = r6.f18658a
            if (r0 == 0) goto L66
            r0 = 0
            r6.f18660c = r0
        L3e:
            boolean r2 = r1.tryAdvance(r6)
            r3 = 1
            if (r2 == 0) goto L57
            boolean r4 = r6.m21581b()
            if (r4 == 0) goto L57
            java.util.function.Predicate r4 = r6.f18651e
            java.lang.Object r5 = r6.f18652f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L57
            r0 = r3
            goto L3e
        L57:
            if (r2 == 0) goto L6a
            if (r0 == 0) goto L60
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f18659b
            r0.set(r3)
        L60:
            java.lang.Object r0 = r6.f18652f
            r7.accept(r0)
            goto L6a
        L66:
            boolean r2 = r1.tryAdvance(r7)
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.stream.C5233l4.tryAdvance(java.util.function.Consumer):boolean");
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f18653g) {
            case 1:
                if (!this.f18659b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5239m4
    /* renamed from: c */
    final Spliterator mo21566c(Spliterator spliterator) {
        switch (this.f18653g) {
            case 0:
                return new C5233l4(spliterator, this, 0);
            default:
                return new C5233l4(spliterator, this, 1);
        }
    }
}
