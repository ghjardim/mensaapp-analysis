package p197b5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p061I4.C0652d;

/* renamed from: b5.v */
/* loaded from: classes2.dex */
public final class C3551v implements InterfaceC3550u {

    /* renamed from: a */
    public final C0652d.b f11984a;

    /* renamed from: b5.v$a */
    public class a implements C0652d.d {

        /* renamed from: a */
        public final /* synthetic */ C3546q f11985a;

        public a(C3546q c3546q) {
            this.f11985a = c3546q;
        }

        @Override // p061I4.C0652d.d
        /* renamed from: a */
        public void mo2635a(Object obj) {
            this.f11985a.m14307f(null);
        }

        @Override // p061I4.C0652d.d
        /* renamed from: c */
        public void mo2636c(Object obj, C0652d.b bVar) {
            this.f11985a.m14307f(bVar);
        }
    }

    public C3551v(C0652d.b bVar) {
        this.f11984a = bVar;
    }

    /* renamed from: h */
    public static C3551v m14331h(C0652d c0652d) {
        C3546q c3546q = new C3546q();
        c0652d.m2628d(new a(c3546q));
        return m14332i(c3546q);
    }

    /* renamed from: i */
    public static C3551v m14332i(C0652d.b bVar) {
        return new C3551v(bVar);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: a */
    public void mo14324a(long j7) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(j7))));
        this.f11984a.mo2629a(hashMap);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: b */
    public void mo14325b(boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "isPlayingStateUpdate");
        hashMap.put("isPlaying", Boolean.valueOf(z6));
        this.f11984a.mo2629a(hashMap);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: c */
    public void mo14326c(int i7, int i8, long j7, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "initialized");
        hashMap.put("width", Integer.valueOf(i7));
        hashMap.put("height", Integer.valueOf(i8));
        hashMap.put("duration", Long.valueOf(j7));
        if (i9 != 0) {
            hashMap.put("rotationCorrection", Integer.valueOf(i9));
        }
        this.f11984a.mo2629a(hashMap);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: d */
    public void mo14327d(String str, String str2, Object obj) {
        this.f11984a.mo2630b(str, str2, obj);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: e */
    public void mo14328e() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingEnd");
        this.f11984a.mo2629a(hashMap);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: f */
    public void mo14329f() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingStart");
        this.f11984a.mo2629a(hashMap);
    }

    @Override // p197b5.InterfaceC3550u
    /* renamed from: g */
    public void mo14330g() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "completed");
        this.f11984a.mo2629a(hashMap);
    }
}
