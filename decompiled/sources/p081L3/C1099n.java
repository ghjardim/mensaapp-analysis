package p081L3;

import java.util.Map;
import p088M3.AbstractC1168j;
import p088M3.C1170l;
import p376x3.AbstractC6948c;

/* renamed from: L3.n */
/* loaded from: classes.dex */
public final class C1099n {

    /* renamed from: a */
    public final int f3608a;

    /* renamed from: b */
    public final AbstractC6948c f3609b;

    public C1099n(int i7, AbstractC6948c abstractC6948c) {
        this.f3608a = i7;
        this.f3609b = abstractC6948c;
    }

    /* renamed from: a */
    public static C1099n m4345a(int i7, Map map) {
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        for (Map.Entry entry : map.entrySet()) {
            m4491a = m4491a.mo28455h((C1170l) entry.getKey(), ((C1082h0) entry.getValue()).m4303a());
        }
        return new C1099n(i7, m4491a);
    }

    /* renamed from: b */
    public int m4346b() {
        return this.f3608a;
    }

    /* renamed from: c */
    public AbstractC6948c m4347c() {
        return this.f3609b;
    }
}
