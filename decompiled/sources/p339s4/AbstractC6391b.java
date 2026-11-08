package p339s4;

import java.util.List;
import org.apache.tika.utils.StringUtils;
import p323q4.C6197D;

/* renamed from: s4.b */
/* loaded from: classes.dex */
public abstract class AbstractC6391b implements InterfaceC6394e {
    @Override // p339s4.InterfaceC6394e
    /* renamed from: d */
    public C6197D mo26701d() {
        return new C6197D(m26708m(), m26709n());
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: e */
    public boolean mo26702e() {
        return Boolean.TRUE.equals(mo26710c("noResult"));
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: f */
    public Integer mo26703f() {
        return (Integer) mo26710c("transactionId");
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: g */
    public boolean mo26704g() {
        return mo26712i("transactionId") && mo26703f() == null;
    }

    @Override // p339s4.InterfaceC6394e
    /* renamed from: j */
    public Boolean mo26705j() {
        return m26706k("inTransaction");
    }

    /* renamed from: k */
    public final Boolean m26706k(String str) {
        Object mo26710c = mo26710c(str);
        if (mo26710c instanceof Boolean) {
            return (Boolean) mo26710c;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m26707l() {
        return Boolean.TRUE.equals(mo26710c("continueOnError"));
    }

    /* renamed from: m */
    public final String m26708m() {
        return (String) mo26710c("sql");
    }

    /* renamed from: n */
    public final List m26709n() {
        return (List) mo26710c("arguments");
    }

    public String toString() {
        return mo26711h() + StringUtils.SPACE + m26708m() + StringUtils.SPACE + m26709n();
    }
}
