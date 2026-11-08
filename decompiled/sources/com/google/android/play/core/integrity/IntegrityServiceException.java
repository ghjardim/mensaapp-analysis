package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C3901a;
import java.util.Locale;

/* loaded from: classes.dex */
public class IntegrityServiceException extends C3644b {

    /* renamed from: a */
    private final Throwable f12638a;

    public IntegrityServiceException(int i7, Throwable th) {
        super(new Status(i7, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i7), C3901a.m15247a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f12638a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f12638a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
