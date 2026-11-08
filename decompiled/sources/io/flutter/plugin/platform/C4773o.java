package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugin.platform.o */
/* loaded from: classes.dex */
public class C4773o implements InterfaceC4772n {

    /* renamed from: a */
    public final Map f17584a = new HashMap();

    @Override // io.flutter.plugin.platform.InterfaceC4772n
    /* renamed from: a */
    public boolean mo20551a(String str, AbstractC4771m abstractC4771m) {
        if (this.f17584a.containsKey(str)) {
            return false;
        }
        this.f17584a.put(str, abstractC4771m);
        return true;
    }

    /* renamed from: b */
    public AbstractC4771m m20552b(String str) {
        return (AbstractC4771m) this.f17584a.get(str);
    }
}
