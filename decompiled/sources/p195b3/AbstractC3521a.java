package p195b3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: b3.a */
/* loaded from: classes.dex */
public abstract class AbstractC3521a {

    /* renamed from: a */
    public static final BigInteger f11853a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    public static final double f11854b = Math.log(10.0d);

    /* renamed from: c */
    public static final double f11855c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m14152a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
