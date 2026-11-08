package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.AbstractC3728k;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes.dex */
public abstract class AbstractC3800q {

    /* renamed from: a */
    public static final InterfaceC3757O f12547a = new C3753K();

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public interface a {
        /* renamed from: a */
        Object mo15032a(InterfaceC3729l interfaceC3729l);
    }

    /* renamed from: a */
    public static Task m15106a(AbstractC3650h abstractC3650h, AbstractC3728k abstractC3728k) {
        return m15107b(abstractC3650h, new C3755M(abstractC3728k));
    }

    /* renamed from: b */
    public static Task m15107b(AbstractC3650h abstractC3650h, a aVar) {
        InterfaceC3757O interfaceC3757O = f12547a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractC3650h.addStatusListener(new C3754L(abstractC3650h, taskCompletionSource, aVar, interfaceC3757O));
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public static Task m15108c(AbstractC3650h abstractC3650h) {
        return m15107b(abstractC3650h, new C3756N());
    }
}
