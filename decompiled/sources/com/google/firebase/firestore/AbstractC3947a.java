package com.google.firebase.firestore;

import org.apache.tika.utils.StringUtils;
import p046G3.C0451t;
import p256j$.util.Objects;

/* renamed from: com.google.firebase.firestore.a */
/* loaded from: classes.dex */
public abstract class AbstractC3947a {

    /* renamed from: a */
    public final C0451t f12897a;

    /* renamed from: b */
    public final String f12898b;

    /* renamed from: c */
    public final String f12899c;

    /* renamed from: com.google.firebase.firestore.a$b */
    public static class b extends AbstractC3947a {
        public b(C0451t c0451t) {
            super(c0451t, "average");
        }
    }

    /* renamed from: com.google.firebase.firestore.a$c */
    public static class c extends AbstractC3947a {
        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super(null, "count");
        }
    }

    /* renamed from: com.google.firebase.firestore.a$d */
    public static class d extends AbstractC3947a {
        public d(C0451t c0451t) {
            super(c0451t, "sum");
        }
    }

    /* renamed from: a */
    public static b m15509a(String str) {
        return new b(C0451t.m1673b(str));
    }

    /* renamed from: b */
    public static c m15510b() {
        return new c();
    }

    /* renamed from: f */
    public static d m15511f(String str) {
        return new d(C0451t.m1673b(str));
    }

    /* renamed from: c */
    public String m15512c() {
        return this.f12899c;
    }

    /* renamed from: d */
    public String m15513d() {
        C0451t c0451t = this.f12897a;
        return c0451t == null ? StringUtils.EMPTY : c0451t.toString();
    }

    /* renamed from: e */
    public String m15514e() {
        return this.f12898b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3947a)) {
            return false;
        }
        AbstractC3947a abstractC3947a = (AbstractC3947a) obj;
        C0451t c0451t = this.f12897a;
        return (c0451t == null || abstractC3947a.f12897a == null) ? c0451t == null && abstractC3947a.f12897a == null : this.f12898b.equals(abstractC3947a.m15514e()) && m15513d().equals(abstractC3947a.m15513d());
    }

    public int hashCode() {
        return Objects.hash(m15514e(), m15513d());
    }

    public AbstractC3947a(C0451t c0451t, String str) {
        String str2;
        this.f12897a = c0451t;
        this.f12898b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (c0451t == null) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "_" + c0451t;
        }
        sb.append(str2);
        this.f12899c = sb.toString();
    }
}
