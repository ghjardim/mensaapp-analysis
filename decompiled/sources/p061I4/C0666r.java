package p061I4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: I4.r */
/* loaded from: classes.dex */
public final class C0666r implements InterfaceC0657i {

    /* renamed from: a */
    public static final Charset f2271a = Charset.forName("UTF8");

    /* renamed from: b */
    public static final C0666r f2272b = new C0666r();

    @Override // p061I4.InterfaceC0657i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String mo2638b(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i7;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i7 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i7 = 0;
        }
        return new String(bArr, i7, remaining, f2271a);
    }

    @Override // p061I4.InterfaceC0657i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo2637a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f2271a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
