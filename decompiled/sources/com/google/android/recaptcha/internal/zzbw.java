package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p118Q5.InterfaceC2210c;
import p132S5.InterfaceC2348Q;
import p132S5.InterfaceC2368a0;
import p132S5.InterfaceC2406t;
import p132S5.InterfaceC2409u0;
import p132S5.InterfaceC2410v;
import p132S5.InterfaceC2412w;
import p189a6.InterfaceC3180a;
import p189a6.InterfaceC3182c;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* loaded from: classes.dex */
public final class zzbw implements InterfaceC2348Q {
    private final /* synthetic */ InterfaceC2412w zza;

    public zzbw(InterfaceC2412w interfaceC2412w) {
        this.zza = interfaceC2412w;
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2406t attachChild(InterfaceC2410v interfaceC2410v) {
        return this.zza.attachChild(interfaceC2410v);
    }

    @Override // p132S5.InterfaceC2348Q
    public final Object await(InterfaceC7157e interfaceC7157e) {
        return this.zza.await(interfaceC7157e);
    }

    @Override // p132S5.InterfaceC2409u0
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public final Object fold(Object obj, InterfaceC0804p interfaceC0804p) {
        return this.zza.fold(obj, interfaceC0804p);
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public final InterfaceC7161i.b get(InterfaceC7161i.c cVar) {
        return this.zza.get(cVar);
    }

    @Override // p132S5.InterfaceC2409u0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2210c getChildren() {
        return this.zza.getChildren();
    }

    @Override // p132S5.InterfaceC2348Q
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // p132S5.InterfaceC2348Q
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // p392z5.InterfaceC7161i.b
    public final InterfaceC7161i.c getKey() {
        return this.zza.getKey();
    }

    @Override // p132S5.InterfaceC2348Q
    public final InterfaceC3182c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC3180a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2409u0 getParent() {
        return this.zza.getParent();
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2368a0 invokeOnCompletion(InterfaceC0800l interfaceC0800l) {
        return this.zza.invokeOnCompletion(interfaceC0800l);
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // p132S5.InterfaceC2409u0
    public final Object join(InterfaceC7157e interfaceC7157e) {
        return this.zza.join(interfaceC7157e);
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public final InterfaceC7161i minusKey(InterfaceC7161i.c cVar) {
        return this.zza.minusKey(cVar);
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2409u0 plus(InterfaceC2409u0 interfaceC2409u0) {
        return this.zza.plus(interfaceC2409u0);
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // p132S5.InterfaceC2409u0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2368a0 invokeOnCompletion(boolean z6, boolean z7, InterfaceC0800l interfaceC0800l) {
        return this.zza.invokeOnCompletion(z6, z7, interfaceC0800l);
    }

    @Override // p392z5.InterfaceC7161i
    public final InterfaceC7161i plus(InterfaceC7161i interfaceC7161i) {
        return this.zza.plus(interfaceC7161i);
    }

    @Override // p132S5.InterfaceC2409u0
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
