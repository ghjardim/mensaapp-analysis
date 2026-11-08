package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: classes2.dex */
public interface ForkResource {
    Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream);
}
