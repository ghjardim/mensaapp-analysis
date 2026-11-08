package p292n0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p036F0.C0322i;
import p036F0.InterfaceC0321h;
import p064J0.InterfaceC0675E;
import p071K0.C0821b;
import p259j0.AbstractC5346o;
import p311p0.C6054N;
import p311p0.C6069b0;
import p311p0.InterfaceC6095x;
import p311p0.InterfaceC6097z;
import p359v0.C6709g;
import p359v0.InterfaceC6705c;
import p366w0.C6825k;
import p366w0.InterfaceC6827m;
import p366w0.InterfaceC6840z;
import p373x0.C6942c;
import p373x0.InterfaceC6941b;

/* renamed from: n0.t */
/* loaded from: classes.dex */
public class C5757t implements InterfaceC5711Z0 {

    /* renamed from: a */
    public final Context f20951a;

    /* renamed from: b */
    public final C6825k f20952b;

    /* renamed from: e */
    public boolean f20955e;

    /* renamed from: g */
    public boolean f20957g;

    /* renamed from: h */
    public boolean f20958h;

    /* renamed from: c */
    public int f20953c = 0;

    /* renamed from: d */
    public long f20954d = 5000;

    /* renamed from: f */
    public InterfaceC6840z f20956f = InterfaceC6840z.f24635a;

    public C5757t(Context context) {
        this.f20951a = context;
        this.f20952b = new C6825k(context);
    }

    @Override // p292n0.InterfaceC5711Z0
    /* renamed from: a */
    public InterfaceC5703V0[] mo23932a(Handler handler, InterfaceC0675E interfaceC0675E, InterfaceC6095x interfaceC6095x, InterfaceC0321h interfaceC0321h, InterfaceC6941b interfaceC6941b) {
        ArrayList arrayList = new ArrayList();
        m24357i(this.f20951a, this.f20953c, this.f20956f, this.f20955e, handler, interfaceC0675E, this.f20954d, arrayList);
        InterfaceC6097z m24351c = m24351c(this.f20951a, this.f20957g, this.f20958h);
        if (m24351c != null) {
            m24350b(this.f20951a, this.f20953c, this.f20956f, this.f20955e, m24351c, handler, interfaceC6095x, arrayList);
        }
        m24356h(this.f20951a, interfaceC0321h, handler.getLooper(), this.f20953c, arrayList);
        m24354f(this.f20951a, interfaceC6941b, handler.getLooper(), this.f20953c, arrayList);
        m24352d(this.f20951a, this.f20953c, arrayList);
        m24353e(arrayList);
        m24355g(this.f20951a, handler, this.f20953c, arrayList);
        return (InterfaceC5703V0[]) arrayList.toArray(new InterfaceC5703V0[0]);
    }

    /* renamed from: b */
    public void m24350b(Context context, int i7, InterfaceC6840z interfaceC6840z, boolean z6, InterfaceC6097z interfaceC6097z, Handler handler, InterfaceC6095x interfaceC6095x, ArrayList arrayList) {
        String str;
        int i8;
        int i9;
        int i10;
        arrayList.add(new C6069b0(context, m24358j(), interfaceC6840z, z6, handler, interfaceC6095x, interfaceC6097z));
        if (i7 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i7 == 2) {
            size--;
        }
        try {
            try {
                i8 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    str = "DefaultRenderersFactory";
                    try {
                        AbstractC5346o.m21865f(str, "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i8;
                        i8 = size;
                        try {
                            i9 = i8 + 1;
                            arrayList.add(i8, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                            AbstractC5346o.m21865f(str, "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused2) {
                        }
                        try {
                            i10 = i9 + 1;
                            try {
                                arrayList.add(i9, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                                AbstractC5346o.m21865f(str, "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused3) {
                                i9 = i10;
                                i10 = i9;
                                arrayList.add(i10, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                                AbstractC5346o.m21865f(str, "Loaded FfmpegAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused4) {
                        }
                        arrayList.add(i10, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                        AbstractC5346o.m21865f(str, "Loaded FfmpegAudioRenderer.");
                    }
                } catch (ClassNotFoundException unused5) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating MIDI extension", e7);
            }
        } catch (ClassNotFoundException unused6) {
            str = "DefaultRenderersFactory";
        }
        try {
            i9 = i8 + 1;
            try {
                arrayList.add(i8, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                AbstractC5346o.m21865f(str, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused7) {
                i8 = i9;
                i9 = i8;
                i10 = i9 + 1;
                arrayList.add(i9, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                AbstractC5346o.m21865f(str, "Loaded LibflacAudioRenderer.");
                arrayList.add(i10, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                AbstractC5346o.m21865f(str, "Loaded FfmpegAudioRenderer.");
            }
            try {
                i10 = i9 + 1;
                arrayList.add(i9, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                AbstractC5346o.m21865f(str, "Loaded LibflacAudioRenderer.");
                try {
                    arrayList.add(i10, (InterfaceC5703V0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC6095x.class, InterfaceC6097z.class).newInstance(handler, interfaceC6095x, interfaceC6097z));
                    AbstractC5346o.m21865f(str, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused8) {
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e8);
                }
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating FLAC extension", e9);
            }
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating Opus extension", e10);
        }
    }

    /* renamed from: c */
    public InterfaceC6097z m24351c(Context context, boolean z6, boolean z7) {
        return new C6054N.f(context).m25246k(z6).m25245j(z7).m25244i();
    }

    /* renamed from: d */
    public void m24352d(Context context, int i7, ArrayList arrayList) {
        arrayList.add(new C0821b());
    }

    /* renamed from: e */
    public void m24353e(ArrayList arrayList) {
        arrayList.add(new C6709g(InterfaceC6705c.a.f24202a, null));
    }

    /* renamed from: f */
    public void m24354f(Context context, InterfaceC6941b interfaceC6941b, Looper looper, int i7, ArrayList arrayList) {
        arrayList.add(new C6942c(interfaceC6941b, looper));
    }

    /* renamed from: h */
    public void m24356h(Context context, InterfaceC0321h interfaceC0321h, Looper looper, int i7, ArrayList arrayList) {
        arrayList.add(new C0322i(interfaceC0321h, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:5|(1:7)|8|9|10|11|12|13|14|(2:15|16)|17|18|19|20|21|(3:23|24|25)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:15|16)|17|18|19|20|21|(3:23|24|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        r4 = r3;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m24357i(android.content.Context r22, int r23, p366w0.InterfaceC6840z r24, boolean r25, android.os.Handler r26, p064J0.InterfaceC0675E r27, long r28, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5757t.m24357i(android.content.Context, int, w0.z, boolean, android.os.Handler, J0.E, long, java.util.ArrayList):void");
    }

    /* renamed from: j */
    public InterfaceC6827m.b m24358j() {
        return this.f20952b;
    }

    /* renamed from: g */
    public void m24355g(Context context, Handler handler, int i7, ArrayList arrayList) {
    }
}
