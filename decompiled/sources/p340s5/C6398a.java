package p340s5;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: s5.a */
/* loaded from: classes2.dex */
public final class C6398a {

    /* renamed from: a */
    public final String f23097a;

    /* renamed from: b */
    public final PdfRenderer f23098b;

    /* renamed from: c */
    public final ParcelFileDescriptor f23099c;

    public C6398a(String id, PdfRenderer documentRenderer, ParcelFileDescriptor fileDescriptor) {
        AbstractC5469l.m23028e(id, "id");
        AbstractC5469l.m23028e(documentRenderer, "documentRenderer");
        AbstractC5469l.m23028e(fileDescriptor, "fileDescriptor");
        this.f23097a = id;
        this.f23098b = documentRenderer;
        this.f23099c = fileDescriptor;
    }

    /* renamed from: a */
    public final void m26720a() {
        this.f23098b.close();
        this.f23099c.close();
    }

    /* renamed from: b */
    public final String m26721b() {
        return this.f23097a;
    }

    /* renamed from: c */
    public final int m26722c() {
        return this.f23098b.getPageCount();
    }

    /* renamed from: d */
    public final PdfRenderer.Page m26723d(int i7) {
        PdfRenderer.Page openPage = this.f23098b.openPage(i7 - 1);
        AbstractC5469l.m23027d(openPage, "openPage(...)");
        return openPage;
    }
}
