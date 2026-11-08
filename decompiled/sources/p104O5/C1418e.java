package p104O5;

import java.util.NoSuchElementException;
import p378x5.AbstractC7002B;

/* renamed from: O5.e */
/* loaded from: classes2.dex */
public final class C1418e extends AbstractC7002B {

    /* renamed from: a */
    public final int f4469a;

    /* renamed from: b */
    public final int f4470b;

    /* renamed from: c */
    public boolean f4471c;

    /* renamed from: d */
    public int f4472d;

    public C1418e(int i7, int i8, int i9) {
        this.f4469a = i9;
        this.f4470b = i8;
        boolean z6 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z6 = true;
        }
        this.f4471c = z6;
        this.f4472d = z6 ? i7 : i8;
    }

    @Override // p378x5.AbstractC7002B
    /* renamed from: a */
    public int mo5523a() {
        int i7 = this.f4472d;
        if (i7 != this.f4470b) {
            this.f4472d = this.f4469a + i7;
        } else {
            if (!this.f4471c) {
                throw new NoSuchElementException();
            }
            this.f4471c = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4471c;
    }
}
