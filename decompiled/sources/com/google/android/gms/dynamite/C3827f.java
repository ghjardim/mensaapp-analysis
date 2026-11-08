package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes.dex */
public final class C3827f implements DynamiteModule.InterfaceC3821b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3821b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC3821b.b mo15175a(Context context, String str, DynamiteModule.InterfaceC3821b.a aVar) {
        int mo15176a;
        DynamiteModule.InterfaceC3821b.b bVar = new DynamiteModule.InterfaceC3821b.b();
        int mo15177b = aVar.mo15177b(context, str);
        bVar.f12602a = mo15177b;
        int i7 = 1;
        int i8 = 0;
        if (mo15177b != 0) {
            mo15176a = aVar.mo15176a(context, str, false);
            bVar.f12603b = mo15176a;
        } else {
            mo15176a = aVar.mo15176a(context, str, true);
            bVar.f12603b = mo15176a;
        }
        int i9 = bVar.f12602a;
        if (i9 != 0) {
            i8 = i9;
        } else if (mo15176a == 0) {
            i7 = 0;
            bVar.f12604c = i7;
            return bVar;
        }
        if (i8 >= mo15176a) {
            i7 = -1;
        }
        bVar.f12604c = i7;
        return bVar;
    }
}
