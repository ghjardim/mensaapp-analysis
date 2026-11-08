package p377x4;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: x4.H */
/* loaded from: classes.dex */
public class C6964H {

    /* renamed from: a */
    public long f24926a;

    /* renamed from: b */
    public b f24927b;

    /* renamed from: c */
    public long f24928c;

    /* renamed from: d */
    public long f24929d;

    /* renamed from: e */
    public boolean f24930e;

    /* renamed from: f */
    public a f24931f;

    /* renamed from: g */
    public String f24932g;

    /* renamed from: x4.H$a */
    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* renamed from: a */
        public final long f24939a;

        a(long j7) {
            this.f24939a = j7;
        }

        /* renamed from: f */
        public long m28543f() {
            return this.f24939a;
        }
    }

    /* renamed from: x4.H$b */
    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: a */
        public long f24944a;

        b(long j7) {
            this.f24944a = j7;
        }

        /* renamed from: f */
        public long m28545f() {
            return this.f24944a;
        }
    }

    /* renamed from: a */
    public ByteBuffer m28541a() {
        try {
            String str = this.f24932g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f24926a);
            allocateDirect.putLong(this.f24927b.m28545f());
            allocateDirect.putLong(this.f24928c);
            allocateDirect.putLong(this.f24929d);
            allocateDirect.putLong(this.f24930e ? 1L : 0L);
            allocateDirect.putLong(this.f24931f.m28543f());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
