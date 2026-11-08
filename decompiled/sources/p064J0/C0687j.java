package p064J0;

import android.view.Surface;
import p366w0.C6829o;
import p366w0.C6830p;

/* renamed from: J0.j */
/* loaded from: classes.dex */
public class C0687j extends C6829o {

    /* renamed from: d */
    public final int f2351d;

    /* renamed from: e */
    public final boolean f2352e;

    public C0687j(Throwable th, C6830p c6830p, Surface surface) {
        super(th, c6830p);
        this.f2351d = System.identityHashCode(surface);
        this.f2352e = surface == null || surface.isValid();
    }
}
