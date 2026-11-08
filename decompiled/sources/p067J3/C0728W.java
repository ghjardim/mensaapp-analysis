package p067J3;

import p088M3.C1170l;

/* renamed from: J3.W */
/* loaded from: classes.dex */
public class C0728W {

    /* renamed from: a */
    public final a f2556a;

    /* renamed from: b */
    public final C1170l f2557b;

    /* renamed from: J3.W$a */
    public enum a {
        ADDED,
        REMOVED
    }

    public C0728W(a aVar, C1170l c1170l) {
        this.f2556a = aVar;
        this.f2557b = c1170l;
    }

    /* renamed from: a */
    public C1170l m3065a() {
        return this.f2557b;
    }

    /* renamed from: b */
    public a m3066b() {
        return this.f2556a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0728W)) {
            return false;
        }
        C0728W c0728w = (C0728W) obj;
        return this.f2556a.equals(c0728w.m3066b()) && this.f2557b.equals(c0728w.m3065a());
    }

    public int hashCode() {
        return ((2077 + this.f2556a.hashCode()) * 31) + this.f2557b.hashCode();
    }
}
