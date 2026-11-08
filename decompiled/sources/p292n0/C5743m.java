package p292n0;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p232g0.C4312b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p272k4.C5410A;
import p292n0.C5743m;

/* renamed from: n0.m */
/* loaded from: classes.dex */
public final class C5743m {

    /* renamed from: a */
    public final AudioManager f20781a;

    /* renamed from: b */
    public final a f20782b;

    /* renamed from: c */
    public b f20783c;

    /* renamed from: d */
    public C4312b f20784d;

    /* renamed from: f */
    public int f20786f;

    /* renamed from: h */
    public AudioFocusRequest f20788h;

    /* renamed from: i */
    public boolean f20789i;

    /* renamed from: g */
    public float f20787g = 1.0f;

    /* renamed from: e */
    public int f20785e = 0;

    /* renamed from: n0.m$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f20790a;

        public a(Handler handler) {
            this.f20790a = handler;
        }

        /* renamed from: b */
        public final /* synthetic */ void m24159b(int i7) {
            C5743m.this.m24148h(i7);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i7) {
            this.f20790a.post(new Runnable() { // from class: n0.l
                @Override // java.lang.Runnable
                public final void run() {
                    C5743m.a.this.m24159b(i7);
                }
            });
        }
    }

    /* renamed from: n0.m$b */
    public interface b {
        /* renamed from: B */
        void mo24093B(float f7);

        /* renamed from: C */
        void mo24094C(int i7);
    }

    public C5743m(Context context, Handler handler, b bVar) {
        this.f20781a = (AudioManager) AbstractC5332a.m21800e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f20783c = bVar;
        this.f20782b = new a(handler);
    }

    /* renamed from: e */
    public static int m24142e(C4312b c4312b) {
        if (c4312b == null) {
            return 0;
        }
        switch (c4312b.f15014c) {
            case 0:
                AbstractC5346o.m21867h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c4312b.f15012a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                return 3;
            case 15:
            default:
                AbstractC5346o.m21867h("AudioFocusManager", "Unidentified audio usage: " + c4312b.f15014c);
                return 0;
            case 16:
                return 4;
        }
    }

    /* renamed from: a */
    public final void m24143a() {
        this.f20781a.abandonAudioFocus(this.f20782b);
    }

    /* renamed from: b */
    public final void m24144b() {
        int i7 = this.f20785e;
        if (i7 == 1 || i7 == 0) {
            return;
        }
        if (AbstractC5330M.f18800a >= 26) {
            m24145c();
        } else {
            m24143a();
        }
    }

    /* renamed from: c */
    public final void m24145c() {
        AudioFocusRequest audioFocusRequest = this.f20788h;
        if (audioFocusRequest != null) {
            this.f20781a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    public final void m24146f(int i7) {
        b bVar = this.f20783c;
        if (bVar != null) {
            bVar.mo24094C(i7);
        }
    }

    /* renamed from: g */
    public float m24147g() {
        return this.f20787g;
    }

    /* renamed from: h */
    public final void m24148h(int i7) {
        if (i7 == -3 || i7 == -2) {
            if (i7 != -2 && !m24157q()) {
                m24154n(4);
                return;
            } else {
                m24146f(0);
                m24154n(3);
                return;
            }
        }
        if (i7 == -1) {
            m24146f(-1);
            m24144b();
            m24154n(1);
        } else if (i7 == 1) {
            m24154n(2);
            m24146f(1);
        } else {
            AbstractC5346o.m21867h("AudioFocusManager", "Unknown focus change type: " + i7);
        }
    }

    /* renamed from: i */
    public void m24149i() {
        this.f20783c = null;
        m24144b();
        m24154n(0);
    }

    /* renamed from: j */
    public final int m24150j() {
        if (this.f20785e == 2) {
            return 1;
        }
        if ((AbstractC5330M.f18800a >= 26 ? m24152l() : m24151k()) == 1) {
            m24154n(2);
            return 1;
        }
        m24154n(1);
        return -1;
    }

    /* renamed from: k */
    public final int m24151k() {
        return this.f20781a.requestAudioFocus(this.f20782b, AbstractC5330M.m21760m0(((C4312b) AbstractC5332a.m21800e(this.f20784d)).f15014c), this.f20786f);
    }

    /* renamed from: l */
    public final int m24152l() {
        AudioFocusRequest.Builder m24115a;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f20788h;
        if (audioFocusRequest == null || this.f20789i) {
            if (audioFocusRequest == null) {
                AbstractC5724e.m24128a();
                m24115a = AbstractC5718c.m23949a(this.f20786f);
            } else {
                AbstractC5724e.m24128a();
                m24115a = AbstractC5721d.m24115a(this.f20788h);
            }
            boolean m24157q = m24157q();
            audioAttributes = m24115a.setAudioAttributes(((C4312b) AbstractC5332a.m21800e(this.f20784d)).m18123a().f15018a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(m24157q);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f20782b);
            build = onAudioFocusChangeListener.build();
            this.f20788h = build;
            this.f20789i = false;
        }
        requestAudioFocus = this.f20781a.requestAudioFocus(this.f20788h);
        return requestAudioFocus;
    }

    /* renamed from: m */
    public void m24153m(C4312b c4312b) {
        if (AbstractC5330M.m21729c(this.f20784d, c4312b)) {
            return;
        }
        this.f20784d = c4312b;
        int m24142e = m24142e(c4312b);
        this.f20786f = m24142e;
        boolean z6 = true;
        if (m24142e != 1 && m24142e != 0) {
            z6 = false;
        }
        AbstractC5332a.m21797b(z6, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* renamed from: n */
    public final void m24154n(int i7) {
        if (this.f20785e == i7) {
            return;
        }
        this.f20785e = i7;
        float f7 = i7 == 4 ? 0.2f : 1.0f;
        if (this.f20787g == f7) {
            return;
        }
        this.f20787g = f7;
        b bVar = this.f20783c;
        if (bVar != null) {
            bVar.mo24093B(f7);
        }
    }

    /* renamed from: o */
    public final boolean m24155o(int i7) {
        return i7 != 1 && this.f20786f == 1;
    }

    /* renamed from: p */
    public int m24156p(boolean z6, int i7) {
        if (!m24155o(i7)) {
            m24144b();
            m24154n(0);
            return 1;
        }
        if (z6) {
            return m24150j();
        }
        int i8 = this.f20785e;
        if (i8 != 1) {
            return i8 != 3 ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: q */
    public final boolean m24157q() {
        C4312b c4312b = this.f20784d;
        return c4312b != null && c4312b.f15012a == 1;
    }
}
