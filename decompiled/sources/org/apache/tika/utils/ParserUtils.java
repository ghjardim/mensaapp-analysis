package org.apache.tika.utils;

import java.io.InputStream;
import java.util.function.Predicate;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.p307io.TemporaryResources;
import org.apache.tika.p307io.TikaInputStream;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import p256j$.util.DesugarArrays;
import p256j$.util.Objects;
import p256j$.util.function.Predicate$CC;
import p256j$.util.stream.Stream;

/* loaded from: classes2.dex */
public class ParserUtils {
    public static final Property EMBEDDED_PARSER = Property.internalText("X-TIKA:EXCEPTION:embedded_parser");

    public static Metadata cloneMetadata(Metadata metadata) {
        Metadata metadata2 = new Metadata();
        for (String str : metadata.names()) {
            if (metadata.isMultiValued(str)) {
                for (String str2 : metadata.getValues(str)) {
                    metadata2.add(str, str2);
                }
            } else {
                metadata2.set(str, metadata.get(str));
            }
        }
        return metadata2;
    }

    public static InputStream ensureStreamReReadable(InputStream inputStream, TemporaryResources temporaryResources, Metadata metadata) {
        if (inputStream instanceof RereadableInputStream) {
            return inputStream;
        }
        TikaInputStream cast = TikaInputStream.cast(inputStream);
        if (cast == null) {
            cast = TikaInputStream.get(inputStream, temporaryResources, metadata);
        }
        if (cast.getInputStreamFactory() != null) {
            return cast;
        }
        cast.getFile();
        cast.mark(-1);
        return cast;
    }

    public static String getParserClassname(Parser parser) {
        return parser instanceof ParserDecorator ? ((ParserDecorator) parser).getWrappedParser().getClass().getName() : parser.getClass().getName();
    }

    public static void recordParserDetails(Parser parser, Metadata metadata) {
        recordParserDetails(getParserClassname(parser), metadata);
    }

    public static void recordParserFailure(Parser parser, Throwable th, Metadata metadata) {
        metadata.add(TikaCoreProperties.EMBEDDED_EXCEPTION, ExceptionUtils.getStackTrace(th));
        metadata.add(EMBEDDED_PARSER, getParserClassname(parser));
    }

    public static InputStream streamResetForReRead(InputStream inputStream, TemporaryResources temporaryResources) {
        if (inputStream instanceof RereadableInputStream) {
            ((RereadableInputStream) inputStream).rewind();
            return inputStream;
        }
        TikaInputStream tikaInputStream = (TikaInputStream) inputStream;
        if (tikaInputStream.getInputStreamFactory() != null) {
            return TikaInputStream.get(tikaInputStream.getInputStreamFactory(), temporaryResources);
        }
        tikaInputStream.reset();
        tikaInputStream.mark(-1);
        return tikaInputStream;
    }

    public static void recordParserDetails(final String str, Metadata metadata) {
        Property property = TikaCoreProperties.TIKA_PARSED_BY;
        String[] values = metadata.getValues(property);
        if (values != null && values.length != 0) {
            Stream stream = DesugarArrays.stream(values);
            Objects.requireNonNull(str);
            if (stream.noneMatch(new Predicate() { // from class: org.apache.tika.utils.a
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                /* renamed from: or */
                public /* synthetic */ Predicate m25087or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return str.equals((String) obj);
                }
            })) {
                metadata.add(property, str);
                return;
            }
            return;
        }
        metadata.add(property, str);
    }
}
