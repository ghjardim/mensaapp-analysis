package p214d6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p206c6.C3601M;

/* renamed from: d6.i */
/* loaded from: classes2.dex */
public final class C4139i {

    /* renamed from: a */
    public final C3601M f13857a;

    /* renamed from: b */
    public final boolean f13858b;

    /* renamed from: c */
    public final String f13859c;

    /* renamed from: d */
    public final long f13860d;

    /* renamed from: e */
    public final long f13861e;

    /* renamed from: f */
    public final long f13862f;

    /* renamed from: g */
    public final int f13863g;

    /* renamed from: h */
    public final Long f13864h;

    /* renamed from: i */
    public final long f13865i;

    /* renamed from: j */
    public final List f13866j;

    public C4139i(C3601M canonicalPath, boolean z6, String comment, long j7, long j8, long j9, int i7, Long l7, long j10) {
        AbstractC5469l.m23028e(canonicalPath, "canonicalPath");
        AbstractC5469l.m23028e(comment, "comment");
        this.f13857a = canonicalPath;
        this.f13858b = z6;
        this.f13859c = comment;
        this.f13860d = j7;
        this.f13861e = j8;
        this.f13862f = j9;
        this.f13863g = i7;
        this.f13864h = l7;
        this.f13865i = j10;
        this.f13866j = new ArrayList();
    }

    /* renamed from: a */
    public final C3601M m17369a() {
        return this.f13857a;
    }

    /* renamed from: b */
    public final List m17370b() {
        return this.f13866j;
    }

    /* renamed from: c */
    public final long m17371c() {
        return this.f13861e;
    }

    /* renamed from: d */
    public final int m17372d() {
        return this.f13863g;
    }

    /* renamed from: e */
    public final Long m17373e() {
        return this.f13864h;
    }

    /* renamed from: f */
    public final long m17374f() {
        return this.f13865i;
    }

    /* renamed from: g */
    public final long m17375g() {
        return this.f13862f;
    }

    /* renamed from: h */
    public final boolean m17376h() {
        return this.f13858b;
    }

    public /* synthetic */ C4139i(C3601M c3601m, boolean z6, String str, long j7, long j8, long j9, int i7, Long l7, long j10, int i8, AbstractC5464g abstractC5464g) {
        this(c3601m, (i8 & 2) != 0 ? false : z6, (i8 & 4) != 0 ? StringUtils.EMPTY : str, (i8 & 8) != 0 ? -1L : j7, (i8 & 16) != 0 ? -1L : j8, (i8 & 32) != 0 ? -1L : j9, (i8 & 64) != 0 ? -1 : i7, (i8 & 128) != 0 ? null : l7, (i8 & 256) == 0 ? j10 : -1L);
    }
}
