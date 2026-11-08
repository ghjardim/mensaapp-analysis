package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.J3 */
/* loaded from: classes3.dex */
final class C5082J3 extends AbstractC5208h3 {
    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: e */
    final AbstractC5208h3 mo21474e(Spliterator spliterator) {
        return new C5082J3(this.f18610b, spliterator, this.f18609a);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: d */
    final void mo21473d() {
        C5172b3 c5172b3 = new C5172b3();
        this.f18616h = c5172b3;
        Objects.requireNonNull(c5172b3);
        this.f18613e = this.f18610b.m21525W(new C5077I3(c5172b3, 0));
        this.f18614f = new C5162a(5, this);
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean m21563a = m21563a();
        if (m21563a) {
            C5172b3 c5172b3 = (C5172b3) this.f18616h;
            long j7 = this.f18615g;
            if (c5172b3.f18557c != 0) {
                if (j7 >= c5172b3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j7));
                }
                for (int i7 = 0; i7 <= c5172b3.f18557c; i7++) {
                    long j8 = c5172b3.f18558d[i7];
                    Object[] objArr = c5172b3.f18548f[i7];
                    if (j7 < objArr.length + j8) {
                        obj = objArr[(int) (j7 - j8)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j7));
            }
            if (j7 < c5172b3.f18556b) {
                obj = c5172b3.f18547e[(int) j7];
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j7));
            }
            consumer.m21477p(obj);
        }
        return m21563a;
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f18616h == null && !this.f18617i) {
            Objects.requireNonNull(consumer);
            m21564c();
            Objects.requireNonNull(consumer);
            C5077I3 c5077i3 = new C5077I3(consumer, 1);
            this.f18610b.m21524V(this.f18612d, c5077i3);
            this.f18617i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
