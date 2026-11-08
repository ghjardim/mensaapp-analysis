package p171Y2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Y2.b */
/* loaded from: classes.dex */
public abstract class AbstractC2919b implements Iterator {

    /* renamed from: a */
    public b f8995a = b.NOT_READY;

    /* renamed from: b */
    public Object f8996b;

    /* renamed from: Y2.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8997a;

        static {
            int[] iArr = new int[b.values().length];
            f8997a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8997a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: Y2.b$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract Object mo10507a();

    /* renamed from: c */
    public final Object m10508c() {
        this.f8995a = b.DONE;
        return null;
    }

    /* renamed from: d */
    public final boolean m10509d() {
        this.f8995a = b.FAILED;
        this.f8996b = mo10507a();
        if (this.f8995a == b.DONE) {
            return false;
        }
        this.f8995a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2932o.m10578u(this.f8995a != b.FAILED);
        int i7 = a.f8997a[this.f8995a.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return m10509d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8995a = b.NOT_READY;
        Object m10549a = AbstractC2927j.m10549a(this.f8996b);
        this.f8996b = null;
        return m10549a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
