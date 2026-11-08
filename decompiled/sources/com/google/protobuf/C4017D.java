package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.D */
/* loaded from: classes.dex */
public class C4017D extends IOException {

    /* renamed from: a */
    public InterfaceC4034V f13283a;

    /* renamed from: b */
    public boolean f13284b;

    /* renamed from: com.google.protobuf.D$a */
    public static class a extends C4017D {
        public a(String str) {
            super(str);
        }
    }

    public C4017D(String str) {
        super(str);
        this.f13283a = null;
    }

    /* renamed from: b */
    public static C4017D m16237b() {
        return new C4017D("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static C4017D m16238c() {
        return new C4017D("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static C4017D m16239d() {
        return new C4017D("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static a m16240e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    public static C4017D m16241f() {
        return new C4017D("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    public static C4017D m16242g() {
        return new C4017D("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    public static C4017D m16243h() {
        return new C4017D("Failed to parse the message.");
    }

    /* renamed from: i */
    public static C4017D m16244i() {
        return new C4017D("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* renamed from: l */
    public static C4017D m16245l() {
        return new C4017D("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: m */
    public static C4017D m16246m() {
        return new C4017D("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public boolean m16247a() {
        return this.f13284b;
    }

    /* renamed from: j */
    public void m16248j() {
        this.f13284b = true;
    }

    /* renamed from: k */
    public C4017D m16249k(InterfaceC4034V interfaceC4034V) {
        this.f13283a = interfaceC4034V;
        return this;
    }

    public C4017D(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f13283a = null;
    }
}
