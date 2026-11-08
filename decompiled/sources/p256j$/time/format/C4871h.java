package p256j$.time.format;

import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.LocalDateTime;
import p256j$.time.ZoneOffset;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;

/* renamed from: j$.time.format.h */
/* loaded from: classes3.dex */
final class C4871h implements InterfaceC4869f {
    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        Long m21104e = c4879p.m21104e(EnumC4900a.INSTANT_SECONDS);
        InterfaceC4912m m21103d = c4879p.m21103d();
        EnumC4900a enumC4900a = EnumC4900a.NANO_OF_SECOND;
        Long valueOf = m21103d.mo20905g(enumC4900a) ? Long.valueOf(c4879p.m21103d().mo20914s(enumC4900a)) : null;
        int i7 = 0;
        if (m21104e == null) {
            return false;
        }
        long longValue = m21104e.longValue();
        int m21178z = enumC4900a.m21178z(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j7 = longValue - 253402300800L;
            long m20873k = AbstractC4815a.m20873k(j7, 315569520000L) + 1;
            LocalDateTime m20932R = LocalDateTime.m20932R(AbstractC4815a.m20872j(j7, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (m20873k > 0) {
                sb.append('+');
                sb.append(m20873k);
            }
            sb.append(m20932R);
            if (m20932R.m20937L() == 0) {
                sb.append(":00");
            }
        } else {
            long j8 = longValue + 62167219200L;
            long j9 = j8 / 315569520000L;
            long j10 = j8 % 315569520000L;
            LocalDateTime m20932R2 = LocalDateTime.m20932R(j10 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(m20932R2);
            if (m20932R2.m20937L() == 0) {
                sb.append(":00");
            }
            if (j9 < 0) {
                if (m20932R2.m20938M() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j9 - 1));
                } else if (j10 == 0) {
                    sb.insert(length, j9);
                } else {
                    sb.insert(length + 1, Math.abs(j9));
                }
            }
        }
        if (m21178z > 0) {
            sb.append('.');
            int i8 = 100000000;
            while (true) {
                if (m21178z <= 0 && i7 % 3 == 0 && i7 >= -2) {
                    break;
                }
                int i9 = m21178z / i8;
                sb.append((char) (i9 + 48));
                m21178z -= i9 * i8;
                i8 /= 10;
                i7++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
