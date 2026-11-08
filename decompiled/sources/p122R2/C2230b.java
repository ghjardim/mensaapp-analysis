package p122R2;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import p382y2.AbstractC7065a;

/* renamed from: R2.b */
/* loaded from: classes.dex */
public class C2230b extends AbstractC7065a {
    public static final Parcelable.Creator<C2230b> CREATOR = new C2244p();

    /* renamed from: a */
    public String f6836a;

    /* renamed from: b */
    public DataHolder f6837b;

    /* renamed from: c */
    public ParcelFileDescriptor f6838c;

    /* renamed from: d */
    public long f6839d;

    /* renamed from: e */
    public byte[] f6840e;

    /* renamed from: f */
    public byte[] f6841f;

    /* renamed from: n */
    public File f6842n;

    public C2230b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j7, byte[] bArr) {
        this.f6836a = str;
        this.f6837b = dataHolder;
        this.f6838c = parcelFileDescriptor;
        this.f6839d = j7;
        this.f6840e = bArr;
    }

    /* renamed from: C0 */
    public static final void m7650C0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: A0 */
    public String m7651A0() {
        return this.f6836a;
    }

    /* renamed from: B0 */
    public byte[] m7652B0() {
        return this.f6840e;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            android.os.ParcelFileDescriptor r0 = r4.f6838c
            r1 = 0
            if (r0 != 0) goto L63
            byte[] r0 = r4.f6841f
            if (r0 == 0) goto L63
            java.io.File r0 = r4.f6842n
            if (r0 != 0) goto Lf
        Ld:
            r2 = r1
            goto L3b
        Lf:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r3 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r4.f6838c = r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            if (r0 == 0) goto L3b
            r0.delete()
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
            goto L2e
        L2d:
            r5 = move-exception
        L2e:
            if (r1 == 0) goto L33
            r1.delete()
        L33:
            throw r5
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto Ld
            r0.delete()
            goto Ld
        L3b:
            if (r2 == 0) goto L63
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r0)
            byte[] r0 = r4.f6841f     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            int r0 = r0.length     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            byte[] r0 = r4.f6841f     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r2.write(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            m7650C0(r2)
            r6 = r6 | 1
            p122R2.C2244p.m7661a(r4, r5, r6)
            goto L66
        L5b:
            r5 = move-exception
            m7650C0(r2)
            throw r5
        L60:
            m7650C0(r2)
        L63:
            p122R2.C2244p.m7661a(r4, r5, r6)
        L66:
            r4.f6838c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p122R2.C2230b.writeToParcel(android.os.Parcel, int):void");
    }

    /* renamed from: x0 */
    public ParcelFileDescriptor m7653x0() {
        return this.f6838c;
    }

    /* renamed from: y0 */
    public long m7654y0() {
        return this.f6839d;
    }

    /* renamed from: z0 */
    public DataHolder m7655z0() {
        return this.f6837b;
    }
}
