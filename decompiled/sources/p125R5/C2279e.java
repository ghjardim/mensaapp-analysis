package p125R5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p076K5.InterfaceC0834a;

/* renamed from: R5.e */
/* loaded from: classes2.dex */
public final class C2279e implements Iterator, InterfaceC0834a {

    /* renamed from: f */
    public static final a f6937f = new a(null);

    /* renamed from: a */
    public final CharSequence f6938a;

    /* renamed from: b */
    public int f6939b;

    /* renamed from: c */
    public int f6940c;

    /* renamed from: d */
    public int f6941d;

    /* renamed from: e */
    public int f6942e;

    /* renamed from: R5.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C2279e(CharSequence string) {
        AbstractC5469l.m23028e(string, "string");
        this.f6938a = string;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6939b = 0;
        int i7 = this.f6941d;
        int i8 = this.f6940c;
        this.f6940c = this.f6942e + i7;
        return this.f6938a.subSequence(i8, i7).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i7;
        int i8;
        int i9 = this.f6939b;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f6942e < 0) {
            this.f6939b = 2;
            return false;
        }
        int length = this.f6938a.length();
        int length2 = this.f6938a.length();
        for (int i10 = this.f6940c; i10 < length2; i10++) {
            char charAt = this.f6938a.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                i7 = (charAt == '\r' && (i8 = i10 + 1) < this.f6938a.length() && this.f6938a.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f6939b = 1;
                this.f6942e = i7;
                this.f6941d = length;
                return true;
            }
        }
        i7 = -1;
        this.f6939b = 1;
        this.f6942e = i7;
        this.f6941d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
