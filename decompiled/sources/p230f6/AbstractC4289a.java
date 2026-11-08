package p230f6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.file.OpenOption;
import p256j$.util.Objects;

/* renamed from: f6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4289a extends AbstractC4293e {

    /* renamed from: a */
    public final Object f14741a;

    /* renamed from: f6.a$a */
    public static class a extends AbstractC4289a {
        public a(byte[] bArr) {
            super(bArr);
        }

        @Override // p230f6.AbstractC4289a
        /* renamed from: c */
        public byte[] mo17929c() {
            return (byte[]) m17928b();
        }

        @Override // p230f6.AbstractC4289a
        /* renamed from: d */
        public InputStream mo17930d(OpenOption... openOptionArr) {
            return new ByteArrayInputStream((byte[]) this.f14741a);
        }
    }

    public AbstractC4289a(Object obj) {
        Objects.requireNonNull(obj, "origin");
        this.f14741a = obj;
    }

    /* renamed from: b */
    public Object m17928b() {
        return this.f14741a;
    }

    /* renamed from: c */
    public abstract byte[] mo17929c();

    /* renamed from: d */
    public abstract InputStream mo17930d(OpenOption... openOptionArr);

    /* renamed from: e */
    public final String m17931e() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return m17931e() + "[" + this.f14741a.toString() + "]";
    }
}
