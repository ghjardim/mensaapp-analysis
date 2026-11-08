package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3643a;

/* renamed from: com.google.android.gms.common.internal.y */
/* loaded from: classes.dex */
public class C3816y implements C3643a.d, C3643a.d.b {

    /* renamed from: b */
    public static final C3816y f12581b = m15158a().m15160a();

    /* renamed from: a */
    public final String f12582a;

    /* renamed from: com.google.android.gms.common.internal.y$a */
    public static class a {

        /* renamed from: a */
        public String f12583a;

        public /* synthetic */ a(AbstractC3743A abstractC3743A) {
        }

        /* renamed from: a */
        public C3816y m15160a() {
            return new C3816y(this.f12583a, null);
        }

        /* renamed from: b */
        public a m15161b(String str) {
            this.f12583a = str;
            return this;
        }
    }

    public /* synthetic */ C3816y(String str, AbstractC3744B abstractC3744B) {
        this.f12582a = str;
    }

    /* renamed from: a */
    public static a m15158a() {
        return new a(null);
    }

    /* renamed from: b */
    public final Bundle m15159b() {
        Bundle bundle = new Bundle();
        String str = this.f12582a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3816y) {
            return AbstractC3798p.m15099b(this.f12582a, ((C3816y) obj).f12582a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f12582a);
    }
}
