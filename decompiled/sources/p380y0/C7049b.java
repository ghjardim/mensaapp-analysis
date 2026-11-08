package p380y0;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p050H0.C0547p;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C7049b implements C0547p.a {

    /* renamed from: a */
    public final C0547p.a f25141a;

    /* renamed from: b */
    public final List f25142b;

    public C7049b(C0547p.a aVar, List list) {
        this.f25141a = aVar;
        this.f25142b = list;
    }

    @Override // p050H0.C0547p.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7048a mo175a(Uri uri, InputStream inputStream) {
        InterfaceC7048a interfaceC7048a = (InterfaceC7048a) this.f25141a.mo175a(uri, inputStream);
        List list = this.f25142b;
        return (list == null || list.isEmpty()) ? interfaceC7048a : (InterfaceC7048a) interfaceC7048a.mo168a(this.f25142b);
    }
}
