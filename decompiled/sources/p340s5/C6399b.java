package p340s5;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import java.io.File;
import kotlin.jvm.internal.AbstractC5469l;
import p356u5.AbstractC6695c;

/* renamed from: s5.b */
/* loaded from: classes2.dex */
public final class C6399b {

    /* renamed from: a */
    public final String f23100a;

    /* renamed from: b */
    public final String f23101b;

    /* renamed from: c */
    public final PdfRenderer.Page f23102c;

    /* renamed from: s5.b$a */
    public static final class a {

        /* renamed from: a */
        public final int f23103a;

        /* renamed from: b */
        public final int f23104b;

        /* renamed from: c */
        public final String f23105c;

        public a(int i7, int i8, String path) {
            AbstractC5469l.m23028e(path, "path");
            this.f23103a = i7;
            this.f23104b = i8;
            this.f23105c = path;
        }

        /* renamed from: a */
        public final int m26729a() {
            return this.f23104b;
        }

        /* renamed from: b */
        public final String m26730b() {
            return this.f23105c;
        }

        /* renamed from: c */
        public final int m26731c() {
            return this.f23103a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC5469l.m23024a(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type io.scer.pdfx.document.Page.Data");
            return this.f23105c.contentEquals(((a) obj).f23105c);
        }

        public int hashCode() {
            return (((this.f23103a * 31) + this.f23104b) * 31) + this.f23105c.hashCode();
        }

        public String toString() {
            return "Data(width=" + this.f23103a + ", height=" + this.f23104b + ", path=" + this.f23105c + ')';
        }
    }

    public C6399b(String id, String documentId, PdfRenderer.Page pageRenderer) {
        AbstractC5469l.m23028e(id, "id");
        AbstractC5469l.m23028e(documentId, "documentId");
        AbstractC5469l.m23028e(pageRenderer, "pageRenderer");
        this.f23100a = id;
        this.f23101b = documentId;
        this.f23102c = pageRenderer;
    }

    /* renamed from: a */
    public final void m26724a() {
        this.f23102c.close();
    }

    /* renamed from: b */
    public final int m26725b() {
        return this.f23102c.getHeight();
    }

    /* renamed from: c */
    public final String m26726c() {
        return this.f23100a;
    }

    /* renamed from: d */
    public final int m26727d() {
        return this.f23102c.getWidth();
    }

    /* renamed from: e */
    public final a m26728e(File file, int i7, int i8, int i9, int i10, boolean z6, int i11, int i12, int i13, int i14, int i15, boolean z7) {
        AbstractC5469l.m23028e(file, "file");
        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        AbstractC5469l.m23027d(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(i9);
        this.f23102c.render(createBitmap, null, null, z7 ? 2 : 1);
        if (!z6 || (i13 == i7 && i14 == i8)) {
            AbstractC6695c.m27607a(createBitmap, file, i10, i15);
            String absolutePath = file.getAbsolutePath();
            AbstractC5469l.m23027d(absolutePath, "getAbsolutePath(...)");
            return new a(i7, i8, absolutePath);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i11, i12, i13, i14);
        AbstractC5469l.m23027d(createBitmap2, "createBitmap(...)");
        AbstractC6695c.m27607a(createBitmap2, file, i10, i15);
        String absolutePath2 = file.getAbsolutePath();
        AbstractC5469l.m23027d(absolutePath2, "getAbsolutePath(...)");
        return new a(i13, i14, absolutePath2);
    }
}
