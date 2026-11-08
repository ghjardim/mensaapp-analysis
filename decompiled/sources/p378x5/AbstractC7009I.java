package p378x5;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5469l;
import p013B5.AbstractC0067k;
import p069J5.InterfaceC0804p;
import p118Q5.AbstractC2212e;
import p118Q5.AbstractC2213f;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: x5.I */
/* loaded from: classes2.dex */
public abstract class AbstractC7009I {

    /* renamed from: x5.I$a */
    public static final class a extends AbstractC0067k implements InterfaceC0804p {

        /* renamed from: b */
        public Object f25057b;

        /* renamed from: c */
        public Object f25058c;

        /* renamed from: d */
        public int f25059d;

        /* renamed from: e */
        public int f25060e;

        /* renamed from: f */
        public /* synthetic */ Object f25061f;

        /* renamed from: n */
        public final /* synthetic */ int f25062n;

        /* renamed from: o */
        public final /* synthetic */ int f25063o;

        /* renamed from: p */
        public final /* synthetic */ Iterator f25064p;

        /* renamed from: q */
        public final /* synthetic */ boolean f25065q;

        /* renamed from: r */
        public final /* synthetic */ boolean f25066r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i7, int i8, Iterator it, boolean z6, boolean z7, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f25062n = i7;
            this.f25063o = i8;
            this.f25064p = it;
            this.f25065q = z6;
            this.f25066r = z7;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2212e abstractC2212e, InterfaceC7157e interfaceC7157e) {
            return ((a) create(abstractC2212e, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(this.f25062n, this.f25063o, this.f25064p, this.f25065q, this.f25066r, interfaceC7157e);
            aVar.f25061f = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0145 -> B:12:0x0148). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0117 -> B:30:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a2 -> B:50:0x0055). Please report as a decompilation issue!!! */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p378x5.AbstractC7009I.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m28759a(int i7, int i8) {
        String str;
        if (i7 <= 0 || i8 <= 0) {
            if (i7 != i8) {
                str = "Both size " + i7 + " and step " + i8 + " must be greater than zero.";
            } else {
                str = "size " + i7 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: b */
    public static final Iterator m28760b(Iterator iterator, int i7, int i8, boolean z6, boolean z7) {
        AbstractC5469l.m23028e(iterator, "iterator");
        return !iterator.hasNext() ? C7033x.f25084a : AbstractC2213f.m7615a(new a(i7, i8, iterator, z7, z6, null));
    }
}
