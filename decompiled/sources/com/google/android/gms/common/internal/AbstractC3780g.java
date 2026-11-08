package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p368w2.C6863d;
import p368w2.C6869j;

/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractC3780g extends AbstractC3772c implements C3643a.f {
    private static volatile Executor zaa;
    private final C3774d zab;
    private final Set zac;
    private final Account zad;

    public AbstractC3780g(Context context, Looper looper, int i7, C3774d c3774d, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        this(context, looper, i7, c3774d, (InterfaceC3686e) aVar, (InterfaceC3704n) bVar);
    }

    /* renamed from: d */
    public final Set m15074d(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C3774d getClientSettings() {
        return this.zab;
    }

    public C6863d[] getRequiredFeatures() {
        return new C6863d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.C3643a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    public AbstractC3780g(Context context, Looper looper, int i7, C3774d c3774d, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        this(context, looper, AbstractC3782h.m15078b(context), C6869j.m28253n(), i7, c3774d, (InterfaceC3686e) AbstractC3802r.m15129k(interfaceC3686e), (InterfaceC3704n) AbstractC3802r.m15129k(interfaceC3704n));
    }

    public AbstractC3780g(Context context, Looper looper, AbstractC3782h abstractC3782h, C6869j c6869j, int i7, C3774d c3774d, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        super(context, looper, abstractC3782h, c6869j, i7, interfaceC3686e == null ? null : new C3749G(interfaceC3686e), interfaceC3704n == null ? null : new C3750H(interfaceC3704n), c3774d.m15058j());
        this.zab = c3774d;
        this.zad = c3774d.m15049a();
        this.zac = m15074d(c3774d.m15052d());
    }
}
