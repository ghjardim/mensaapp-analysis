package p253i5;

/* renamed from: i5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4596b implements InterfaceC4645z0 {
    /* renamed from: a */
    public final void m19793a(int i7) {
        if (mo19335b() < i7) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void m19794c() {
        AbstractC4643y0.m20175a(this);
    }

    @Override // p253i5.InterfaceC4645z0
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        m19793a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // p253i5.InterfaceC4645z0
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: V */
    public void mo19334V() {
    }

    @Override // p253i5.InterfaceC4645z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
