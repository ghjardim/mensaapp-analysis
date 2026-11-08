package p256j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: j$.time.zone.i */
/* loaded from: classes3.dex */
final class C4934i extends AbstractC4935j {

    /* renamed from: c */
    private final Set f18131c;

    C4934i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f18131c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // p256j$.time.zone.AbstractC4935j
    /* renamed from: c */
    protected final Set mo21251c() {
        return this.f18131c;
    }

    @Override // p256j$.time.zone.AbstractC4935j
    /* renamed from: b */
    protected final C4931f mo21250b(String str) {
        if (this.f18131c.contains(str)) {
            return new C4931f(TimeZone.getTimeZone(str));
        }
        throw new C4932g("Not a built-in time zone: " + str);
    }
}
