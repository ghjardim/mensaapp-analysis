package p315p4;

import android.net.Uri;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6926i;
import p378x5.AbstractC7005E;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public final class C6134a {

    /* renamed from: a */
    public final String f21885a;

    /* renamed from: b */
    public final String f21886b;

    /* renamed from: c */
    public final Uri f21887c;

    /* renamed from: d */
    public final long f21888d;

    /* renamed from: e */
    public final byte[] f21889e;

    /* renamed from: p4.a$a */
    public static final class a {

        /* renamed from: a */
        public String f21890a;

        /* renamed from: b */
        public String f21891b;

        /* renamed from: c */
        public Uri f21892c;

        /* renamed from: d */
        public long f21893d;

        /* renamed from: e */
        public byte[] f21894e;

        /* renamed from: a */
        public final C6134a m25531a() {
            return new C6134a(this.f21890a, this.f21891b, this.f21892c, this.f21893d, this.f21894e);
        }

        /* renamed from: b */
        public final a m25532b(byte[] bytes) {
            AbstractC5469l.m23028e(bytes, "bytes");
            this.f21894e = bytes;
            return this;
        }

        /* renamed from: c */
        public final a m25533c(String str) {
            this.f21891b = str;
            return this;
        }

        /* renamed from: d */
        public final a m25534d(String str) {
            this.f21890a = str;
            return this;
        }

        /* renamed from: e */
        public final a m25535e(long j7) {
            this.f21893d = j7;
            return this;
        }

        /* renamed from: f */
        public final a m25536f(Uri uri) {
            this.f21892c = uri;
            return this;
        }
    }

    public C6134a(String str, String str2, Uri uri, long j7, byte[] bArr) {
        this.f21885a = str;
        this.f21886b = str2;
        this.f21887c = uri;
        this.f21888d = j7;
        this.f21889e = bArr;
    }

    /* renamed from: a */
    public final HashMap m25530a() {
        return AbstractC7005E.m28736e(new C6926i("path", this.f21885a), new C6926i("name", this.f21886b), new C6926i("size", Long.valueOf(this.f21888d)), new C6926i("bytes", this.f21889e), new C6926i("identifier", String.valueOf(this.f21887c)));
    }
}
