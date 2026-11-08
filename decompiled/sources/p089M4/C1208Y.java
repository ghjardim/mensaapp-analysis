package p089M4;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p061I4.C0664p;

/* renamed from: M4.Y */
/* loaded from: classes2.dex */
public class C1208Y extends C0664p {
    @Override // p061I4.C0664p
    /* renamed from: g */
    public Object mo2670g(byte b7, ByteBuffer buffer) {
        AbstractC5469l.m23028e(buffer, "buffer");
        if (b7 != -127) {
            return super.mo2670g(b7, buffer);
        }
        Object m2669f = m2669f(buffer);
        List list = m2669f instanceof List ? (List) m2669f : null;
        if (list != null) {
            return C1210a.f3870c.m4690a(list);
        }
        return null;
    }

    @Override // p061I4.C0664p
    /* renamed from: p */
    public void mo2671p(ByteArrayOutputStream stream, Object obj) {
        AbstractC5469l.m23028e(stream, "stream");
        if (!(obj instanceof C1210a)) {
            super.mo2671p(stream, obj);
        } else {
            stream.write(129);
            mo2671p(stream, ((C1210a) obj).m4689a());
        }
    }
}
