package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import p017C2.AbstractC0077b;

/* loaded from: classes.dex */
public abstract class zzbz extends AbstractC0077b {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e7) {
            Log.e("AUTH", "Error serializing object.", e7);
            return null;
        }
    }
}
