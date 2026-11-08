package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C3643a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p136T2.C2440a;
import p207d.AbstractC4094d;
import p256j$.util.DesugarCollections;
import p334s.C6309b;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public final class C3774d {

    /* renamed from: a */
    public final Account f12466a;

    /* renamed from: b */
    public final Set f12467b;

    /* renamed from: c */
    public final Set f12468c;

    /* renamed from: d */
    public final Map f12469d;

    /* renamed from: e */
    public final int f12470e;

    /* renamed from: f */
    public final View f12471f;

    /* renamed from: g */
    public final String f12472g;

    /* renamed from: h */
    public final String f12473h;

    /* renamed from: i */
    public final C2440a f12474i;

    /* renamed from: j */
    public Integer f12475j;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class a {

        /* renamed from: a */
        public Account f12476a;

        /* renamed from: b */
        public C6309b f12477b;

        /* renamed from: c */
        public String f12478c;

        /* renamed from: d */
        public String f12479d;

        /* renamed from: e */
        public final C2440a f12480e = C2440a.f7221q;

        /* renamed from: a */
        public C3774d m15060a() {
            return new C3774d(this.f12476a, this.f12477b, null, 0, null, this.f12478c, this.f12479d, this.f12480e, false);
        }

        /* renamed from: b */
        public a m15061b(String str) {
            this.f12478c = str;
            return this;
        }

        /* renamed from: c */
        public final a m15062c(Collection collection) {
            if (this.f12477b == null) {
                this.f12477b = new C6309b();
            }
            this.f12477b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m15063d(Account account) {
            this.f12476a = account;
            return this;
        }

        /* renamed from: e */
        public final a m15064e(String str) {
            this.f12479d = str;
            return this;
        }
    }

    public C3774d(Account account, Set set, Map map, int i7, View view, String str, String str2, C2440a c2440a, boolean z6) {
        this.f12466a = account;
        Set emptySet = set == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(set);
        this.f12467b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f12469d = map;
        this.f12471f = view;
        this.f12470e = i7;
        this.f12472g = str;
        this.f12473h = str2;
        this.f12474i = c2440a == null ? C2440a.f7221q : c2440a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC4094d.m17162a(it.next());
            throw null;
        }
        this.f12468c = DesugarCollections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m15049a() {
        return this.f12466a;
    }

    /* renamed from: b */
    public String m15050b() {
        Account account = this.f12466a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m15051c() {
        Account account = this.f12466a;
        return account != null ? account : new Account(AbstractC3772c.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: d */
    public Set m15052d() {
        return this.f12468c;
    }

    /* renamed from: e */
    public Set m15053e(C3643a c3643a) {
        AbstractC4094d.m17162a(this.f12469d.get(c3643a));
        return this.f12467b;
    }

    /* renamed from: f */
    public String m15054f() {
        return this.f12472g;
    }

    /* renamed from: g */
    public Set m15055g() {
        return this.f12467b;
    }

    /* renamed from: h */
    public final C2440a m15056h() {
        return this.f12474i;
    }

    /* renamed from: i */
    public final Integer m15057i() {
        return this.f12475j;
    }

    /* renamed from: j */
    public final String m15058j() {
        return this.f12473h;
    }

    /* renamed from: k */
    public final void m15059k(Integer num) {
        this.f12475j = num;
    }
}
