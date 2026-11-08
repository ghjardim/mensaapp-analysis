package p256j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.d */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4994d {
    /* renamed from: m */
    public static Optional m21355m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    /* renamed from: i */
    public static Optional m21351i(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.m21279b(optional.get());
        }
        return Optional.m21278a();
    }

    /* renamed from: n */
    public static OptionalDouble m21356n(C4938C c4938c) {
        if (c4938c == null) {
            return null;
        }
        if (c4938c.m21258c()) {
            return OptionalDouble.of(c4938c.m21257b());
        }
        return OptionalDouble.empty();
    }

    /* renamed from: j */
    public static C4938C m21352j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return C4938C.m21256d(optionalDouble.getAsDouble());
        }
        return C4938C.m21255a();
    }

    /* renamed from: p */
    public static OptionalLong m21358p(C4940E c4940e) {
        if (c4940e == null) {
            return null;
        }
        if (c4940e.m21270c()) {
            return OptionalLong.of(c4940e.m21269b());
        }
        return OptionalLong.empty();
    }

    /* renamed from: l */
    public static C4940E m21354l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return C4940E.m21268d(optionalLong.getAsLong());
        }
        return C4940E.m21267a();
    }

    /* renamed from: o */
    public static OptionalInt m21357o(C4939D c4939d) {
        if (c4939d == null) {
            return null;
        }
        if (c4939d.m21266c()) {
            return OptionalInt.of(c4939d.m21265b());
        }
        return OptionalInt.empty();
    }

    /* renamed from: k */
    public static C4939D m21353k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return C4939D.m21264d(optionalInt.getAsInt());
        }
        return C4939D.m21263a();
    }

    /* renamed from: q */
    public static void m21359q(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC4936A) {
            ((InterfaceC4936A) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    /* renamed from: r */
    public static C4965c m21360r(Comparator comparator, Comparator comparator2) {
        Objects.requireNonNull(comparator2);
        return new C4965c((EnumC4998f) ((InterfaceC4996e) comparator), comparator2, 0);
    }

    /* renamed from: d */
    public static long m21346d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    /* renamed from: e */
    public static boolean m21347e(Spliterator spliterator, int i7) {
        return (spliterator.characteristics() & i7) == i7;
    }

    /* renamed from: g */
    public static boolean m21349g(InterfaceC4960Z interfaceC4960Z, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC4960Z.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(interfaceC4960Z.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return interfaceC4960Z.tryAdvance((IntConsumer) new C4945J(consumer));
    }

    /* renamed from: b */
    public static void m21344b(InterfaceC4960Z interfaceC4960Z, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC4960Z.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC5311v0.f18756a) {
                AbstractC5311v0.m21606a(interfaceC4960Z.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            interfaceC4960Z.forEachRemaining((IntConsumer) new C4945J(consumer));
        }
    }

    /* renamed from: h */
    public static boolean m21350h(InterfaceC4966c0 interfaceC4966c0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC4966c0.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(interfaceC4966c0.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return interfaceC4966c0.tryAdvance((LongConsumer) new C4949N(consumer));
    }

    /* renamed from: c */
    public static void m21345c(InterfaceC4966c0 interfaceC4966c0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC4966c0.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC5311v0.f18756a) {
                AbstractC5311v0.m21606a(interfaceC4966c0.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            interfaceC4966c0.forEachRemaining((LongConsumer) new C4949N(consumer));
        }
    }

    /* renamed from: f */
    public static boolean m21348f(InterfaceC4957W interfaceC4957W, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC4957W.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(interfaceC4957W.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return interfaceC4957W.tryAdvance((DoubleConsumer) new C4941F(consumer));
    }

    /* renamed from: a */
    public static void m21343a(InterfaceC4957W interfaceC4957W, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC4957W.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC5311v0.f18756a) {
                AbstractC5311v0.m21606a(interfaceC4957W.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            interfaceC4957W.forEachRemaining((DoubleConsumer) new C4941F(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
