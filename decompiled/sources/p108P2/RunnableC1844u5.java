package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.net.URL;
import java.util.Map;

/* renamed from: P2.u5 */
/* loaded from: classes.dex */
public final class RunnableC1844u5 implements Runnable {

    /* renamed from: a */
    public final URL f5549a;

    /* renamed from: b */
    public final byte[] f5550b;

    /* renamed from: c */
    public final InterfaceC1817r5 f5551c;

    /* renamed from: d */
    public final String f5552d;

    /* renamed from: e */
    public final Map f5553e;

    /* renamed from: f */
    public final /* synthetic */ C1853v5 f5554f;

    public RunnableC1844u5(C1853v5 c1853v5, String str, URL url, byte[] bArr, Map map, InterfaceC1817r5 interfaceC1817r5) {
        this.f5554f = c1853v5;
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(url);
        AbstractC3802r.m15129k(interfaceC1817r5);
        this.f5549a = url;
        this.f5550b = bArr;
        this.f5551c = interfaceC1817r5;
        this.f5552d = str;
        this.f5553e = map;
    }

    /* renamed from: b */
    public final void m6426b(final int i7, final Exception exc, final byte[] bArr, final Map map) {
        this.f5554f.f5129a.mo5628f().m6446A(new Runnable() { // from class: P2.s5
            @Override // java.lang.Runnable
            public final void run() {
                r0.f5551c.mo5750a(RunnableC1844u5.this.f5552d, i7, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.RunnableC1844u5.run():void");
    }
}
