package p228f4;

import java.util.Collections;
import java.util.Map;
import p219e3.C4176f;
import p220e4.C4196h;

/* renamed from: f4.c */
/* loaded from: classes.dex */
public class C4279c extends AbstractC4281e {
    public C4279c(C4196h c4196h, C4176f c4176f, long j7) {
        super(c4196h, c4176f);
        if (j7 != 0) {
            super.m17904G("Range", "bytes=" + j7 + "-");
        }
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: e */
    public String mo17894e() {
        return "GET";
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: l */
    public Map mo17895l() {
        return Collections.singletonMap("alt", "media");
    }
}
