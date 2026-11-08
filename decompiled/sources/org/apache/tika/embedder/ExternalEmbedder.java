package org.apache.tika.embedder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.embedder.ExternalEmbedder;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.p307io.TemporaryResources;
import org.apache.tika.p307io.TikaInputStream;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.StringUtils;
import p222e6.AbstractC4213g;
import p256j$.util.DesugarCollections;
import p265j6.C5395e;

/* loaded from: classes2.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set<MediaType> supportedEmbedTypes = Collections.emptySet();
    private Map<Property, String[]> metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", ExternalParser.INPUT_FILE_TOKEN};
    private String commandAssignmentOperator = "=";
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = "=";
    private boolean quoteAssignmentValues = false;

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$multiThreadedStreamCopy$0(InputStream inputStream, OutputStream outputStream) {
        try {
            AbstractC4213g.m17646n(inputStream, outputStream);
        } catch (IOException e7) {
            System.out.println("ERROR: " + e7.getMessage());
        }
    }

    private void multiThreadedStreamCopy(final InputStream inputStream, final OutputStream outputStream) {
        new Thread(new Runnable() { // from class: l6.a
            @Override // java.lang.Runnable
            public final void run() {
                ExternalEmbedder.lambda$multiThreadedStreamCopy$0(inputStream, outputStream);
            }
        }).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            AbstractC4213g.m17646n(process.getInputStream(), outputStream);
        } catch (IOException e7) {
            System.out.println("ERROR: " + e7.getMessage());
        }
    }

    public static String serializeMetadata(List<String> list) {
        return list != null ? Arrays.toString(list.toArray()) : StringUtils.EMPTY;
    }

    @Override // org.apache.tika.embedder.Embedder
    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) {
        int i7;
        Map<Property, String[]> map = this.metadataCommandArguments;
        boolean z6 = (map == null || map.isEmpty()) ? false : true;
        TikaInputStream tikaInputStream = TikaInputStream.get(inputStream);
        File file = null;
        List<String> commandMetadataSegments = z6 ? getCommandMetadataSegments(metadata) : null;
        String[] strArr = this.command;
        ArrayList<String> arrayList = new ArrayList();
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = true;
        boolean z10 = true;
        for (int length = strArr.length; i8 < length; length = i7) {
            String str = strArr[i8];
            String[] strArr2 = strArr;
            if (str.contains(ExternalParser.INPUT_FILE_TOKEN)) {
                i7 = length;
                str = str.replace(ExternalParser.INPUT_FILE_TOKEN, tikaInputStream.getFile().toString());
                z9 = false;
            } else {
                i7 = length;
            }
            if (str.contains(ExternalParser.OUTPUT_FILE_TOKEN)) {
                file = this.tmp.createTemporaryFile();
                str = str.replace(ExternalParser.OUTPUT_FILE_TOKEN, file.toString());
                z10 = false;
            }
            if (str.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                z7 = true;
            }
            if (str.contains(METADATA_COMMAND_ARGUMENTS_TOKEN)) {
                if (z6) {
                    arrayList.addAll(commandMetadataSegments);
                }
                z8 = true;
            } else {
                arrayList.add(str);
            }
            i8++;
            strArr = strArr2;
        }
        if (z6) {
            if (z7) {
                int i9 = 0;
                for (String str2 : arrayList) {
                    if (str2.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                        arrayList.set(i9, str2.replace(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN, serializeMetadata(commandMetadataSegments)));
                    }
                    i9++;
                }
            } else if (!z8 && !z7) {
                arrayList.addAll(commandMetadataSegments);
            }
        }
        Process exec = arrayList.toArray().length == 1 ? Runtime.getRuntime().exec(((String[]) arrayList.toArray(new String[0]))[0]) : Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0]));
        C5395e m22309l = C5395e.m22307o().m22309l();
        try {
            sendStdErrToOutputStream(exec, m22309l);
            if (z9) {
                sendInputStreamToStdIn(inputStream, exec);
            } else {
                exec.getOutputStream().close();
            }
            if (z10) {
                sendStdOutToOutputStream(exec, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    exec.waitFor();
                } catch (InterruptedException unused) {
                }
                AbstractC4213g.m17646n(TikaInputStream.get(file), outputStream);
            }
            if (z10) {
                try {
                    exec.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z9) {
                AbstractC4213g.m17643k(tikaInputStream);
            }
            AbstractC4213g.m17644l(outputStream);
            AbstractC4213g.m17644l(m22309l);
            if (exec.exitValue() == 0) {
                return;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + m22309l.m22297g(StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            if (z10) {
                try {
                    exec.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z9) {
                AbstractC4213g.m17643k(tikaInputStream);
            }
            AbstractC4213g.m17644l(outputStream);
            AbstractC4213g.m17644l(m22309l);
            if (exec.exitValue() == 0) {
                throw th;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + m22309l.m22297g(StandardCharsets.UTF_8.name()));
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List<String> getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i7;
        Iterator<Property> it;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] names = metadata.names();
            int length = names.length;
            for (int i8 = 0; i8 < length; i8++) {
                String str = names[i8];
                Iterator<Property> it2 = getMetadataCommandArguments().keySet().iterator();
                while (it2.hasNext()) {
                    Property next = it2.next();
                    if (str.equals(next.getName()) && (strArr = getMetadataCommandArguments().get(next)) != null) {
                        int length2 = strArr.length;
                        int i9 = 0;
                        while (i9 < length2) {
                            String str2 = strArr[i9];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i10 = 0;
                                while (true) {
                                    strArr2 = names;
                                    if (i10 >= length3) {
                                        break;
                                    }
                                    String str3 = values[i10];
                                    int i11 = length;
                                    if (this.quoteAssignmentValues) {
                                        str3 = "'" + str3 + "'";
                                    }
                                    arrayList.add(str2 + this.commandAppendOperator + str3);
                                    i10++;
                                    names = strArr2;
                                    length = i11;
                                    it2 = it2;
                                }
                                i7 = length;
                                it = it2;
                            } else {
                                strArr2 = names;
                                i7 = length;
                                it = it2;
                                String str4 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    str4 = "'" + str4 + "'";
                                }
                                arrayList.add(str2 + this.commandAssignmentOperator + str4);
                            }
                            i9++;
                            names = strArr2;
                            length = i7;
                            it2 = it;
                        }
                    }
                    names = names;
                    length = length;
                    it2 = it2;
                }
            }
        }
        return arrayList;
    }

    public Map<Property, String[]> getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    @Override // org.apache.tika.embedder.Embedder
    public Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map<Property, String[]> map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z6) {
        this.quoteAssignmentValues = z6;
    }

    public void setSupportedEmbedTypes(Set<MediaType> set) {
        this.supportedEmbedTypes = DesugarCollections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            int waitFor = (strArr.length == 1 ? Runtime.getRuntime().exec(strArr[0]) : Runtime.getRuntime().exec(strArr)).waitFor();
            for (int i7 : iArr) {
                if (waitFor == i7) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set<MediaType> getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}
