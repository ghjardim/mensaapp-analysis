package org.apache.tika.pipes;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.PipesResult;

/* loaded from: classes2.dex */
public abstract class PipesReporterBase extends PipesReporter implements Initializable {
    private StatusFilter statusFilter;
    private final Set<PipesResult.STATUS> includes = new HashSet();
    private final Set<PipesResult.STATUS> excludes = new HashSet();

    public static class AcceptAllFilter extends StatusFilter {
        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return true;
        }

        private AcceptAllFilter() {
            super();
        }
    }

    public static class ExcludesFilter extends StatusFilter {
        private final Set<PipesResult.STATUS> excludes;

        public ExcludesFilter(Set<PipesResult.STATUS> set) {
            super();
            this.excludes = set;
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return !this.excludes.contains(status);
        }
    }

    public static class IncludesFilter extends StatusFilter {
        private final Set<PipesResult.STATUS> includes;

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return this.includes.contains(status);
        }

        private IncludesFilter(Set<PipesResult.STATUS> set) {
            super();
            this.includes = set;
        }
    }

    public static abstract class StatusFilter {
        public abstract boolean accept(PipesResult.STATUS status);

        private StatusFilter() {
        }
    }

    private StatusFilter buildStatusFilter(Set<PipesResult.STATUS> set, Set<PipesResult.STATUS> set2) {
        if (set.size() > 0 && set2.size() > 0) {
            throw new TikaConfigException("Only one of includes and excludes may have any contents");
        }
        return set.size() > 0 ? new IncludesFilter(set) : set2.size() > 0 ? new ExcludesFilter(set2) : new AcceptAllFilter();
    }

    private String getOptionString() {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (PipesResult.STATUS status : PipesResult.STATUS.values()) {
            i7++;
            if (i7 > 1) {
                sb.append(", ");
            }
            sb.append(status.name());
        }
        return sb.toString();
    }

    public boolean accept(PipesResult.STATUS status) {
        return this.statusFilter.accept(status);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
        this.statusFilter = buildStatusFilter(this.includes, this.excludes);
    }

    @Field
    public void setExcludes(List<String> list) {
        for (String str : list) {
            try {
                this.excludes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e7) {
                throw new TikaConfigException("I regret I don't recognize " + str + ". I only understand: " + getOptionString(), e7);
            }
        }
    }

    @Field
    public void setIncludes(List<String> list) {
        for (String str : list) {
            try {
                this.includes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e7) {
                throw new TikaConfigException("I regret I don't recognize " + str + ". I only understand: " + getOptionString(), e7);
            }
        }
    }
}
