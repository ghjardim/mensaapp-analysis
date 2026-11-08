package p104O5;

import kotlin.jvm.internal.AbstractC5464g;
import p027D5.AbstractC0195c;
import p076K5.InterfaceC0834a;
import p378x5.AbstractC7022m;

/* renamed from: O5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1414a implements Iterable, InterfaceC0834a {

    /* renamed from: d */
    public static final a f4455d = new a(null);

    /* renamed from: a */
    public final char f4456a;

    /* renamed from: b */
    public final char f4457b;

    /* renamed from: c */
    public final int f4458c;

    /* renamed from: O5.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public AbstractC1414a(char c7, char c8, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4456a = c7;
        this.f4457b = (char) AbstractC0195c.m794b(c7, c8, i7);
        this.f4458c = i7;
    }

    /* renamed from: a */
    public final char m5514a() {
        return this.f4456a;
    }

    /* renamed from: b */
    public final char m5515b() {
        return this.f4457b;
    }

    @Override // java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC7022m iterator() {
        return new C1415b(this.f4456a, this.f4457b, this.f4458c);
    }
}
