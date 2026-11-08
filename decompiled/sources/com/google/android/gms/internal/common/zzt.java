package com.google.android.gms.internal.common;

import org.jspecify.annotations.NullMarked;
import p256j$.util.Objects;

@NullMarked
/* loaded from: classes.dex */
public final class zzt {
    public static final CharSequence zza(Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
