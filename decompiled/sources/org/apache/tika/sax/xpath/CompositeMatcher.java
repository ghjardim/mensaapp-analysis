package org.apache.tika.sax.xpath;

/* loaded from: classes2.dex */
public class CompositeMatcher extends Matcher {

    /* renamed from: a */
    private final Matcher f21468a;

    /* renamed from: b */
    private final Matcher f21469b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f21468a = matcher;
        this.f21469b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher descend = this.f21468a.descend(str, str2);
        Matcher descend2 = this.f21469b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        return descend == matcher ? descend2 : descend2 == matcher ? descend : (this.f21468a == descend && this.f21469b == descend2) ? this : new CompositeMatcher(descend, descend2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return this.f21468a.matchesAttribute(str, str2) || this.f21469b.matchesAttribute(str, str2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return this.f21468a.matchesElement() || this.f21469b.matchesElement();
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return this.f21468a.matchesText() || this.f21469b.matchesText();
    }
}
