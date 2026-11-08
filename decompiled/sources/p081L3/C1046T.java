package p081L3;

import java.util.HashMap;
import java.util.Map;
import p060I3.C0643e;
import p060I3.C0648j;

/* renamed from: L3.T */
/* loaded from: classes.dex */
public class C1046T implements InterfaceC1060a {

    /* renamed from: a */
    public final Map f3465a = new HashMap();

    /* renamed from: b */
    public final Map f3466b = new HashMap();

    @Override // p081L3.InterfaceC1060a
    /* renamed from: a */
    public C0643e mo4146a(String str) {
        return (C0643e) this.f3465a.get(str);
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: b */
    public void mo4147b(C0648j c0648j) {
        this.f3466b.put(c0648j.m2608b(), c0648j);
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: c */
    public void mo4148c(C0643e c0643e) {
        this.f3465a.put(c0643e.m2552a(), c0643e);
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: d */
    public C0648j mo4149d(String str) {
        return (C0648j) this.f3466b.get(str);
    }
}
