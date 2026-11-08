package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzjk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z6 = true;
        while (it.hasNext()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(it.next());
            z6 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
