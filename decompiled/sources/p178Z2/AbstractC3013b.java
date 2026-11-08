package p178Z2;

import java.util.NoSuchElementException;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.b */
/* loaded from: classes.dex */
public abstract class AbstractC3013b extends AbstractC3010Y {

    /* renamed from: a */
    public b f9222a = b.NOT_READY;

    /* renamed from: b */
    public Object f9223b;

    /* renamed from: Z2.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9224a;

        static {
            int[] iArr = new int[b.values().length];
            f9224a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9224a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: Z2.b$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract Object mo10778a();

    /* renamed from: c */
    public final Object m10887c() {
        this.f9222a = b.DONE;
        return null;
    }

    /* renamed from: d */
    public final boolean m10888d() {
        this.f9222a = b.FAILED;
        this.f9223b = mo10778a();
        if (this.f9222a == b.DONE) {
            return false;
        }
        this.f9222a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2932o.m10578u(this.f9222a != b.FAILED);
        int i7 = a.f9224a[this.f9222a.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return m10888d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9222a = b.NOT_READY;
        Object m10836a = AbstractC2997K.m10836a(this.f9223b);
        this.f9223b = null;
        return m10836a;
    }
}
