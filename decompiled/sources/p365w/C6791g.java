package p365w;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: w.g */
/* loaded from: classes.dex */
public final class C6791g {

    /* renamed from: a */
    public final boolean f24381a;

    /* renamed from: b */
    public Configuration f24382b;

    public C6791g(boolean z6) {
        this.f24381a = z6;
    }

    /* renamed from: a */
    public final boolean m27843a() {
        return this.f24381a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6791g(boolean z6, Configuration newConfig) {
        this(z6);
        AbstractC5469l.m23028e(newConfig, "newConfig");
        this.f24382b = newConfig;
    }
}
