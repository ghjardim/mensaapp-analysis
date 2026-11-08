package p259j0;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p232g0.C4318h;

/* renamed from: j0.r */
/* loaded from: classes.dex */
public abstract class AbstractC5349r {
    /* renamed from: a */
    public static void m21880a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m21881b(MediaFormat mediaFormat, C4318h c4318h) {
        if (c4318h != null) {
            m21883d(mediaFormat, "color-transfer", c4318h.f15042c);
            m21883d(mediaFormat, "color-standard", c4318h.f15040a);
            m21883d(mediaFormat, "color-range", c4318h.f15041b);
            m21880a(mediaFormat, "hdr-static-info", c4318h.f15043d);
        }
    }

    /* renamed from: c */
    public static void m21882c(MediaFormat mediaFormat, String str, float f7) {
        if (f7 != -1.0f) {
            mediaFormat.setFloat(str, f7);
        }
    }

    /* renamed from: d */
    public static void m21883d(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    /* renamed from: e */
    public static void m21884e(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer("csd-" + i7, ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }
}
