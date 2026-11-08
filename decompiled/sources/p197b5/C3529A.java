package p197b5;

import android.content.Context;
import android.util.LongSparseArray;
import io.flutter.plugin.platform.InterfaceC4772n;
import io.flutter.view.TextureRegistry;
import p012B4.C0055f;
import p026D4.InterfaceC0191a;
import p061I4.C0652d;
import p061I4.InterfaceC0651c;
import p197b5.AbstractC3545p;
import p197b5.AbstractC3548s;
import p205c5.C3585b;
import p205c5.C3588e;
import p213d5.C4130c;
import p256j$.util.Objects;
import p370w4.AbstractC6917b;
import p370w4.C6916a;

/* renamed from: b5.A */
/* loaded from: classes2.dex */
public class C3529A implements InterfaceC0191a, AbstractC3545p.a {

    /* renamed from: d */
    public a f11925d;

    /* renamed from: c */
    public final LongSparseArray f11924c = new LongSparseArray();

    /* renamed from: e */
    public final C3552w f11926e = new C3552w();

    /* renamed from: f */
    public Long f11927f = Long.MAX_VALUE;

    /* renamed from: b5.A$a */
    public static final class a {

        /* renamed from: a */
        public final Context f11928a;

        /* renamed from: b */
        public final InterfaceC0651c f11929b;

        /* renamed from: c */
        public final c f11930c;

        /* renamed from: d */
        public final b f11931d;

        /* renamed from: e */
        public final TextureRegistry f11932e;

        public a(Context context, InterfaceC0651c interfaceC0651c, c cVar, b bVar, TextureRegistry textureRegistry) {
            this.f11928a = context;
            this.f11929b = interfaceC0651c;
            this.f11930c = cVar;
            this.f11931d = bVar;
            this.f11932e = textureRegistry;
        }

        /* renamed from: a */
        public void m14228a(C3529A c3529a, InterfaceC0651c interfaceC0651c) {
            AbstractC3544o.m14283m(interfaceC0651c, c3529a);
        }

        /* renamed from: b */
        public void m14229b(InterfaceC0651c interfaceC0651c) {
            AbstractC3544o.m14283m(interfaceC0651c, null);
        }
    }

    /* renamed from: b5.A$b */
    public interface b {
        /* renamed from: a */
        String mo14230a(String str, String str2);
    }

