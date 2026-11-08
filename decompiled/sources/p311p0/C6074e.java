package p311p0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p178Z2.AbstractC3037z;
import p203c3.AbstractC3577g;
import p232g0.AbstractC4336z;
import p232g0.C4312b;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: p0.e */
/* loaded from: classes.dex */
public final class C6074e {

    /* renamed from: c */
    public static final C6074e f21708c = new C6074e(AbstractC3033v.m11051u(e.f21713d));

    /* renamed from: d */
    public static final AbstractC3033v f21709d = AbstractC3033v.m11053x(2, 5, 6);

    /* renamed from: e */
    public static final AbstractC3035x f21710e = new AbstractC3035x.a().m11086f(5, 6).m11086f(17, 6).m11086f(7, 6).m11086f(30, 10).m11086f(18, 6).m11086f(6, 8).m11086f(8, 8).m11086f(14, 8).m11083c();

    /* renamed from: a */
    public final SparseArray f21711a;

    /* renamed from: b */
    public final int f21712b;

    /* renamed from: p0.e$b */
    public static final class b {
        /* renamed from: a */
        private static AbstractC3037z m25364a() {
            AbstractC3037z.a m11116i = new AbstractC3037z.a().m11116i(8, 7);
            int i7 = AbstractC5330M.f18800a;
            if (i7 >= 31) {
                m11116i.m11116i(26, 27);
            }
            if (i7 >= 33) {
                m11116i.mo11040a(30);
            }
            return m11116i.m11119l();
        }

