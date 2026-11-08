package p256j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.apache.tika.utils.StringUtils;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.InterfaceC4915p;

/* renamed from: j$.time.format.g */
/* loaded from: classes3.dex */
final class C4870g extends C4872i {

    /* renamed from: g */
    private final boolean f17982g;

    C4870g(InterfaceC4915p interfaceC4915p, int i7, int i8, boolean z6, int i9) {
        super(interfaceC4915p, i7, i8, EnumC4884u.NOT_NEGATIVE, i9);
        this.f17982g = z6;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.p, java.lang.Enum] */
    @Override // p256j$.time.format.C4872i
    /* renamed from: b */
    final C4872i mo21074b() {
        if (this.f17988e == -1) {
            return this;
        }
        return new C4870g(this.f17984a, this.f17985b, this.f17986c, this.f17982g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.p, java.lang.Enum] */
    @Override // p256j$.time.format.C4872i
    /* renamed from: c */
    final C4872i mo21075c(int i7) {
        return new C4870g(this.f17984a, this.f17985b, this.f17986c, this.f17982g, this.f17988e + i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.p, java.lang.Enum] */
    @Override // p256j$.time.format.C4872i, p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        ?? r02 = this.f17984a;
        Long m21104e = c4879p.m21104e(r02);
        if (m21104e == null) {
            return false;
        }
        C4882s m21101b = c4879p.m21101b();
        long longValue = m21104e.longValue();
        C4919t mo21172l = r02.mo21172l();
        mo21172l.m21201b(longValue, r02);
        BigDecimal valueOf = BigDecimal.valueOf(mo21172l.m21203e());
        BigDecimal add = BigDecimal.valueOf(mo21172l.m21202d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z6 = this.f17982g;
        int i7 = this.f17985b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i7), this.f17986c), roundingMode).toPlainString().substring(2);
            m21101b.getClass();
            if (z6) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i7 <= 0) {
            return true;
        }
        if (z6) {
            m21101b.getClass();
            sb.append('.');
        }
        for (int i8 = 0; i8 < i7; i8++) {
            m21101b.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // p256j$.time.format.C4872i
    public final String toString() {
        return "Fraction(" + this.f17984a + "," + this.f17985b + "," + this.f17986c + (this.f17982g ? ",DecimalPoint" : StringUtils.EMPTY) + ")";
    }
}
