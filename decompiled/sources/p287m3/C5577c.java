package p287m3;

import com.google.android.gms.common.internal.AbstractC3802r;
import p219e3.C4183m;
import p262j3.AbstractC5367c;
import p262j3.AbstractC5368d;

/* renamed from: m3.c */
/* loaded from: classes.dex */
public final class C5577c extends AbstractC5368d {

    /* renamed from: a */
    public final String f20152a;

    /* renamed from: b */
    public final C4183m f20153b;

    public C5577c(String str, C4183m c4183m) {
        AbstractC3802r.m15123e(str);
        this.f20152a = str;
        this.f20153b = c4183m;
    }

    /* renamed from: c */
    public static C5577c m23350c(AbstractC5367c abstractC5367c) {
        AbstractC3802r.m15129k(abstractC5367c);
        return new C5577c(abstractC5367c.mo22072b(), null);
    }

    /* renamed from: d */
    public static C5577c m23351d(C4183m c4183m) {
        return new C5577c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (C4183m) AbstractC3802r.m15129k(c4183m));
    }

    @Override // p262j3.AbstractC5368d
    /* renamed from: a */
    public Exception mo22073a() {
        return this.f20153b;
    }

    @Override // p262j3.AbstractC5368d
    /* renamed from: b */
    public String mo22074b() {
        return this.f20152a;
    }
}
