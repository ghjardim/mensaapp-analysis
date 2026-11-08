package p354u3;

import p346t3.AbstractC6538w;

/* renamed from: u3.f */
/* loaded from: classes.dex */
public final class C6648f extends AbstractC6538w {

    /* renamed from: a */
    public String f24015a;

    /* renamed from: b */
    public String f24016b;

    /* renamed from: c */
    public boolean f24017c = false;

    /* renamed from: d */
    public boolean f24018d = false;

    @Override // p346t3.AbstractC6538w
    /* renamed from: a */
    public final void mo27127a(boolean z6) {
        this.f24018d = z6;
    }

    @Override // p346t3.AbstractC6538w
    /* renamed from: b */
    public final void mo27128b(boolean z6) {
        this.f24017c = z6;
    }

    @Override // p346t3.AbstractC6538w
    /* renamed from: c */
    public final void mo27129c(String str, String str2) {
        this.f24015a = str;
        this.f24016b = str2;
    }

    /* renamed from: d */
    public final String m27536d() {
        return this.f24015a;
    }

    /* renamed from: e */
    public final String m27537e() {
        return this.f24016b;
    }

    /* renamed from: f */
    public final boolean m27538f() {
        return this.f24018d;
    }

    /* renamed from: g */
    public final boolean m27539g() {
        return (this.f24015a == null || this.f24016b == null) ? false : true;
    }

    /* renamed from: h */
    public final boolean m27540h() {
        return this.f24017c;
    }
}
