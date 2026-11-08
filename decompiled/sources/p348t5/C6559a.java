package p348t5;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.AbstractC5469l;
import p340s5.C6398a;
import p356u5.AbstractC6696d;
import p371w5.C6926i;

/* renamed from: t5.a */
/* loaded from: classes2.dex */
public final class C6559a extends AbstractC6561c {
    @Override // p348t5.AbstractC6561c
    /* renamed from: b */
    public void mo27272b(String id) {
        AbstractC5469l.m23028e(id, "id");
        ((C6398a) m27277d(id)).m26720a();
        super.mo27272b(id);
    }

    /* renamed from: f */
    public final C6398a m27273f(C6926i c6926i) {
        String m27610b = AbstractC6696d.m27610b();
        AbstractC5469l.m23025b(c6926i);
        C6398a c6398a = new C6398a(m27610b, (PdfRenderer) c6926i.m28369b(), (ParcelFileDescriptor) c6926i.m28368a());
        m27278e(m27610b, c6398a);
        return c6398a;
    }
}
