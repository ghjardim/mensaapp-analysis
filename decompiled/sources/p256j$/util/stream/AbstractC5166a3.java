package p256j$.util.stream;

import java.util.Arrays;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.a3 */
/* loaded from: classes3.dex */
abstract class AbstractC5166a3 extends AbstractC5180d implements Iterable {

    /* renamed from: e */
    Object f18532e;

    /* renamed from: f */
    Object[] f18533f;

    /* renamed from: c */
    public abstract Object mo21502c(int i7);

    /* renamed from: s */
    protected abstract void mo21503s(Object obj, int i7, int i8, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* renamed from: t */
    protected abstract int mo21504t(Object obj);

    /* renamed from: w */
    protected abstract Object[] mo21505w();

    AbstractC5166a3(int i7) {
        super(i7);
        this.f18532e = mo21502c(1 << this.f18555a);
    }

    AbstractC5166a3() {
        this.f18532e = mo21502c(16);
    }

    /* renamed from: v */
    protected final void m21510v(long j7) {
        long mo21504t;
        int i7 = this.f18557c;
        if (i7 == 0) {
            mo21504t = mo21504t(this.f18532e);
        } else {
            mo21504t = mo21504t(this.f18533f[i7]) + this.f18558d[i7];
        }
        if (j7 > mo21504t) {
            if (this.f18533f == null) {
                Object[] mo21505w = mo21505w();
                this.f18533f = mo21505w;
                this.f18558d = new long[8];
                mo21505w[0] = this.f18532e;
            }
            int i8 = this.f18557c + 1;
            while (j7 > mo21504t) {
                Object[] objArr = this.f18533f;
                if (i8 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f18533f = Arrays.copyOf(objArr, length);
                    this.f18558d = Arrays.copyOf(this.f18558d, length);
                }
                int i9 = this.f18555a;
                if (i8 != 0 && i8 != 1) {
                    i9 = Math.min((i9 + i8) - 1, 30);
                }
                int i10 = 1 << i9;
                this.f18533f[i8] = mo21502c(i10);
                long[] jArr = this.f18558d;
                jArr[i8] = jArr[i8 - 1] + mo21504t(this.f18533f[r6]);
                mo21504t += i10;
                i8++;
            }
        }
    }

    /* renamed from: u */
    protected final int m21509u(long j7) {
        if (this.f18557c == 0) {
            if (j7 < this.f18556b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j7));
        }
        if (j7 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j7));
        }
        for (int i7 = 0; i7 <= this.f18557c; i7++) {
            if (j7 < this.f18558d[i7] + mo21504t(this.f18533f[i7])) {
                return i7;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j7));
    }

    /* renamed from: r */
    public void mo21482r(int i7, Object obj) {
        long j7 = i7;
        long count = count() + j7;
        if (count > mo21504t(obj) || count < j7) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f18557c == 0) {
            System.arraycopy(this.f18532e, 0, obj, i7, this.f18556b);
            return;
        }
        for (int i8 = 0; i8 < this.f18557c; i8++) {
            Object obj2 = this.f18533f[i8];
            System.arraycopy(obj2, 0, obj, i7, mo21504t(obj2));
            i7 += mo21504t(this.f18533f[i8]);
        }
        int i9 = this.f18556b;
        if (i9 > 0) {
            System.arraycopy(this.f18532e, 0, obj, i7, i9);
        }
    }

    /* renamed from: d */
    public Object mo21480d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object mo21502c = mo21502c((int) count);
        mo21482r(0, mo21502c);
        return mo21502c;
    }

    /* renamed from: x */
    protected final void m21511x() {
        long mo21504t;
        if (this.f18556b == mo21504t(this.f18532e)) {
            if (this.f18533f == null) {
                Object[] mo21505w = mo21505w();
                this.f18533f = mo21505w;
                this.f18558d = new long[8];
                mo21505w[0] = this.f18532e;
            }
            int i7 = this.f18557c;
            int i8 = i7 + 1;
            Object[] objArr = this.f18533f;
            if (i8 >= objArr.length || objArr[i8] == null) {
                if (i7 == 0) {
                    mo21504t = mo21504t(this.f18532e);
                } else {
                    mo21504t = mo21504t(objArr[i7]) + this.f18558d[i7];
                }
                m21510v(mo21504t + 1);
            }
            this.f18556b = 0;
            int i9 = this.f18557c + 1;
            this.f18557c = i9;
            this.f18532e = this.f18533f[i9];
        }
    }

    @Override // p256j$.util.stream.AbstractC5180d
    public final void clear() {
        Object[] objArr = this.f18533f;
        if (objArr != null) {
            this.f18532e = objArr[0];
            this.f18533f = null;
            this.f18558d = null;
        }
        this.f18556b = 0;
        this.f18557c = 0;
    }

    /* renamed from: e */
    public void mo21481e(Object obj) {
        for (int i7 = 0; i7 < this.f18557c; i7++) {
            Object obj2 = this.f18533f[i7];
            mo21503s(obj2, 0, mo21504t(obj2), obj);
        }
        mo21503s(this.f18532e, 0, this.f18556b, obj);
    }
}
