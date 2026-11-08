package p256j$.util;

import java.util.Calendar;
import p256j$.time.Instant;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarCalendar {
    public static final Instant toInstant(Calendar calendar) {
        return Instant.m20918M(calendar.getTimeInMillis());
    }
}
