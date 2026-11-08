package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p125R5.AbstractC2291q;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7025p;

/* loaded from: classes.dex */
public final class zzfk {
    private final List zza;

    public zzfk() {
        this(true);
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC2291q.m7745u(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !AbstractC5469l.m23024a("https", uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(String str) {
        Uri parse = Uri.parse(str);
        AbstractC5469l.m23025b(parse);
        return zze(parse) && zzd(parse.toString());
    }

    public zzfk(boolean z6) {
        this.zza = zzf(AbstractC7024o.m28864j("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
