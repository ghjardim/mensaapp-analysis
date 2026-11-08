package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.C3978H;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
import p219e3.C4176f;
import p220e4.AbstractC4192d;
import p220e4.C4196h;

/* renamed from: com.google.firebase.storage.p */
/* loaded from: classes.dex */
public class C4000p implements Comparable {

    /* renamed from: a */
    public final Uri f13211a;

    /* renamed from: b */
    public final C3990f f13212b;

    /* renamed from: com.google.firebase.storage.p$a */
    public class a implements OnFailureListener {

        /* renamed from: a */
        public final /* synthetic */ TaskCompletionSource f13213a;

        public a(TaskCompletionSource taskCompletionSource) {
            this.f13213a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f13213a.setException(C3998n.m16025e(exc, 0));
        }
    }

    /* renamed from: com.google.firebase.storage.p$b */
    public class b implements OnSuccessListener {

        /* renamed from: a */
        public final /* synthetic */ TaskCompletionSource f13215a;

        public b(TaskCompletionSource taskCompletionSource) {
            this.f13215a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C3978H.d dVar) {
            if (this.f13215a.getTask().isComplete()) {
                return;
            }
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            this.f13215a.setException(C3998n.m16023c(Status.f12250o));
        }
    }

    /* renamed from: com.google.firebase.storage.p$c */
    public class c implements C3978H.b {

        /* renamed from: a */
        public final /* synthetic */ long f13217a;

        /* renamed from: b */
        public final /* synthetic */ TaskCompletionSource f13218b;

        public c(long j7, TaskCompletionSource taskCompletionSource) {
            this.f13217a = j7;
            this.f13218b = taskCompletionSource;
        }

