package org.apache.tika.parser;

import java.util.UUID;
import java.util.function.Consumer;
import p256j$.util.concurrent.ConcurrentHashMap;
import p256j$.util.function.Consumer$CC;

/* loaded from: classes2.dex */
public abstract class AbstractExternalProcessParser implements Parser {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();
    private static final long serialVersionUID = 7186985395903074255L;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: org.apache.tika.parser.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractExternalProcessParser.lambda$static$0();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new Consumer() { // from class: org.apache.tika.parser.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Process) obj).destroyForcibly();
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public String register(Process process) {
        String uuid = UUID.randomUUID().toString();
        PROCESS_MAP.put(uuid, process);
        return uuid;
    }

    public Process release(String str) {
        return PROCESS_MAP.remove(str);
    }
}
