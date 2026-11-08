package p054H4;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.C4804i;
import java.util.HashMap;
import p061I4.C0649a;
import p061I4.C0664p;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.a */
/* loaded from: classes.dex */
public class C0565a {

    /* renamed from: a */
    public final C0649a f1844a;

    /* renamed from: b */
    public final FlutterJNI f1845b;

    /* renamed from: c */
    public b f1846c;

    /* renamed from: d */
    public final C0649a.d f1847d;

    /* renamed from: H4.a$a */
    public class a implements C0649a.d {
        public a() {
        }

        @Override // p061I4.C0649a.d
        /* renamed from: a */
        public void mo2170a(Object obj, C0649a.e eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (C0565a.this.f1846c == null) {
                eVar.mo2187a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            AbstractC6917b.m28358f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        C0565a.this.f1846c.mo2173e(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        C0565a.this.f1846c.mo2172d(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        C0565a.this.f1846c.mo2171c(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        C0565a.this.f1846c.mo2174f(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        C0565a.this.f1846c.mo2175g(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.mo2187a(null);
        }
    }

    /* renamed from: H4.a$b */
    public interface b extends FlutterJNI.InterfaceC4656a {
        /* renamed from: c */
        void mo2171c(int i7);

        /* renamed from: d */
        void mo2172d(String str);

        /* renamed from: e */
        void mo2173e(String str);

        /* renamed from: f */
        void mo2174f(int i7);

        /* renamed from: g */
        void mo2175g(int i7);
    }

    public C0565a(C7146a c7146a, FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f1847d = aVar;
        C0649a c0649a = new C0649a(c7146a, "flutter/accessibility", C0664p.f2266a);
        this.f1844a = c0649a;
        c0649a.m2614e(aVar);
        this.f1845b = flutterJNI;
    }

    /* renamed from: b */
    public void m2164b(int i7, C4804i.g gVar) {
        this.f1845b.dispatchSemanticsAction(i7, gVar);
    }

    /* renamed from: c */
    public void m2165c(int i7, C4804i.g gVar, Object obj) {
        this.f1845b.dispatchSemanticsAction(i7, gVar, obj);
    }

    /* renamed from: d */
    public void m2166d() {
        this.f1845b.setSemanticsEnabled(false);
    }

    /* renamed from: e */
    public void m2167e() {
        this.f1845b.setSemanticsEnabled(true);
    }

    /* renamed from: f */
    public void m2168f(int i7) {
        this.f1845b.setAccessibilityFeatures(i7);
    }

    /* renamed from: g */
    public void m2169g(b bVar) {
        this.f1846c = bVar;
        this.f1845b.setAccessibilityDelegate(bVar);
    }
}
