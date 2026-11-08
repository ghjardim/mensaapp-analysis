package p144U3;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: U3.n */
/* loaded from: classes.dex */
public class C2541n {

    /* renamed from: a */
    public static final byte f7412a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f7413b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m8521b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m8522c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m8523a() {
        byte[] m8522c = m8522c(UUID.randomUUID(), new byte[17]);
        byte b7 = m8522c[0];
        m8522c[16] = b7;
        m8522c[0] = (byte) ((b7 & f7413b) | f7412a);
        return m8521b(m8522c);
    }
}
