package p256j$.time.format;

import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import p256j$.time.temporal.EnumC4900a;
import p256j$.util.Objects;

/* renamed from: j$.time.format.j */
/* loaded from: classes3.dex */
final class C4873j implements InterfaceC4869f {

    /* renamed from: d */
    static final String[] f17989d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e */
    static final C4873j f17990e = new C4873j("+HH:MM:ss", "Z");

    /* renamed from: a */
    private final String f17991a;

    /* renamed from: b */
    private final int f17992b;

    /* renamed from: c */
    private final int f17993c;

    static {
        new C4873j("+HH:MM:ss", "0");
    }

    C4873j(String str, String str2) {
        Objects.requireNonNull(str, MimeTypesReaderMetKeys.PATTERN_ATTR);
        Objects.requireNonNull(str2, "noOffsetText");
        int i7 = 0;
        while (true) {
            String[] strArr = f17989d;
            if (i7 < 22) {
                if (strArr[i7].equals(str)) {
                    this.f17992b = i7;
                    this.f17993c = i7 % 11;
                    this.f17991a = str2;
                    return;
                }
                i7++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        Long m21104e = c4879p.m21104e(EnumC4900a.OFFSET_SECONDS);
        boolean z6 = false;
        if (m21104e == null) {
            return false;
        }
        long longValue = m21104e.longValue();
        int i7 = (int) longValue;
        if (longValue != i7) {
            throw new ArithmeticException();
        }
        String str = this.f17991a;
        if (i7 == 0) {
            sb.append(str);
        } else {
            int abs = Math.abs((i7 / 3600) % 100);
            int abs2 = Math.abs((i7 / 60) % 60);
            int abs3 = Math.abs(i7 % 60);
            int length = sb.length();
            sb.append(i7 < 0 ? "-" : "+");
            if (this.f17992b >= 11 && abs < 10) {
                sb.append((char) (abs + 48));
            } else {
                m21077a(false, abs, sb);
            }
            int i8 = this.f17993c;
            if ((i8 >= 3 && i8 <= 8) || ((i8 >= 9 && abs3 > 0) || (i8 >= 1 && abs2 > 0))) {
                m21077a(i8 > 0 && i8 % 2 == 0, abs2, sb);
                abs += abs2;
                if (i8 == 7 || i8 == 8 || (i8 >= 5 && abs3 > 0)) {
                    if (i8 > 0 && i8 % 2 == 0) {
                        z6 = true;
                    }
                    m21077a(z6, abs3, sb);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m21077a(boolean z6, int i7, StringBuilder sb) {
        sb.append(z6 ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : StringUtils.EMPTY);
        sb.append((char) ((i7 / 10) + 48));
        sb.append((char) ((i7 % 10) + 48));
    }

    public final String toString() {
        String replace = this.f17991a.replace("'", "''");
        return "Offset(" + f17989d[this.f17992b] + ",'" + replace + "')";
    }
}
