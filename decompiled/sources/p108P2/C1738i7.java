package p108P2;

import java.util.List;
import java.util.Map;

/* renamed from: P2.i7 */
/* loaded from: classes.dex */
public final class C1738i7 implements InterfaceC1574P2 {

    /* renamed from: a */
    public final /* synthetic */ String f5166a;

    /* renamed from: b */
    public final /* synthetic */ List f5167b;

    /* renamed from: c */
    public final /* synthetic */ C1828s7 f5168c;

    public C1738i7(C1828s7 c1828s7, String str, List list) {
        this.f5166a = str;
        this.f5167b = list;
        this.f5168c = c1828s7;
    }

    @Override // p108P2.InterfaceC1574P2
    /* renamed from: a */
    public final void mo5947a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f5168c.m6300D(true, i7, th, bArr, this.f5166a, this.f5167b);
    }
}
