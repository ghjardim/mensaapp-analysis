package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p109P3.InterfaceC1901J;
import p116Q3.AbstractC2133b;
import p137T3.InterfaceC2446a;
import p219e3.C4176f;
import p219e3.C4185o;
import p219e3.InterfaceC4177g;

/* renamed from: com.google.firebase.firestore.h */
/* loaded from: classes.dex */
public class C3954h implements InterfaceC4177g, FirebaseFirestore.InterfaceC3946a {

    /* renamed from: a */
    public final Map f12950a = new HashMap();

    /* renamed from: b */
    public final C4176f f12951b;

    /* renamed from: c */
    public final Context f12952c;

    /* renamed from: d */
    public final InterfaceC2446a f12953d;

    /* renamed from: e */
    public final InterfaceC2446a f12954e;

    /* renamed from: f */
    public final InterfaceC1901J f12955f;

    public C3954h(Context context, C4176f c4176f, InterfaceC2446a interfaceC2446a, InterfaceC2446a interfaceC2446a2, InterfaceC1901J interfaceC1901J) {
        this.f12952c = context;
        this.f12951b = c4176f;
        this.f12953d = interfaceC2446a;
        this.f12954e = interfaceC2446a2;
        this.f12955f = interfaceC1901J;
        c4176f.m17528h(this);
    }

    @Override // p219e3.InterfaceC4177g
    /* renamed from: a */
    public synchronized void mo15606a(String str, C4185o c4185o) {
        Iterator it = new ArrayList(this.f12950a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).m15493c0();
            AbstractC2133b.m7217d(!this.f12950a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    /* renamed from: b */
    public synchronized FirebaseFirestore m15607b(String str) {
        FirebaseFirestore firebaseFirestore;
        firebaseFirestore = (FirebaseFirestore) this.f12950a.get(str);
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.m15460W(this.f12952c, this.f12951b, this.f12953d, this.f12954e, str, this, this.f12955f);
            this.f12950a.put(str, firebaseFirestore);
        }
        return firebaseFirestore;
    }

    @Override // com.google.firebase.firestore.FirebaseFirestore.InterfaceC3946a
    public synchronized void remove(String str) {
        this.f12950a.remove(str);
    }
}
