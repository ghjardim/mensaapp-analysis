package p206c6;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7032w;

/* renamed from: c6.i */
/* loaded from: classes2.dex */
public final class C3621i {

    /* renamed from: a */
    public final boolean f12132a;

    /* renamed from: b */
    public final boolean f12133b;

    /* renamed from: c */
    public final C3601M f12134c;

    /* renamed from: d */
    public final Long f12135d;

    /* renamed from: e */
    public final Long f12136e;

    /* renamed from: f */
    public final Long f12137f;

    /* renamed from: g */
    public final Long f12138g;

    /* renamed from: h */
    public final Map f12139h;

    public C3621i(boolean z6, boolean z7, C3601M c3601m, Long l7, Long l8, Long l9, Long l10, Map extras) {
        AbstractC5469l.m23028e(extras, "extras");
        this.f12132a = z6;
        this.f12133b = z7;
        this.f12134c = c3601m;
        this.f12135d = l7;
        this.f12136e = l8;
        this.f12137f = l9;
        this.f12138g = l10;
        this.f12139h = AbstractC7005E.m28744m(extras);
    }

    /* renamed from: a */
    public final Long m14673a() {
        return this.f12137f;
    }

    /* renamed from: b */
    public final Long m14674b() {
        return this.f12135d;
    }

    /* renamed from: c */
    public final boolean m14675c() {
        return this.f12133b;
    }

    /* renamed from: d */
    public final boolean m14676d() {
        return this.f12132a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f12132a) {
            arrayList.add("isRegularFile");
        }
        if (this.f12133b) {
            arrayList.add("isDirectory");
        }
        if (this.f12135d != null) {
            arrayList.add("byteCount=" + this.f12135d);
        }
        if (this.f12136e != null) {
            arrayList.add("createdAt=" + this.f12136e);
        }
        if (this.f12137f != null) {
            arrayList.add("lastModifiedAt=" + this.f12137f);
        }
        if (this.f12138g != null) {
            arrayList.add("lastAccessedAt=" + this.f12138g);
        }
        if (!this.f12139h.isEmpty()) {
            arrayList.add("extras=" + this.f12139h);
        }
        return AbstractC7032w.m28878D(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C3621i(boolean z6, boolean z7, C3601M c3601m, Long l7, Long l8, Long l9, Long l10, Map map, int i7, AbstractC5464g abstractC5464g) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) == 0 ? z7 : false, (i7 & 4) != 0 ? null : c3601m, (i7 & 8) != 0 ? null : l7, (i7 & 16) != 0 ? null : l8, (i7 & 32) != 0 ? null : l9, (i7 & 64) == 0 ? l10 : null, (i7 & 128) != 0 ? AbstractC7005E.m28735d() : map);
    }
}
