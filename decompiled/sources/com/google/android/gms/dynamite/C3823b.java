package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
/* loaded from: classes.dex */
public final class C3823b implements DynamiteModule.InterfaceC3821b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3821b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC3821b.b mo15175a(Context context, String str, DynamiteModule.InterfaceC3821b.a aVar) {
        DynamiteModule.InterfaceC3821b.b bVar = new DynamiteModule.InterfaceC3821b.b();
        int mo15176a = aVar.mo15176a(context, str, true);
        bVar.f12603b = mo15176a;
        if (mo15176a != 0) {
            bVar.f12604c = 1;
        } else {
            int mo15177b = aVar.mo15177b(context, str);
            bVar.f12602a = mo15177b;
            if (mo15177b != 0) {
                bVar.f12604c = -1;
            }
        }
        return bVar;
    }
}
