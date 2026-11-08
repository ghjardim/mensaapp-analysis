package p171Y2;

/* renamed from: Y2.d */
/* loaded from: classes.dex */
public abstract class AbstractC2921d implements InterfaceC2933p {

    /* renamed from: Y2.d$a */
    public static abstract class a extends AbstractC2921d {
        @Override // p171Y2.InterfaceC2933p
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.m10522b((Character) obj);
        }
    }

    /* renamed from: Y2.d$b */
    public static final class b extends a {

        /* renamed from: a */
        public final char f9003a;

        public b(char c7) {
            this.f9003a = c7;
        }

        @Override // p171Y2.AbstractC2921d
        /* renamed from: e */
        public boolean mo10524e(char c7) {
            return c7 == this.f9003a;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC2921d.m10520g(this.f9003a) + "')";
        }
    }

    /* renamed from: Y2.d$c */
    public static abstract class c extends a {

        /* renamed from: a */
        public final String f9004a;

        public c(String str) {
            this.f9004a = (String) AbstractC2932o.m10572o(str);
        }

        public final String toString() {
            return this.f9004a;
        }
    }

    /* renamed from: Y2.d$d */
    public static final class d extends c {

        /* renamed from: b */
        public static final AbstractC2921d f9005b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // p171Y2.AbstractC2921d
        /* renamed from: c */
        public int mo10523c(CharSequence charSequence, int i7) {
            AbstractC2932o.m10575r(i7, charSequence.length());
            return -1;
        }

        @Override // p171Y2.AbstractC2921d
        /* renamed from: e */
        public boolean mo10524e(char c7) {
            return false;
        }
    }

    /* renamed from: Y2.d$e */
    public static final class e extends c {

        /* renamed from: b */
        public static final int f9006b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c */
        public static final AbstractC2921d f9007c = new e();

        public e() {
            super("CharMatcher.whitespace()");
        }

        @Override // p171Y2.AbstractC2921d
        /* renamed from: e */
        public boolean mo10524e(char c7) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c7) >>> f9006b) == c7;
        }
    }

    /* renamed from: d */
    public static AbstractC2921d m10518d(char c7) {
        return new b(c7);
    }

    /* renamed from: f */
    public static AbstractC2921d m10519f() {
        return d.f9005b;
    }

    /* renamed from: g */
    public static String m10520g(char c7) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c7 & 15);
            c7 = (char) (c7 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: h */
    public static AbstractC2921d m10521h() {
        return e.f9007c;
    }

    /* renamed from: b */
    public boolean m10522b(Character ch) {
        return mo10524e(ch.charValue());
    }

    /* renamed from: c */
    public int mo10523c(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        AbstractC2932o.m10575r(i7, length);
        while (i7 < length) {
            if (mo10524e(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo10524e(char c7);
}
