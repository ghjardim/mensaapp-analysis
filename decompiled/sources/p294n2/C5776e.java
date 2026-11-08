package p294n2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.C3774d;
import java.util.Collections;
import java.util.List;
import p345t2.C6440i;

/* renamed from: n2.e */
/* loaded from: classes.dex */
public final class C5776e extends C3643a.a {
    @Override // com.google.android.gms.common.api.C3643a.a
    public final /* synthetic */ C3643a.f buildClient(Context context, Looper looper, C3774d c3774d, Object obj, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        return new C6440i(context, looper, c3774d, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // com.google.android.gms.common.api.C3643a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m14760A0();
    }
}
