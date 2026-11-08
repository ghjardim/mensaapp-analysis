package p054H4;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.ClimateForcast;
import org.json.JSONException;
import org.json.JSONObject;
import p054H4.C0573i;
import p061I4.C0649a;
import p061I4.C0654f;
import p061I4.InterfaceC0651c;
import p370w4.AbstractC6917b;

/* renamed from: H4.i */
/* loaded from: classes.dex */
public class C0573i {

    /* renamed from: a */
    public final C0649a f1857a;

    /* renamed from: H4.i$a */
    public interface a {
        /* renamed from: a */
        void mo2193a(boolean z6);
    }

    /* renamed from: H4.i$b */
    public static class b {

        /* renamed from: a */
        public final KeyEvent f1858a;

        /* renamed from: b */
        public final Character f1859b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f1858a = keyEvent;
            this.f1859b = ch;
        }
    }

    public C0573i(InterfaceC0651c interfaceC0651c) {
        this.f1857a = new C0649a(interfaceC0651c, "flutter/keyevent", C0654f.f2252a);
    }

    /* renamed from: b */
    public static C0649a.e m2189b(final a aVar) {
        return new C0649a.e() { // from class: H4.h
            @Override // p061I4.C0649a.e
            /* renamed from: a */
            public final void mo2187a(Object obj) {
                C0573i.m2190d(C0573i.a.this, obj);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ void m2190d(a aVar, Object obj) {
        boolean z6 = false;
        if (obj != null) {
            try {
                z6 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e7) {
                AbstractC6917b.m28354b("KeyEventChannel", "Unable to unpack JSON message: " + e7);
            }
        }
        aVar.mo2193a(z6);
    }

    /* renamed from: c */
    public final Map m2191c(b bVar, boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z6 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f1858a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f1858a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f1858a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f1858a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f1858a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f1858a.getMetaState()));
        Character ch = bVar.f1859b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put(ClimateForcast.SOURCE, Integer.valueOf(bVar.f1858a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f1858a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f1858a.getRepeatCount()));
        return hashMap;
    }

    /* renamed from: e */
    public void m2192e(b bVar, boolean z6, a aVar) {
        this.f1857a.m2613d(m2191c(bVar, z6), m2189b(aVar));
    }
}
