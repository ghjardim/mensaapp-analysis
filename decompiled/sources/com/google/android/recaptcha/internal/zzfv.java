package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzfv extends AbstractC0068l implements InterfaceC0804p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzfv(this.zza, this.zzb, this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        AbstractC0024c.m76e();
        AbstractC6928k.m28382b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzfw zzfwVar = this.zzb;
        String str2 = this.zzc;
        webView = zzfwVar.zza;
        webView.evaluateJavascript(str2 + "(" + AbstractC7032w.m28878D(arrayList, ",", null, null, 0, null, null, 62, null) + ")", null);
        return C6934q.f24811a;
    }
}
