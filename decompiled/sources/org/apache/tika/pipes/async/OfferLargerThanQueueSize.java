package org.apache.tika.pipes.async;

/* loaded from: classes2.dex */
public class OfferLargerThanQueueSize extends IllegalArgumentException {
    private final int queueSize;
    private final int sizeOffered;

    public OfferLargerThanQueueSize(int i7, int i8) {
        this.sizeOffered = i7;
        this.queueSize = i8;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "sizeOffered (" + this.sizeOffered + ") is greater than queue size (" + this.queueSize + ")";
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSizeOffered() {
        return this.sizeOffered;
    }
}
