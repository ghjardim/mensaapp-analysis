package p297n5;

import com.google.protobuf.AbstractC4057j;
import com.google.protobuf.C4017D;
import com.google.protobuf.C4071q;
import com.google.protobuf.InterfaceC4034V;
import com.google.protobuf.InterfaceC4050f0;
import java.io.InputStream;
import java.io.OutputStream;
import p171Y2.AbstractC2932o;
import p237g5.C4426a0;

/* renamed from: n5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5786b {

    /* renamed from: a */
    public static volatile C4071q f21084a = C4071q.m16878b();

    /* renamed from: n5.b$a */
    public static final class a implements C4426a0.c {

        /* renamed from: d */
        public static final ThreadLocal f21085d = new ThreadLocal();

        /* renamed from: a */
        public final InterfaceC4050f0 f21086a;

        /* renamed from: b */
        public final InterfaceC4034V f21087b;

        /* renamed from: c */
        public final int f21088c;

        public a(InterfaceC4034V interfaceC4034V, int i7) {
            this.f21087b = (InterfaceC4034V) AbstractC2932o.m10573p(interfaceC4034V, "defaultInstance cannot be null");
            this.f21086a = interfaceC4034V.mo16320j();
            this.f21088c = i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[Catch: IOException -> 0x003b, TryCatch #2 {IOException -> 0x003b, blocks: (B:12:0x0017, B:14:0x001b, B:18:0x0025, B:20:0x002f, B:22:0x0037, B:27:0x004b, B:29:0x0055, B:33:0x0059, B:46:0x005f, B:47:0x007f, B:49:0x003e, B:51:0x0082), top: B:11:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[Catch: IOException -> 0x003b, TryCatch #2 {IOException -> 0x003b, blocks: (B:12:0x0017, B:14:0x001b, B:18:0x0025, B:20:0x002f, B:22:0x0037, B:27:0x004b, B:29:0x0055, B:33:0x0059, B:46:0x005f, B:47:0x007f, B:49:0x003e, B:51:0x0082), top: B:11:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x005f A[Catch: IOException -> 0x003b, TryCatch #2 {IOException -> 0x003b, blocks: (B:12:0x0017, B:14:0x001b, B:18:0x0025, B:20:0x002f, B:22:0x0037, B:27:0x004b, B:29:0x0055, B:33:0x0059, B:46:0x005f, B:47:0x007f, B:49:0x003e, B:51:0x0082), top: B:11:0x0017 }] */
        @Override // p237g5.C4426a0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.protobuf.InterfaceC4034V mo18842a(java.io.InputStream r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof p297n5.C5785a
                if (r0 == 0) goto L17
                r0 = r6
                n5.a r0 = (p297n5.C5785a) r0
                com.google.protobuf.f0 r0 = r0.m24444d()
                com.google.protobuf.f0 r1 = r5.f21086a
                if (r0 != r1) goto L17
                r0 = r6
                n5.a r0 = (p297n5.C5785a) r0     // Catch: java.lang.IllegalStateException -> L17
                com.google.protobuf.V r6 = r0.m24443c()     // Catch: java.lang.IllegalStateException -> L17
                return r6
            L17:
                boolean r0 = r6 instanceof p237g5.InterfaceC4416Q     // Catch: java.io.IOException -> L3b
                if (r0 == 0) goto L85
                int r0 = r6.available()     // Catch: java.io.IOException -> L3b
                if (r0 <= 0) goto L80
                r1 = 4194304(0x400000, float:5.877472E-39)
                if (r0 > r1) goto L80
                java.lang.ThreadLocal r1 = p297n5.AbstractC5786b.a.f21085d     // Catch: java.io.IOException -> L3b
                java.lang.Object r2 = r1.get()     // Catch: java.io.IOException -> L3b
                java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch: java.io.IOException -> L3b
                if (r2 == 0) goto L3e
                java.lang.Object r2 = r2.get()     // Catch: java.io.IOException -> L3b
                byte[] r2 = (byte[]) r2     // Catch: java.io.IOException -> L3b
                if (r2 == 0) goto L3e
                int r3 = r2.length     // Catch: java.io.IOException -> L3b
                if (r3 >= r0) goto L48
                goto L3e
            L3b:
                r6 = move-exception
                goto Lb0
            L3e:
                byte[] r2 = new byte[r0]     // Catch: java.io.IOException -> L3b
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.io.IOException -> L3b
                r3.<init>(r2)     // Catch: java.io.IOException -> L3b
                r1.set(r3)     // Catch: java.io.IOException -> L3b
            L48:
                r1 = r0
            L49:
                if (r1 <= 0) goto L57
                int r3 = r0 - r1
                int r3 = r6.read(r2, r3, r1)     // Catch: java.io.IOException -> L3b
                r4 = -1
                if (r3 != r4) goto L55
                goto L57
            L55:
                int r1 = r1 - r3
                goto L49
            L57:
                if (r1 != 0) goto L5f
                r1 = 0
                com.google.protobuf.j r0 = com.google.protobuf.AbstractC4057j.m16530l(r2, r1, r0)     // Catch: java.io.IOException -> L3b
                goto L86
            L5f:
                int r6 = r0 - r1
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L3b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3b
                r2.<init>()     // Catch: java.io.IOException -> L3b
                java.lang.String r3 = "size inaccurate: "
                r2.append(r3)     // Catch: java.io.IOException -> L3b
                r2.append(r0)     // Catch: java.io.IOException -> L3b
                java.lang.String r0 = " != "
                r2.append(r0)     // Catch: java.io.IOException -> L3b
                r2.append(r6)     // Catch: java.io.IOException -> L3b
                java.lang.String r6 = r2.toString()     // Catch: java.io.IOException -> L3b
                r1.<init>(r6)     // Catch: java.io.IOException -> L3b
                throw r1     // Catch: java.io.IOException -> L3b
            L80:
                if (r0 != 0) goto L85
                com.google.protobuf.V r6 = r5.f21087b     // Catch: java.io.IOException -> L3b
                return r6
            L85:
                r0 = 0
            L86:
                if (r0 != 0) goto L8c
                com.google.protobuf.j r0 = com.google.protobuf.AbstractC4057j.m16525g(r6)
            L8c:
                r6 = 2147483647(0x7fffffff, float:NaN)
                r0.m16540I(r6)
                int r6 = r5.f21088c
                if (r6 < 0) goto L99
                r0.m16539H(r6)
            L99:
                com.google.protobuf.V r6 = r5.m24448d(r0)     // Catch: com.google.protobuf.C4017D -> L9e
                return r6
            L9e:
                r6 = move-exception
                g5.l0 r0 = p237g5.C4448l0.f15809s
                java.lang.String r1 = "Invalid protobuf byte sequence"
                g5.l0 r0 = r0.m18963q(r1)
                g5.l0 r6 = r0.m18962p(r6)
                g5.n0 r6 = r6.m18956d()
                throw r6
            Lb0:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p297n5.AbstractC5786b.a.mo18842a(java.io.InputStream):com.google.protobuf.V");
        }

        /* renamed from: d */
        public final InterfaceC4034V m24448d(AbstractC4057j abstractC4057j) {
            InterfaceC4034V interfaceC4034V = (InterfaceC4034V) this.f21086a.mo16420a(abstractC4057j, AbstractC5786b.f21084a);
            try {
                abstractC4057j.mo16543a(0);
                return interfaceC4034V;
            } catch (C4017D e7) {
                e7.m16249k(interfaceC4034V);
                throw e7;
            }
        }

        @Override // p237g5.C4426a0.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream mo18843b(InterfaceC4034V interfaceC4034V) {
            return new C5785a(interfaceC4034V, this.f21086a);
        }
    }

    /* renamed from: a */
    public static long m24445a(InputStream inputStream, OutputStream outputStream) {
        AbstractC2932o.m10573p(inputStream, "inputStream cannot be null!");
        AbstractC2932o.m10573p(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j7 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j7;
            }
            outputStream.write(bArr, 0, read);
            j7 += read;
        }
    }

    /* renamed from: b */
    public static C4426a0.c m24446b(InterfaceC4034V interfaceC4034V) {
        return new a(interfaceC4034V, -1);
    }
}
