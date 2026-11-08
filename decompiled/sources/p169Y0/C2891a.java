package p169Y0;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p141U0.AbstractC2501c;
import p141U0.C2500b;
import p171Y2.AbstractC2920c;
import p171Y2.AbstractC2922e;
import p232g0.C4334x;

/* renamed from: Y0.a */
/* loaded from: classes.dex */
public final class C2891a extends AbstractC2501c {

    /* renamed from: c */
    public static final Pattern f8894c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f8895a = AbstractC2922e.f9010c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f8896b = AbstractC2922e.f9009b.newDecoder();

    @Override // p141U0.AbstractC2501c
    /* renamed from: b */
    public C4334x mo8457b(C2500b c2500b, ByteBuffer byteBuffer) {
        String m10417c = m10417c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m10417c == null) {
            return new C4334x(new C2893c(bArr, null, null));
        }
        Matcher matcher = f8894c.matcher(m10417c);
        String str2 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m10515e = AbstractC2920c.m10515e(group);
                m10515e.hashCode();
                if (m10515e.equals("streamurl")) {
                    str2 = group2;
                } else if (m10515e.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C4334x(new C2893c(bArr, str, str2));
    }

    /* renamed from: c */
    public final String m10417c(ByteBuffer byteBuffer) {
        try {
            return this.f8895a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f8896b.decode(byteBuffer).toString();
                this.f8896b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f8896b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f8896b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f8895a.reset();
            byteBuffer.rewind();
        }
    }
}
