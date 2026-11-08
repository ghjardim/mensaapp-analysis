package p155W0;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.tika.utils.StringUtils;

/* renamed from: W0.c */
/* loaded from: classes.dex */
public final class C2655c {

    /* renamed from: a */
    public final ByteArrayOutputStream f7879a;

    /* renamed from: b */
    public final DataOutputStream f7880b;

    public C2655c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f7879a = byteArrayOutputStream;
        this.f7880b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m9109b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] m9110a(C2653a c2653a) {
        this.f7879a.reset();
        try {
            m9109b(this.f7880b, c2653a.f7873a);
            String str = c2653a.f7874b;
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            m9109b(this.f7880b, str);
            this.f7880b.writeLong(c2653a.f7875c);
            this.f7880b.writeLong(c2653a.f7876d);
            this.f7880b.write(c2653a.f7877e);
            this.f7880b.flush();
            return this.f7879a.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}
