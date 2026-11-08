package p322q3;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p219e3.C4176f;
import p262j3.InterfaceC5365a;
import p287m3.C5575a;
import p287m3.C5576b;
import p287m3.C5589o;
import p287m3.C5590p;

/* renamed from: q3.i */
/* loaded from: classes.dex */
public class C6193i implements InterfaceC5365a {

    /* renamed from: a */
    public final String f22139a;

    /* renamed from: b */
    public final IntegrityManager f22140b;

    /* renamed from: c */
    public final C5589o f22141c;

    /* renamed from: d */
    public final Executor f22142d;

    /* renamed from: e */
    public final Executor f22143e;

    /* renamed from: f */
    public final C5590p f22144f;

    public C6193i(C4176f c4176f, Executor executor, Executor executor2) {
        this(c4176f.m17534r().m17551f(), IntegrityManagerFactory.create(c4176f.m17532m()), new C5589o(c4176f), executor, executor2, new C5590p());
    }

    /* renamed from: l */
    public static /* synthetic */ Task m25849l(C5575a c5575a) {
        return Tasks.forResult(C5576b.m23343c(c5575a));
    }

    @Override // p262j3.InterfaceC5365a
    /* renamed from: a */
    public Task mo22069a() {
        return m25850g().onSuccessTask(this.f22142d, new SuccessContinuation() { // from class: q3.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m25854k;
                m25854k = C6193i.this.m25854k((IntegrityTokenResponse) obj);
                return m25854k;
            }
        }).onSuccessTask(this.f22142d, new SuccessContinuation() { // from class: q3.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m25849l;
                m25849l = C6193i.m25849l((C5575a) obj);
                return m25849l;
            }
        });
    }

    /* renamed from: g */
    public final Task m25850g() {
        final C6186b c6186b = new C6186b();
        return Tasks.call(this.f22143e, new Callable() { // from class: q3.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6187c m25851h;
                m25851h = C6193i.this.m25851h(c6186b);
                return m25851h;
            }
        }).onSuccessTask(this.f22142d, new SuccessContinuation() { // from class: q3.h
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m25852i;
                m25852i = C6193i.this.m25852i((C6187c) obj);
                return m25852i;
            }
        });
    }

    /* renamed from: h */
    public final /* synthetic */ C6187c m25851h(C6186b c6186b) {
        return C6187c.m25842a(this.f22141c.m23389c(c6186b.m25841a().getBytes("UTF-8"), this.f22144f));
    }

    /* renamed from: i */
    public final /* synthetic */ Task m25852i(C6187c c6187c) {
        return this.f22140b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(this.f22139a)).setNonce(c6187c.m25843b()).build());
    }

    /* renamed from: j */
    public final /* synthetic */ C5575a m25853j(C6185a c6185a) {
        return this.f22141c.m23388b(c6185a.m25840a().getBytes("UTF-8"), 3, this.f22144f);
    }

    /* renamed from: k */
    public final /* synthetic */ Task m25854k(IntegrityTokenResponse integrityTokenResponse) {
        final C6185a c6185a = new C6185a(integrityTokenResponse.token());
        return Tasks.call(this.f22143e, new Callable() { // from class: q3.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5575a m25853j;
                m25853j = C6193i.this.m25853j(c6185a);
                return m25853j;
            }
        });
    }

    public C6193i(String str, IntegrityManager integrityManager, C5589o c5589o, Executor executor, Executor executor2, C5590p c5590p) {
        this.f22139a = str;
        this.f22140b = integrityManager;
        this.f22141c = c5589o;
        this.f22142d = executor;
        this.f22143e = executor2;
        this.f22144f = c5590p;
    }
}
