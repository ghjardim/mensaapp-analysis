package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3798p;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public final class C3680b {

    /* renamed from: a */
    public final int f12325a;

    /* renamed from: b */
    public final C3643a f12326b;

    /* renamed from: c */
    public final C3643a.d f12327c;

    /* renamed from: d */
    public final String f12328d;

    public C3680b(C3643a c3643a, C3643a.d dVar, String str) {
        this.f12326b = c3643a;
        this.f12327c = dVar;
        this.f12328d = str;
        this.f12325a = AbstractC3798p.m15100c(c3643a, dVar, str);
    }

    /* renamed from: a */
    public static C3680b m14903a(C3643a c3643a, C3643a.d dVar, String str) {
        return new C3680b(c3643a, dVar, str);
    }

    /* renamed from: b */
    public final String m14904b() {
        return this.f12326b.m14806c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3680b)) {
            return false;
        }
        C3680b c3680b = (C3680b) obj;
        return AbstractC3798p.m15099b(this.f12326b, c3680b.f12326b) && AbstractC3798p.m15099b(this.f12327c, c3680b.f12327c) && AbstractC3798p.m15099b(this.f12328d, c3680b.f12328d);
    }

    public final int hashCode() {
        return this.f12325a;
    }
}
