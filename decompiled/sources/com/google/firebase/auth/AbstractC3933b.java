package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p003A2.C0019a;
import p219e3.C4183m;
import p346t3.C6483O;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.firebase.auth.b */
/* loaded from: classes.dex */
public abstract class AbstractC3933b {

    /* renamed from: com.google.firebase.auth.b$a */
    public static class a extends AbstractC7065a {
        public static final Parcelable.Creator<a> CREATOR = new C3936e();

        /* renamed from: x0 */
        public static a m15412x0() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            AbstractC7067c.m29118b(parcel, AbstractC7067c.m29117a(parcel));
        }
    }

    /* renamed from: com.google.firebase.auth.b$b */
    public static abstract class b {
        private static final C0019a zza = new C0019a("PhoneAuthProvider", new String[0]);

        public abstract void onCodeAutoRetrievalTimeOut(String str);

        public abstract void onCodeSent(String str, a aVar);

        public abstract void onVerificationCompleted(C6483O c6483o);

        public abstract void onVerificationFailed(C4183m c4183m);
    }

    /* renamed from: a */
    public static C6483O m15410a(String str, String str2) {
        return C6483O.m27032B0(str, str2);
    }

    /* renamed from: b */
    public static void m15411b(C3932a c3932a) {
        AbstractC3802r.m15129k(c3932a);
        FirebaseAuth.m15306h0(c3932a);
    }
}
