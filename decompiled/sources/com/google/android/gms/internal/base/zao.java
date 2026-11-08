package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p372x.AbstractC6935a;

/* loaded from: classes.dex */
public final class zao extends AbstractC6935a {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (!zan.zaa()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, true != zan.zaa() ? 0 : 2);
        return registerReceiver;
    }
}
