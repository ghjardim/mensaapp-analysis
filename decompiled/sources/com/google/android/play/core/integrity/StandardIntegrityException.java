package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C3902b;
import java.util.Locale;

/* loaded from: classes.dex */
public class StandardIntegrityException extends C3644b {

    /* renamed from: a */
    private final Throwable f12639a;

    public StandardIntegrityException(int i7, Throwable th) {
        super(new Status(i7, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i7), C3902b.m15248a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f12639a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f12639a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
