package p160W5;

import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2342N;
import p132S5.EnumC2338L;
import p132S5.InterfaceC2334J;
import p146U5.AbstractC2598p;
import p146U5.EnumC2583a;
import p146U5.InterfaceC2600r;
import p146U5.InterfaceC2601s;
import p153V5.AbstractC2633f;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p378x5.AbstractC7032w;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: W5.e */
/* loaded from: classes2.dex */
public abstract class AbstractC2729e implements InterfaceC2735k {

    /* renamed from: a */
    public final InterfaceC7161i f8051a;

    /* renamed from: b */
    public final int f8052b;

    /* renamed from: c */
    public final EnumC2583a f8053c;

    /* renamed from: W5.e$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f8054a;

        /* renamed from: b */
        public /* synthetic */ Object f8055b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC2632e f8056c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC2729e f8057d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2632e interfaceC2632e, AbstractC2729e abstractC2729e, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f8056c = interfaceC2632e;
            this.f8057d = abstractC2729e;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(this.f8056c, this.f8057d, interfaceC7157e);
            aVar.f8055b = obj;
            return aVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f8054a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.f8055b;
                InterfaceC2632e interfaceC2632e = this.f8056c;
                InterfaceC2601s m9349j = this.f8057d.m9349j(interfaceC2334J);
                this.f8054a = 1;
                if (AbstractC2633f.m9057f(interfaceC2632e, m9349j, this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return C6934q.f24811a;
        }
    }

    /* renamed from: W5.e$b */
    public static final class b extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f8058a;

        /* renamed from: b */
        public /* synthetic */ Object f8059b;

        public b(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e) {
            return ((b) create(interfaceC2600r, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            b bVar = AbstractC2729e.this.new b(interfaceC7157e);
            bVar.f8059b = obj;
            return bVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f8058a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC2600r interfaceC2600r = (InterfaceC2600r) this.f8059b;
                AbstractC2729e abstractC2729e = AbstractC2729e.this;
                this.f8058a = 1;
                if (abstractC2729e.mo9049f(interfaceC2600r, this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return C6934q.f24811a;
        }
    }

    public AbstractC2729e(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        this.f8051a = interfaceC7161i;
        this.f8052b = i7;
        this.f8053c = enumC2583a;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m9345e(AbstractC2729e abstractC2729e, InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
        Object m7998c = AbstractC2336K.m7998c(new a(interfaceC2632e, abstractC2729e, null), interfaceC7157e);
        return m7998c == AbstractC0024c.m76e() ? m7998c : C6934q.f24811a;
    }

    @Override // p153V5.InterfaceC2631d
    /* renamed from: a */
    public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
        return m9345e(this, interfaceC2632e, interfaceC7157e);
    }

    @Override // p160W5.InterfaceC2735k
    /* renamed from: c */
    public InterfaceC2631d mo9088c(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        InterfaceC7161i plus = interfaceC7161i.plus(this.f8051a);
        if (enumC2583a == EnumC2583a.f7562a) {
            int i8 = this.f8052b;
            if (i8 != -3) {
                if (i7 != -3) {
                    if (i8 != -2) {
                        if (i7 != -2) {
                            i7 += i8;
                            if (i7 < 0) {
                                i7 = C3643a.e.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i7 = i8;
            }
            enumC2583a = this.f8053c;
        }
        return (AbstractC5469l.m23024a(plus, this.f8051a) && i7 == this.f8052b && enumC2583a == this.f8053c) ? this : mo9050g(plus, i7, enumC2583a);
    }

    /* renamed from: d */
    public String m9346d() {
        return null;
    }

    /* renamed from: f */
    public abstract Object mo9049f(InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e);

    /* renamed from: g */
    public abstract AbstractC2729e mo9050g(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a);

    /* renamed from: h */
    public final InterfaceC0804p m9347h() {
        return new b(null);
    }

    /* renamed from: i */
    public final int m9348i() {
        int i7 = this.f8052b;
        if (i7 == -3) {
            return -2;
        }
        return i7;
    }

    /* renamed from: j */
    public InterfaceC2601s m9349j(InterfaceC2334J interfaceC2334J) {
        return AbstractC2598p.m8880c(interfaceC2334J, this.f8051a, m9348i(), this.f8053c, EnumC2338L.f7070c, null, m9347h(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String m9346d = m9346d();
        if (m9346d != null) {
            arrayList.add(m9346d);
        }
        if (this.f8051a != C7162j.f25439a) {
            arrayList.add("context=" + this.f8051a);
        }
        if (this.f8052b != -3) {
            arrayList.add("capacity=" + this.f8052b);
        }
        if (this.f8053c != EnumC2583a.f7562a) {
            arrayList.add("onBufferOverflow=" + this.f8053c);
        }
        return AbstractC2342N.m8004a(this) + '[' + AbstractC7032w.m28878D(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
