package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3647e;

/* renamed from: com.google.android.gms.common.api.internal.P */
/* loaded from: classes.dex */
public final class C3668P extends AbstractC3656D {

    /* renamed from: c */
    public final AbstractC3647e f12306c;

    public C3668P(AbstractC3647e abstractC3647e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f12306c = abstractC3647e;
    }

    @Override // com.google.android.gms.common.api.AbstractC3648f
    /* renamed from: a */
    public final AbstractC3684d mo14815a(AbstractC3684d abstractC3684d) {
        return this.f12306c.doRead((AbstractC3647e) abstractC3684d);
    }

    @Override // com.google.android.gms.common.api.AbstractC3648f
    /* renamed from: b */
    public final AbstractC3684d mo14816b(AbstractC3684d abstractC3684d) {
        return this.f12306c.doWrite((AbstractC3647e) abstractC3684d);
    }

    @Override // com.google.android.gms.common.api.AbstractC3648f
    /* renamed from: d */
    public final Looper mo14817d() {
        return this.f12306c.getLooper();
    }
}
