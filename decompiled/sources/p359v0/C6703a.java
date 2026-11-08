package p359v0;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.AbstractC5489c;
import p284m0.AbstractC5563k;
import p284m0.C5561i;
import p292n0.AbstractC5705W0;
import p359v0.InterfaceC6705c;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C6703a extends AbstractC5563k implements InterfaceC6705c {

    /* renamed from: o */
    public final b f24199o;

    /* renamed from: v0.a$a */
    public class a extends AbstractC6708f {
        public a() {
        }

        @Override // p284m0.AbstractC5562j
        /* renamed from: r */
        public void mo19242r() {
            C6703a.this.m23304t(this);
        }
    }

    /* renamed from: v0.a$b */
    public interface b {
        /* renamed from: a */
        Bitmap mo27617a(byte[] bArr, int i7);
    }

    /* renamed from: v0.a$c */
    public static final class c implements InterfaceC6705c.a {

        /* renamed from: b */
        public final b f24201b = new b() { // from class: v0.b
            @Override // p359v0.C6703a.b
            /* renamed from: a */
            public final Bitmap mo27617a(byte[] bArr, int i7) {
                Bitmap m27612x;
                m27612x = C6703a.m27612x(bArr, i7);
                return m27612x;
            }
        };

        @Override // p359v0.InterfaceC6705c.a
        /* renamed from: a */
        public int mo27620a(C4327q c4327q) {
            String str = c4327q.f15138n;
            return (str == null || !AbstractC4336z.m18423p(str)) ? AbstractC5705W0.m23918a(0) : AbstractC5330M.m21787z0(c4327q.f15138n) ? AbstractC5705W0.m23918a(4) : AbstractC5705W0.m23918a(1);
        }

        @Override // p359v0.InterfaceC6705c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C6703a mo27621b() {
            return new C6703a(this.f24201b, null);
        }
    }

    public /* synthetic */ C6703a(b bVar, a aVar) {
        this(bVar);
    }

    /* renamed from: B */
    public static Bitmap m27611B(byte[] bArr, int i7) {
        try {
            return AbstractC5489c.m23073a(bArr, i7, null);
        } catch (C4295A e7) {
            throw new C6706d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i7 + ")", e7);
        } catch (IOException e8) {
            throw new C6706d(e8);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ Bitmap m27612x(byte[] bArr, int i7) {
        return m27611B(bArr, i7);
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C6706d mo19238k(Throwable th) {
        return new C6706d("Unexpected decode error", th);
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C6706d mo19239l(C5561i c5561i, AbstractC6708f abstractC6708f, boolean z6) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(c5561i.f20077d);
            AbstractC5332a.m21802g(byteBuffer.hasArray());
            AbstractC5332a.m21796a(byteBuffer.arrayOffset() == 0);
            abstractC6708f.f24204e = this.f24199o.mo27617a(byteBuffer.array(), byteBuffer.remaining());
            abstractC6708f.f20085b = c5561i.f20079f;
            return null;
        } catch (C6706d e7) {
            return e7;
        }
    }

    @Override // p284m0.AbstractC5563k, p284m0.InterfaceC5559g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC6708f mo21993a() {
        return (AbstractC6708f) super.mo21993a();
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: i */
    public C5561i mo19236i() {
        return new C5561i(1);
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public AbstractC6708f mo19237j() {
        return new a();
    }

    public C6703a(b bVar) {
        super(new C5561i[1], new AbstractC6708f[1]);
        this.f24199o = bVar;
    }
}
