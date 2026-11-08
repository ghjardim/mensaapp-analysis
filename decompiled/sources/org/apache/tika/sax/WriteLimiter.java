package org.apache.tika.sax;

/* loaded from: classes2.dex */
public interface WriteLimiter {
    int getWriteLimit();

    boolean isThrowOnWriteLimitReached();
}