    /* renamed from: b5.A$c */
    public interface c {
        /* renamed from: a */
        String mo14231a(String str);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        C6916a m28346e = C6916a.m28346e();
        Context m785a = bVar.m785a();
        InterfaceC0651c m786b = bVar.m786b();
        final C0055f m28349c = m28346e.m28349c();
        Objects.requireNonNull(m28349c);
        c cVar = new c() { // from class: b5.x
            @Override // p197b5.C3529A.c
            /* renamed from: a */
            public final String mo14231a(String str) {
                return C0055f.this.m137l(str);
            }
        };
        final C0055f m28349c2 = m28346e.m28349c();
        Objects.requireNonNull(m28349c2);
        a aVar = new a(m785a, m786b, cVar, new b() { // from class: b5.y
            @Override // p197b5.C3529A.b
            /* renamed from: a */
            public final String mo14230a(String str, String str2) {
                return C0055f.this.m138m(str, str2);
            }
        }, bVar.m789e());
        this.f11925d = aVar;
        aVar.m14228a(this, bVar.m786b());
        InterfaceC4772n m788d = bVar.m788d();
        final LongSparseArray longSparseArray = this.f11924c;
        Objects.requireNonNull(longSparseArray);
        m788d.mo20551a("plugins.flutter.dev/video_player_android", new C3585b(new C3585b.a() { // from class: b5.z
            @Override // p205c5.C3585b.a
            /* renamed from: a */
            public final AbstractC3549t mo14333a(Long l7) {
                return (AbstractC3549t) longSparseArray.get(l7.longValue());
            }
        }));
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: a */
    public void mo14213a() {
        m14225m();
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: b */
    public void mo14214b(Long l7) {
        m14226n(l7.longValue()).mo14314d();
        this.f11924c.remove(l7.longValue());
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: c */
    public void mo14215c(Long l7) {
        m14226n(l7.longValue()).m14318h();
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: d */
    public void mo14216d(Long l7, Double d7) {
        m14226n(l7.longValue()).m14322m(d7.doubleValue());
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: e */
    public void mo14217e(Long l7, Double d7) {
        m14226n(l7.longValue()).m14323n(d7.doubleValue());
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: f */
    public void mo14218f(Long l7, Long l8) {
        m14226n(l7.longValue()).m14319i(l8.intValue());
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: g */
    public void mo14219g(Long l7, Boolean bool) {
        m14226n(l7.longValue()).m14321l(bool.booleanValue());
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: h */
    public Long mo14220h(AbstractC3545p.b bVar) {
        AbstractC3548s m14309b;
        long mo20272id;
        AbstractC3549t m17319p;
        if (bVar.m14287b() != null) {
            m14309b = AbstractC3548s.m14308a("asset:///" + (bVar.m14290e() != null ? this.f11925d.f11931d.mo14230a(bVar.m14287b(), bVar.m14290e()) : this.f11925d.f11930c.mo14231a(bVar.m14287b())));
        } else if (bVar.m14291f().startsWith("rtsp://")) {
            m14309b = AbstractC3548s.m14310c(bVar.m14291f());
        } else {
            AbstractC3548s.a aVar = AbstractC3548s.a.UNKNOWN;
            String m14288c = bVar.m14288c();
            if (m14288c != null) {
                switch (m14288c) {
                    case "ss":
                        aVar = AbstractC3548s.a.SMOOTH;
                        break;
                    case "hls":
                        aVar = AbstractC3548s.a.HTTP_LIVE;
                        break;
                    case "dash":
                        aVar = AbstractC3548s.a.DYNAMIC_ADAPTIVE;
                        break;
                }
            }
            m14309b = AbstractC3548s.m14309b(bVar.m14291f(), aVar, bVar.m14289d());
        }
        if (bVar.m14292g() == AbstractC3545p.e.PLATFORM_VIEW) {
            Long l7 = this.f11927f;
            this.f11927f = Long.valueOf(l7.longValue() - 1);
            mo20272id = l7.longValue();
            m17319p = C3588e.m14457p(this.f11925d.f11928a, C3551v.m14331h(m14224l(mo20272id)), m14309b, this.f11926e);
        } else {
            TextureRegistry.SurfaceProducer mo20252c = this.f11925d.f11932e.mo20252c();
            mo20272id = mo20252c.mo20272id();
            m17319p = C4130c.m17319p(this.f11925d.f11928a, C3551v.m14331h(m14224l(mo20272id)), mo20252c, m14309b, this.f11926e);
        }
        this.f11924c.put(mo20272id, m17319p);
        return Long.valueOf(mo20272id);
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: i */
    public void mo14221i(Boolean bool) {
        this.f11926e.f11986a = bool.booleanValue();
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: j */
    public void mo14222j(Long l7) {
        m14226n(l7.longValue()).m14317g();
    }

    @Override // p197b5.AbstractC3545p.a
    /* renamed from: k */
    public Long mo14223k(Long l7) {
        AbstractC3549t m14226n = m14226n(l7.longValue());
        long m14316f = m14226n.m14316f();
        m14226n.m14320j();
        return Long.valueOf(m14316f);
    }

    /* renamed from: l */
    public final C0652d m14224l(long j7) {
        return new C0652d(this.f11925d.f11929b, "flutter.io/videoPlayer/videoEvents" + j7);
    }

    /* renamed from: m */
    public final void m14225m() {
        for (int i7 = 0; i7 < this.f11924c.size(); i7++) {
            ((AbstractC3549t) this.f11924c.valueAt(i7)).mo14314d();
        }
        this.f11924c.clear();
    }

    /* renamed from: n */
    public final AbstractC3549t m14226n(long j7) {
        AbstractC3549t abstractC3549t = (AbstractC3549t) this.f11924c.get(j7);
        if (abstractC3549t != null) {
            return abstractC3549t;
        }
        String str = "No player found with playerId <" + j7 + ">";
        if (this.f11924c.size() == 0) {
            str = str + " and no active players created by the plugin.";
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: o */
    public void m14227o() {
        m14225m();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        if (this.f11925d == null) {
            AbstractC6917b.m28361i("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f11925d.m14229b(bVar.m786b());
        this.f11925d = null;
        m14227o();
    }
}
