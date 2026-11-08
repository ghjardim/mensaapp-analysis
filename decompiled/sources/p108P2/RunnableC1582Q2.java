package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Map;

/* renamed from: P2.Q2 */
/* loaded from: classes.dex */
public final class RunnableC1582Q2 implements Runnable {

    /* renamed from: a */
    public final InterfaceC1574P2 f4881a;

    /* renamed from: b */
    public final int f4882b;

    /* renamed from: c */
    public final Throwable f4883c;

    /* renamed from: d */
    public final byte[] f4884d;

    /* renamed from: e */
    public final String f4885e;

    /* renamed from: f */
    public final Map f4886f;

    public /* synthetic */ RunnableC1582Q2(String str, InterfaceC1574P2 interfaceC1574P2, int i7, Throwable th, byte[] bArr, Map map, AbstractC1597S2 abstractC1597S2) {
        AbstractC3802r.m15129k(interfaceC1574P2);
        this.f4881a = interfaceC1574P2;
        this.f4882b = i7;
        this.f4883c = th;
        this.f4884d = bArr;
        this.f4885e = str;
        this.f4886f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4881a.mo5947a(this.f4885e, this.f4882b, this.f4883c, this.f4884d, this.f4886f);
    }
}
