package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import p219e3.C4183m;

/* renamed from: com.google.firebase.storage.n */
/* loaded from: classes.dex */
public class C3998n extends C4183m {

    /* renamed from: a */
    public final int f13188a;

    /* renamed from: b */
    public final int f13189b;

    /* renamed from: c */
    public Throwable f13190c;

    public C3998n(int i7, Throwable th, int i8) {
        super(m16026g(i7));
        this.f13190c = th;
        this.f13188a = i7;
        this.f13189b = i8;
        Log.e("StorageException", "StorageException has occurred.\n" + m16026g(i7) + "\n Code: " + i7 + " HttpResult: " + i8);
        Throwable th2 = this.f13190c;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.f13190c);
        }
    }

    /* renamed from: a */
    public static int m16021a(Status status) {
        if (status.m14798C0()) {
            return -13040;
        }
        return status.equals(Status.f12251p) ? -13030 : -13000;
    }

    /* renamed from: b */
    public static int m16022b(Throwable th, int i7) {
        if (th instanceof C3985a) {
            return -13040;
        }
        if (i7 == -2) {
            return -13030;
        }
        if (i7 == 401) {
            return -13020;
        }
        if (i7 == 409) {
            return -13031;
        }
        if (i7 != 403) {
            return i7 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    /* renamed from: c */
    public static C3998n m16023c(Status status) {
        AbstractC3802r.m15129k(status);
        AbstractC3802r.m15119a(!status.m14799D0());
        return new C3998n(m16021a(status), null, 0);
    }

    /* renamed from: d */
    public static C3998n m16024d(Throwable th) {
        return m16025e(th, 0);
    }

    /* renamed from: e */
    public static C3998n m16025e(Throwable th, int i7) {
        if (th instanceof C3998n) {
            return (C3998n) th;
        }
        if (m16027h(i7) && th == null) {
            return null;
        }
        return new C3998n(m16022b(th, i7), th, i7);
    }

    /* renamed from: g */
    public static String m16026g(int i7) {
        if (i7 == -13040) {
            return "The operation was cancelled.";
        }
        if (i7 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i7 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i7 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i7 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i7) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    /* renamed from: h */
    public static boolean m16027h(int i7) {
        return i7 == 0 || (i7 >= 200 && i7 < 300);
    }

    /* renamed from: f */
    public int m16028f() {
        return this.f13188a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th = this.f13190c;
        if (th == this) {
            return null;
        }
        return th;
    }
}
