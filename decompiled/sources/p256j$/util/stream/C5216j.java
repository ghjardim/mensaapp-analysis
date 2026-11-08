package p256j$.util.stream;

import java.util.stream.Collector;

/* renamed from: j$.util.stream.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5216j {

    /* renamed from: a */
    public final /* synthetic */ Collector f18634a;

    private /* synthetic */ C5216j(Collector collector) {
        this.f18634a = collector;
    }

    /* renamed from: a */
    public static /* synthetic */ C5216j m21567a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C5216j(collector);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f18634a;
        if (obj instanceof C5216j) {
            obj = ((C5216j) obj).f18634a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18634a.hashCode();
    }
}
