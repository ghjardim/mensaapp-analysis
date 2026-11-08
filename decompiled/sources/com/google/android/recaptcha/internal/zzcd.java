package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import p048G5.AbstractC0470e;

/* loaded from: classes.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) {
        return AbstractC0470e.m1717a(file);
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        AbstractC0470e.m1718b(file, bArr);
    }
}