        /* renamed from: b */
        public static boolean m25365b(AudioManager audioManager, C6081j c6081j) {
            AudioDeviceInfo[] devices = c6081j == null ? ((AudioManager) AbstractC5332a.m21800e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c6081j.f21740a};
            AbstractC3037z m25364a = m25364a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (m25364a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: p0.e$c */
    public static final class c {
        /* renamed from: a */
        public static AbstractC3033v m25366a(C4312b c4312b) {
            boolean isDirectPlaybackSupported;
            AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
            AbstractC3010Y it = C6074e.f21710e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (AbstractC5330M.f18800a >= AbstractC5330M.m21693L(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c4312b.m18123a().f15018a);
                    if (isDirectPlaybackSupported) {
                        m11045m.mo11040a(num);
                    }
                }
            }
            m11045m.mo11040a(2);
            return m11045m.m11063k();
        }

        /* renamed from: b */
        public static int m25367b(int i7, int i8, C4312b c4312b) {
            boolean isDirectPlaybackSupported;
            for (int i9 = 10; i9 > 0; i9--) {
                int m21697N = AbstractC5330M.m21697N(i9);
                if (m21697N != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(m21697N).build(), c4312b.m18123a().f15018a);
                    if (isDirectPlaybackSupported) {
                        return i9;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: p0.e$d */
    public static final class d {
        /* renamed from: a */
        public static C6074e m25368a(AudioManager audioManager, C4312b c4312b) {
            List directProfilesForAttributes;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c4312b.m18123a().f15018a);
            return new C6074e(C6074e.m25354c(directProfilesForAttributes));
        }

        /* renamed from: b */
        public static C6081j m25369b(AudioManager audioManager, C4312b c4312b) {
            List audioDevicesForAttributes;
            try {
                audioDevicesForAttributes = ((AudioManager) AbstractC5332a.m21800e(audioManager)).getAudioDevicesForAttributes(c4312b.m18123a().f15018a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new C6081j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static boolean m25353b() {
        String str = AbstractC5330M.f18802c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* renamed from: c */
    public static AbstractC3033v m25354c(List list) {
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(AbstractC3577g.m14420c(12)));
        for (int i7 = 0; i7 < list.size(); i7++) {
            AudioProfile m25276a = AbstractC6066a.m25276a(list.get(i7));
            encapsulationType = m25276a.getEncapsulationType();
            if (encapsulationType != 1) {
                format = m25276a.getFormat();
                if (AbstractC5330M.m21674B0(format) || f21710e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) AbstractC5332a.m21800e((Set) hashMap.get(Integer.valueOf(format)));
                        channelMasks2 = m25276a.getChannelMasks();
                        set.addAll(AbstractC3577g.m14420c(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = m25276a.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(AbstractC3577g.m14420c(channelMasks)));
                    }
                }
            }
        }
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        for (Map.Entry entry : hashMap.entrySet()) {
            m11045m.mo11040a(new e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return m11045m.m11063k();
    }

    /* renamed from: d */
    public static AbstractC3033v m25355d(int[] iArr, int i7) {
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i8 : iArr) {
            m11045m.mo11040a(new e(i8, i7));
        }
        return m11045m.m11063k();
    }

    /* renamed from: e */
    public static C6074e m25356e(Context context, C4312b c4312b, AudioDeviceInfo audioDeviceInfo) {
        return m25358g(context, c4312b, (AbstractC5330M.f18800a < 23 || audioDeviceInfo == null) ? null : new C6081j(audioDeviceInfo));
    }

    /* renamed from: f */
    public static C6074e m25357f(Context context, Intent intent, C4312b c4312b, C6081j c6081j) {
        AudioManager audioManager = (AudioManager) AbstractC5332a.m21800e(context.getSystemService("audio"));
        if (c6081j == null) {
            c6081j = AbstractC5330M.f18800a >= 33 ? d.m25369b(audioManager, c4312b) : null;
        }
        int i7 = AbstractC5330M.f18800a;
        if (i7 >= 33 && (AbstractC5330M.m21682F0(context) || AbstractC5330M.m21785y0(context))) {
            return d.m25368a(audioManager, c4312b);
        }
        if (i7 >= 23 && b.m25365b(audioManager, c6081j)) {
            return f21708c;
        }
        AbstractC3037z.a aVar = new AbstractC3037z.a();
        aVar.mo11040a(2);
        if (i7 >= 29 && (AbstractC5330M.m21682F0(context) || AbstractC5330M.m21785y0(context))) {
            aVar.m11117j(c.m25366a(c4312b));
            return new C6074e(m25355d(AbstractC3577g.m14431n(aVar.m11119l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z6 || m25353b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.m11117j(f21709d);
        }
        if (intent == null || z6 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C6074e(m25355d(AbstractC3577g.m14431n(aVar.m11119l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.m11117j(AbstractC3577g.m14420c(intArrayExtra));
        }
        return new C6074e(m25355d(AbstractC3577g.m14431n(aVar.m11119l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* renamed from: g */
    public static C6074e m25358g(Context context, C4312b c4312b, C6081j c6081j) {
        return m25357f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c4312b, c6081j);
    }

    /* renamed from: h */
    public static int m25359h(int i7) {
        int i8 = AbstractC5330M.f18800a;
        if (i8 <= 28) {
            if (i7 == 7) {
                i7 = 8;
            } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                i7 = 6;
            }
        }
        if (i8 <= 26 && "fugu".equals(AbstractC5330M.f18801b) && i7 == 1) {
            i7 = 2;
        }
        return AbstractC5330M.m21697N(i7);
    }

    /* renamed from: j */
    public static Uri m25360j() {
        if (m25353b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6074e)) {
            return false;
        }
        C6074e c6074e = (C6074e) obj;
        return AbstractC5330M.m21774t(this.f21711a, c6074e.f21711a) && this.f21712b == c6074e.f21712b;
    }

    public int hashCode() {
        return this.f21712b + (AbstractC5330M.m21776u(this.f21711a) * 31);
    }

    /* renamed from: i */
    public Pair m25361i(C4327q c4327q, C4312b c4312b) {
        int m18413f = AbstractC4336z.m18413f((String) AbstractC5332a.m21800e(c4327q.f15138n), c4327q.f15134j);
        if (!f21710e.containsKey(Integer.valueOf(m18413f))) {
            return null;
        }
        if (m18413f == 18 && !m25363l(18)) {
            m18413f = 6;
        } else if ((m18413f == 8 && !m25363l(8)) || (m18413f == 30 && !m25363l(30))) {
            m18413f = 7;
        }
        if (!m25363l(m18413f)) {
            return null;
        }
        e eVar = (e) AbstractC5332a.m21800e((e) this.f21711a.get(m18413f));
        int i7 = c4327q.f15114B;
        if (i7 == -1 || m18413f == 18) {
            int i8 = c4327q.f15115C;
            if (i8 == -1) {
                i8 = 48000;
            }
            i7 = eVar.m25371b(i8, c4312b);
        } else if (!c4327q.f15138n.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC5330M.f18800a >= 33) {
            if (!eVar.m25372c(i7)) {
                return null;
            }
        } else if (i7 > 10) {
            return null;
        }
        int m25359h = m25359h(i7);
        if (m25359h == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(m18413f), Integer.valueOf(m25359h));
    }

    /* renamed from: k */
    public boolean m25362k(C4327q c4327q, C4312b c4312b) {
        return m25361i(c4327q, c4312b) != null;
    }

    /* renamed from: l */
    public boolean m25363l(int i7) {
        return AbstractC5330M.m21770r(this.f21711a, i7);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f21712b + ", audioProfiles=" + this.f21711a + "]";
    }

    public C6074e(List list) {
        this.f21711a = new SparseArray();
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            this.f21711a.put(eVar.f21714a, eVar);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f21711a.size(); i9++) {
            i8 = Math.max(i8, ((e) this.f21711a.valueAt(i9)).f21715b);
        }
        this.f21712b = i8;
    }

    /* renamed from: p0.e$e */
    public static final class e {

        /* renamed from: d */
        public static final e f21713d;

        /* renamed from: a */
        public final int f21714a;

        /* renamed from: b */
        public final int f21715b;

        /* renamed from: c */
        public final AbstractC3037z f21716c;

        static {
            f21713d = AbstractC5330M.f18800a >= 33 ? new e(2, m25370a(10)) : new e(2, 10);
        }

        public e(int i7, Set set) {
            this.f21714a = i7;
            AbstractC3037z m11106o = AbstractC3037z.m11106o(set);
            this.f21716c = m11106o;
            AbstractC3010Y it = m11106o.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                i8 = Math.max(i8, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f21715b = i8;
        }

        /* renamed from: a */
        public static AbstractC3037z m25370a(int i7) {
            AbstractC3037z.a aVar = new AbstractC3037z.a();
            for (int i8 = 1; i8 <= i7; i8++) {
                aVar.mo11040a(Integer.valueOf(AbstractC5330M.m21697N(i8)));
            }
            return aVar.m11119l();
        }

        /* renamed from: b */
        public int m25371b(int i7, C4312b c4312b) {
            return this.f21716c != null ? this.f21715b : AbstractC5330M.f18800a >= 29 ? c.m25367b(this.f21714a, i7, c4312b) : ((Integer) AbstractC5332a.m21800e((Integer) C6074e.f21710e.getOrDefault(Integer.valueOf(this.f21714a), 0))).intValue();
        }

        /* renamed from: c */
        public boolean m25372c(int i7) {
            if (this.f21716c == null) {
                return i7 <= this.f21715b;
            }
            int m21697N = AbstractC5330M.m21697N(i7);
            if (m21697N == 0) {
                return false;
            }
            return this.f21716c.contains(Integer.valueOf(m21697N));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f21714a == eVar.f21714a && this.f21715b == eVar.f21715b && AbstractC5330M.m21729c(this.f21716c, eVar.f21716c);
        }

        public int hashCode() {
            int i7 = ((this.f21714a * 31) + this.f21715b) * 31;
            AbstractC3037z abstractC3037z = this.f21716c;
            return i7 + (abstractC3037z == null ? 0 : abstractC3037z.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f21714a + ", maxChannelCount=" + this.f21715b + ", channelMasks=" + this.f21716c + "]";
        }

        public e(int i7, int i8) {
            this.f21714a = i7;
            this.f21715b = i8;
            this.f21716c = null;
        }
    }
}
