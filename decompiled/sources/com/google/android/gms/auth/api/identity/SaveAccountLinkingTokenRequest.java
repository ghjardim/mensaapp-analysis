package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import p313p2.C6099A;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new C6099A();

    /* renamed from: a */
    public final PendingIntent f12178a;

    /* renamed from: b */
    public final String f12179b;

    /* renamed from: c */
    public final String f12180c;

    /* renamed from: d */
    public final List f12181d;

    /* renamed from: e */
    public final String f12182e;

    /* renamed from: f */
    public final int f12183f;

    /* renamed from: com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$a */
    public static final class C3640a {

        /* renamed from: a */
        public PendingIntent f12184a;

        /* renamed from: b */
        public String f12185b;

        /* renamed from: c */
        public String f12186c;

        /* renamed from: d */
        public List f12187d = new ArrayList();

        /* renamed from: e */
        public String f12188e;

        /* renamed from: f */
        public int f12189f;

        /* renamed from: a */
        public SaveAccountLinkingTokenRequest m14726a() {
            AbstractC3802r.m15120b(this.f12184a != null, "Consent PendingIntent cannot be null");
            AbstractC3802r.m15120b("auth_code".equals(this.f12185b), "Invalid tokenType");
            AbstractC3802r.m15120b(!TextUtils.isEmpty(this.f12186c), "serviceId cannot be null or empty");
            AbstractC3802r.m15120b(this.f12187d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f12184a, this.f12185b, this.f12186c, this.f12187d, this.f12188e, this.f12189f);
        }

        /* renamed from: b */
        public C3640a m14727b(PendingIntent pendingIntent) {
            this.f12184a = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C3640a m14728c(List list) {
            this.f12187d = list;
            return this;
        }

        /* renamed from: d */
        public C3640a m14729d(String str) {
            this.f12186c = str;
            return this;
        }

        /* renamed from: e */
        public C3640a m14730e(String str) {
            this.f12185b = str;
            return this;
        }

        /* renamed from: f */
        public final C3640a m14731f(String str) {
            this.f12188e = str;
            return this;
        }

        /* renamed from: g */
        public final C3640a m14732g(int i7) {
            this.f12189f = i7;
            return this;
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i7) {
        this.f12178a = pendingIntent;
        this.f12179b = str;
        this.f12180c = str2;
        this.f12181d = list;
        this.f12182e = str3;
        this.f12183f = i7;
    }

    /* renamed from: C0 */
    public static C3640a m14720C0(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC3802r.m15129k(saveAccountLinkingTokenRequest);
        C3640a m14721x0 = m14721x0();
        m14721x0.m14728c(saveAccountLinkingTokenRequest.m14725z0());
        m14721x0.m14729d(saveAccountLinkingTokenRequest.m14722A0());
        m14721x0.m14727b(saveAccountLinkingTokenRequest.m14724y0());
        m14721x0.m14730e(saveAccountLinkingTokenRequest.m14723B0());
        m14721x0.m14732g(saveAccountLinkingTokenRequest.f12183f);
        String str = saveAccountLinkingTokenRequest.f12182e;
        if (!TextUtils.isEmpty(str)) {
            m14721x0.m14731f(str);
        }
        return m14721x0;
    }

    /* renamed from: x0 */
    public static C3640a m14721x0() {
        return new C3640a();
    }

    /* renamed from: A0 */
    public String m14722A0() {
        return this.f12180c;
    }

    /* renamed from: B0 */
    public String m14723B0() {
        return this.f12179b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f12181d.size() == saveAccountLinkingTokenRequest.f12181d.size() && this.f12181d.containsAll(saveAccountLinkingTokenRequest.f12181d) && AbstractC3798p.m15099b(this.f12178a, saveAccountLinkingTokenRequest.f12178a) && AbstractC3798p.m15099b(this.f12179b, saveAccountLinkingTokenRequest.f12179b) && AbstractC3798p.m15099b(this.f12180c, saveAccountLinkingTokenRequest.f12180c) && AbstractC3798p.m15099b(this.f12182e, saveAccountLinkingTokenRequest.f12182e) && this.f12183f == saveAccountLinkingTokenRequest.f12183f;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f12178a, this.f12179b, this.f12180c, this.f12181d, this.f12182e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m14724y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 2, m14723B0(), false);
        AbstractC7067c.m29108E(parcel, 3, m14722A0(), false);
        AbstractC7067c.m29110G(parcel, 4, m14725z0(), false);
        AbstractC7067c.m29108E(parcel, 5, this.f12182e, false);
        AbstractC7067c.m29136t(parcel, 6, this.f12183f);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: y0 */
    public PendingIntent m14724y0() {
        return this.f12178a;
    }

    /* renamed from: z0 */
    public List m14725z0() {
        return this.f12181d;
    }
}
