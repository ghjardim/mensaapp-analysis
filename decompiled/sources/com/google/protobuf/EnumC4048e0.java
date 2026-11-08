package com.google.protobuf;

import com.google.protobuf.AbstractC4015C;

/* renamed from: com.google.protobuf.e0 */
/* loaded from: classes.dex */
public enum EnumC4048e0 implements AbstractC4015C.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: d */
    public static final AbstractC4015C.b f13366d = new AbstractC4015C.b() { // from class: com.google.protobuf.e0.a
    };

    /* renamed from: a */
    public final int f13368a;

    EnumC4048e0(int i7) {
        this.f13368a = i7;
    }

    @Override // com.google.protobuf.AbstractC4015C.a
    /* renamed from: a */
    public final int mo16192a() {
        if (this != UNRECOGNIZED) {
            return this.f13368a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
