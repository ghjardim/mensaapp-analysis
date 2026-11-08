package p061I4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p061I4.C0664p;
import p370w4.AbstractC6917b;

/* renamed from: I4.q */
/* loaded from: classes.dex */
public final class C0665q implements InterfaceC0660l {

    /* renamed from: b */
    public static final C0665q f2269b = new C0665q(C0664p.f2266a);

    /* renamed from: a */
    public final C0664p f2270a;

    public C0665q(C0664p c0664p) {
        this.f2270a = c0664p;
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: a */
    public C0658j mo2639a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object m2669f = this.f2270a.m2669f(byteBuffer);
        Object m2669f2 = this.f2270a.m2669f(byteBuffer);
        if (!(m2669f instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C0658j((String) m2669f, m2669f2);
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: b */
    public ByteBuffer mo2640b(Object obj) {
        C0664p.a aVar = new C0664p.a();
        aVar.write(0);
        this.f2270a.mo2671p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.m2672a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: c */
    public ByteBuffer mo2641c(String str, String str2, Object obj, String str3) {
        C0664p.a aVar = new C0664p.a();
        aVar.write(1);
        this.f2270a.mo2671p(aVar, str);
        this.f2270a.mo2671p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f2270a.mo2671p(aVar, AbstractC6917b.m28356d((Throwable) obj));
        } else {
            this.f2270a.mo2671p(aVar, obj);
        }
        this.f2270a.mo2671p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.m2672a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: d */
    public ByteBuffer mo2642d(String str, String str2, Object obj) {
        C0664p.a aVar = new C0664p.a();
        aVar.write(1);
        this.f2270a.mo2671p(aVar, str);
        this.f2270a.mo2671p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f2270a.mo2671p(aVar, AbstractC6917b.m28356d((Throwable) obj));
        } else {
            this.f2270a.mo2671p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.m2672a(), 0, aVar.size());
        return allocateDirect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // p061I4.InterfaceC0660l
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2643e(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            I4.p r0 = r4.f2270a
            java.lang.Object r0 = r0.m2669f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            I4.p r0 = r4.f2270a
            java.lang.Object r0 = r0.m2669f(r5)
            I4.p r1 = r4.f2270a
            java.lang.Object r1 = r1.m2669f(r5)
            I4.p r2 = r4.f2270a
            java.lang.Object r2 = r2.m2669f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            I4.e r5 = new I4.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p061I4.C0665q.mo2643e(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: f */
    public ByteBuffer mo2644f(C0658j c0658j) {
        C0664p.a aVar = new C0664p.a();
        this.f2270a.mo2671p(aVar, c0658j.f2254a);
        this.f2270a.mo2671p(aVar, c0658j.f2255b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.m2672a(), 0, aVar.size());
        return allocateDirect;
    }
}
