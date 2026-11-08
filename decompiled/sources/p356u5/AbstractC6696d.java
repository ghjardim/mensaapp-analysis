package p356u5;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p125R5.C2280f;

/* renamed from: u5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC6696d {
    /* renamed from: a */
    public static final String m27609a() {
        return new C2280f("-").m7723b(m27610b(), StringUtils.EMPTY);
    }

    /* renamed from: b */
    public static final String m27610b() {
        String uuid = UUID.randomUUID().toString();
        AbstractC5469l.m23027d(uuid, "toString(...)");
        return uuid;
    }
}