        @Override // com.google.firebase.storage.C3978H.b
        /* renamed from: a */
        public void mo15956a(C3978H.d dVar, InputStream inputStream) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i7 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        this.f13218b.setResult(byteArrayOutputStream.toByteArray());
                        inputStream.close();
                        return;
                    } else {
                        i7 += read;
                        if (i7 > this.f13217a) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: com.google.firebase.storage.p$d */
    public class d implements Continuation {

        /* renamed from: a */
        public final /* synthetic */ List f13220a;

        /* renamed from: b */
        public final /* synthetic */ List f13221b;

        /* renamed from: c */
        public final /* synthetic */ Executor f13222c;

        /* renamed from: d */
        public final /* synthetic */ TaskCompletionSource f13223d;

        public d(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f13220a = list;
            this.f13221b = list2;
            this.f13222c = executor;
            this.f13223d = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Task task) {
            if (task.isSuccessful()) {
                C3994j c3994j = (C3994j) task.getResult();
                this.f13220a.addAll(c3994j.m16020d());
                this.f13221b.addAll(c3994j.m16018b());
                if (c3994j.m16019c() != null) {
                    C4000p.this.m16097x(null, c3994j.m16019c()).continueWithTask(this.f13222c, this);
                } else {
                    this.f13223d.setResult(new C3994j(this.f13220a, this.f13221b, null));
                }
            } else {
                this.f13223d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    public C4000p(Uri uri, C3990f c3990f) {
        AbstractC3802r.m15120b(uri != null, "storageUri cannot be null");
        AbstractC3802r.m15120b(c3990f != null, "FirebaseApp cannot be null");
        this.f13211a = uri;
        this.f13212b = c3990f;
    }

    /* renamed from: A */
    public C3984N m16076A(Uri uri) {
        AbstractC3802r.m15120b(uri != null, "uri cannot be null");
        C3984N c3984n = new C3984N(this, null, uri, null);
        c3984n.m15905b0();
        return c3984n;
    }

    /* renamed from: B */
    public C3984N m16077B(Uri uri, C3999o c3999o) {
        AbstractC3802r.m15120b(uri != null, "uri cannot be null");
        AbstractC3802r.m15120b(c3999o != null, "metadata cannot be null");
        C3984N c3984n = new C3984N(this, c3999o, uri, null);
        c3984n.m15905b0();
        return c3984n;
    }

    /* renamed from: C */
    public Task m16078C(C3999o c3999o) {
        AbstractC3802r.m15129k(c3999o);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C3977G.m15939b().m15944f(new RunnableC3983M(this, taskCompletionSource, c3999o));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4000p) {
            return ((C4000p) obj).toString().equals(toString());
        }
        return false;
    }

    /* renamed from: f */
    public C4000p m16079f(String str) {
        AbstractC3802r.m15120b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new C4000p(this.f13211a.buildUpon().appendEncodedPath(AbstractC4192d.m17597b(AbstractC4192d.m17596a(str))).build(), this.f13212b);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4000p c4000p) {
        return this.f13211a.compareTo(c4000p.f13211a);
    }

    /* renamed from: h */
    public Task m16081h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C3977G.m15939b().m15944f(new RunnableC3988d(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: i */
    public C4176f m16082i() {
        return m16092s().m15999a();
    }

    /* renamed from: j */
    public String m16083j() {
        return this.f13211a.getAuthority();
    }

    /* renamed from: k */
    public Task m16084k(long j7) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C3978H c3978h = new C3978H(this);
        c3978h.m15953r0(new c(j7, taskCompletionSource)).addOnSuccessListener(new b(taskCompletionSource)).addOnFailureListener(new a(taskCompletionSource));
        c3978h.m15905b0();
        return taskCompletionSource.getTask();
    }

    /* renamed from: l */
    public Task m16085l() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C3977G.m15939b().m15944f(new RunnableC3992h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: m */
    public C3989e m16086m(Uri uri) {
        C3989e c3989e = new C3989e(this, uri);
        c3989e.m15905b0();
        return c3989e;
    }

    /* renamed from: n */
    public Task m16087n() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C3977G.m15939b().m15944f(new RunnableC3993i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public String m16088o() {
        String path = this.f13211a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    /* renamed from: p */
    public C4000p m16089p() {
        String path = this.f13211a.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new C4000p(this.f13211a.buildUpon().path(lastIndexOf != -1 ? path.substring(0, lastIndexOf) : "/").build(), this.f13212b);
    }

    /* renamed from: q */
    public String m16090q() {
        return this.f13211a.getPath();
    }

    /* renamed from: r */
    public C4000p m16091r() {
        return new C4000p(this.f13211a.buildUpon().path(StringUtils.EMPTY).build(), this.f13212b);
    }

    /* renamed from: s */
    public C3990f m16092s() {
        return this.f13212b;
    }

    /* renamed from: t */
    public C4196h m16093t() {
        return new C4196h(this.f13211a, this.f13212b.m16003e());
    }

    public String toString() {
        return "gs://" + this.f13211a.getAuthority() + this.f13211a.getEncodedPath();
    }

    /* renamed from: u */
    public Task m16094u(int i7) {
        AbstractC3802r.m15120b(i7 > 0, "maxResults must be greater than zero");
        AbstractC3802r.m15120b(i7 <= 1000, "maxResults must be at most 1000");
        return m16097x(Integer.valueOf(i7), null);
    }

    /* renamed from: v */
    public Task m16095v(int i7, String str) {
        AbstractC3802r.m15120b(i7 > 0, "maxResults must be greater than zero");
        AbstractC3802r.m15120b(i7 <= 1000, "maxResults must be at most 1000");
        AbstractC3802r.m15120b(str != null, "pageToken must be non-null to resume a previous list() operation");
        return m16097x(Integer.valueOf(i7), str);
    }

    /* renamed from: w */
    public Task m16096w() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor m15941a = C3977G.m15939b().m15941a();
        m16097x(null, null).continueWithTask(m15941a, new d(arrayList, arrayList2, m15941a, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: x */
    public final Task m16097x(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C3977G.m15939b().m15944f(new RunnableC3995k(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: y */
    public C3984N m16098y(byte[] bArr) {
        AbstractC3802r.m15120b(bArr != null, "bytes cannot be null");
        C3984N c3984n = new C3984N(this, null, bArr);
        c3984n.m15905b0();
        return c3984n;
    }

    /* renamed from: z */
    public C3984N m16099z(byte[] bArr, C3999o c3999o) {
        AbstractC3802r.m15120b(bArr != null, "bytes cannot be null");
        AbstractC3802r.m15120b(c3999o != null, "metadata cannot be null");
        C3984N c3984n = new C3984N(this, c3999o, bArr);
        c3984n.m15905b0();
        return c3984n;
    }
}
