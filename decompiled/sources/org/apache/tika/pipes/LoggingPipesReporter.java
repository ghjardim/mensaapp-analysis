package org.apache.tika.pipes;

import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class LoggingPipesReporter extends PipesReporter {
    InterfaceC6304d LOGGER = AbstractC6306f.m26394k(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.mo26364h("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j7) {
        this.LOGGER.mo26376t("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j7));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.mo26375s("error {}", str);
    }
}
