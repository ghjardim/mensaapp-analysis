package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p368w2.C6863d;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
public abstract class AbstractC3720v {

    /* renamed from: a */
    public final C6863d[] f12399a;

    /* renamed from: b */
    public final boolean f12400b;

    /* renamed from: c */
    public final int f12401c;

    /* renamed from: com.google.android.gms.common.api.internal.v$a */
    public static class a {

        /* renamed from: a */
        public InterfaceC3712r f12402a;

        /* renamed from: c */
        public C6863d[] f12404c;

        /* renamed from: b */
        public boolean f12403b = true;

        /* renamed from: d */
        public int f12405d = 0;

        public /* synthetic */ a(AbstractC3687e0 abstractC3687e0) {
        }

        /* renamed from: a */
        public AbstractC3720v m14990a() {
            AbstractC3802r.m15120b(this.f12402a != null, "execute parameter required");
            return new C3685d0(this, this.f12404c, this.f12403b, this.f12405d);
        }

        /* renamed from: b */
        public a m14991b(InterfaceC3712r interfaceC3712r) {
            this.f12402a = interfaceC3712r;
            return this;
        }

        /* renamed from: c */
        public a m14992c(boolean z6) {
            this.f12403b = z6;
            return this;
        }

        /* renamed from: d */
        public a m14993d(C6863d... c6863dArr) {
            this.f12404c = c6863dArr;
            return this;
        }

        /* renamed from: e */
        public a m14994e(int i7) {
            this.f12405d = i7;
            return this;
        }
    }

    public AbstractC3720v(C6863d[] c6863dArr, boolean z6, int i7) {
        this.f12399a = c6863dArr;
        boolean z7 = false;
        if (c6863dArr != null && z6) {
            z7 = true;
        }
        this.f12400b = z7;
        this.f12401c = i7;
    }

    /* renamed from: a */
    public static a m14985a() {
        return new a(null);
    }

    /* renamed from: b */
    public abstract void mo14916b(C3643a.b bVar, TaskCompletionSource taskCompletionSource);

    /* renamed from: c */
    public boolean m14986c() {
        return this.f12400b;
    }

    /* renamed from: d */
    public final int m14987d() {
        return this.f12401c;
    }

    /* renamed from: e */
    public final C6863d[] m14988e() {
        return this.f12399a;
    }
}
