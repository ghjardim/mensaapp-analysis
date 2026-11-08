package p311p0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import p232g0.AbstractC4336z;
import p232g0.C4312b;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p311p0.C6054N;
import p311p0.C6082k;

/* renamed from: p0.E */
/* loaded from: classes.dex */
public final class C6045E implements C6054N.d {

    /* renamed from: a */
    public final Context f21537a;

    /* renamed from: b */
    public Boolean f21538b;

    /* renamed from: p0.E$a */
    public static final class a {
        /* renamed from: a */
        public static C6082k m25150a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            return !isOffloadedPlaybackSupported ? C6082k.f21741d : new C6082k.b().m25398e(true).m25400g(z6).m25397d();
        }
    }

    /* renamed from: p0.E$b */
    public static final class b {
        /* renamed from: a */
        public static C6082k m25151a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C6082k.f21741d;
            }
            return new C6082k.b().m25398e(true).m25399f(AbstractC5330M.f18800a > 32 && playbackOffloadSupport == 2).m25400g(z6).m25397d();
        }
    }

    public C6045E(Context context) {
        this.f21537a = context;
    }

    @Override // p311p0.C6054N.d
    /* renamed from: a */
    public C6082k mo25148a(C4327q c4327q, C4312b c4312b) {
        AbstractC5332a.m21800e(c4327q);
        AbstractC5332a.m21800e(c4312b);
        int i7 = AbstractC5330M.f18800a;
        if (i7 < 29 || c4327q.f15115C == -1) {
            return C6082k.f21741d;
        }
        boolean m25149b = m25149b(this.f21537a);
        int m18413f = AbstractC4336z.m18413f((String) AbstractC5332a.m21800e(c4327q.f15138n), c4327q.f15134j);
        if (m18413f == 0 || i7 < AbstractC5330M.m21693L(m18413f)) {
            return C6082k.f21741d;
        }
        int m21697N = AbstractC5330M.m21697N(c4327q.f15114B);
        if (m21697N == 0) {
            return C6082k.f21741d;
        }
        try {
            AudioFormat m21695M = AbstractC5330M.m21695M(c4327q.f15115C, m21697N, m18413f);
            return i7 >= 31 ? b.m25151a(m21695M, c4312b.m18123a().f15018a, m25149b) : a.m25150a(m21695M, c4312b.m18123a().f15018a, m25149b);
        } catch (IllegalArgumentException unused) {
            return C6082k.f21741d;
        }
    }

    /* renamed from: b */
    public final boolean m25149b(Context context) {
        Boolean bool = this.f21538b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.f21538b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f21538b = Boolean.FALSE;
            }
        } else {
            this.f21538b = Boolean.FALSE;
        }
        return this.f21538b.booleanValue();
    }
}
