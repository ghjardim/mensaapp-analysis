package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
public final class C3825d implements DynamiteModule.InterfaceC3821b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3821b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC3821b.b mo15175a(Context context, String str, DynamiteModule.InterfaceC3821b.a aVar) {
        DynamiteModule.InterfaceC3821b.b bVar = new DynamiteModule.InterfaceC3821b.b();
        int mo15176a = aVar.mo15176a(context, str, false);
        bVar.f12603b = mo15176a;
        bVar.f12604c = mo15176a != 0 ? 1 : 0;
        return bVar;
    }
}
