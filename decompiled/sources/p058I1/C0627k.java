package p058I1;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import org.apache.tika.utils.StringUtils;
import p069J5.InterfaceC0789a;
import p125R5.AbstractC2294t;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;

/* renamed from: I1.k */
/* loaded from: classes.dex */
public final class C0627k implements Comparable {

    /* renamed from: f */
    public static final a f2185f = new a(null);

    /* renamed from: n */
    public static final C0627k f2186n = new C0627k(0, 0, 0, StringUtils.EMPTY);

    /* renamed from: o */
    public static final C0627k f2187o = new C0627k(0, 1, 0, StringUtils.EMPTY);

    /* renamed from: p */
    public static final C0627k f2188p;

    /* renamed from: q */
    public static final C0627k f2189q;

    /* renamed from: a */
    public final int f2190a;

    /* renamed from: b */
    public final int f2191b;

    /* renamed from: c */
    public final int f2192c;

    /* renamed from: d */
    public final String f2193d;

    /* renamed from: e */
    public final InterfaceC6923f f2194e;

    /* renamed from: I1.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C0627k m2530a() {
            return C0627k.f2187o;
        }

        /* renamed from: b */
        public final C0627k m2531b(String str) {
            String group;
            if (str != null && !AbstractC2294t.m7756K(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String description = matcher.group(4) != null ? matcher.group(4) : StringUtils.EMPTY;
                            AbstractC5469l.m23027d(description, "description");
                            return new C0627k(parseInt, parseInt2, parseInt3, description, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    /* renamed from: I1.k$b */
    public static final class b extends AbstractC5470m implements InterfaceC0789a {
        public b() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(C0627k.this.m2527h()).shiftLeft(32).or(BigInteger.valueOf(C0627k.this.m2528i())).shiftLeft(32).or(BigInteger.valueOf(C0627k.this.m2529j()));
        }
    }

    static {
        C0627k c0627k = new C0627k(1, 0, 0, StringUtils.EMPTY);
        f2188p = c0627k;
        f2189q = c0627k;
    }

    public /* synthetic */ C0627k(int i7, int i8, int i9, String str, AbstractC5464g abstractC5464g) {
        this(i7, i8, i9, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0627k)) {
            return false;
        }
        C0627k c0627k = (C0627k) obj;
        return this.f2190a == c0627k.f2190a && this.f2191b == c0627k.f2191b && this.f2192c == c0627k.f2192c;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0627k other) {
        AbstractC5469l.m23028e(other, "other");
        return m2526g().compareTo(other.m2526g());
    }

    /* renamed from: g */
    public final BigInteger m2526g() {
        Object value = this.f2194e.getValue();
        AbstractC5469l.m23027d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    /* renamed from: h */
    public final int m2527h() {
        return this.f2190a;
    }

    public int hashCode() {
        return ((((527 + this.f2190a) * 31) + this.f2191b) * 31) + this.f2192c;
    }

    /* renamed from: i */
    public final int m2528i() {
        return this.f2191b;
    }

    /* renamed from: j */
    public final int m2529j() {
        return this.f2192c;
    }

    public String toString() {
        String str;
        if (AbstractC2294t.m7756K(this.f2193d)) {
            str = StringUtils.EMPTY;
        } else {
            str = '-' + this.f2193d;
        }
        return this.f2190a + '.' + this.f2191b + '.' + this.f2192c + str;
    }

    public C0627k(int i7, int i8, int i9, String str) {
        this.f2190a = i7;
        this.f2191b = i8;
        this.f2192c = i9;
        this.f2193d = str;
        this.f2194e = AbstractC6924g.m28367a(new b());
    }
}
