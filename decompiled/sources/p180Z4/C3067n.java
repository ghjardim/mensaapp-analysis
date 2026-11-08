package p180Z4;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p061I4.C0664p;

/* renamed from: Z4.n */
/* loaded from: classes2.dex */
public class C3067n extends C0664p {
    @Override // p061I4.C0664p
    /* renamed from: g */
    public Object mo2670g(byte b7, ByteBuffer buffer) {
        AbstractC5469l.m23028e(buffer, "buffer");
        if (b7 == -127) {
            Long l7 = (Long) m2669f(buffer);
            if (l7 != null) {
                return EnumC3051M.f9483b.m11210a((int) l7.longValue());
            }
            return null;
        }
        if (b7 == -126) {
            Object m2669f = m2669f(buffer);
            List list = m2669f instanceof List ? (List) m2669f : null;
            if (list != null) {
                return C3048J.f9353c.m11176a(list);
            }
            return null;
        }
        if (b7 != -125) {
            return super.mo2670g(b7, buffer);
        }
        Object m2669f2 = m2669f(buffer);
        List list2 = m2669f2 instanceof List ? (List) m2669f2 : null;
        if (list2 != null) {
            return C3053O.f9490c.m11212a(list2);
        }
        return null;
    }

    @Override // p061I4.C0664p
    /* renamed from: p */
    public void mo2671p(ByteArrayOutputStream stream, Object obj) {
        AbstractC5469l.m23028e(stream, "stream");
        if (obj instanceof EnumC3051M) {
            stream.write(129);
            mo2671p(stream, Integer.valueOf(((EnumC3051M) obj).m11209f()));
        } else if (obj instanceof C3048J) {
            stream.write(130);
            mo2671p(stream, ((C3048J) obj).m11175b());
        } else if (!(obj instanceof C3053O)) {
            super.mo2671p(stream, obj);
        } else {
            stream.write(131);
            mo2671p(stream, ((C3053O) obj).m11211a());
        }
    }
}
