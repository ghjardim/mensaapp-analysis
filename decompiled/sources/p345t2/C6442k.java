package p345t2;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import p337s2.C6374c;

/* renamed from: t2.k */
/* loaded from: classes.dex */
public final class C6442k extends AbstractC6447p {

    /* renamed from: a */
    public final /* synthetic */ Context f23349a;

    /* renamed from: b */
    public final /* synthetic */ GoogleSignInOptions f23350b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6442k(AbstractC3648f abstractC3648f, Context context, GoogleSignInOptions googleSignInOptions) {
        super(abstractC3648f);
        this.f23349a = context;
        this.f23350b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return new C6374c(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        ((C6454w) ((C6440i) bVar).getService()).m26950f(new BinderC6441j(this), this.f23350b);
    }
}
