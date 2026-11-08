package p332r5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0068l;
import p026D4.InterfaceC0191a;
import p048G5.AbstractC0470e;
import p055H5.AbstractC0590a;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2329G0;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2384i;
import p132S5.AbstractC2388k;
import p132S5.C2363Y;
import p132S5.InterfaceC2334J;
import p340s5.C6398a;
import p340s5.C6399b;
import p347t4.AbstractC6546a;
import p348t5.C6559a;
import p348t5.C6560b;
import p348t5.C6562d;
import p356u5.AbstractC6695c;
import p356u5.AbstractC6696d;
import p356u5.C6694b;
import p371w5.AbstractC6928k;
import p371w5.C6926i;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: r5.b */
/* loaded from: classes2.dex */
public final class C6297b implements AbstractC6546a.g {

    /* renamed from: a */
    public final InterfaceC0191a.b f22816a;

    /* renamed from: b */
    public final C6559a f22817b;

    /* renamed from: c */
    public final C6560b f22818c;

    /* renamed from: d */
    public final SparseArray f22819d;

    /* renamed from: e */
    public final SparseArray f22820e;

    /* renamed from: r5.b$b */
    public static final class b extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f22824a;

        /* renamed from: b */
        public /* synthetic */ Object f22825b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC6546a.j f22826c;

        /* renamed from: d */
        public final /* synthetic */ C6297b f22827d;

        /* renamed from: e */
        public final /* synthetic */ AbstractC6546a.m f22828e;

        /* renamed from: f */
        public final /* synthetic */ AbstractC6546a.k f22829f;

        /* renamed from: r5.b$b$a */
        public static final class a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f22830a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC6546a.k f22831b;

            /* renamed from: c */
            public final /* synthetic */ C6399b.a f22832c;

