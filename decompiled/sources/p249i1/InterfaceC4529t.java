package p249i1;

import p232g0.C4327q;
import p259j0.InterfaceC5338g;

/* renamed from: i1.t */
/* loaded from: classes.dex */
public interface InterfaceC4529t {

    /* renamed from: i1.t$a */
    public interface a {

        /* renamed from: a */
        public static final a f16172a = new C7222a();

        /* renamed from: i1.t$a$a, reason: collision with other inner class name */
        public class C7222a implements a {
            @Override // p249i1.InterfaceC4529t.a
            /* renamed from: a */
            public boolean mo19226a(C4327q c4327q) {
                return false;
            }

            @Override // p249i1.InterfaceC4529t.a
            /* renamed from: b */
            public InterfaceC4529t mo19227b(C4327q c4327q) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // p249i1.InterfaceC4529t.a
            /* renamed from: c */
            public int mo19228c(C4327q c4327q) {
                return 1;
            }
        }

        /* renamed from: a */
        boolean mo19226a(C4327q c4327q);

        /* renamed from: b */
        InterfaceC4529t mo19227b(C4327q c4327q);

        /* renamed from: c */
        int mo19228c(C4327q c4327q);
    }

    /* renamed from: i1.t$b */
    public static class b {

        /* renamed from: c */
        public static final b f16173c = new b(-9223372036854775807L, false);

        /* renamed from: a */
        public final long f16174a;

        /* renamed from: b */
        public final boolean f16175b;

        public b(long j7, boolean z6) {
            this.f16174a = j7;
            this.f16175b = z6;
        }

        /* renamed from: b */
        public static b m19261b() {
            return f16173c;
        }

        /* renamed from: c */
        public static b m19262c(long j7) {
            return new b(j7, true);
        }
    }

    /* renamed from: a */
    InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8);

    /* renamed from: b */
    void mo19258b(byte[] bArr, int i7, int i8, b bVar, InterfaceC5338g interfaceC5338g);

    /* renamed from: c */
    int mo19259c();

    void reset();
}
