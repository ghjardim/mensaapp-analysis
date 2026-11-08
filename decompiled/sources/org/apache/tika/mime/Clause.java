package org.apache.tika.mime;

import java.io.Serializable;

/* loaded from: classes2.dex */
interface Clause extends Serializable {
    boolean eval(byte[] bArr);

    int size();
}
