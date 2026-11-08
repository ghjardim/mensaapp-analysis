package p047G4;

import io.flutter.embedding.engine.C4659a;
import io.flutter.plugins.GeneratedPluginRegistrant;
import p370w4.AbstractC6917b;

/* renamed from: G4.a */
/* loaded from: classes.dex */
public abstract class AbstractC0465a {
    /* renamed from: a */
    public static void m1711a(C4659a c4659a) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C4659a.class).invoke(null, c4659a);
        } catch (Exception e7) {
            AbstractC6917b.m28354b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c4659a + ") but could not find or invoke the GeneratedPluginRegistrant.");
            AbstractC6917b.m28355c("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }
}
