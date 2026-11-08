package p335s0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.mime.MimeTypes;
import p178Z2.AbstractC3035x;
import p186a3.AbstractC3107b;
import p232g0.AbstractC4317g;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5495i;
import p276l0.C5497k;
import p276l0.C5506t;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;
import p335s0.InterfaceC6326F;

/* renamed from: s0.O */
/* loaded from: classes.dex */
public final class C6335O implements InterfaceC6337Q {

    /* renamed from: a */
    public final InterfaceC5493g.a f22902a;

    /* renamed from: b */
    public final String f22903b;

    /* renamed from: c */
    public final boolean f22904c;

    /* renamed from: d */
    public final Map f22905d;

    public C6335O(String str, boolean z6, InterfaceC5493g.a aVar) {
        AbstractC5332a.m21796a((z6 && TextUtils.isEmpty(str)) ? false : true);
        this.f22902a = aVar;
        this.f22903b = str;
        this.f22904c = z6;
        this.f22905d = new HashMap();
    }

    /* renamed from: c */
    public static byte[] m26534c(InterfaceC5493g.a aVar, String str, byte[] bArr, Map map) {
        C5510x c5510x = new C5510x(aVar.mo23075a());
        C5497k m23086a = new C5497k.b().m23095j(str).m23090e(map).m23089d(2).m23088c(bArr).m23087b(1).m23086a();
        int i7 = 0;
        C5497k c5497k = m23086a;
        while (true) {
            try {
                C5495i c5495i = new C5495i(c5510x, c5497k);
                try {
                    return AbstractC3107b.m11352d(c5495i);
                } catch (C5506t e7) {
                    try {
                        String m26535d = m26535d(e7, i7);
                        if (m26535d == null) {
                            throw e7;
                        }
                        i7++;
                        c5497k = c5497k.m23081a().m23095j(m26535d).m23086a();
                    } finally {
                        AbstractC5330M.m21759m(c5495i);
                    }
                }
            } catch (Exception e8) {
                throw new C6338S(m23086a, (Uri) AbstractC5332a.m21800e(c5510x.m23137v()), c5510x.mo713n(), c5510x.m23136g(), e8);
            }
        }
    }

    /* renamed from: d */
    public static String m26535d(C5506t c5506t, int i7) {
        Map map;
        List list;
        int i8 = c5506t.f19849d;
        if ((i8 != 307 && i8 != 308) || i7 >= 5 || (map = c5506t.f19851f) == null || (list = (List) map.get(HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // p335s0.InterfaceC6337Q
    /* renamed from: a */
    public byte[] mo26536a(UUID uuid, InterfaceC6326F.d dVar) {
        return m26534c(this.f22902a, dVar.m26509b() + "&signedRequest=" + AbstractC5330M.m21687I(dVar.m26508a()), null, Collections.emptyMap());
    }

    @Override // p335s0.InterfaceC6337Q
    /* renamed from: b */
    public byte[] mo26537b(UUID uuid, InterfaceC6326F.a aVar) {
        String m26505b = aVar.m26505b();
        if (this.f22904c || TextUtils.isEmpty(m26505b)) {
            m26505b = this.f22903b;
        }
        if (TextUtils.isEmpty(m26505b)) {
            C5497k.b bVar = new C5497k.b();
            Uri uri = Uri.EMPTY;
            throw new C6338S(bVar.m23094i(uri).m23086a(), uri, AbstractC3035x.m11072j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = AbstractC4317g.f15031e;
        hashMap.put(HttpHeaders.CONTENT_TYPE, uuid2.equals(uuid) ? "text/xml" : AbstractC4317g.f15029c.equals(uuid) ? "application/json" : MimeTypes.OCTET_STREAM);
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f22905d) {
            hashMap.putAll(this.f22905d);
        }
        return m26534c(this.f22902a, m26505b, aVar.m26504a(), hashMap);
    }

    /* renamed from: e */
    public void m26538e(String str, String str2) {
        AbstractC5332a.m21800e(str);
        AbstractC5332a.m21800e(str2);
        synchronized (this.f22905d) {
            this.f22905d.put(str, str2);
        }
    }
}
