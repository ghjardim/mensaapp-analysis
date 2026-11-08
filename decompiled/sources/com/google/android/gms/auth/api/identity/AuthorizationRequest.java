package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p313p2.C6121p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public class AuthorizationRequest extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new C6121p();

    /* renamed from: a */
    public final List f12162a;

    /* renamed from: b */
    public final String f12163b;

    /* renamed from: c */
    public final boolean f12164c;

    /* renamed from: d */
    public final boolean f12165d;

    /* renamed from: e */
    public final Account f12166e;

    /* renamed from: f */
    public final String f12167f;

    /* renamed from: n */
    public final String f12168n;

    /* renamed from: o */
    public final boolean f12169o;

    /* renamed from: com.google.android.gms.auth.api.identity.AuthorizationRequest$a */
    public static final class C3639a {

        /* renamed from: a */
        public List f12170a;

        /* renamed from: b */
        public String f12171b;

        /* renamed from: c */
        public boolean f12172c;

        /* renamed from: d */
        public boolean f12173d;

        /* renamed from: e */
        public Account f12174e;

        /* renamed from: f */
        public String f12175f;

        /* renamed from: g */
        public String f12176g;

        /* renamed from: h */
        public boolean f12177h;

        /* renamed from: a */
        public AuthorizationRequest m14712a() {
            return new AuthorizationRequest(this.f12170a, this.f12171b, this.f12172c, this.f12173d, this.f12174e, this.f12175f, this.f12176g, this.f12177h);
        }

        /* renamed from: b */
        public C3639a m14713b(String str) {
            this.f12175f = AbstractC3802r.m15123e(str);
            return this;
        }

        /* renamed from: c */
        public C3639a m14714c(String str, boolean z6) {
            m14719h(str);
            this.f12171b = str;
            this.f12172c = true;
            this.f12177h = z6;
            return this;
        }

        /* renamed from: d */
        public C3639a m14715d(Account account) {
            this.f12174e = (Account) AbstractC3802r.m15129k(account);
            return this;
        }

        /* renamed from: e */
        public C3639a m14716e(List list) {
            boolean z6 = false;
            if (list != null && !list.isEmpty()) {
                z6 = true;
            }
            AbstractC3802r.m15120b(z6, "requestedScopes cannot be null or empty");
            this.f12170a = list;
            return this;
        }

        /* renamed from: f */
        public final C3639a m14717f(String str) {
            m14719h(str);
            this.f12171b = str;
            this.f12173d = true;
            return this;
        }

        /* renamed from: g */
        public final C3639a m14718g(String str) {
            this.f12176g = str;
            return this;
        }

        /* renamed from: h */
        public final String m14719h(String str) {
            AbstractC3802r.m15129k(str);
            String str2 = this.f12171b;
            boolean z6 = true;
            if (str2 != null && !str2.equals(str)) {
                z6 = false;
            }
            AbstractC3802r.m15120b(z6, "two different server client ids provided");
            return str;
        }
    }

    public AuthorizationRequest(List list, String str, boolean z6, boolean z7, Account account, String str2, String str3, boolean z8) {
        boolean z9 = false;
        if (list != null && !list.isEmpty()) {
            z9 = true;
        }
        AbstractC3802r.m15120b(z9, "requestedScopes cannot be null or empty");
        this.f12162a = list;
        this.f12163b = str;
        this.f12164c = z6;
        this.f12165d = z7;
        this.f12166e = account;
        this.f12167f = str2;
        this.f12168n = str3;
        this.f12169o = z8;
    }

    /* renamed from: E0 */
    public static C3639a m14704E0(AuthorizationRequest authorizationRequest) {
        AbstractC3802r.m15129k(authorizationRequest);
        C3639a m14705x0 = m14705x0();
        m14705x0.m14716e(authorizationRequest.m14706A0());
        boolean m14708C0 = authorizationRequest.m14708C0();
        String m14711z0 = authorizationRequest.m14711z0();
        Account m14710y0 = authorizationRequest.m14710y0();
        String m14707B0 = authorizationRequest.m14707B0();
        String str = authorizationRequest.f12168n;
        if (str != null) {
            m14705x0.m14718g(str);
        }
        if (m14711z0 != null) {
            m14705x0.m14713b(m14711z0);
        }
        if (m14710y0 != null) {
            m14705x0.m14715d(m14710y0);
        }
        if (authorizationRequest.f12165d && m14707B0 != null) {
            m14705x0.m14717f(m14707B0);
        }
        if (authorizationRequest.m14709D0() && m14707B0 != null) {
            m14705x0.m14714c(m14707B0, m14708C0);
        }
        return m14705x0;
    }

    /* renamed from: x0 */
    public static C3639a m14705x0() {
        return new C3639a();
    }

    /* renamed from: A0 */
    public List m14706A0() {
        return this.f12162a;
    }

    /* renamed from: B0 */
    public String m14707B0() {
        return this.f12163b;
    }

    /* renamed from: C0 */
    public boolean m14708C0() {
        return this.f12169o;
    }

    /* renamed from: D0 */
    public boolean m14709D0() {
        return this.f12164c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f12162a.size() == authorizationRequest.f12162a.size() && this.f12162a.containsAll(authorizationRequest.f12162a) && this.f12164c == authorizationRequest.f12164c && this.f12169o == authorizationRequest.f12169o && this.f12165d == authorizationRequest.f12165d && AbstractC3798p.m15099b(this.f12163b, authorizationRequest.f12163b) && AbstractC3798p.m15099b(this.f12166e, authorizationRequest.f12166e) && AbstractC3798p.m15099b(this.f12167f, authorizationRequest.f12167f) && AbstractC3798p.m15099b(this.f12168n, authorizationRequest.f12168n);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f12162a, this.f12163b, Boolean.valueOf(this.f12164c), Boolean.valueOf(this.f12169o), Boolean.valueOf(this.f12165d), this.f12166e, this.f12167f, this.f12168n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29112I(parcel, 1, m14706A0(), false);
        AbstractC7067c.m29108E(parcel, 2, m14707B0(), false);
        AbstractC7067c.m29123g(parcel, 3, m14709D0());
        AbstractC7067c.m29123g(parcel, 4, this.f12165d);
        AbstractC7067c.m29106C(parcel, 5, m14710y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 6, m14711z0(), false);
        AbstractC7067c.m29108E(parcel, 7, this.f12168n, false);
        AbstractC7067c.m29123g(parcel, 8, m14708C0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: y0 */
    public Account m14710y0() {
        return this.f12166e;
    }

    /* renamed from: z0 */
    public String m14711z0() {
        return this.f12167f;
    }
}
