package p104O5;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7022m;

/* renamed from: O5.b */
/* loaded from: classes2.dex */
public final class C1415b extends AbstractC7022m {

    /* renamed from: a */
    public final int f4459a;

    /* renamed from: b */
    public final int f4460b;

    /* renamed from: c */
    public boolean f4461c;

    /* renamed from: d */
    public int f4462d;

    public C1415b(char c7, char c8, int i7) {
        this.f4459a = i7;
        this.f4460b = c8;
        boolean z6 = false;
        if (i7 <= 0 ? AbstractC5469l.m23029f(c7, c8) >= 0 : AbstractC5469l.m23029f(c7, c8) <= 0) {
            z6 = true;
        }
        this.f4461c = z6;
        this.f4462d = z6 ? c7 : c8;
    }

    @Override // p378x5.AbstractC7022m
    /* renamed from: a */
    public char mo5517a() {
        int i7 = this.f4462d;
        if (i7 != this.f4460b) {
            this.f4462d = this.f4459a + i7;
        } else {
            if (!this.f4461c) {
                throw new NoSuchElementException();
            }
            this.f4461c = false;
        }
        return (char) i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4461c;
    }
}
