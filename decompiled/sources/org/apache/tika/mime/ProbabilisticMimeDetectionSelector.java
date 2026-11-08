package org.apache.tika.mime;

import java.util.List;
import org.apache.tika.detect.Detector;

/* loaded from: classes2.dex */
public class ProbabilisticMimeDetectionSelector implements Detector {
    private static final float DEFAULT_EXTENSION_TRUST = 0.8f;
    private static final float DEFAULT_MAGIC_TRUST = 0.9f;
    private static final float DEFAULT_META_TRUST = 0.8f;
    private static final long serialVersionUID = 224589862960269260L;
    private final float changeRate;
    private float extension_neg;
    private float extension_trust;
    private float magic_neg;
    private float magic_trust;
    private float meta_neg;
    private float meta_trust;
    private final MimeTypes mimeTypes;
    private float priorExtensionFileType;
    private float priorMagicFileType;
    private float priorMetaFileType;
    private final MediaType rootMediaType;
    private float threshold;

    public static class Builder {
        private float extension_neg;
        private float extension_trust;
        private float magic_neg;
        private float magic_trust;
        private float meta_neg;
        private float meta_trust;
        private float priorExtensionFileType;
        private float priorMagicFileType;
        private float priorMetaFileType;
        private float threshold;

        public ProbabilisticMimeDetectionSelector build2() {
            return new ProbabilisticMimeDetectionSelector(this);
        }

        public synchronized Builder extension_neg(float f7) {
            this.extension_neg = f7;
            return this;
        }

        public synchronized Builder extension_trust(float f7) {
            this.extension_trust = f7;
            return this;
        }

        public synchronized Builder magic_neg(float f7) {
            this.magic_neg = f7;
            return this;
        }

        public synchronized Builder magic_trust(float f7) {
            this.magic_trust = f7;
            return this;
        }

        public synchronized Builder meta_neg(float f7) {
            this.meta_neg = f7;
            return this;
        }

        public synchronized Builder meta_trust(float f7) {
            this.meta_trust = f7;
            return this;
        }

        public synchronized Builder priorExtensionFileType(float f7) {
            this.priorExtensionFileType = f7;
            return this;
        }

        public synchronized Builder priorMagicFileType(float f7) {
            this.priorMagicFileType = f7;
            return this;
        }

        public synchronized Builder priorMetaFileType(float f7) {
            this.priorMetaFileType = f7;
            return this;
        }

        public synchronized Builder threshold(float f7) {
            this.threshold = f7;
            return this;
        }
    }

    public ProbabilisticMimeDetectionSelector() {
        this(MimeTypes.getDefaultMimeTypes(), null);
    }

