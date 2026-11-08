package p060I3;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONObject;
import p116Q3.AbstractC2155x;

/* renamed from: I3.f */
/* loaded from: classes.dex */
public class C0644f {

    /* renamed from: g */
    public static final Charset f2212g = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C0645g f2213a;

    /* renamed from: b */
    public final InputStream f2214b;

    /* renamed from: c */
    public final InputStreamReader f2215c;

    /* renamed from: d */
    public C0643e f2216d;

    /* renamed from: e */
    public ByteBuffer f2217e;

    /* renamed from: f */
    public long f2218f;

    public C0644f(C0645g c0645g, InputStream inputStream) {
        this.f2213a = c0645g;
        this.f2214b = inputStream;
        this.f2215c = new InputStreamReader(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f2217e = allocate;
        allocate.flip();
    }

    /* renamed from: a */
    public final IllegalArgumentException m2557a(String str) {
        m2558b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    /* renamed from: b */
    public void m2558b() {
        this.f2214b.close();
    }

    /* renamed from: c */
    public final InterfaceC0641c m2559c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(ExternalParsersConfigReaderMetKeys.METADATA_TAG)) {
            C0643e m2577b = this.f2213a.m2577b(jSONObject.getJSONObject(ExternalParsersConfigReaderMetKeys.METADATA_TAG));
            AbstractC2155x.m7309a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return m2577b;
        }
        if (jSONObject.has("namedQuery")) {
            C0648j m2592q = this.f2213a.m2592q(jSONObject.getJSONObject("namedQuery"));
            AbstractC2155x.m7309a("BundleElement", "Query loaded: " + m2592q.m2608b(), new Object[0]);
            return m2592q;
        }
        if (jSONObject.has("documentMetadata")) {
            C0646h m2578c = this.f2213a.m2578c(jSONObject.getJSONObject("documentMetadata"));
            AbstractC2155x.m7309a("BundleElement", "Document metadata loaded: " + m2578c.m2602b(), new Object[0]);
            return m2578c;
        }
        if (!jSONObject.has("document")) {
            throw m2557a("Cannot decode unknown Bundle element: " + str);
        }
        C0640b m2581f = this.f2213a.m2581f(jSONObject.getJSONObject("document"));
        AbstractC2155x.m7309a("BundleElement", "Document loaded: " + m2581f.m2548b(), new Object[0]);
        return m2581f;
    }

    /* renamed from: d */
    public C0643e m2560d() {
        C0643e c0643e = this.f2216d;
        if (c0643e != null) {
            return c0643e;
        }
        InterfaceC0641c m2567k = m2567k();
        if (!(m2567k instanceof C0643e)) {
            throw m2557a("Expected first element in bundle to be a metadata object");
        }
        C0643e c0643e2 = (C0643e) m2567k;
        this.f2216d = c0643e2;
        this.f2218f = 0L;
        return c0643e2;
    }

    /* renamed from: e */
    public long m2561e() {
        return this.f2218f;
    }

    /* renamed from: f */
    public InterfaceC0641c m2562f() {
        m2560d();
        return m2567k();
    }

    /* renamed from: g */
    public final int m2563g() {
        this.f2217e.mark();
        for (int i7 = 0; i7 < this.f2217e.remaining(); i7++) {
            try {
                if (this.f2217e.get() == 123) {
                    return i7;
                }
            } finally {
                this.f2217e.reset();
            }
        }
        this.f2217e.reset();
        return -1;
    }

    /* renamed from: h */
    public final boolean m2564h() {
        this.f2217e.compact();
        int read = this.f2214b.read(this.f2217e.array(), this.f2217e.arrayOffset() + this.f2217e.position(), this.f2217e.remaining());
        boolean z6 = read > 0;
        if (z6) {
            ByteBuffer byteBuffer = this.f2217e;
            byteBuffer.position(byteBuffer.position() + read);
        }
        this.f2217e.flip();
        return z6;
    }

    /* renamed from: i */
    public final String m2565i(int i7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i7 > 0) {
            if (this.f2217e.remaining() == 0 && !m2564h()) {
                throw m2557a("Reached the end of bundle when more data was expected.");
            }
            int min = Math.min(i7, this.f2217e.remaining());
            byteArrayOutputStream.write(this.f2217e.array(), this.f2217e.arrayOffset() + this.f2217e.position(), min);
            ByteBuffer byteBuffer = this.f2217e;
            byteBuffer.position(byteBuffer.position() + min);
            i7 -= min;
        }
        return byteArrayOutputStream.toString(f2212g.name());
    }

    /* renamed from: j */
    public final String m2566j() {
        int m2563g;
        do {
            m2563g = m2563g();
            if (m2563g != -1) {
                break;
            }
        } while (m2564h());
        if (this.f2217e.remaining() == 0) {
            return null;
        }
        if (m2563g == -1) {
            throw m2557a("Reached the end of bundle when a length string is expected.");
        }
        byte[] bArr = new byte[m2563g];
        this.f2217e.get(bArr);
        return f2212g.decode(ByteBuffer.wrap(bArr)).toString();
    }

    /* renamed from: k */
    public final InterfaceC0641c m2567k() {
        String m2566j = m2566j();
        if (m2566j == null) {
            return null;
        }
        String m2565i = m2565i(Integer.parseInt(m2566j));
        this.f2218f += m2566j.getBytes(f2212g).length + r1;
        return m2559c(m2565i);
    }
}
