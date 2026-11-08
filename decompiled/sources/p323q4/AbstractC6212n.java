package p323q4;

/* renamed from: q4.n */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6212n {

    /* renamed from: q4.n$a */
    public class a implements InterfaceC6208j {

        /* renamed from: a */
        public final /* synthetic */ C6207i f22210a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6213o f22211b;

        public a(InterfaceC6213o interfaceC6213o, C6207i c6207i) {
            this.f22211b = interfaceC6213o;
            this.f22210a = c6207i;
        }

        @Override // p323q4.InterfaceC6208j
        /* renamed from: a */
        public int mo25950a() {
            return this.f22210a.f22188c;
        }

        @Override // p323q4.InterfaceC6208j
        /* renamed from: b */
        public boolean mo25951b() {
            return this.f22210a.m25923F();
        }
    }

    /* renamed from: a */
    public static void m25962a(InterfaceC6213o interfaceC6213o, C6207i c6207i, Runnable runnable) {
        interfaceC6213o.mo25965b(new C6209k(c6207i == null ? null : new a(interfaceC6213o, c6207i), runnable));
    }

    /* renamed from: b */
    public static InterfaceC6213o m25963b(String str, int i7, int i8) {
        return i7 == 1 ? new C6217s(str, i8) : new C6215q(str, i7, i8);
    }
}
