package p021D;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: D.r */
/* loaded from: classes.dex */
public final class C0110r implements InterfaceC0103k {

    /* renamed from: a */
    public final LocaleList f342a;

    public C0110r(Object obj) {
        this.f342a = AbstractC0109q.m279a(obj);
    }

    @Override // p021D.InterfaceC0103k
    /* renamed from: a */
    public Object mo273a() {
        return this.f342a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f342a.equals(((InterfaceC0103k) obj).mo273a());
        return equals;
    }

    @Override // p021D.InterfaceC0103k
    public Locale get(int i7) {
        Locale locale;
        locale = this.f342a.get(i7);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f342a.hashCode();
        return hashCode;
    }

    @Override // p021D.InterfaceC0103k
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f342a.isEmpty();
        return isEmpty;
    }

    public String toString() {
        String localeList;
        localeList = this.f342a.toString();
        return localeList;
    }
}
