package p240h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2928k;
import p232g0.C4327q;
import p259j0.AbstractC5330M;

/* renamed from: h0.b */
/* loaded from: classes.dex */
public interface InterfaceC4476b {

    /* renamed from: a */
    public static final ByteBuffer f15926a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: h0.b$a */
    public static final class a {

        /* renamed from: e */
        public static final a f15927e = new a(-1, -1, -1);

        /* renamed from: a */
        public final int f15928a;

        /* renamed from: b */
        public final int f15929b;

        /* renamed from: c */
        public final int f15930c;

        /* renamed from: d */
        public final int f15931d;

        public a(C4327q c4327q) {
            this(c4327q.f15115C, c4327q.f15114B, c4327q.f15116D);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15928a == aVar.f15928a && this.f15929b == aVar.f15929b && this.f15930c == aVar.f15930c;
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(Integer.valueOf(this.f15928a), Integer.valueOf(this.f15929b), Integer.valueOf(this.f15930c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f15928a + ", channelCount=" + this.f15929b + ", encoding=" + this.f15930c + ']';
        }

        public a(int i7, int i8, int i9) {
            this.f15928a = i7;
            this.f15929b = i8;
            this.f15930c = i9;
            this.f15931d = AbstractC5330M.m21674B0(i9) ? AbstractC5330M.m21748i0(i9, i8) : -1;
        }
    }

    /* renamed from: h0.b$b */
    public static final class b extends Exception {

        /* renamed from: a */
        public final a f15932a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + StringUtils.SPACE + aVar);
            this.f15932a = aVar;
        }
    }

    /* renamed from: a */
    ByteBuffer mo19055a();

    /* renamed from: b */
    void mo19056b(ByteBuffer byteBuffer);

    /* renamed from: c */
    boolean mo19057c();

    /* renamed from: d */
    a mo19058d(a aVar);

    /* renamed from: e */
    void mo19059e();

    void flush();

    boolean isActive();

    void reset();
}
