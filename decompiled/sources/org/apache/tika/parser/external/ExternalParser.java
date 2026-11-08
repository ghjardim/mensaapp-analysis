package org.apache.tika.parser.external;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.p307io.TemporaryResources;
import org.apache.tika.p307io.TikaInputStream;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.XHTMLContentHandler;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.ContentHandler;
import p222e6.AbstractC4213g;
import p256j$.util.DesugarCollections;
import p265j6.C5392b;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class ExternalParser implements Parser {
    public static final String INPUT_FILE_TOKEN = "${INPUT}";
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(ExternalParser.class);
    public static final String OUTPUT_FILE_TOKEN = "${OUTPUT}";
    private static final long serialVersionUID = -1079128990650687037L;
    private final long timeoutMs = 60000;
    private Set<MediaType> supportedTypes = Collections.emptySet();
    private Map<Pattern, String> metadataPatterns = null;
    private String[] command = {"cat"};
    private LineConsumer ignoredLineConsumer = LineConsumer.NULL;

    public interface LineConsumer extends Serializable {
        public static final LineConsumer NULL = new C5996e();

        void consume(String str);
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    private void extractMetadata(final InputStream inputStream, final Metadata metadata) {
        Thread thread = new Thread(new Runnable() { // from class: org.apache.tika.parser.external.c
            @Override // java.lang.Runnable
            public final void run() {
                ExternalParser.this.lambda$extractMetadata$2(inputStream, metadata);
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    private void extractOutput(InputStream inputStream, XHTMLContentHandler xHTMLContentHandler) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try {
            xHTMLContentHandler.startDocument();
            xHTMLContentHandler.startElement("p");
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    xHTMLContentHandler.endElement("p");
                    xHTMLContentHandler.endDocument();
                    inputStreamReader.close();
                    return;
                }
                xHTMLContentHandler.characters(cArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void ignoreStream(InputStream inputStream) {
        ignoreStream(inputStream, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$extractMetadata$2(InputStream inputStream, Metadata metadata) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                boolean z6 = false;
                for (Map.Entry<Pattern, String> entry : this.metadataPatterns.entrySet()) {
                    Matcher matcher = entry.getKey().matcher(readLine);
                    if (matcher.find()) {
                        if (entry.getValue() == null || entry.getValue().equals(StringUtils.EMPTY)) {
                            metadata.add(matcher.group(1), matcher.group(2));
                        } else {
                            metadata.add(entry.getValue(), matcher.group(1));
                        }
                        z6 = true;
                    }
                }
                if (!z6) {
                    this.ignoredLineConsumer.consume(readLine);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC4213g.m17645m(bufferedReader);
                AbstractC4213g.m17643k(inputStream);
                throw th;
            }
        }
        AbstractC4213g.m17645m(bufferedReader);
        AbstractC4213g.m17643k(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ignoreStream$0(InputStream inputStream) {
        try {
            AbstractC4213g.m17646n(inputStream, C5392b.f19228a);
        } catch (IOException unused) {
        } catch (Throwable th) {
            AbstractC4213g.m17643k(inputStream);
            throw th;
        }
        AbstractC4213g.m17643k(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendInput$1(Process process, InputStream inputStream) {
        try {
            AbstractC4213g.m17646n(inputStream, process.getOutputStream());
        } catch (IOException unused) {
        }
    }

    private void sendInput(final Process process, final InputStream inputStream) {
        Thread thread = new Thread(new Runnable() { // from class: org.apache.tika.parser.external.d
            @Override // java.lang.Runnable
            public final void run() {
                ExternalParser.lambda$sendInput$1(process, inputStream);
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public LineConsumer getIgnoredLineConsumer() {
        return this.ignoredLineConsumer;
    }

    public Map<Pattern, String> getMetadataExtractionPatterns() {
        return this.metadataPatterns;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getSupportedTypes();
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            parse(TikaInputStream.get(inputStream, temporaryResources, metadata), xHTMLContentHandler, metadata, temporaryResources);
        } finally {
            temporaryResources.dispose();
        }
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setIgnoredLineConsumer(LineConsumer lineConsumer) {
        this.ignoredLineConsumer = lineConsumer;
    }

    public void setMetadataExtractionPatterns(Map<Pattern, String> map) {
        this.metadataPatterns = map;
    }

    public void setSupportedTypes(Set<MediaType> set) {
        this.supportedTypes = DesugarCollections.unmodifiableSet(new HashSet(set));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean check(java.lang.String[] r8, int... r9) {
        /*
            int r0 = r9.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lb
            int[] r9 = new int[r1]
            r0 = 127(0x7f, float:1.78E-43)
            r9[r2] = r0
        Lb:
            r0 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Process r0 = r3.exec(r8)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.io.InputStream r3 = r0.getErrorStream()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Thread r3 = ignoreStream(r3, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.io.InputStream r4 = r0.getInputStream()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Thread r4 = ignoreStream(r4, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r3.join()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r4.join()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r4 = 60000(0xea60, double:2.9644E-319)
            boolean r3 = org.apache.tika.parser.external.AbstractC5992a.m25049a(r0, r4, r3)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            if (r3 == 0) goto L66
            int r3 = r0.exitValue()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r6.d r4 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.String r5 = "exit value for {}: {}"
            r6 = r8[r2]     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r4.mo26360d(r5, r6, r7)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            int r4 = r9.length     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r5 = r2
        L48:
            if (r5 >= r4) goto L62
            r6 = r9[r5]     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            if (r3 != r6) goto L52
            org.apache.tika.fork.AbstractC5965c.m24999a(r0)
            return r2
        L52:
            int r5 = r5 + 1
            goto L48
        L55:
            r8 = move-exception
            goto Lc8
        L58:
            r9 = move-exception
            goto L6c
        L5a:
            r8 = move-exception
            goto La9
        L5c:
            r9 = move-exception
            goto Laa
        L5e:
            r9 = move-exception
            goto Laa
        L60:
            r9 = move-exception
            goto Laa
        L62:
            org.apache.tika.fork.AbstractC5965c.m24999a(r0)
            return r1
        L66:
            java.util.concurrent.TimeoutException r9 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r9.<init>()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            throw r9     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
        L6c:
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto La8
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "posix_spawn"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L8a
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "UNIXProcess"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto La8
        L8a:
            r6.d r1 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L55
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "(TIKA-1526): exception trying to run: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            r3.append(r8)     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r1.mo26378v(r8, r9)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto La7
            org.apache.tika.fork.AbstractC5965c.m24999a(r0)
        La7:
            return r2
        La8:
            throw r9     // Catch: java.lang.Throwable -> L55
        La9:
            throw r8     // Catch: java.lang.Throwable -> L55
        Laa:
            r6.d r1 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L55
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "exception trying to run  "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            r3.append(r8)     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r1.mo26378v(r8, r9)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto Lc7
            org.apache.tika.fork.AbstractC5965c.m24999a(r0)
        Lc7:
            return r2
        Lc8:
            if (r0 == 0) goto Lcd
            org.apache.tika.fork.AbstractC5965c.m24999a(r0)
        Lcd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.external.ExternalParser.check(java.lang.String[], int[]):boolean");
    }

    private static Thread ignoreStream(final InputStream inputStream, boolean z6) {
        Thread thread = new Thread(new Runnable() { // from class: org.apache.tika.parser.external.b
            @Override // java.lang.Runnable
            public final void run() {
                ExternalParser.lambda$ignoreStream$0(inputStream);
            }
        });
        thread.start();
        if (z6) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
            }
        }
        return thread;
    }

    public Set<MediaType> getSupportedTypes() {
        return this.supportedTypes;
    }

    private void parse(TikaInputStream tikaInputStream, XHTMLContentHandler xHTMLContentHandler, Metadata metadata, TemporaryResources temporaryResources) {
        String[] strArr;
        Process exec;
        Map<Pattern, String> map = this.metadataPatterns;
        boolean z6 = (map == null || map.isEmpty()) ? false : true;
        String[] strArr2 = this.command;
        if (strArr2.length == 1) {
            strArr = strArr2[0].split(StringUtils.SPACE);
        } else {
            String[] strArr3 = new String[strArr2.length];
            System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
            strArr = strArr3;
        }
        Process process = null;
        boolean z7 = true;
        boolean z8 = true;
        File file = null;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (strArr[i7].contains(INPUT_FILE_TOKEN)) {
                strArr[i7] = strArr[i7].replace(INPUT_FILE_TOKEN, tikaInputStream.getFile().getPath());
                z7 = false;
            }
            if (strArr[i7].contains(OUTPUT_FILE_TOKEN)) {
                file = temporaryResources.createTemporaryFile();
                strArr[i7] = strArr[i7].replace(OUTPUT_FILE_TOKEN, file.getPath());
                z8 = false;
            }
        }
        try {
            if (strArr.length == 1) {
                exec = Runtime.getRuntime().exec(strArr[0]);
            } else {
                exec = Runtime.getRuntime().exec(strArr);
            }
            process = exec;
        } catch (Exception e7) {
            LOG.mo26377u("problem with process exec", e7);
        }
        try {
            if (z7) {
                sendInput(process, tikaInputStream);
            } else {
                process.getOutputStream().close();
            }
            InputStream inputStream = process.getInputStream();
            InputStream errorStream = process.getErrorStream();
            if (z6) {
                extractMetadata(errorStream, metadata);
                if (z8) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    extractMetadata(inputStream, metadata);
                }
            } else {
                ignoreStream(errorStream);
                if (z8) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    ignoreStream(inputStream);
                }
            }
            try {
                process.waitFor();
            } catch (InterruptedException unused) {
            }
            if (z8) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                extractOutput(fileInputStream, xHTMLContentHandler);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                process.waitFor();
            } catch (InterruptedException unused2) {
            }
            throw th3;
        }
    }
}
