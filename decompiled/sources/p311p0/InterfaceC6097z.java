package p311p0;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import p232g0.C4297C;
import p232g0.C4312b;
import p232g0.C4315e;
import p232g0.C4327q;
import p259j0.InterfaceC5334c;
import p300o0.C5912w1;

/* renamed from: p0.z */
/* loaded from: classes.dex */
public interface InterfaceC6097z {

    /* renamed from: p0.z$a */
    public static final class a {

        /* renamed from: a */
        public final int f21779a;

        /* renamed from: b */
        public final int f21780b;

        /* renamed from: c */
        public final int f21781c;

        /* renamed from: d */
        public final boolean f21782d;

        /* renamed from: e */
        public final boolean f21783e;

        /* renamed from: f */
        public final int f21784f;

        public a(int i7, int i8, int i9, boolean z6, boolean z7, int i10) {
            this.f21779a = i7;
            this.f21780b = i8;
            this.f21781c = i9;
            this.f21782d = z6;
            this.f21783e = z7;
            this.f21784f = i10;
        }
    }

    /* renamed from: p0.z$c */
    public static final class c extends Exception {

        /* renamed from: a */
        public final int f21786a;

        /* renamed from: b */
        public final boolean f21787b;

        /* renamed from: c */
        public final C4327q f21788c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(int r4, int r5, int r6, int r7, p232g0.C4327q r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f21786a = r4
                r3.f21787b = r9
                r3.f21788c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p311p0.InterfaceC6097z.c.<init>(int, int, int, int, g0.q, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: p0.z$d */
    public interface d {
        /* renamed from: a */
        void mo25313a(long j7);

        /* renamed from: b */
        void mo25314b(a aVar);

        /* renamed from: c */
        void mo25315c(boolean z6);

        /* renamed from: d */
        void mo25316d(Exception exc);

        /* renamed from: e */
        void mo25317e(a aVar);

        /* renamed from: f */
        void mo25318f();

        /* renamed from: g */
        void mo25319g();

        /* renamed from: h */
        void mo25320h(int i7, long j7, long j8);

        /* renamed from: i */
        void mo25321i();

        /* renamed from: j */
        void mo25322j();

        /* renamed from: k */
        void mo25323k();
    }

    /* renamed from: p0.z$e */
    public static final class e extends Exception {

        /* renamed from: a */
        public final long f21789a;

        /* renamed from: b */
        public final long f21790b;

        public e(long j7, long j8) {
            super("Unexpected audio track timestamp discontinuity: expected " + j8 + ", got " + j7);
            this.f21789a = j7;
            this.f21790b = j8;
        }
    }

    /* renamed from: p0.z$f */
    public static final class f extends Exception {

        /* renamed from: a */
        public final int f21791a;

        /* renamed from: b */
        public final boolean f21792b;

        /* renamed from: c */
        public final C4327q f21793c;

        public f(int i7, C4327q c4327q, boolean z6) {
            super("AudioTrack write failed: " + i7);
            this.f21792b = z6;
            this.f21791a = i7;
            this.f21793c = c4327q;
        }
    }

    /* renamed from: A */
    void mo25177A(boolean z6);

    /* renamed from: B */
    void mo25178B(C4327q c4327q, int i7, int[] iArr);

    /* renamed from: a */
    boolean mo25190a(C4327q c4327q);

    /* renamed from: b */
    void mo25191b(AudioDeviceInfo audioDeviceInfo);

    /* renamed from: c */
    boolean mo25192c();

    /* renamed from: d */
    void mo25193d(C4297C c4297c);

    /* renamed from: e */
    void mo25195e();

    /* renamed from: f */
    void mo25197f();

    void flush();

    /* renamed from: g */
    void mo25199g(float f7);

    /* renamed from: h */
    void mo25201h();

    /* renamed from: i */
    C4297C mo25203i();

    /* renamed from: j */
    boolean mo25205j();

    /* renamed from: k */
    void mo25207k(C4315e c4315e);

    /* renamed from: l */
    void mo25208l(int i7);

    /* renamed from: m */
    void mo25210m(int i7, int i8);

    /* renamed from: n */
    void mo25212n(int i7);

    /* renamed from: o */
    long mo25214o(boolean z6);

    /* renamed from: p */
    void mo25216p();

    /* renamed from: q */
    void mo25217q(C4312b c4312b);

    /* renamed from: r */
    void mo25218r(InterfaceC5334c interfaceC5334c);

    void release();

    void reset();

    /* renamed from: s */
    void mo25220s(long j7);

    /* renamed from: t */
    void mo25222t();

    /* renamed from: u */
    void mo25224u(C5912w1 c5912w1);

    /* renamed from: v */
    void mo25226v(d dVar);

    /* renamed from: w */
    void mo25228w();

    /* renamed from: x */
    C6082k mo25229x(C4327q c4327q);

    /* renamed from: y */
    boolean mo25231y(ByteBuffer byteBuffer, long j7, int i7);

    /* renamed from: z */
    int mo25232z(C4327q c4327q);

    /* renamed from: p0.z$b */
    public static final class b extends Exception {

        /* renamed from: a */
        public final C4327q f21785a;

        public b(Throwable th, C4327q c4327q) {
            super(th);
            this.f21785a = c4327q;
        }

        public b(String str, C4327q c4327q) {
            super(str);
            this.f21785a = c4327q;
        }
    }
}
