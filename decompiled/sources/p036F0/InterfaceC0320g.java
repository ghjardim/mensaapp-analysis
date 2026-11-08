package p036F0;

import p232g0.C4327q;
import p249i1.C4517h;
import p249i1.InterfaceC4521l;
import p249i1.InterfaceC4529t;
import p256j$.util.Objects;
import p260j1.C5358a;
import p260j1.C5360c;

/* renamed from: F0.g */
/* loaded from: classes.dex */
public interface InterfaceC0320g {

    /* renamed from: a */
    public static final InterfaceC0320g f1159a = new a();

    /* renamed from: F0.g$a */
    public class a implements InterfaceC0320g {

        /* renamed from: b */
        public final C4517h f1160b = new C4517h();

        @Override // p036F0.InterfaceC0320g
        /* renamed from: a */
        public boolean mo1242a(C4327q c4327q) {
            String str = c4327q.f15138n;
            return this.f1160b.mo19226a(c4327q) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // p036F0.InterfaceC0320g
        /* renamed from: b */
        public InterfaceC4521l mo1243b(C4327q c4327q) {
            String str = c4327q.f15138n;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C5358a(str, c4327q.f15119G, 16000L);
                    case "application/cea-708":
                        return new C5360c(c4327q.f15119G, c4327q.f15141q);
                }
            }
            if (!this.f1160b.mo19226a(c4327q)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            InterfaceC4529t mo19227b = this.f1160b.mo19227b(c4327q);
            return new C0315b(mo19227b.getClass().getSimpleName() + "Decoder", mo19227b);
        }
    }

    /* renamed from: a */
    boolean mo1242a(C4327q c4327q);

    /* renamed from: b */
    InterfaceC4521l mo1243b(C4327q c4327q);
}
