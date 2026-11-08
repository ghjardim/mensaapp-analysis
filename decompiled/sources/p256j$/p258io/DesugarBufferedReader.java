package p256j$.p258io;

import java.io.BufferedReader;
import p256j$.util.Spliterators;
import p256j$.util.stream.AbstractC5034A0;
import p256j$.util.stream.Stream;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarBufferedReader {
    public static Stream lines(BufferedReader bufferedReader) {
        return AbstractC5034A0.m21401f0(Spliterators.m21294n(new C4816a(bufferedReader)), false);
    }
}
