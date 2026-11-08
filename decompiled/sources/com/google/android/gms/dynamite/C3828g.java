package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes.dex */
public final class C3828g implements DynamiteModule.InterfaceC3821b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3821b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC3821b.b mo15175a(Context context, String str, DynamiteModule.InterfaceC3821b.a aVar) {
        DynamiteModule.InterfaceC3821b.b bVar = new DynamiteModule.InterfaceC3821b.b();
        bVar.f12602a = aVar.mo15177b(context, str);
        int i7 = 1;
        int mo15176a = aVar.mo15176a(context, str, true);
        bVar.f12603b = mo15176a;
        int i8 = bVar.f12602a;
        if (i8 == 0) {
            i8 = 0;
            if (mo15176a == 0) {
                i7 = 0;
                bVar.f12604c = i7;
                return bVar;
            }
        }
        if (mo15176a < i8) {
            i7 = -1;
        }
        bVar.f12604c = i7;
        return bVar;
    }
}
