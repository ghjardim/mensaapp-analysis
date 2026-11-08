package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC3798p;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p368w2.C6863d;

/* renamed from: com.google.android.gms.common.api.internal.M */
/* loaded from: classes.dex */
public final class C3665M {

    /* renamed from: a */
    public final C3680b f12296a;

    /* renamed from: b */
    public final C6863d f12297b;

    public /* synthetic */ C3665M(C3680b c3680b, C6863d c6863d, AbstractC3664L abstractC3664L) {
        this.f12296a = c3680b;
        this.f12297b = c6863d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3665M)) {
            C3665M c3665m = (C3665M) obj;
            if (AbstractC3798p.m15099b(this.f12296a, c3665m.f12296a) && AbstractC3798p.m15099b(this.f12297b, c3665m.f12297b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f12296a, this.f12297b);
    }

    public final String toString() {
        return AbstractC3798p.m15101d(this).m15102a(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, this.f12296a).m15102a("feature", this.f12297b).toString();
    }
}
