package p256j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class Optional<T> {

    /* renamed from: b */
    private static final Optional f18151b = new Optional();

    /* renamed from: a */
    private final Object f18152a;

    private Optional() {
        this.f18152a = null;
    }

    /* renamed from: a */
    public static Optional m21278a() {
        return f18151b;
    }

    private Optional(Object obj) {
        this.f18152a = Objects.requireNonNull(obj);
    }

    /* renamed from: b */
    public static Optional m21279b(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t7) {
        if (t7 != null) {
            return new Optional<>(t7);
        }
        return f18151b;
    }

    public T get() {
        T t7 = (T) this.f18152a;
        if (t7 != null) {
            return t7;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f18152a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f18152a, ((Optional) obj).f18152a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f18152a);
    }

    public final String toString() {
        Object obj = this.f18152a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
