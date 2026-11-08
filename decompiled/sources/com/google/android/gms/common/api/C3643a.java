package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.C3774d;
import com.google.android.gms.common.internal.InterfaceC3786j;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p368w2.C6863d;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C3643a {

    /* renamed from: a */
    public final a f12259a;

    /* renamed from: b */
    public final g f12260b;

    /* renamed from: c */
    public final String f12261c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, C3774d c3774d, Object obj, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
            return buildClient(context, looper, c3774d, obj, (InterfaceC3686e) aVar, (InterfaceC3704n) bVar);
        }

        public f buildClient(Context context, Looper looper, C3774d c3774d, Object obj, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class c {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface d {

        /* renamed from: l */
        public static final a f12262l = new a(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public static final class a implements b {
            public /* synthetic */ a(AbstractC3735r abstractC3735r) {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface b extends d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface f extends b {
        void connect(AbstractC3772c.c cVar);

        void disconnect();

        void disconnect(String str);

        C6863d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC3786j interfaceC3786j, Set set);

        Set getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC3772c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class g extends c {
    }

    public C3643a(String str, a aVar, g gVar) {
        AbstractC3802r.m15130l(aVar, "Cannot construct an Api with a null ClientBuilder");
        AbstractC3802r.m15130l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f12261c = str;
        this.f12259a = aVar;
        this.f12260b = gVar;
    }

    /* renamed from: a */
    public final a m14804a() {
        return this.f12259a;
    }

    /* renamed from: b */
    public final c m14805b() {
        return this.f12260b;
    }

    /* renamed from: c */
    public final String m14806c() {
        return this.f12261c;
    }
}
