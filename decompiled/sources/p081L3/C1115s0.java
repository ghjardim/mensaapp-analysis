package p081L3;

import android.database.Cursor;
import com.google.protobuf.C4017D;
import p060I3.C0643e;
import p060I3.C0648j;
import p088M3.C1181w;
import p116Q3.AbstractC2133b;
import p116Q3.InterfaceC2153v;
import p219e3.C4188r;
import p263j4.C5371a;

/* renamed from: L3.s0 */
/* loaded from: classes.dex */
public class C1115s0 implements InterfaceC1060a {

    /* renamed from: a */
    public final C1077f1 f3634a;

    /* renamed from: b */
    public final C1105p f3635b;

    public C1115s0(C1077f1 c1077f1, C1105p c1105p) {
        this.f3634a = c1077f1;
        this.f3635b = c1105p;
    }

    /* renamed from: g */
    public static /* synthetic */ C0643e m4391g(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new C0643e(str, cursor.getInt(0), new C1181w(new C4188r(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: a */
    public C0643e mo4146a(final String str) {
        return (C0643e) this.f3634a.m4283F("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").m4297b(str).m4299d(new InterfaceC2153v() { // from class: L3.q0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                C0643e m4391g;
                m4391g = C1115s0.m4391g(str, (Cursor) obj);
                return m4391g;
            }
        });
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: b */
    public void mo4147b(C0648j c0648j) {
        this.f3634a.m4285w("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", c0648j.m2608b(), Long.valueOf(c0648j.m2609c().m4572f().m17567h()), Integer.valueOf(c0648j.m2609c().m4572f().m17566f()), this.f3635b.m4380j(c0648j.m2607a()).mo16319i());
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: c */
    public void mo4148c(C0643e c0643e) {
        this.f3634a.m4285w("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", c0643e.m2552a(), Integer.valueOf(c0643e.m2554c()), Long.valueOf(c0643e.m2553b().m4572f().m17567h()), Integer.valueOf(c0643e.m2553b().m4572f().m17566f()), Integer.valueOf(c0643e.m2556e()), Long.valueOf(c0643e.m2555d()));
    }

    @Override // p081L3.InterfaceC1060a
    /* renamed from: d */
    public C0648j mo4149d(final String str) {
        return (C0648j) this.f3634a.m4283F("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").m4297b(str).m4299d(new InterfaceC2153v() { // from class: L3.r0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                C0648j m4392h;
                m4392h = C1115s0.this.m4392h(str, (Cursor) obj);
                return m4392h;
            }
        });
    }

    /* renamed from: h */
    public final /* synthetic */ C0648j m4392h(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new C0648j(str, this.f3635b.m4371a(C5371a.m22087h0(cursor.getBlob(2))), new C1181w(new C4188r(cursor.getLong(0), cursor.getInt(1))));
        } catch (C4017D e7) {
            throw AbstractC2133b.m7214a("NamedQuery failed to parse: %s", e7);
        }
    }
}
