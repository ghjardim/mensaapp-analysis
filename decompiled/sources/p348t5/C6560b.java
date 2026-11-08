package p348t5;

import android.graphics.pdf.PdfRenderer;
import kotlin.jvm.internal.AbstractC5469l;
import p340s5.C6399b;
import p356u5.AbstractC6696d;

/* renamed from: t5.b */
/* loaded from: classes2.dex */
public final class C6560b extends AbstractC6561c {
    @Override // p348t5.AbstractC6561c
    /* renamed from: b */
    public void mo27272b(String id) {
        AbstractC5469l.m23028e(id, "id");
        ((C6399b) m27277d(id)).m26724a();
        super.mo27272b(id);
    }

    /* renamed from: f */
    public final C6399b m27274f(String documentId, PdfRenderer.Page pageRenderer) {
        AbstractC5469l.m23028e(documentId, "documentId");
        AbstractC5469l.m23028e(pageRenderer, "pageRenderer");
        String m27610b = AbstractC6696d.m27610b();
        C6399b c6399b = new C6399b(m27610b, documentId, pageRenderer);
        m27278e(m27610b, c6399b);
        return c6399b;
    }
}
