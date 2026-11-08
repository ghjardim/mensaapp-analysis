package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.v */
/* loaded from: classes.dex */
public class C3313v extends IOException {

    /* renamed from: a */
    public InterfaceC3264J f10668a;

    /* renamed from: b */
    public boolean f10669b;

    /* renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C3313v {
        public a(String str) {
            super(str);
        }
    }

    public C3313v(String str) {
        super(str);
        this.f10668a = null;
    }

    /* renamed from: b */
    public static C3313v m12842b() {
        return new C3313v("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static C3313v m12843c() {
        return new C3313v("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static C3313v m12844d() {
        return new C3313v("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static a m12845e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    public static C3313v m12846f() {
        return new C3313v("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    public static C3313v m12847g() {
        return new C3313v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    public static C3313v m12848h() {
        return new C3313v("Failed to parse the message.");
    }

    /* renamed from: i */
    public static C3313v m12849i() {
        return new C3313v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* renamed from: l */
    public static C3313v m12850l() {
        return new C3313v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: m */
    public static C3313v m12851m() {
        return new C3313v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public boolean m12852a() {
        return this.f10669b;
    }

    /* renamed from: j */
    public void m12853j() {
        this.f10669b = true;
    }

    /* renamed from: k */
    public C3313v m12854k(InterfaceC3264J interfaceC3264J) {
        this.f10668a = interfaceC3264J;
        return this;
    }

    public C3313v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f10668a = null;
    }
}
