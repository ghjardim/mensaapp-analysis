package com.google.android.gms.common.api;

import p368w2.C6863d;

/* renamed from: com.google.android.gms.common.api.q */
/* loaded from: classes.dex */
public final class C3734q extends UnsupportedOperationException {

    /* renamed from: a */
    public final C6863d f12416a;

    public C3734q(C6863d c6863d) {
        this.f12416a = c6863d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f12416a));
    }
}
