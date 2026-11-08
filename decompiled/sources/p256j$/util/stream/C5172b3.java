package p256j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.b3 */
/* loaded from: classes3.dex */
class C5172b3 extends AbstractC5180d implements Consumer, Iterable {

    /* renamed from: e */
    protected Object[] f18547e = new Object[1 << 4];

    /* renamed from: f */
    protected Object[][] f18548f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    C5172b3() {
    }

    /* renamed from: s */
    protected final void m21538s(long j7) {
        long length;
        int i7 = this.f18557c;
        if (i7 == 0) {
            length = this.f18547e.length;
        } else {
            length = this.f18558d[i7] + this.f18548f[i7].length;
        }
        if (j7 > length) {
            if (this.f18548f == null) {
                Object[][] objArr = new Object[8][];
                this.f18548f = objArr;
                this.f18558d = new long[8];
                objArr[0] = this.f18547e;
            }
            int i8 = i7 + 1;
            while (j7 > length) {
                Object[][] objArr2 = this.f18548f;
                if (i8 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f18548f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f18558d = Arrays.copyOf(this.f18558d, length2);
                }
                int i9 = this.f18555a;
                if (i8 != 0 && i8 != 1) {
                    i9 = Math.min((i9 + i8) - 1, 30);
                }
                int i10 = 1 << i9;
                this.f18548f[i8] = new Object[i10];
                long[] jArr = this.f18558d;
                jArr[i8] = jArr[i8 - 1] + r5[r7].length;
                length += i10;
                i8++;
            }
        }
    }

    @Override // p256j$.util.stream.AbstractC5180d
    public final void clear() {
        Object[][] objArr = this.f18548f;
        if (objArr != null) {
            this.f18547e = objArr[0];
            int i7 = 0;
            while (true) {
                Object[] objArr2 = this.f18547e;
                if (i7 >= objArr2.length) {
                    break;
                }
                objArr2[i7] = null;
                i7++;
            }
            this.f18548f = null;
            this.f18558d = null;
        } else {
            for (int i8 = 0; i8 < this.f18556b; i8++) {
                this.f18547e[i8] = null;
            }
        }
        this.f18556b = 0;
        this.f18557c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m21289i(spliterator());
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i7 = 0; i7 < this.f18557c; i7++) {
            for (Object obj : this.f18548f[i7]) {
                consumer.accept(obj);
            }
        }
        for (int i8 = 0; i8 < this.f18556b; i8++) {
            consumer.accept(this.f18547e[i8]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i7 = this.f18556b;
        Object[] objArr = this.f18547e;
        if (i7 == objArr.length) {
            if (this.f18548f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f18548f = objArr2;
                this.f18558d = new long[8];
                objArr2[0] = objArr;
            }
            int i8 = this.f18557c;
            int i9 = i8 + 1;
            Object[][] objArr3 = this.f18548f;
            if (i9 >= objArr3.length || objArr3[i9] == null) {
                if (i8 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i8].length + this.f18558d[i8];
                }
                m21538s(length + 1);
            }
            this.f18556b = 0;
            int i10 = this.f18557c + 1;
            this.f18557c = i10;
            this.f18547e = this.f18548f[i10];
        }
        Object[] objArr4 = this.f18547e;
        int i11 = this.f18556b;
        this.f18556b = i11 + 1;
        objArr4[i11] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C5162a(10, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public p256j$.util.Spliterator spliterator() {
        return new C5125S2(this, 0, this.f18557c, 0, this.f18556b);
    }
}
