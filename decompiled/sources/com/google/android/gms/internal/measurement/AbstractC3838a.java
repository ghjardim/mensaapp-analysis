package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.measurement.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3838a {
    /* renamed from: a */
    public static /* synthetic */ BigDecimal m15198a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
