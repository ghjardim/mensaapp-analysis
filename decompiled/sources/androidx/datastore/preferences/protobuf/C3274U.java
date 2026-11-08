package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentMap;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.U */
/* loaded from: classes.dex */
public final class C3274U {

    /* renamed from: c */
    public static final C3274U f10410c = new C3274U();

    /* renamed from: d */
    public static boolean f10411d = false;

    /* renamed from: b */
    public final ConcurrentMap f10413b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC3279Z f10412a = new C3256B();

    /* renamed from: a */
    public static C3274U m12181a() {
        return f10410c;
    }

    /* renamed from: b */
    public InterfaceC3278Y m12182b(Class cls, InterfaceC3278Y interfaceC3278Y) {
        AbstractC3312u.m12835b(cls, "messageType");
        AbstractC3312u.m12835b(interfaceC3278Y, "schema");
        return (InterfaceC3278Y) this.f10413b.putIfAbsent(cls, interfaceC3278Y);
    }

    /* renamed from: c */
    public InterfaceC3278Y m12183c(Class cls) {
        AbstractC3312u.m12835b(cls, "messageType");
        InterfaceC3278Y interfaceC3278Y = (InterfaceC3278Y) this.f10413b.get(cls);
        if (interfaceC3278Y != null) {
            return interfaceC3278Y;
        }
        InterfaceC3278Y mo12059a = this.f10412a.mo12059a(cls);
        InterfaceC3278Y m12182b = m12182b(cls, mo12059a);
        return m12182b != null ? m12182b : mo12059a;
    }

    /* renamed from: d */
    public InterfaceC3278Y m12184d(Object obj) {
        return m12183c(obj.getClass());
    }
}
