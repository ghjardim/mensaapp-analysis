package p256j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.Consumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.p1 */
/* loaded from: classes3.dex */
final class C5253p1 extends AbstractC5258q1 {
    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC5094M0 m21590a;
        if (!m21592c()) {
            return false;
        }
        boolean tryAdvance = this.f18683d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f18682c == null && (m21590a = AbstractC5258q1.m21590a(this.f18684e)) != null) {
                Spliterator spliterator = m21590a.spliterator();
                this.f18683d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f18680a = null;
        }
        return tryAdvance;
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f18680a == null) {
            return;
        }
        if (this.f18683d == null) {
            Spliterator spliterator = this.f18682c;
            if (spliterator == null) {
                ArrayDeque m21591b = m21591b();
                while (true) {
                    InterfaceC5094M0 m21590a = AbstractC5258q1.m21590a(m21591b);
                    if (m21590a != null) {
                        m21590a.forEach(consumer);
                    } else {
                        this.f18680a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
