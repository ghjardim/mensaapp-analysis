package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.az */
/* loaded from: classes.dex */
final class C3866az implements StandardIntegrityManager {

    /* renamed from: a */
    private final C3881bn f12691a;

    /* renamed from: b */
    private final C3887bt f12692b;

    public C3866az(C3881bn c3881bn, C3887bt c3887bt) {
        this.f12691a = c3881bn;
        this.f12692b = c3887bt;
    }

    /* renamed from: a */
    public final /* synthetic */ Task m15226a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l7) {
        final long mo15206b = prepareIntegrityTokenRequest.mo15206b();
        final long longValue = l7.longValue();
        prepareIntegrityTokenRequest.mo15205a();
        final C3887bt c3887bt = this.f12692b;
        final int i7 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(mo15206b, longValue, i7) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b */
            public final /* synthetic */ long f12737b;

            /* renamed from: c */
            public final /* synthetic */ long f12738c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return C3887bt.this.m15243a(this.f12737b, this.f12738c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long mo15206b = prepareIntegrityTokenRequest.mo15206b();
        prepareIntegrityTokenRequest.mo15205a();
        return this.f12691a.m15242e(mo15206b, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C3866az.this.m15226a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
