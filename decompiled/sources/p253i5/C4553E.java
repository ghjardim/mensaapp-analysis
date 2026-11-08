package p253i5;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import p171Y2.AbstractC2932o;
import p171Y2.C2937t;
import p237g5.AbstractC4413N;
import p237g5.AbstractC4430c0;
import p237g5.AbstractC4432d0;

/* renamed from: i5.E */
/* loaded from: classes2.dex */
public final class C4553E extends AbstractC4432d0 {

    /* renamed from: a */
    public static final boolean f16502a = AbstractC4413N.m18675a(C4553E.class.getClassLoader());

    @Override // p237g5.AbstractC4430c0.c
    /* renamed from: a */
    public String mo18895a() {
        return "dns";
    }

    @Override // p237g5.AbstractC4430c0.c
    /* renamed from: b */
    public AbstractC4430c0 mo18896b(URI uri, AbstractC4430c0.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) AbstractC2932o.m10573p(uri.getPath(), "targetPath");
        AbstractC2932o.m10569l(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new C4551D(uri.getAuthority(), str.substring(1), aVar, AbstractC4580S.f16589u, C2937t.m10602c(), f16502a);
    }

    @Override // p237g5.AbstractC4432d0
    /* renamed from: c */
    public Collection mo18911c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // p237g5.AbstractC4432d0
    /* renamed from: e */
    public boolean mo18913e() {
        return true;
    }

    @Override // p237g5.AbstractC4432d0
    /* renamed from: f */
    public int mo18914f() {
        return 5;
    }
}