    private MediaType applyProbilities(List<MimeType> list, MimeType mimeType, MimeType mimeType2) {
        MediaType mediaType;
        float f7;
        MediaType mediaType2;
        MediaType mediaType3;
        int i7;
        List<MimeType> list2 = list;
        MimeType mimeType3 = mimeType;
        MimeType mimeType4 = mimeType2;
        MediaType type = mimeType3 == null ? null : mimeType.getType();
        MediaType type2 = mimeType4 != null ? mimeType2.getType() : null;
        int size = list.size();
        float f8 = this.magic_trust;
        float f9 = this.magic_neg;
        float f10 = this.extension_trust;
        float f11 = this.extension_neg;
        float f12 = this.meta_trust;
        float f13 = this.meta_neg;
        if (type == null || type.compareTo(this.rootMediaType) == 0) {
            f10 = 1.0f;
            f11 = 1.0f;
        }
        if (type2 == null || type2.compareTo(this.rootMediaType) == 0) {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        MediaType mediaType4 = this.rootMediaType;
        float f14 = -1.0f;
        if (!list.isEmpty()) {
            int i8 = 0;
            MediaType mediaType5 = type2;
            while (i8 < size) {
                MediaType type3 = list2.get(i8).getType();
                int i9 = size;
                MediaTypeRegistry mediaTypeRegistry = this.mimeTypes.getMediaTypeRegistry();
                float f15 = f8;
                if (type3 == null || !type3.equals(this.rootMediaType)) {
                    if (type != null) {
                        if (type.equals(type3) || mediaTypeRegistry.isSpecializationOf(type, type3)) {
                            list2.set(i8, mimeType3);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, type)) {
                            type = type3;
                        }
                    }
                    if (mediaType5 != null) {
                        if (mediaType5.equals(type3) || mediaTypeRegistry.isSpecializationOf(mediaType5, type3)) {
                            list2.set(i8, mimeType4);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, mediaType5)) {
                            mediaType5 = type3;
                        }
                    }
                    f8 = f15;
                    mediaType = mediaType5;
                } else {
                    f8 = 1.0f;
                    f9 = 1.0f;
                    mediaType = mediaType5;
                }
                float[] fArr = new float[3];
                float[] fArr2 = new float[3];
                MediaType mediaType6 = mediaType4;
                float[] fArr3 = new float[3];
                MediaType type4 = list2.get(i8).getType();
                if (i8 > 0) {
                    float f16 = this.changeRate;
                    f7 = 1.0f;
                    f8 *= 1.0f - f16;
                    f9 *= f16 + 1.0f;
                } else {
                    f7 = 1.0f;
                }
                if (type4 == null || f8 == f7) {
                    fArr[0] = 0.1f;
                } else {
                    fArr2[0] = f8;
                    fArr3[0] = f9;
                    if (mediaType == null || f12 == f7) {
                        fArr2[1] = f7;
                        fArr3[1] = f7;
                    } else if (type4.equals(mediaType)) {
                        fArr2[1] = f12;
                        fArr3[1] = f13;
                    } else {
                        fArr2[1] = f7 - f12;
                        fArr3[1] = f7 - f13;
                    }
                    if (type == null || f10 == f7) {
                        fArr2[2] = f7;
                        fArr3[2] = f7;
                    } else if (type4.equals(type)) {
                        fArr2[2] = f10;
                        fArr3[2] = f11;
                    } else {
                        fArr2[2] = f7 - f10;
                        fArr3[2] = f7 - f11;
                    }
                }
                int i10 = i8;
                float[] fArr4 = new float[3];
                float[] fArr5 = new float[3];
                if (mimeType4 == null || f12 == f7) {
                    fArr[1] = 0.1f;
                } else {
                    fArr4[1] = f12;
                    fArr5[1] = f13;
                    if (type4 == null || f8 == f7) {
                        fArr4[0] = f7;
                        fArr5[0] = f7;
                    } else if (mediaType.equals(type4)) {
                        fArr4[0] = f8;
                        fArr5[0] = f9;
                    } else {
                        fArr4[0] = f7 - f8;
                        fArr5[0] = f7 - f9;
                    }
                    if (type == null || f10 == f7) {
                        fArr4[2] = f7;
                        fArr5[2] = f7;
                    } else if (mediaType.equals(type)) {
                        fArr4[2] = f10;
                        fArr5[2] = f11;
                    } else {
                        fArr4[2] = f7 - f10;
                        fArr5[2] = f7 - f11;
                    }
                }
                float[] fArr6 = new float[3];
                float[] fArr7 = new float[3];
                if (type == null || f10 == f7) {
                    fArr[2] = 0.1f;
                } else {
                    fArr6[2] = f10;
                    fArr7[2] = f11;
                    if (type4 == null || f8 == f7) {
                        fArr6[0] = f7;
                        fArr7[0] = f7;
                    } else if (type4.equals(type)) {
                        fArr6[0] = f8;
                        fArr7[0] = f9;
                    } else {
                        fArr6[0] = f7 - f8;
                        fArr7[0] = f7 - f9;
                    }
                    if (mediaType == null || f12 == f7) {
                        fArr6[1] = f7;
                        fArr7[1] = f7;
                    } else if (mediaType.equals(type)) {
                        fArr6[1] = f12;
                        fArr7[1] = f13;
                    } else {
                        fArr6[1] = f7 - f12;
                        fArr7[1] = f7 - f13;
                    }
                }
                float f17 = this.priorMagicFileType;
                float f18 = f7 - f17;
                if (fArr[0] == 0.0f) {
                    mediaType3 = type;
                    float f19 = f18;
                    int i11 = 3;
                    mediaType2 = mediaType;
                    int i12 = 0;
                    while (i12 < i11) {
                        float f20 = fArr2[i12];
                        f17 *= f20;
                        if (f20 != f7) {
                            f19 *= fArr3[i12];
                        }
                        i12++;
                        i11 = 3;
                        f7 = 1.0f;
                    }
                    i7 = 0;
                    fArr[0] = f17 / (f17 + f19);
                } else {
                    mediaType2 = mediaType;
                    mediaType3 = type;
                    i7 = 0;
                }
                float f21 = fArr[i7];
                if (f14 < f21) {
                    f14 = f21;
                    mediaType6 = type4;
                }
                float f22 = this.priorMetaFileType;
                float f23 = 1.0f;
                float f24 = 1.0f - f22;
                if (fArr[1] == 0.0f) {
                    int i13 = i7;
                    while (i13 < 3) {
                        float f25 = fArr4[i13];
                        f22 *= f25;
                        if (f25 != f23) {
                            f24 *= fArr5[i13];
                        }
                        i13++;
                        f23 = 1.0f;
                    }
                    fArr[1] = f22 / (f24 + f22);
                }
                float f26 = fArr[1];
                if (f14 < f26) {
                    f14 = f26;
                    mediaType6 = mediaType2;
                }
                float f27 = this.priorExtensionFileType;
                float f28 = 1.0f - f27;
                if (fArr[2] == 0.0f) {
                    for (int i14 = i7; i14 < 3; i14++) {
                        float f29 = fArr6[i14];
                        f27 *= f29;
                        if (f29 != 1.0f) {
                            f28 *= fArr7[i14];
                        }
                    }
                    fArr[2] = f27 / (f28 + f27);
                }
                float f30 = fArr[2];
                if (f14 < f30) {
                    f14 = f30;
                    mediaType4 = mediaType3;
                } else {
                    mediaType4 = mediaType6;
                }
                i8 = i10 + 1;
                list2 = list;
                mimeType3 = mimeType;
                mimeType4 = mimeType2;
                size = i9;
                mediaType5 = mediaType2;
                type = mediaType3;
            }
        }
        return f14 < this.threshold ? this.rootMediaType : mediaType4;
    }

    private void initializeDefaultProbabilityParameters() {
        this.priorMagicFileType = 0.5f;
        this.priorExtensionFileType = 0.5f;
        this.priorMetaFileType = 0.5f;
        this.magic_trust = DEFAULT_MAGIC_TRUST;
        this.extension_trust = 0.8f;
        this.meta_trust = 0.8f;
        this.magic_neg = 0.100000024f;
        this.extension_neg = 0.19999999f;
        this.meta_neg = 0.19999999f;
        this.threshold = 0.5001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.tika.detect.Detector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.tika.mime.MediaType detect(java.io.InputStream r6, org.apache.tika.metadata.Metadata r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L28
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes
            int r1 = r1.getMinLength()
            r6.mark(r1)
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            byte[] r1 = r1.readMagicHeader(r6)     // Catch: java.lang.Throwable -> L23
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            java.util.List r1 = r2.getMimeType(r1)     // Catch: java.lang.Throwable -> L23
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L23
            r6.reset()
            goto L28
        L23:
            r7 = move-exception
            r6.reset()
            throw r7
        L28:
            java.lang.String r6 = "resourceName"
            java.lang.String r6 = r7.get(r6)
            r1 = 0
            if (r6 == 0) goto L59
            java.net.URI r2 = new java.net.URI     // Catch: java.net.URISyntaxException -> L50
            r2.<init>(r6)     // Catch: java.net.URISyntaxException -> L50
            java.lang.String r2 = r2.getPath()     // Catch: java.net.URISyntaxException -> L50
            if (r2 == 0) goto L4f
            r3 = 47
            int r3 = r2.lastIndexOf(r3)     // Catch: java.net.URISyntaxException -> L50
            int r3 = r3 + 1
            int r4 = r2.length()     // Catch: java.net.URISyntaxException -> L50
            if (r3 >= r4) goto L4f
            java.lang.String r6 = r2.substring(r3)     // Catch: java.net.URISyntaxException -> L50
            goto L50
        L4f:
            r6 = r1
        L50:
            if (r6 == 0) goto L59
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes
            org.apache.tika.mime.MimeType r6 = r2.getMimeType(r6)
            goto L5a
        L59:
            r6 = r1
        L5a:
            java.lang.String r2 = "Content-Type"
            java.lang.String r7 = r7.get(r2)
            if (r7 == 0) goto L68
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: org.apache.tika.mime.MimeTypeException -> L68
            org.apache.tika.mime.MimeType r1 = r2.forName(r7)     // Catch: org.apache.tika.mime.MimeTypeException -> L68
        L68:
            org.apache.tika.mime.MediaType r6 = r5.applyProbilities(r0, r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.mime.ProbabilisticMimeDetectionSelector.detect(java.io.InputStream, org.apache.tika.metadata.Metadata):org.apache.tika.mime.MediaType");
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public ProbabilisticMimeDetectionSelector(Builder builder) {
        this(MimeTypes.getDefaultMimeTypes(), builder);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes) {
        this(mimeTypes, null);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes, Builder builder) {
        this.mimeTypes = mimeTypes;
        this.rootMediaType = MediaType.OCTET_STREAM;
        initializeDefaultProbabilityParameters();
        this.changeRate = 0.1f;
        if (builder != null) {
            this.priorMagicFileType = builder.priorMagicFileType == 0.0f ? this.priorMagicFileType : builder.priorMagicFileType;
            this.priorExtensionFileType = builder.priorExtensionFileType == 0.0f ? this.priorExtensionFileType : builder.priorExtensionFileType;
            this.priorMetaFileType = builder.priorMetaFileType == 0.0f ? this.priorMetaFileType : builder.priorMetaFileType;
            this.magic_trust = builder.magic_trust == 0.0f ? this.magic_trust : builder.extension_neg;
            this.extension_trust = builder.extension_trust == 0.0f ? this.extension_trust : builder.extension_trust;
            this.meta_trust = builder.meta_trust == 0.0f ? this.meta_trust : builder.meta_trust;
            this.magic_neg = builder.magic_neg == 0.0f ? this.magic_neg : builder.magic_neg;
            this.extension_neg = builder.extension_neg == 0.0f ? this.extension_neg : builder.extension_neg;
            this.meta_neg = builder.meta_neg == 0.0f ? this.meta_neg : builder.meta_neg;
            this.threshold = builder.threshold == 0.0f ? this.threshold : builder.threshold;
        }
    }
}
