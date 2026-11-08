package p125R5;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;

/* renamed from: R5.v */
/* loaded from: classes2.dex */
public abstract class AbstractC2296v extends AbstractC2295u {
    /* renamed from: r0 */
    public static final String m7794r0(String str, int i7) {
        AbstractC5469l.m23028e(str, "<this>");
        if (i7 >= 0) {
            String substring = str.substring(AbstractC1421h.m5530c(i7, str.length()));
            AbstractC5469l.m23027d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    /* renamed from: s0 */
    public static char m7795s0(CharSequence charSequence) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(AbstractC2294t.m7748C(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
