package p366w0;

import android.media.MediaCodecInfo;
import java.util.List;
import p259j0.AbstractC5330M;

/* renamed from: w0.v */
/* loaded from: classes.dex */
public abstract class AbstractC6836v {

    /* renamed from: a */
    public static Boolean f24555a;

    /* renamed from: w0.v$a */
    public static final class a {
        /* renamed from: a */
        public static int m28137a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            AbstractC6832r.m28130a();
            int m28138b = m28138b(supportedPerformancePoints, AbstractC6831q.m28129a(i7, i8, (int) d7));
            if (m28138b == 1 && AbstractC6836v.f24555a == null) {
                Boolean unused = AbstractC6836v.f24555a = Boolean.valueOf(m28139c());
                if (AbstractC6836v.f24555a.booleanValue()) {
                    return 0;
                }
            }
            return m28138b;
        }

        /* renamed from: b */
        public static int m28138b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i7 = 0; i7 < list.size(); i7++) {
                covers = AbstractC6834t.m28132a(list.get(i7)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            r4 = ((p366w0.C6830p) r1.get(r3)).f24547d.getVideoCapabilities().getSupportedPerformancePoints();
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean m28139c() {
            /*
                int r0 = p259j0.AbstractC5330M.f18800a
                r1 = 35
                r2 = 0
                if (r0 < r1) goto L8
                return r2
            L8:
                r0 = 1
                g0.q$b r1 = new g0.q$b     // Catch: p366w0.AbstractC6811I.c -> L71
                r1.<init>()     // Catch: p366w0.AbstractC6811I.c -> L71
                java.lang.String r3 = "video/avc"
                g0.q$b r1 = r1.m18264o0(r3)     // Catch: p366w0.AbstractC6811I.c -> L71
                g0.q r1 = r1.m18234K()     // Catch: p366w0.AbstractC6811I.c -> L71
                java.lang.String r3 = r1.f15138n     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r3 == 0) goto L71
                w0.z r3 = p366w0.InterfaceC6840z.f24635a     // Catch: p366w0.AbstractC6811I.c -> L71
                java.util.List r1 = p366w0.AbstractC6811I.m28003v(r3, r1, r2, r2)     // Catch: p366w0.AbstractC6811I.c -> L71
                r3 = r2
            L23:
                int r4 = r1.size()     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r3 >= r4) goto L71
                java.lang.Object r4 = r1.get(r3)     // Catch: p366w0.AbstractC6811I.c -> L71
                w0.p r4 = (p366w0.C6830p) r4     // Catch: p366w0.AbstractC6811I.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f24547d     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.get(r3)     // Catch: p366w0.AbstractC6811I.c -> L71
                w0.p r4 = (p366w0.C6830p) r4     // Catch: p366w0.AbstractC6811I.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f24547d     // Catch: p366w0.AbstractC6811I.c -> L71
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.get(r3)     // Catch: p366w0.AbstractC6811I.c -> L71
                w0.p r4 = (p366w0.C6830p) r4     // Catch: p366w0.AbstractC6811I.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f24547d     // Catch: p366w0.AbstractC6811I.c -> L71
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: p366w0.AbstractC6811I.c -> L71
                java.util.List r4 = p366w0.AbstractC6833s.m28131a(r4)     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r4 == 0) goto L6e
                boolean r5 = r4.isEmpty()     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r5 != 0) goto L6e
                p366w0.AbstractC6832r.m28130a()     // Catch: p366w0.AbstractC6811I.c -> L71
                r1 = 720(0x2d0, float:1.009E-42)
                r3 = 60
                r5 = 1280(0x500, float:1.794E-42)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = p366w0.AbstractC6831q.m28129a(r5, r1, r3)     // Catch: p366w0.AbstractC6811I.c -> L71
                int r1 = m28138b(r4, r1)     // Catch: p366w0.AbstractC6811I.c -> L71
                if (r1 != r0) goto L6d
                r2 = r0
            L6d:
                return r2
            L6e:
                int r3 = r3 + 1
                goto L23
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p366w0.AbstractC6836v.a.m28139c():boolean");
        }
    }

    /* renamed from: c */
    public static int m28136c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        if (AbstractC5330M.f18800a < 29) {
            return 0;
        }
        Boolean bool = f24555a;
        if (bool == null || !bool.booleanValue()) {
            return a.m28137a(videoCapabilities, i7, i8, d7);
        }
        return 0;
    }
}
