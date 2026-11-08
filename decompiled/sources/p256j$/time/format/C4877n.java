package p256j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p256j$.time.chrono.C4855u;
import p256j$.time.temporal.AbstractC4908i;
import p256j$.time.temporal.AbstractC4910k;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.util.Objects;

/* renamed from: j$.time.format.n */
/* loaded from: classes3.dex */
public final class C4877n {

    /* renamed from: f */
    private static final C4864a f18001f = new C4864a();

    /* renamed from: a */
    private C4877n f18002a;

    /* renamed from: b */
    private final C4877n f18003b;

    /* renamed from: c */
    private final ArrayList f18004c;

    /* renamed from: d */
    private final boolean f18005d;

    /* renamed from: e */
    private int f18006e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', EnumC4900a.ERA);
        hashMap.put('y', EnumC4900a.YEAR_OF_ERA);
        hashMap.put('u', EnumC4900a.YEAR);
        InterfaceC4915p interfaceC4915p = AbstractC4908i.f18065a;
        hashMap.put('Q', interfaceC4915p);
        hashMap.put('q', interfaceC4915p);
        EnumC4900a enumC4900a = EnumC4900a.MONTH_OF_YEAR;
        hashMap.put('M', enumC4900a);
        hashMap.put('L', enumC4900a);
        hashMap.put('D', EnumC4900a.DAY_OF_YEAR);
        hashMap.put('d', EnumC4900a.DAY_OF_MONTH);
        hashMap.put('F', EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC4900a enumC4900a2 = EnumC4900a.DAY_OF_WEEK;
        hashMap.put('E', enumC4900a2);
        hashMap.put('c', enumC4900a2);
        hashMap.put('e', enumC4900a2);
        hashMap.put('a', EnumC4900a.AMPM_OF_DAY);
        hashMap.put('H', EnumC4900a.HOUR_OF_DAY);
        hashMap.put('k', EnumC4900a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', EnumC4900a.HOUR_OF_AMPM);
        hashMap.put('h', EnumC4900a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', EnumC4900a.MINUTE_OF_HOUR);
        hashMap.put('s', EnumC4900a.SECOND_OF_MINUTE);
        EnumC4900a enumC4900a3 = EnumC4900a.NANO_OF_SECOND;
        hashMap.put('S', enumC4900a3);
        hashMap.put('A', EnumC4900a.MILLI_OF_DAY);
        hashMap.put('n', enumC4900a3);
        hashMap.put('N', EnumC4900a.NANO_OF_DAY);
        hashMap.put('g', AbstractC4910k.f18072a);
    }

    public C4877n() {
        this.f18002a = this;
        this.f18004c = new ArrayList();
        this.f18006e = -1;
        this.f18003b = null;
        this.f18005d = false;
    }

    private C4877n(C4877n c4877n) {
        this.f18002a = this;
        this.f18004c = new ArrayList();
        this.f18006e = -1;
        this.f18003b = c4877n;
        this.f18005d = true;
    }

    /* renamed from: q */
    public final void m21095q() {
        m21078d(EnumC4874k.SENSITIVE);
    }

    /* renamed from: p */
    public final void m21094p() {
        m21078d(EnumC4874k.INSENSITIVE);
    }

    /* renamed from: s */
    public final void m21097s() {
        m21078d(EnumC4874k.STRICT);
    }

    /* renamed from: r */
    public final void m21096r() {
        m21078d(EnumC4874k.LENIENT);
    }

    /* renamed from: k */
    public final void m21089k(InterfaceC4915p interfaceC4915p, int i7) {
        Objects.requireNonNull(interfaceC4915p, "field");
        if (i7 < 1 || i7 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i7);
        }
        m21079j(new C4872i(interfaceC4915p, i7, i7, EnumC4884u.NOT_NEGATIVE));
    }

    /* renamed from: l */
    public final void m21090l(InterfaceC4915p interfaceC4915p, int i7, int i8, EnumC4884u enumC4884u) {
        if (i7 == i8 && enumC4884u == EnumC4884u.NOT_NEGATIVE) {
            m21089k(interfaceC4915p, i8);
            return;
        }
        Objects.requireNonNull(interfaceC4915p, "field");
        Objects.requireNonNull(enumC4884u, "signStyle");
        if (i7 < 1 || i7 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i7);
        }
        if (i8 < 1 || i8 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i8);
        }
        if (i8 < i7) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i8 + " < " + i7);
        }
        m21079j(new C4872i(interfaceC4915p, i7, i8, enumC4884u));
    }

    /* renamed from: j */
    private void m21079j(C4872i c4872i) {
        C4872i mo21074b;
        EnumC4884u enumC4884u;
        C4877n c4877n = this.f18002a;
        int i7 = c4877n.f18006e;
        if (i7 >= 0) {
            C4872i c4872i2 = (C4872i) c4877n.f18004c.get(i7);
            int i8 = c4872i.f17985b;
            int i9 = c4872i.f17986c;
            if (i8 == i9) {
                enumC4884u = c4872i.f17987d;
                if (enumC4884u == EnumC4884u.NOT_NEGATIVE) {
                    mo21074b = c4872i2.mo21075c(i9);
                    m21078d(c4872i.mo21074b());
                    this.f18002a.f18006e = i7;
                    this.f18002a.f18004c.set(i7, mo21074b);
                    return;
                }
            }
            mo21074b = c4872i2.mo21074b();
            this.f18002a.f18006e = m21078d(c4872i);
            this.f18002a.f18004c.set(i7, mo21074b);
            return;
        }
        c4877n.f18006e = m21078d(c4872i);
    }

    /* renamed from: b */
    public final void m21082b(EnumC4900a enumC4900a) {
        C4870g c4870g = new C4870g(enumC4900a, 0, 9, true, 0);
        Objects.requireNonNull(enumC4900a, "field");
        if (enumC4900a.mo21172l().m21205g()) {
            m21078d(c4870g);
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + enumC4900a);
        }
    }

    /* renamed from: i */
    public final void m21088i(EnumC4900a enumC4900a, HashMap hashMap) {
        Objects.requireNonNull(enumC4900a, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        EnumC4885v enumC4885v = EnumC4885v.FULL;
        m21078d(new C4876m(enumC4900a, enumC4885v, new C4865b(new C4881r(Collections.singletonMap(enumC4885v, linkedHashMap)))));
    }

    /* renamed from: c */
    public final void m21083c() {
        m21078d(new C4871h());
    }

    /* renamed from: h */
    public final void m21087h() {
        m21078d(C4873j.f17990e);
    }

    /* renamed from: g */
    public final void m21086g(String str, String str2) {
        m21078d(new C4873j(str, str2));
    }

    /* renamed from: m */
    public final void m21091m() {
        m21078d(new C4875l(1, f18001f));
    }

    /* renamed from: e */
    public final void m21084e(char c7) {
        m21078d(new C4867d(c7));
    }

    /* renamed from: f */
    public final void m21085f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            m21078d(new C4867d(str.charAt(0)));
        } else {
            m21078d(new C4875l(0, str));
        }
    }

    /* renamed from: a */
    public final void m21081a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m21078d(dateTimeFormatter.m21069e());
    }

    /* renamed from: o */
    public final void m21093o() {
        C4877n c4877n = this.f18002a;
        c4877n.f18006e = -1;
        this.f18002a = new C4877n(c4877n);
    }

    /* renamed from: n */
    public final void m21092n() {
        C4877n c4877n = this.f18002a;
        if (c4877n.f18003b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (c4877n.f18004c.size() > 0) {
            C4877n c4877n2 = this.f18002a;
            C4868e c4868e = new C4868e(c4877n2.f18004c, c4877n2.f18005d);
            this.f18002a = this.f18002a.f18003b;
            m21078d(c4868e);
            return;
        }
        this.f18002a = this.f18002a.f18003b;
    }

    /* renamed from: d */
    private int m21078d(InterfaceC4869f interfaceC4869f) {
        Objects.requireNonNull(interfaceC4869f, "pp");
        C4877n c4877n = this.f18002a;
        c4877n.getClass();
        c4877n.f18004c.add(interfaceC4869f);
        this.f18002a.f18006e = -1;
        return r2.f18004c.size() - 1;
    }

    /* renamed from: v */
    public final void m21099v() {
        m21080u(Locale.getDefault(), EnumC4883t.SMART, null);
    }

    /* renamed from: t */
    final DateTimeFormatter m21098t(EnumC4883t enumC4883t, C4855u c4855u) {
        return m21080u(Locale.getDefault(), enumC4883t, c4855u);
    }

    /* renamed from: u */
    private DateTimeFormatter m21080u(Locale locale, EnumC4883t enumC4883t, C4855u c4855u) {
        Objects.requireNonNull(locale, "locale");
        while (this.f18002a.f18003b != null) {
            m21092n();
        }
        C4868e c4868e = new C4868e(this.f18004c, false);
        C4882s c4882s = C4882s.f18015a;
        return new DateTimeFormatter(c4868e, locale, enumC4883t, c4855u);
    }
}
