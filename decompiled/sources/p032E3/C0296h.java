package p032E3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p011B3.C0044c;
import p011B3.InterfaceC0046e;
import p011B3.InterfaceC0047f;
import p018C3.InterfaceC0087a;
import p018C3.InterfaceC0088b;
import p032E3.C0296h;

/* renamed from: E3.h */
/* loaded from: classes.dex */
public class C0296h {

    /* renamed from: a */
    public final Map f1133a;

    /* renamed from: b */
    public final Map f1134b;

    /* renamed from: c */
    public final InterfaceC0046e f1135c;

    /* renamed from: E3.h$a */
    public static final class a implements InterfaceC0088b {

        /* renamed from: d */
        public static final InterfaceC0046e f1136d = new InterfaceC0046e() { // from class: E3.g
            @Override // p011B3.InterfaceC0043b
            /* renamed from: a */
            public final void mo105a(Object obj, Object obj2) {
                C0296h.a.m1184e(obj, (InterfaceC0047f) obj2);
            }
        };

        /* renamed from: a */
        public final Map f1137a = new HashMap();

        /* renamed from: b */
        public final Map f1138b = new HashMap();

        /* renamed from: c */
        public InterfaceC0046e f1139c = f1136d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m1184e(Object obj, InterfaceC0047f interfaceC0047f) {
            throw new C0044c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C0296h m1185c() {
            return new C0296h(new HashMap(this.f1137a), new HashMap(this.f1138b), this.f1139c);
        }

        /* renamed from: d */
        public a m1186d(InterfaceC0087a interfaceC0087a) {
            interfaceC0087a.mo235a(this);
            return this;
        }

        @Override // p018C3.InterfaceC0088b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo236a(Class cls, InterfaceC0046e interfaceC0046e) {
            this.f1137a.put(cls, interfaceC0046e);
            this.f1138b.remove(cls);
            return this;
        }
    }

    public C0296h(Map map, Map map2, InterfaceC0046e interfaceC0046e) {
        this.f1133a = map;
        this.f1134b = map2;
        this.f1135c = interfaceC0046e;
    }

    /* renamed from: a */
    public static a m1180a() {
        return new a();
    }

    /* renamed from: b */
    public void m1181b(Object obj, OutputStream outputStream) {
        new C0294f(outputStream, this.f1133a, this.f1134b, this.f1135c).m1177q(obj);
    }

    /* renamed from: c */
    public byte[] m1182c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m1181b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
