package p167X5;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p104O5.AbstractC1421h;

/* renamed from: X5.B */
/* loaded from: classes2.dex */
public final class C2841B {
    private volatile AtomicReferenceArray<Object> array;

    public C2841B(int i7) {
        this.array = new AtomicReferenceArray<>(i7);
    }

    /* renamed from: a */
    public final int m10250a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m10251b(int i7) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i7 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i7);
        }
        return null;
    }

    /* renamed from: c */
    public final void m10252c(int i7, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i7 < length) {
            atomicReferenceArray.set(i7, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(AbstractC1421h.m5528a(i7 + 1, length * 2));
        for (int i8 = 0; i8 < length; i8++) {
            atomicReferenceArray2.set(i8, atomicReferenceArray.get(i8));
        }
        atomicReferenceArray2.set(i7, obj);
        this.array = atomicReferenceArray2;
    }
}
