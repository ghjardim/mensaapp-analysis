package p373x0;

import p141U0.InterfaceC2499a;
import p148V0.C2607b;
import p155W0.C2654b;
import p169Y0.C2891a;
import p176Z0.C2966h;
import p193b1.C3510c;
import p232g0.C4327q;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public interface InterfaceC6940a {

    /* renamed from: a */
    public static final InterfaceC6940a f24821a = new a();

    /* renamed from: x0.a$a */
    public class a implements InterfaceC6940a {
        @Override // p373x0.InterfaceC6940a
        /* renamed from: a */
        public boolean mo28419a(C4327q c4327q) {
            String str = c4327q.f15138n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p373x0.InterfaceC6940a
        /* renamed from: b */
        public InterfaceC2499a mo28420b(C4327q c4327q) {
            String str = c4327q.f15138n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C2607b();
                    case "application/x-icy":
                        return new C2891a();
                    case "application/id3":
                        return new C2966h();
                    case "application/x-emsg":
                        return new C2654b();
                    case "application/x-scte35":
                        return new C3510c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo28419a(C4327q c4327q);

    /* renamed from: b */
    InterfaceC2499a mo28420b(C4327q c4327q);
}
