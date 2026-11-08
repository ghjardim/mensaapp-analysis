package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.Executor;
import p038F2.ExecutorC0330a;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes.dex */
public final class C3698k {

    /* renamed from: a */
    public final Executor f12373a;

    /* renamed from: b */
    public volatile Object f12374b;

    /* renamed from: c */
    public volatile a f12375c;

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    public static final class a {

        /* renamed from: a */
        public final Object f12376a;

        /* renamed from: b */
        public final String f12377b;

        public a(Object obj, String str) {
            this.f12376a = obj;
            this.f12377b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12376a == aVar.f12376a && this.f12377b.equals(aVar.f12377b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12376a) * 31) + this.f12377b.hashCode();
        }
    }

    public C3698k(Looper looper, Object obj, String str) {
        this.f12373a = new ExecutorC0330a(looper);
        this.f12374b = AbstractC3802r.m15130l(obj, "Listener must not be null");
        this.f12375c = new a(obj, AbstractC3802r.m15123e(str));
    }
}
