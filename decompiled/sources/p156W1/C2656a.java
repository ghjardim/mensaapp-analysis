package p156W1;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import p149V1.C2610c;
import p170Y1.InterfaceC2900g;
import p256j$.util.DesugarCollections;

/* renamed from: W1.a */
/* loaded from: classes.dex */
public final class C2656a implements InterfaceC2900g {

    /* renamed from: c */
    public static final String f7881c;

    /* renamed from: d */
    public static final String f7882d;

    /* renamed from: e */
    public static final String f7883e;

    /* renamed from: f */
    public static final Set f7884f;

    /* renamed from: g */
    public static final C2656a f7885g;

    /* renamed from: h */
    public static final C2656a f7886h;

    /* renamed from: a */
    public final String f7887a;

    /* renamed from: b */
    public final String f7888b;

    static {
        String m9133a = AbstractC2660e.m9133a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f7881c = m9133a;
        String m9133a2 = AbstractC2660e.m9133a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f7882d = m9133a2;
        String m9133a3 = AbstractC2660e.m9133a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f7883e = m9133a3;
        f7884f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(C2610c.m8990b("proto"), C2610c.m8990b("json"))));
        f7885g = new C2656a(m9133a, null);
        f7886h = new C2656a(m9133a2, m9133a3);
    }

    public C2656a(String str, String str2) {
        this.f7887a = str;
        this.f7888b = str2;
    }

    /* renamed from: d */
    public static C2656a m9111d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C2656a(str2, str3);
    }

    @Override // p170Y1.InterfaceC2900g
    /* renamed from: a */
    public Set mo9112a() {
        return f7884f;
    }

    @Override // p170Y1.InterfaceC2899f
    /* renamed from: b */
    public byte[] mo9113b() {
        return m9114c();
    }

    /* renamed from: c */
    public byte[] m9114c() {
        String str = this.f7888b;
        if (str == null && this.f7887a == null) {
            return null;
        }
        String str2 = this.f7887a;
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String m9115e() {
        return this.f7888b;
    }

    /* renamed from: f */
    public String m9116f() {
        return this.f7887a;
    }

    @Override // p170Y1.InterfaceC2899f
    public String getName() {
        return "cct";
    }
}
