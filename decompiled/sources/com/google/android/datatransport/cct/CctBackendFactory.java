package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p156W1.C2659d;
import p177Z1.AbstractC2981h;
import p177Z1.InterfaceC2977d;
import p177Z1.InterfaceC2986m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC2977d {
    @Override // p177Z1.InterfaceC2977d
    public InterfaceC2986m create(AbstractC2981h abstractC2981h) {
        return new C2659d(abstractC2981h.mo10726b(), abstractC2981h.mo10729e(), abstractC2981h.mo10728d());
    }
}
