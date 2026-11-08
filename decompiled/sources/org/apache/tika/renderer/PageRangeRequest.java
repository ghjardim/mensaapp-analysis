package org.apache.tika.renderer;

import p256j$.util.Objects;

/* loaded from: classes2.dex */
public class PageRangeRequest implements RenderRequest {
    public static PageRangeRequest RENDER_ALL = new PageRangeRequest(1, -1);
    private final int from;

    /* renamed from: to */
    private final int f21461to;

    public PageRangeRequest(int i7, int i8) {
        this.from = i7;
        this.f21461to = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageRangeRequest pageRangeRequest = (PageRangeRequest) obj;
        return this.from == pageRangeRequest.from && this.f21461to == pageRangeRequest.f21461to;
    }

    public int getFrom() {
        return this.from;
    }

    public int getTo() {
        return this.f21461to;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.from), Integer.valueOf(this.f21461to));
    }
}
