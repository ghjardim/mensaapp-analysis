package p256j$.time.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p256j$.time.C4822c;
import p256j$.time.chrono.C4855u;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.temporal.AbstractC4908i;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.util.Objects;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: e */
    public static final DateTimeFormatter f17970e;

    /* renamed from: a */
    private final C4868e f17971a;

    /* renamed from: b */
    private final Locale f17972b;

    /* renamed from: c */
    private final C4882s f17973c;

    /* renamed from: d */
    private final C4855u f17974d;

    static {
        C4877n c4877n = new C4877n();
        EnumC4900a enumC4900a = EnumC4900a.YEAR;
        EnumC4884u enumC4884u = EnumC4884u.EXCEEDS_PAD;
        c4877n.m21090l(enumC4900a, 4, 10, enumC4884u);
        c4877n.m21084e('-');
        EnumC4900a enumC4900a2 = EnumC4900a.MONTH_OF_YEAR;
        c4877n.m21089k(enumC4900a2, 2);
        c4877n.m21084e('-');
        EnumC4900a enumC4900a3 = EnumC4900a.DAY_OF_MONTH;
        c4877n.m21089k(enumC4900a3, 2);
        EnumC4883t enumC4883t = EnumC4883t.STRICT;
        C4855u c4855u = C4855u.f17955d;
        DateTimeFormatter m21098t = c4877n.m21098t(enumC4883t, c4855u);
        ISO_LOCAL_DATE = m21098t;
        C4877n c4877n2 = new C4877n();
        c4877n2.m21094p();
        c4877n2.m21081a(m21098t);
        c4877n2.m21087h();
        c4877n2.m21098t(enumC4883t, c4855u);
        C4877n c4877n3 = new C4877n();
        c4877n3.m21094p();
        c4877n3.m21081a(m21098t);
        c4877n3.m21093o();
        c4877n3.m21087h();
        c4877n3.m21098t(enumC4883t, c4855u);
        C4877n c4877n4 = new C4877n();
        EnumC4900a enumC4900a4 = EnumC4900a.HOUR_OF_DAY;
        c4877n4.m21089k(enumC4900a4, 2);
        c4877n4.m21084e(':');
        EnumC4900a enumC4900a5 = EnumC4900a.MINUTE_OF_HOUR;
        c4877n4.m21089k(enumC4900a5, 2);
        c4877n4.m21093o();
        c4877n4.m21084e(':');
        EnumC4900a enumC4900a6 = EnumC4900a.SECOND_OF_MINUTE;
        c4877n4.m21089k(enumC4900a6, 2);
        c4877n4.m21093o();
        c4877n4.m21082b(EnumC4900a.NANO_OF_SECOND);
        DateTimeFormatter m21098t2 = c4877n4.m21098t(enumC4883t, null);
        C4877n c4877n5 = new C4877n();
        c4877n5.m21094p();
        c4877n5.m21081a(m21098t2);
        c4877n5.m21087h();
        c4877n5.m21098t(enumC4883t, null);
        C4877n c4877n6 = new C4877n();
        c4877n6.m21094p();
        c4877n6.m21081a(m21098t2);
        c4877n6.m21093o();
        c4877n6.m21087h();
        c4877n6.m21098t(enumC4883t, null);
        C4877n c4877n7 = new C4877n();
        c4877n7.m21094p();
        c4877n7.m21081a(m21098t);
        c4877n7.m21084e('T');
        c4877n7.m21081a(m21098t2);
        DateTimeFormatter m21098t3 = c4877n7.m21098t(enumC4883t, c4855u);
        C4877n c4877n8 = new C4877n();
        c4877n8.m21094p();
        c4877n8.m21081a(m21098t3);
        c4877n8.m21096r();
        c4877n8.m21087h();
        c4877n8.m21097s();
        DateTimeFormatter m21098t4 = c4877n8.m21098t(enumC4883t, c4855u);
        C4877n c4877n9 = new C4877n();
        c4877n9.m21081a(m21098t4);
        c4877n9.m21093o();
        c4877n9.m21084e('[');
        c4877n9.m21095q();
        c4877n9.m21091m();
        c4877n9.m21084e(']');
        c4877n9.m21098t(enumC4883t, c4855u);
        C4877n c4877n10 = new C4877n();
        c4877n10.m21081a(m21098t3);
        c4877n10.m21093o();
        c4877n10.m21087h();
        c4877n10.m21093o();
        c4877n10.m21084e('[');
        c4877n10.m21095q();
        c4877n10.m21091m();
        c4877n10.m21084e(']');
        c4877n10.m21098t(enumC4883t, c4855u);
        C4877n c4877n11 = new C4877n();
        c4877n11.m21094p();
        c4877n11.m21090l(enumC4900a, 4, 10, enumC4884u);
        c4877n11.m21084e('-');
        c4877n11.m21089k(EnumC4900a.DAY_OF_YEAR, 3);
        c4877n11.m21093o();
        c4877n11.m21087h();
        c4877n11.m21098t(enumC4883t, c4855u);
        C4877n c4877n12 = new C4877n();
        c4877n12.m21094p();
        c4877n12.m21090l(AbstractC4908i.f18067c, 4, 10, enumC4884u);
        c4877n12.m21085f("-W");
        c4877n12.m21089k(AbstractC4908i.f18066b, 2);
        c4877n12.m21084e('-');
        EnumC4900a enumC4900a7 = EnumC4900a.DAY_OF_WEEK;
        c4877n12.m21089k(enumC4900a7, 1);
        c4877n12.m21093o();
        c4877n12.m21087h();
        c4877n12.m21098t(enumC4883t, c4855u);
        C4877n c4877n13 = new C4877n();
        c4877n13.m21094p();
        c4877n13.m21083c();
        f17970e = c4877n13.m21098t(enumC4883t, null);
        C4877n c4877n14 = new C4877n();
        c4877n14.m21094p();
        c4877n14.m21089k(enumC4900a, 4);
        c4877n14.m21089k(enumC4900a2, 2);
        c4877n14.m21089k(enumC4900a3, 2);
        c4877n14.m21093o();
        c4877n14.m21096r();
        c4877n14.m21086g("+HHMMss", "Z");
        c4877n14.m21097s();
        c4877n14.m21098t(enumC4883t, c4855u);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C4877n c4877n15 = new C4877n();
        c4877n15.m21094p();
        c4877n15.m21096r();
        c4877n15.m21093o();
        c4877n15.m21088i(enumC4900a7, hashMap);
        c4877n15.m21085f(", ");
        c4877n15.m21092n();
        c4877n15.m21090l(enumC4900a3, 1, 2, EnumC4884u.NOT_NEGATIVE);
        c4877n15.m21084e(' ');
        c4877n15.m21088i(enumC4900a2, hashMap2);
        c4877n15.m21084e(' ');
        c4877n15.m21089k(enumC4900a, 4);
        c4877n15.m21084e(' ');
        c4877n15.m21089k(enumC4900a4, 2);
        c4877n15.m21084e(':');
        c4877n15.m21089k(enumC4900a5, 2);
        c4877n15.m21093o();
        c4877n15.m21084e(':');
        c4877n15.m21089k(enumC4900a6, 2);
        c4877n15.m21092n();
        c4877n15.m21084e(' ');
        c4877n15.m21086g("+HHMM", "GMT");
        c4877n15.m21098t(EnumC4883t.SMART, c4855u);
    }

    DateTimeFormatter(C4868e c4868e, Locale locale, EnumC4883t enumC4883t, C4855u c4855u) {
        C4882s c4882s = C4882s.f18015a;
        this.f17971a = (C4868e) Objects.requireNonNull(c4868e, "printerParser");
        this.f17972b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f17973c = (C4882s) Objects.requireNonNull(c4882s, "decimalStyle");
        this.f17974d = c4855u;
    }

    /* renamed from: d */
    public final Locale m21068d() {
        return this.f17972b;
    }

    /* renamed from: c */
    public final C4882s m21067c() {
        return this.f17973c;
    }

    /* renamed from: b */
    public final InterfaceC4848n m21066b() {
        return this.f17974d;
    }

    /* renamed from: a */
    public final String m21065a(InterfaceC4912m interfaceC4912m) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(interfaceC4912m, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            this.f17971a.mo21072l(new C4879p(interfaceC4912m, this), sb);
            return sb.toString();
        } catch (IOException e7) {
            throw new C4822c(e7.getMessage(), e7);
        }
    }

    /* renamed from: e */
    final C4868e m21069e() {
        return this.f17971a.m21073a();
    }

    public final String toString() {
        String c4868e = this.f17971a.toString();
        return c4868e.startsWith("[") ? c4868e : c4868e.substring(1, c4868e.length() - 1);
    }
}
