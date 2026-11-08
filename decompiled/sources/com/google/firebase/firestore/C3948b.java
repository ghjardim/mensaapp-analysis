package com.google.firebase.firestore;

import com.google.firebase.firestore.AbstractC3947a;
import com.google.firebase.firestore.C3950d;
import java.util.Map;
import p046G3.C0417c;
import p116Q3.AbstractC2157z;
import p256j$.util.Objects;
import p272k4.C5413D;

/* renamed from: com.google.firebase.firestore.b */
/* loaded from: classes.dex */
public class C3948b {

    /* renamed from: a */
    public final C0417c f12900a;

    /* renamed from: b */
    public final Map f12901b;

    public C3948b(C0417c c0417c, Map map) {
        AbstractC2157z.m7329b(c0417c);
        this.f12900a = c0417c;
        this.f12901b = map;
    }

    /* renamed from: a */
    public final Object m15515a(Object obj, AbstractC3947a abstractC3947a, Class cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RuntimeException("AggregateField '" + abstractC3947a.m15512c() + "' is not a " + cls.getName());
    }

    /* renamed from: b */
    public long m15516b(AbstractC3947a.c cVar) {
        Long m15522h = m15522h(cVar);
        if (m15522h != null) {
            return m15522h.longValue();
        }
        throw new IllegalArgumentException("RunAggregationQueryResponse alias " + cVar.m15512c() + " is null");
    }

    /* renamed from: c */
    public Double m15517c(AbstractC3947a.b bVar) {
        return m15520f(bVar);
    }

    /* renamed from: d */
    public Object m15518d(AbstractC3947a abstractC3947a) {
        return m15521g(abstractC3947a);
    }

    /* renamed from: e */
    public long m15519e() {
        return m15516b(AbstractC3947a.m15510b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3948b)) {
            return false;
        }
        C3948b c3948b = (C3948b) obj;
        return this.f12900a.equals(c3948b.f12900a) && this.f12901b.equals(c3948b.f12901b);
    }

    /* renamed from: f */
    public Double m15520f(AbstractC3947a abstractC3947a) {
        Number number = (Number) m15523i(abstractC3947a, Number.class);
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    /* renamed from: g */
    public final Object m15521g(AbstractC3947a abstractC3947a) {
        if (this.f12901b.containsKey(abstractC3947a.m15512c())) {
            return new C3959m(this.f12900a.m1628d().f12957b, C3950d.a.f12911d).m15680f((C5413D) this.f12901b.get(abstractC3947a.m15512c()));
        }
        throw new IllegalArgumentException("'" + abstractC3947a.m15514e() + "(" + abstractC3947a.m15513d() + ")' was not requested in the aggregation query.");
    }

    /* renamed from: h */
    public Long m15522h(AbstractC3947a abstractC3947a) {
        Number number = (Number) m15523i(abstractC3947a, Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.f12900a, this.f12901b);
    }

    /* renamed from: i */
    public final Object m15523i(AbstractC3947a abstractC3947a, Class cls) {
        return m15515a(m15521g(abstractC3947a), abstractC3947a, cls);
    }
}
