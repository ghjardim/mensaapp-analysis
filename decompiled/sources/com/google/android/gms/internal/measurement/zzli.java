package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzli extends IOException {
    public zzli() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzli(long j7, long j8, int i7, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i7))), th);
    }

    public zzli(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
