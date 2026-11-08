package p256j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.e */
/* loaded from: classes3.dex */
final class C4868e implements InterfaceC4869f {

    /* renamed from: a */
    private final InterfaceC4869f[] f17980a;

    /* renamed from: b */
    private final boolean f17981b;

    C4868e(ArrayList arrayList, boolean z6) {
        this((InterfaceC4869f[]) arrayList.toArray(new InterfaceC4869f[arrayList.size()]), z6);
    }

    C4868e(InterfaceC4869f[] interfaceC4869fArr, boolean z6) {
        this.f17980a = interfaceC4869fArr;
        this.f17981b = z6;
    }

    /* renamed from: a */
    public final C4868e m21073a() {
        return !this.f17981b ? this : new C4868e(this.f17980a, false);
    }

    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        int length = sb.length();
        boolean z6 = this.f17981b;
        if (z6) {
            c4879p.m21106g();
        }
        try {
            for (InterfaceC4869f interfaceC4869f : this.f17980a) {
                if (!interfaceC4869f.mo21072l(c4879p, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z6) {
                c4879p.m21100a();
            }
            return true;
        } finally {
            if (z6) {
                c4879p.m21100a();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC4869f[] interfaceC4869fArr = this.f17980a;
        if (interfaceC4869fArr != null) {
            boolean z6 = this.f17981b;
            sb.append(z6 ? "[" : "(");
            for (InterfaceC4869f interfaceC4869f : interfaceC4869fArr) {
                sb.append(interfaceC4869f);
            }
            sb.append(z6 ? "]" : ")");
        }
        return sb.toString();
    }
}
