package p021D;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* renamed from: D.j */
/* loaded from: classes.dex */
public final class C0102j implements InterfaceC0103k {

    /* renamed from: c */
    public static final Locale[] f336c = new Locale[0];

    /* renamed from: d */
    public static final Locale f337d = new Locale("en", "XA");

    /* renamed from: e */
    public static final Locale f338e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f339f = C0101i.m263b("en-Latn");

    /* renamed from: a */
    public final Locale[] f340a;

    /* renamed from: b */
    public final String f341b;

    public C0102j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f340a = f336c;
            this.f341b = StringUtils.EMPTY;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale == null) {
                throw new NullPointerException("list[" + i7 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                m272b(sb, locale2);
                if (i7 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f340a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f341b = sb.toString();
    }

    /* renamed from: b */
    public static void m272b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // p021D.InterfaceC0103k
    /* renamed from: a */
    public Object mo273a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0102j)) {
            return false;
        }
        Locale[] localeArr = ((C0102j) obj).f340a;
        if (this.f340a.length != localeArr.length) {
            return false;
        }
        int i7 = 0;
        while (true) {
            Locale[] localeArr2 = this.f340a;
            if (i7 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
            i7++;
        }
    }

    @Override // p021D.InterfaceC0103k
    public Locale get(int i7) {
        if (i7 >= 0) {
            Locale[] localeArr = this.f340a;
            if (i7 < localeArr.length) {
                return localeArr[i7];
            }
        }
        return null;
    }

    public int hashCode() {
        int i7 = 1;
        for (Locale locale : this.f340a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    @Override // p021D.InterfaceC0103k
    public boolean isEmpty() {
        return this.f340a.length == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f340a;
            if (i7 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i7]);
            if (i7 < this.f340a.length - 1) {
                sb.append(',');
            }
            i7++;
        }
    }
}
