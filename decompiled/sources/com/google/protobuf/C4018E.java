package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.protobuf.E */
/* loaded from: classes.dex */
public class C4018E extends InputStream {

    /* renamed from: a */
    public Iterator f13285a;

    /* renamed from: b */
    public ByteBuffer f13286b;

    /* renamed from: c */
    public int f13287c = 0;

    /* renamed from: d */
    public int f13288d;

    /* renamed from: e */
    public int f13289e;

    /* renamed from: f */
    public boolean f13290f;

    /* renamed from: n */
    public byte[] f13291n;

    /* renamed from: o */
    public int f13292o;

    /* renamed from: p */
    public long f13293p;

    public C4018E(Iterable iterable) {
        this.f13285a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f13287c++;
        }
        this.f13288d = -1;
        if (m16250a()) {
            return;
        }
        this.f13286b = AbstractC4015C.f13278e;
        this.f13288d = 0;
        this.f13289e = 0;
        this.f13293p = 0L;
    }

    /* renamed from: a */
    public final boolean m16250a() {
        this.f13288d++;
        if (!this.f13285a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f13285a.next();
        this.f13286b = byteBuffer;
        this.f13289e = byteBuffer.position();
        if (this.f13286b.hasArray()) {
            this.f13290f = true;
            this.f13291n = this.f13286b.array();
            this.f13292o = this.f13286b.arrayOffset();
        } else {
            this.f13290f = false;
            this.f13293p = AbstractC4090z0.m17115k(this.f13286b);
            this.f13291n = null;
        }
        return true;
    }

    /* renamed from: c */
    public final void m16251c(int i7) {
        int i8 = this.f13289e + i7;
        this.f13289e = i8;
        if (i8 == this.f13286b.limit()) {
            m16250a();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f13288d == this.f13287c) {
            return -1;
        }
        if (this.f13290f) {
            int i7 = this.f13291n[this.f13289e + this.f13292o] & ForkServer.ERROR;
            m16251c(1);
            return i7;
        }
        int m17127w = AbstractC4090z0.m17127w(this.f13289e + this.f13293p) & ForkServer.ERROR;
        m16251c(1);
        return m17127w;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        if (this.f13288d == this.f13287c) {
            return -1;
        }
        int limit = this.f13286b.limit();
        int i9 = this.f13289e;
        int i10 = limit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.f13290f) {
            System.arraycopy(this.f13291n, i9 + this.f13292o, bArr, i7, i8);
            m16251c(i8);
        } else {
            int position = this.f13286b.position();
            AbstractC4019F.m16253b(this.f13286b, this.f13289e);
            this.f13286b.get(bArr, i7, i8);
            AbstractC4019F.m16253b(this.f13286b, position);
            m16251c(i8);
        }
        return i8;
    }
}