            /* renamed from: d */
            public final /* synthetic */ AbstractC6546a.m f22833d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC6546a.k kVar, C6399b.a aVar, AbstractC6546a.m mVar, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f22831b = kVar;
                this.f22832c = aVar;
                this.f22833d = mVar;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return new a(this.f22831b, this.f22832c, this.f22833d, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f22830a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                this.f22831b.m27203d(this.f22832c.m26730b());
                this.f22831b.m27204e(AbstractC0058b.m152d(this.f22832c.m26731c()));
                this.f22831b.m27202c(AbstractC0058b.m152d(this.f22832c.m26729a()));
                this.f22833d.mo27214a(this.f22831b);
                return C6934q.f24811a;
            }
        }

        /* renamed from: r5.b$b$b, reason: collision with other inner class name */
        public static final class C7239b extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f22834a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC6546a.m f22835b;

            /* renamed from: c */
            public final /* synthetic */ Exception f22836c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7239b(AbstractC6546a.m mVar, Exception exc, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f22835b = mVar;
                this.f22836c = exc;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((C7239b) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return new C7239b(this.f22835b, this.f22836c, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f22834a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                this.f22835b.mo27215b(new C6299d("pdf_renderer", "Unexpected error", this.f22836c));
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC6546a.j jVar, C6297b c6297b, AbstractC6546a.m mVar, AbstractC6546a.k kVar, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f22826c = jVar;
            this.f22827d = c6297b;
            this.f22828e = mVar;
            this.f22829f = kVar;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((b) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            b bVar = new b(this.f22826c, this.f22827d, this.f22828e, this.f22829f, interfaceC7157e);
            bVar.f22825b = obj;
            return bVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Long m27186l;
            Long m27178d;
            Long m27180f;
            Long m27179e;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f22824a;
            try {
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    String m27184j = this.f22826c.m27184j();
                    if (m27184j == null) {
                        this.f22828e.mo27215b(new C6299d("pdf_renderer", "Page ID is null", null));
                        return C6934q.f24811a;
                    }
                    Long m27186l2 = this.f22826c.m27186l();
                    if (m27186l2 == null) {
                        this.f22828e.mo27215b(new C6299d("pdf_renderer", "Width is null", null));
                        return C6934q.f24811a;
                    }
                    int longValue = (int) m27186l2.longValue();
                    Long m27183i = this.f22826c.m27183i();
                    if (m27183i == null) {
                        this.f22828e.mo27215b(new C6299d("pdf_renderer", "Height is null", null));
                        return C6934q.f24811a;
                    }
                    int longValue2 = (int) m27183i.longValue();
                    Long m27182h = this.f22826c.m27182h();
                    int longValue3 = m27182h != null ? (int) m27182h.longValue() : 1;
                    String m27176b = this.f22826c.m27176b();
                    int parseColor = m27176b != null ? Color.parseColor(m27176b) : 0;
                    Boolean m27177c = this.f22826c.m27177c();
                    boolean booleanValue = m27177c != null ? m27177c.booleanValue() : false;
                    int longValue4 = (!booleanValue || (m27179e = this.f22826c.m27179e()) == null) ? 0 : (int) m27179e.longValue();
                    int longValue5 = (!booleanValue || (m27180f = this.f22826c.m27180f()) == null) ? 0 : (int) m27180f.longValue();
                    int longValue6 = (!booleanValue || (m27178d = this.f22826c.m27178d()) == null) ? 0 : (int) m27178d.longValue();
                    int longValue7 = (!booleanValue || (m27186l = this.f22826c.m27186l()) == null) ? 0 : (int) m27186l.longValue();
                    Long m27185k = this.f22826c.m27185k();
                    int longValue8 = m27185k != null ? (int) m27185k.longValue() : 100;
                    Boolean m27181g = this.f22826c.m27181g();
                    boolean booleanValue2 = m27181g != null ? m27181g.booleanValue() : false;
                    C6399b c6399b = (C6399b) this.f22827d.f22818c.m27277d(m27184j);
                    String str = "jpg";
                    if (longValue3 != 0) {
                        if (longValue3 == 1) {
                            str = "png";
                        } else if (longValue3 == 2) {
                            str = "webp";
                        }
                    }
                    File file = new File(this.f22827d.f22816a.m785a().getCacheDir(), "pdf_renderer_cache");
                    file.mkdirs();
                    C6399b.a m26728e = c6399b.m26728e(new File(file, AbstractC6696d.m27609a() + '.' + str), longValue, longValue2, parseColor, longValue3, booleanValue, longValue4, longValue5, longValue7, longValue6, longValue8, booleanValue2);
                    AbstractC2329G0 m8055c = C2363Y.m8055c();
                    a aVar = new a(this.f22829f, m26728e, this.f22828e, null);
                    this.f22824a = 1;
                    if (AbstractC2384i.m8118g(m8055c, aVar, this) == m76e) {
                        return m76e;
                    }
                } else if (i7 == 1) {
                    AbstractC6928k.m28382b(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
            } catch (Exception e7) {
                AbstractC2329G0 m8055c2 = C2363Y.m8055c();
                C7239b c7239b = new C7239b(this.f22828e, e7, null);
                this.f22824a = 2;
                if (AbstractC2384i.m8118g(m8055c2, c7239b, this) == m76e) {
                    return m76e;
                }
            }
            return C6934q.f24811a;
        }
    }

    public C6297b(InterfaceC0191a.b binding, C6559a documents, C6560b pages) {
        AbstractC5469l.m23028e(binding, "binding");
        AbstractC5469l.m23028e(documents, "documents");
        AbstractC5469l.m23028e(pages, "pages");
        this.f22816a = binding;
        this.f22817b = documents;
        this.f22818c = pages;
        this.f22819d = new SparseArray();
        this.f22820e = new SparseArray();
    }

    /* renamed from: r */
    public static final C6934q m26335r(int i7, int i8, int i9, int i10, Bitmap bitmap, Surface it) {
        AbstractC5469l.m23028e(it, "it");
        Canvas lockCanvas = it.lockCanvas(new Rect(i7, i8, i9, i10));
        lockCanvas.drawBitmap(bitmap, i7, i8, (Paint) null);
        bitmap.recycle();
        it.unlockCanvasAndPost(lockCanvas);
        return C6934q.f24811a;
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: a */
    public void mo26336a(AbstractC6546a.e message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        AbstractC6546a.f fVar = new AbstractC6546a.f();
        try {
            String m27164b = message.m27164b();
            AbstractC5469l.m23025b(m27164b);
            fVar.m27169b(this.f22817b.m27273f(m26350u(new File(m27164b))).m26721b());
            fVar.m27170c(Long.valueOf(r6.m26722c()));
            result.mo27214a(fVar);
        } catch (FileNotFoundException unused) {
            result.mo27215b(new C6299d("pdf_renderer", "File not found", null));
        } catch (IOException unused2) {
            result.mo27215b(new C6299d("pdf_renderer", "Can't open file", null));
        } catch (NullPointerException unused3) {
            result.mo27215b(new C6299d("pdf_renderer", "Need call arguments: path", null));
        } catch (C6694b unused4) {
            result.mo27215b(new C6299d("pdf_renderer", "Can't create PDF renderer", null));
        } catch (Exception unused5) {
            result.mo27215b(new C6299d("pdf_renderer", "Unknown error", null));
        }
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: b */
    public void mo26337b(AbstractC6546a.e message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        AbstractC6546a.f fVar = new AbstractC6546a.f();
        try {
            String m27164b = message.m27164b();
            AbstractC5469l.m23025b(m27164b);
            fVar.m27169b(this.f22817b.m27273f(m26348s(m27164b)).m26721b());
            fVar.m27170c(Long.valueOf(r6.m26722c()));
            result.mo27214a(fVar);
        } catch (FileNotFoundException unused) {
            result.mo27215b(new C6299d("pdf_renderer", "File not found", null));
        } catch (IOException unused2) {
            result.mo27215b(new C6299d("pdf_renderer", "Can't open file", null));
        } catch (NullPointerException unused3) {
            result.mo27215b(new C6299d("pdf_renderer", "Need call arguments: path", null));
        } catch (C6694b unused4) {
            result.mo27215b(new C6299d("pdf_renderer", "Can't create PDF renderer", null));
        } catch (Exception unused5) {
            result.mo27215b(new C6299d("pdf_renderer", "Unknown error", null));
        }
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: c */
    public void mo26338c(AbstractC6546a.o message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        Long m27238m = message.m27238m();
        AbstractC5469l.m23025b(m27238m);
        int longValue = (int) m27238m.longValue();
        TextureRegistry.SurfaceProducer surfaceProducer = (TextureRegistry.SurfaceProducer) this.f22819d.get(longValue);
        Long m27239n = message.m27239n();
        AbstractC5469l.m23025b(m27239n);
        int longValue2 = (int) m27239n.longValue();
        Long m27237l = message.m27237l();
        AbstractC5469l.m23025b(m27237l);
        int longValue3 = (int) m27237l.longValue();
        if (longValue2 != 0 && longValue3 != 0) {
            surfaceProducer.setSize(longValue2, longValue3);
        }
        this.f22820e.put(longValue, message);
        Surface surface = surfaceProducer.getSurface();
        AbstractC5469l.m23027d(surface, "getSurface(...)");
        m26347q(surface, message, result);
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: d */
    public void mo26339d(AbstractC6546a.j message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        AbstractC2388k.m8128d(AbstractC2336K.m7996a(C2363Y.m8054b()), null, null, new b(message, this, result, new AbstractC6546a.k(), null), 3, null);
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: e */
    public void mo26340e(AbstractC6546a.c message) {
        AbstractC5469l.m23028e(message, "message");
        try {
            String m27155b = message.m27155b();
            C6559a c6559a = this.f22817b;
            AbstractC5469l.m23025b(m27155b);
            c6559a.mo27272b(m27155b);
        } catch (NullPointerException unused) {
            throw new C6299d("pdf_renderer", "Need call arguments: id!", null);
        } catch (C6562d unused2) {
            throw new C6299d("pdf_renderer", "Document not exist in documents repository", null);
        } catch (Exception unused3) {
            throw new C6299d("pdf_renderer", "Unknown error", null);
        }
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: f */
    public void mo26341f(AbstractC6546a.c message) {
        AbstractC5469l.m23028e(message, "message");
        try {
            String m27155b = message.m27155b();
            AbstractC5469l.m23025b(m27155b);
            this.f22818c.mo27272b(m27155b);
        } catch (NullPointerException unused) {
            throw new C6299d("pdf_renderer", "Need call arguments: id!", null);
        } catch (C6562d unused2) {
            throw new C6299d("pdf_renderer", "Page not exist in pages repository", null);
        } catch (Exception unused3) {
            throw new C6299d("pdf_renderer", "Unknown error", null);
        }
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: g */
    public void mo26342g(AbstractC6546a.a message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        AbstractC6546a.b bVar = new AbstractC6546a.b();
        try {
            String m27143c = message.m27143c();
            AbstractC5469l.m23025b(m27143c);
            Long m27144d = message.m27144d();
            AbstractC5469l.m23025b(m27144d);
            int longValue = (int) m27144d.longValue();
            Boolean m27142b = message.m27142b();
            AbstractC5469l.m23025b(m27142b);
            if (m27142b.booleanValue()) {
                PdfRenderer.Page m26723d = ((C6398a) this.f22817b.m27277d(m27143c)).m26723d(longValue);
                try {
                    bVar.m27152d(Double.valueOf(m26723d.getWidth()));
                    bVar.m27150b(Double.valueOf(m26723d.getHeight()));
                    C6934q c6934q = C6934q.f24811a;
                    AbstractC0590a.m2388a(m26723d, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC0590a.m2388a(m26723d, th);
                        throw th2;
                    }
                }
            } else {
                bVar.m27151c(this.f22818c.m27274f(m27143c, ((C6398a) this.f22817b.m27277d(m27143c)).m26723d(longValue)).m26726c());
                bVar.m27152d(Double.valueOf(r7.m26727d()));
                bVar.m27150b(Double.valueOf(r7.m26725b()));
            }
            result.mo27214a(bVar);
        } catch (NullPointerException unused) {
            result.mo27215b(new C6299d("pdf_renderer", "Need call arguments: documentId & page!", null));
        } catch (C6562d unused2) {
            result.mo27215b(new C6299d("pdf_renderer", "Document not exist in documents", null));
        } catch (Exception unused3) {
            result.mo27215b(new C6299d("pdf_renderer", "Unknown error", null));
        }
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: h */
    public void mo26343h(AbstractC6546a.d message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        AbstractC6546a.f fVar = new AbstractC6546a.f();
        try {
            byte[] m27159b = message.m27159b();
            AbstractC5469l.m23025b(m27159b);
            fVar.m27169b(this.f22817b.m27273f(m26349t(m27159b)).m26721b());
            fVar.m27170c(Long.valueOf(r6.m26722c()));
            result.mo27214a(fVar);
        } catch (IOException unused) {
            result.mo27215b(new C6299d("pdf_renderer", "Can't open file", null));
        } catch (C6694b unused2) {
            result.mo27215b(new C6299d("pdf_renderer", "Can't create PDF renderer", null));
        } catch (Exception unused3) {
            result.mo27215b(new C6299d("pdf_renderer", "Unknown error", null));
        }
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: i */
    public void mo26344i(AbstractC6546a.l message, AbstractC6546a.m result) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(result, "result");
        Long m27208c = message.m27208c();
        AbstractC5469l.m23025b(m27208c);
        int longValue = (int) m27208c.longValue();
        Long m27209d = message.m27209d();
        AbstractC5469l.m23025b(m27209d);
        int longValue2 = (int) m27209d.longValue();
        Long m27207b = message.m27207b();
        AbstractC5469l.m23025b(m27207b);
        int longValue3 = (int) m27207b.longValue();
        TextureRegistry.SurfaceProducer surfaceProducer = (TextureRegistry.SurfaceProducer) this.f22819d.get(longValue);
        if (surfaceProducer != null) {
            surfaceProducer.setSize(longValue2, longValue3);
        }
        result.mo27214a(null);
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: j */
    public void mo26345j(AbstractC6546a.n message) {
        AbstractC5469l.m23028e(message, "message");
        Long m27217b = message.m27217b();
        AbstractC5469l.m23025b(m27217b);
        int longValue = (int) m27217b.longValue();
        TextureRegistry.SurfaceProducer surfaceProducer = (TextureRegistry.SurfaceProducer) this.f22819d.get(longValue);
        if (surfaceProducer != null) {
            surfaceProducer.setCallback(null);
        }
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f22819d.remove(longValue);
    }

    @Override // p347t4.AbstractC6546a.g
    /* renamed from: k */
    public AbstractC6546a.i mo26346k() {
        TextureRegistry.SurfaceProducer mo20252c = this.f22816a.m789e().mo20252c();
        AbstractC5469l.m23027d(mo20252c, "createSurfaceProducer(...)");
        int mo20272id = (int) mo20252c.mo20272id();
        this.f22819d.put(mo20272id, mo20252c);
        mo20252c.setCallback(new a(mo20272id, mo20252c));
        AbstractC6546a.i iVar = new AbstractC6546a.i();
        iVar.m27173b(Long.valueOf(mo20272id));
        return iVar;
    }

    /* renamed from: q */
    public final void m26347q(Surface surface, AbstractC6546a.o oVar, AbstractC6546a.m mVar) {
        int i7;
        AbstractC6546a.m mVar2;
        Long m27234i = oVar.m27234i();
        AbstractC5469l.m23025b(m27234i);
        int longValue = (int) m27234i.longValue();
        C6559a c6559a = this.f22817b;
        String m27230e = oVar.m27230e();
        AbstractC5469l.m23025b(m27230e);
        PdfRenderer.Page m26723d = ((C6398a) c6559a.m27277d(m27230e)).m26723d(longValue);
        try {
            Double m27232g = oVar.m27232g();
            double doubleValue = m27232g != null ? m27232g.doubleValue() : m26723d.getWidth();
            Double m27231f = oVar.m27231f();
            double doubleValue2 = m27231f != null ? m27231f.doubleValue() : m26723d.getHeight();
            Long m27228c = oVar.m27228c();
            AbstractC5469l.m23025b(m27228c);
            final int longValue2 = (int) m27228c.longValue();
            Long m27229d = oVar.m27229d();
            AbstractC5469l.m23025b(m27229d);
            int longValue3 = (int) m27229d.longValue();
            Long m27240o = oVar.m27240o();
            AbstractC5469l.m23025b(m27240o);
            final int longValue4 = (int) m27240o.longValue();
            Long m27233h = oVar.m27233h();
            AbstractC5469l.m23025b(m27233h);
            final int longValue5 = (int) m27233h.longValue();
            Long m27235j = oVar.m27235j();
            AbstractC5469l.m23025b(m27235j);
            int longValue6 = (int) m27235j.longValue();
            Long m27236k = oVar.m27236k();
            AbstractC5469l.m23025b(m27236k);
            int longValue7 = (int) m27236k.longValue();
            String m27227b = oVar.m27227b();
            if ((longValue4 <= 0 || longValue5 <= 0) && mVar != null) {
                i7 = longValue3;
                mVar.mo27215b(new C6299d("pdf_renderer", "updateTexture width/height == 0", null));
            } else {
                i7 = longValue3;
            }
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{(float) (doubleValue / m26723d.getWidth()), 0.0f, -longValue6, 0.0f, (float) (doubleValue2 / m26723d.getHeight()), -longValue7, 0.0f, 0.0f, 1.0f});
            try {
                final Bitmap createBitmap = Bitmap.createBitmap(longValue4, longValue5, Bitmap.Config.ARGB_8888);
                AbstractC5469l.m23027d(createBitmap, "createBitmap(...)");
                if (m27227b != null) {
                    createBitmap.eraseColor(Color.parseColor(m27227b));
                }
                m26723d.render(createBitmap, null, matrix, 1);
                final int i8 = i7;
                AbstractC6298c.m26354a(surface, new InterfaceC0800l() { // from class: r5.a
                    @Override // p069J5.InterfaceC0800l
                    public final Object invoke(Object obj) {
                        C6934q m26335r;
                        m26335r = C6297b.m26335r(longValue2, i8, longValue4, longValue5, createBitmap, (Surface) obj);
                        return m26335r;
                    }
                });
                mVar2 = mVar;
                if (mVar2 != null) {
                    try {
                        mVar2.mo27214a(null);
                        C6934q c6934q = C6934q.f24811a;
                    } catch (Exception unused) {
                        if (mVar2 != null) {
                            mVar2.mo27215b(new C6299d("pdf_renderer", "updateTexture Unknown error", null));
                            C6934q c6934q2 = C6934q.f24811a;
                        }
                        AbstractC0590a.m2388a(m26723d, null);
                    }
                }
            } catch (Exception unused2) {
                mVar2 = mVar;
            }
            AbstractC0590a.m2388a(m26723d, null);
        } finally {
        }
    }

    /* renamed from: s */
    public final C6926i m26348s(String str) {
        String mo784a = this.f22816a.m787c().mo784a(str);
        File file = new File(this.f22816a.m785a().getCacheDir(), AbstractC6696d.m27609a() + ".pdf");
        if (!file.exists()) {
            InputStream open = this.f22816a.m785a().getAssets().open(mo784a);
            AbstractC5469l.m23027d(open, "open(...)");
            AbstractC6695c.m27608b(open, file);
            open.close();
        }
        Log.d("pdf_renderer", "OpenAssetDocument. Created file: " + file.getPath());
        return m26350u(file);
    }

    /* renamed from: t */
    public final C6926i m26349t(byte[] bArr) {
        File file = new File(this.f22816a.m785a().getCacheDir(), AbstractC6696d.m27609a() + ".pdf");
        if (!file.exists()) {
            AbstractC0470e.m1718b(file, bArr);
        }
        Log.d("pdf_renderer", "OpenDataDocument. Created file: " + file.getPath());
        return m26350u(file);
    }

    /* renamed from: u */
    public final C6926i m26350u(File file) {
        Log.d("pdf_renderer", "OpenFileDocument. File: " + file.getPath());
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        if (open != null) {
            return new C6926i(open, new PdfRenderer(open));
        }
        throw new C6694b();
    }

    /* renamed from: r5.b$a */
    public static final class a implements TextureRegistry.SurfaceProducer.InterfaceC4792a {

        /* renamed from: b */
        public final /* synthetic */ int f22822b;

        /* renamed from: c */
        public final /* synthetic */ TextureRegistry.SurfaceProducer f22823c;

        public a(int i7, TextureRegistry.SurfaceProducer surfaceProducer) {
            this.f22822b = i7;
            this.f22823c = surfaceProducer;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer.InterfaceC4792a
        /* renamed from: b */
        public void mo17322b() {
            AbstractC6546a.o oVar = (AbstractC6546a.o) C6297b.this.f22820e.get(this.f22822b);
            if (oVar != null) {
                C6297b c6297b = C6297b.this;
                Surface surface = this.f22823c.getSurface();
                AbstractC5469l.m23027d(surface, "getSurface(...)");
                c6297b.m26347q(surface, oVar, null);
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer.InterfaceC4792a
        /* renamed from: a */
        public void mo17321a() {
        }
    }
}
