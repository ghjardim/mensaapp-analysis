package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i7, List<Clause> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i7 <= list.size()) {
            if (i7 > 0) {
                this.min = i7;
                this.clauses = list;
                return;
            } else {
                throw new IllegalArgumentException("min cannot be <= 0: " + i7);
            }
        }
        throw new IllegalArgumentException("min (" + i7 + ") cannot be > clauses.size (" + list.size() + ")");
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it = this.clauses.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (it.next().eval(bArr) && (i7 = i7 + 1) >= this.min) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        Iterator<Clause> it = this.clauses.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = Math.max(i7, it.next().size());
        }
        return i7;
    }

    public String toString() {
        return "minShouldMatch (min: " + this.min + ") " + this.clauses;
    }
}
