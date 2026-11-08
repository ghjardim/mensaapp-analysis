package p256j$.util;

import p256j$.util.stream.AbstractC5034A0;
import p256j$.util.stream.Stream;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return AbstractC5034A0.m21401f0(Spliterators.m21293m(tArr, 0, tArr.length), false);
    }
}
