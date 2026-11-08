package p197b5;

import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p197b5.AbstractC3545p;

/* renamed from: b5.o */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3544o {
    /* renamed from: a */
    public static InterfaceC0657i m14271a() {
        return AbstractC3545p.c.f11963d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m14272b(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            aVar.mo14213a();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: c */
    public static /* synthetic */ void m14273c(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo14220h((AbstractC3545p.b) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: d */
    public static /* synthetic */ void m14274d(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            aVar.mo14221i((Boolean) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m14275e(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            aVar.mo14214b((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: f */
    public static /* synthetic */ void m14276f(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            aVar.mo14219g((Long) arrayList2.get(0), (Boolean) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: g */
    public static /* synthetic */ void m14277g(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            aVar.mo14217e((Long) arrayList2.get(0), (Double) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: h */
    public static /* synthetic */ void m14278h(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            aVar.mo14216d((Long) arrayList2.get(0), (Double) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: i */
    public static /* synthetic */ void m14279i(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            aVar.mo14215c((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: j */
    public static /* synthetic */ void m14280j(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo14223k((Long) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: k */
    public static /* synthetic */ void m14281k(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            aVar.mo14218f((Long) arrayList2.get(0), (Long) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: l */
    public static /* synthetic */ void m14282l(AbstractC3545p.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            aVar.mo14222j((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3545p.m14285a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: m */
    public static void m14283m(InterfaceC0651c interfaceC0651c, AbstractC3545p.a aVar) {
        m14284n(interfaceC0651c, StringUtils.EMPTY, aVar);
    }

    /* renamed from: n */
    public static void m14284n(InterfaceC0651c interfaceC0651c, String str, final AbstractC3545p.a aVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize" + str2, m14271a());
        if (aVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: b5.d
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14272b(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create" + str2, m14271a());
        if (aVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: b5.g
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14273c(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose" + str2, m14271a());
        if (aVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: b5.h
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14275e(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping" + str2, m14271a());
        if (aVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: b5.i
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14276f(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
        C0649a c0649a5 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume" + str2, m14271a());
        if (aVar != null) {
            c0649a5.m2614e(new C0649a.d() { // from class: b5.j
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14277g(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a5.m2614e(null);
        }
        C0649a c0649a6 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed" + str2, m14271a());
        if (aVar != null) {
            c0649a6.m2614e(new C0649a.d() { // from class: b5.k
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14278h(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a6.m2614e(null);
        }
        C0649a c0649a7 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play" + str2, m14271a());
        if (aVar != null) {
            c0649a7.m2614e(new C0649a.d() { // from class: b5.l
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14279i(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a7.m2614e(null);
        }
        C0649a c0649a8 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position" + str2, m14271a());
        if (aVar != null) {
            c0649a8.m2614e(new C0649a.d() { // from class: b5.m
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14280j(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a8.m2614e(null);
        }
        C0649a c0649a9 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo" + str2, m14271a());
        if (aVar != null) {
            c0649a9.m2614e(new C0649a.d() { // from class: b5.n
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14281k(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a9.m2614e(null);
        }
        C0649a c0649a10 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause" + str2, m14271a());
        if (aVar != null) {
            c0649a10.m2614e(new C0649a.d() { // from class: b5.e
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14282l(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a10.m2614e(null);
        }
        C0649a c0649a11 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers" + str2, m14271a());
        if (aVar != null) {
            c0649a11.m2614e(new C0649a.d() { // from class: b5.f
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3544o.m14274d(AbstractC3545p.a.this, obj, eVar);
                }
            });
        } else {
            c0649a11.m2614e(null);
        }
    }
}
