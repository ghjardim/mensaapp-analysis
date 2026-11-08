package p028E;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import p042G.AbstractC0343e;

/* renamed from: E.k */
/* loaded from: classes.dex */
public abstract class AbstractC0206k {

    /* renamed from: E.k$b */
    public static class b {

        /* renamed from: a */
        public final Uri f828a;

        /* renamed from: b */
        public final int f829b;

        /* renamed from: c */
        public final int f830c;

        /* renamed from: d */
        public final boolean f831d;

        /* renamed from: e */
        public final int f832e;

        public b(Uri uri, int i7, int i8, boolean z6, int i9) {
            this.f828a = (Uri) AbstractC0343e.m1353c(uri);
            this.f829b = i7;
            this.f830c = i8;
            this.f831d = z6;
            this.f832e = i9;
        }

        /* renamed from: a */
        public static b m837a(Uri uri, int i7, int i8, boolean z6, int i9) {
            return new b(uri, i7, i8, z6, i9);
        }

        /* renamed from: b */
        public int m838b() {
            return this.f832e;
        }

        /* renamed from: c */
        public int m839c() {
            return this.f829b;
        }

        /* renamed from: d */
        public Uri m840d() {
            return this.f828a;
        }

        /* renamed from: e */
        public int m841e() {
            return this.f830c;
        }

        /* renamed from: f */
        public boolean m842f() {
            return this.f831d;
        }
    }

    /* renamed from: E.k$c */
    public static class c {
        /* renamed from: a */
        public abstract void mo843a(int i7);

        /* renamed from: b */
        public abstract void mo844b(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m830a(Context context, List list, int i7, boolean z6, int i8, Handler handler, c cVar) {
        C0196a c0196a = new C0196a(cVar, AbstractC0207l.m846b(handler));
        if (!z6) {
            return AbstractC0205j.m823d(context, list, i7, null, c0196a);
        }
        if (list.size() <= 1) {
            return AbstractC0205j.m824e(context, (C0201f) list.get(0), c0196a, i7, i8);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* renamed from: E.k$a */
    public static class a {

        /* renamed from: a */
        public final int f826a;

        /* renamed from: b */
        public final List f827b;

        public a(int i7, b[] bVarArr) {
            this.f826a = i7;
            this.f827b = Collections.singletonList(bVarArr);
        }

        /* renamed from: a */
        public static a m831a(int i7, List list) {
            return new a(i7, list);
        }

        /* renamed from: b */
        public static a m832b(int i7, b[] bVarArr) {
            return new a(i7, bVarArr);
        }

        /* renamed from: c */
        public b[] m833c() {
            return (b[]) this.f827b.get(0);
        }

        /* renamed from: d */
        public List m834d() {
            return this.f827b;
        }

        /* renamed from: e */
        public int m835e() {
            return this.f826a;
        }

        /* renamed from: f */
        public boolean m836f() {
            return this.f827b.size() > 1;
        }

        public a(int i7, List list) {
            this.f826a = i7;
            this.f827b = list;
        }
    }
}
