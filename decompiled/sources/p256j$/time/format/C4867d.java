package p256j$.time.format;

/* renamed from: j$.time.format.d */
/* loaded from: classes3.dex */
final class C4867d implements InterfaceC4869f {

    /* renamed from: a */
    private final char f17979a;

    C4867d(char c7) {
        this.f17979a = c7;
    }

    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        sb.append(this.f17979a);
        return true;
    }

    public final String toString() {
        char c7 = this.f17979a;
        if (c7 == '\'') {
            return "''";
        }
        return "'" + c7 + "'";
    }
}
