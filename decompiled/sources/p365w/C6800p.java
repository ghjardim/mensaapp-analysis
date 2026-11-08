package p365w;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: w.p */
/* loaded from: classes.dex */
public final class C6800p {

    /* renamed from: a */
    public final boolean f24468a;

    /* renamed from: b */
    public Configuration f24469b;

    public C6800p(boolean z6) {
        this.f24468a = z6;
    }

    /* renamed from: a */
    public final boolean m27953a() {
        return this.f24468a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6800p(boolean z6, Configuration newConfig) {
        this(z6);
        AbstractC5469l.m23028e(newConfig, "newConfig");
        this.f24469b = newConfig;
    }
}
