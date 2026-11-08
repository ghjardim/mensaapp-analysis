package p256j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p256j$.util.Objects;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.j */
/* loaded from: classes3.dex */
public abstract class AbstractC4935j {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f18132a;

    /* renamed from: b */
    private static final ConcurrentHashMap f18133b;

    /* renamed from: b */
    protected abstract C4931f mo21250b(String str);

    /* renamed from: c */
    protected abstract Set mo21251c();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f18132a = copyOnWriteArrayList;
        f18133b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C4933h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C4931f m21252a(String str, boolean z6) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f18133b;
        AbstractC4935j abstractC4935j = (AbstractC4935j) concurrentHashMap.get(str);
        if (abstractC4935j != null) {
            return abstractC4935j.mo21250b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new C4932g("No time-zone data files registered");
        }
        throw new C4932g("Unknown time-zone ID: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m21253d(AbstractC4935j abstractC4935j) {
        Objects.requireNonNull(abstractC4935j, "provider");
        synchronized (AbstractC4935j.class) {
            try {
                for (String str : abstractC4935j.mo21251c()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((AbstractC4935j) f18133b.putIfAbsent(str, abstractC4935j)) != null) {
                        throw new C4932g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + abstractC4935j);
                    }
                }
                Collections.unmodifiableSet(new HashSet(f18133b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f18132a.add(abstractC4935j);
    }
}
