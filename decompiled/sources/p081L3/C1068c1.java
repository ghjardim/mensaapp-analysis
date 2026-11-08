package p081L3;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p053H3.C0564j;
import p095N3.C1267g;
import p116Q3.AbstractC2133b;
import p116Q3.InterfaceC2145n;

/* renamed from: L3.c1 */
/* loaded from: classes.dex */
public class C1068c1 implements InterfaceC1079g0 {

    /* renamed from: a */
    public final C1077f1 f3514a;

    public C1068c1(C1077f1 c1077f1) {
        this.f3514a = c1077f1;
    }

    /* renamed from: h */
    public static /* synthetic */ void m4235h(Set set, Cursor cursor) {
        set.add(cursor.getString(0));
    }

    /* renamed from: i */
    public static /* synthetic */ void m4236i(Boolean[] boolArr, Cursor cursor) {
        try {
            if (AbstractC1085i0.f3560b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e7) {
            throw AbstractC2133b.m7214a("SQLitePersistence.DataMigration failed to parse: %s", e7);
        }
    }

    /* renamed from: d */
    public final void m4237d() {
        this.f3514a.mo4224l("build overlays", new Runnable() { // from class: L3.Z0
            @Override // java.lang.Runnable
            public final void run() {
                C1068c1.this.m4240g();
            }
        });
    }

    /* renamed from: e */
    public final Set m4238e() {
        final HashSet hashSet = new HashSet();
        this.f3514a.m4283F("SELECT DISTINCT uid FROM mutation_queues").m4300e(new InterfaceC2145n() { // from class: L3.b1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1068c1.m4235h(hashSet, (Cursor) obj);
            }
        });
        return hashSet;
    }

    /* renamed from: f */
    public boolean m4239f() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f3514a.m4283F("SELECT migration_name FROM data_migrations").m4300e(new InterfaceC2145n() { // from class: L3.a1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1068c1.m4236i(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    /* renamed from: g */
    public final /* synthetic */ void m4240g() {
        if (m4239f()) {
            Set m4238e = m4238e();
            InterfaceC1106p0 mo4220h = this.f3514a.mo4220h();
            Iterator it = m4238e.iterator();
            while (it.hasNext()) {
                C0564j c0564j = new C0564j((String) it.next());
                C1077f1 c1077f1 = this.f3514a;
                InterfaceC1076f0 mo4217e = c1077f1.mo4217e(c0564j, c1077f1.mo4216d(c0564j));
                HashSet hashSet = new HashSet();
                Iterator it2 = mo4217e.mo4191k().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(((C1267g) it2.next()).m4848f());
                }
                new C1102o(mo4220h, mo4217e, this.f3514a.mo4214b(c0564j), this.f3514a.mo4216d(c0564j)).m4362o(hashSet);
            }
            m4241j();
        }
    }

    /* renamed from: j */
    public final void m4241j() {
        this.f3514a.m4285w("DELETE FROM data_migrations WHERE migration_name = ?", AbstractC1085i0.f3560b);
    }

    @Override // p081L3.InterfaceC1079g0
    public void run() {
        m4237d();
    }
}
