package org.apache.tika.pipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* loaded from: classes2.dex */
public class CompositePipesReporter extends PipesReporter implements Initializable {
    private List<PipesReporter> pipesReporters = new ArrayList();

    @Field
    public void addPipesReporter(PipesReporter pipesReporter) {
        this.pipesReporters.add(pipesReporter);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
        List<PipesReporter> list = this.pipesReporters;
        if (list == null) {
            throw new TikaConfigException("must specify 'pipesReporters'");
        }
        if (list.size() == 0) {
            throw new TikaConfigException("must specify at least one pipes reporter");
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        IOException e7 = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e8) {
                e7 = e8;
            }
        }
        if (e7 != null) {
            throw e7;
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().error(th);
        }
    }

    public List<PipesReporter> getPipesReporters() {
        return this.pipesReporters;
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j7) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().report(fetchEmitTuple, pipesResult, j7);
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public boolean supportsTotalCount() {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            if (it.next().supportsTotalCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().error(str);
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(TotalCountResult totalCountResult) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().report(totalCountResult);
        }
    }
}
