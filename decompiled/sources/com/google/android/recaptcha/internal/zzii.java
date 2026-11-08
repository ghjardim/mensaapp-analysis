package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import p371w5.AbstractC6930m;
import p378x5.AbstractC7005E;

/* loaded from: classes.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = AbstractC7005E.m28737f(AbstractC6930m.m28383a(2, Context.ACTIVITY_SERVICE), AbstractC6930m.m28383a(3, Context.TELEPHONY_SERVICE), AbstractC6930m.m28383a(4, Context.INPUT_METHOD_SERVICE), AbstractC6930m.m28383a(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    /* renamed from: cs */
    public final /* synthetic */ Object mo15261cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }
}
