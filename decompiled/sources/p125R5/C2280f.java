package p125R5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;
import p378x5.AbstractC7023n;

/* renamed from: R5.f */
/* loaded from: classes2.dex */
public final class C2280f implements Serializable {

    /* renamed from: b */
    public static final a f6943b = new a(null);

    /* renamed from: a */
    public final Pattern f6944a;

    /* renamed from: R5.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C2280f(Pattern nativePattern) {
        AbstractC5469l.m23028e(nativePattern, "nativePattern");
        this.f6944a = nativePattern;
    }

    /* renamed from: a */
    public final boolean m7722a(CharSequence input) {
        AbstractC5469l.m23028e(input, "input");
        return this.f6944a.matcher(input).matches();
    }

    /* renamed from: b */
    public final String m7723b(CharSequence input, String replacement) {
        AbstractC5469l.m23028e(input, "input");
        AbstractC5469l.m23028e(replacement, "replacement");
        String replaceAll = this.f6944a.matcher(input).replaceAll(replacement);
        AbstractC5469l.m23027d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    /* renamed from: c */
    public final List m7724c(CharSequence input, int i7) {
        AbstractC5469l.m23028e(input, "input");
        AbstractC2294t.m7774c0(i7);
        Matcher matcher = this.f6944a.matcher(input);
        if (i7 == 1 || !matcher.find()) {
            return AbstractC7023n.m28856b(input.toString());
        }
        ArrayList arrayList = new ArrayList(i7 > 0 ? AbstractC1421h.m5530c(i7, 10) : 10);
        int i8 = i7 - 1;
        int i9 = 0;
        do {
            arrayList.add(input.subSequence(i9, matcher.start()).toString());
            i9 = matcher.end();
            if (i8 >= 0 && arrayList.size() == i8) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i9, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f6944a.toString();
        AbstractC5469l.m23027d(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2280f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p125R5.C2280f.<init>(java.lang.String):void");
    }
}
