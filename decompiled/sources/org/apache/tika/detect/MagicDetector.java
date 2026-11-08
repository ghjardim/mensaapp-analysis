package org.apache.tika.detect;

import java.io.CharArrayWriter;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: classes2.dex */
public class MagicDetector implements Detector {
    private final boolean isRegex;
    private final boolean isStringIgnoreCase;
    private final int length;
    private final byte[] mask;
    private final int offsetRangeBegin;
    private final int offsetRangeEnd;
    private final byte[] pattern;
    private final int patternLength;
    private final MediaType type;

    public MagicDetector(MediaType mediaType, byte[] bArr) {
        this(mediaType, bArr, 0);
    }

    private static byte[] decodeString(String str, String str2) {
        int i7 = 0;
        if (str.startsWith("0x")) {
            int length = (str.length() - 2) / 2;
            byte[] bArr = new byte[length];
            while (i7 < length) {
                int i8 = i7 * 2;
                bArr[i7] = (byte) Integer.parseInt(str.substring(i8 + 2, i8 + 4), 16);
                i7++;
            }
            return bArr;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i9 = 0;
        while (i9 < str.length()) {
            if (str.charAt(i9) == '\\') {
                int i10 = i9 + 1;
                if (str.charAt(i10) == '\\') {
                    charArrayWriter.write(92);
                } else if (str.charAt(i10) == 'x') {
                    charArrayWriter.write(Integer.parseInt(str.substring(i9 + 2, i9 + 4), 16));
                    i9 += 3;
                } else if (str.charAt(i10) == 'r') {
                    charArrayWriter.write(13);
                } else if (str.charAt(i10) == 'n') {
                    charArrayWriter.write(10);
                } else {
                    int i11 = i10;
                    while (i11 < i9 + 4 && i11 < str.length() && Character.isDigit(str.charAt(i11))) {
                        i11++;
                    }
                    charArrayWriter.write(Short.decode("0" + str.substring(i10, i11)).byteValue());
                    i9 = i11 + (-1);
                }
                i9 = i10;
            } else {
                charArrayWriter.write(str.charAt(i9));
            }
            i9++;
        }
        char[] charArray = charArrayWriter.toCharArray();
        if ("unicodeLE".equals(str2)) {
            byte[] bArr2 = new byte[charArray.length * 2];
            while (i7 < charArray.length) {
                int i12 = i7 * 2;
                char c7 = charArray[i7];
                bArr2[i12] = (byte) (c7 & 255);
                bArr2[i12 + 1] = (byte) (c7 >> '\b');
                i7++;
            }
            return bArr2;
        }
        if (!"unicodeBE".equals(str2)) {
            int length2 = charArray.length;
            byte[] bArr3 = new byte[length2];
            while (i7 < length2) {
                bArr3[i7] = (byte) charArray[i7];
                i7++;
            }
            return bArr3;
        }
        byte[] bArr4 = new byte[charArray.length * 2];
        while (i7 < charArray.length) {
            int i13 = i7 * 2;
            char c8 = charArray[i7];
            bArr4[i13] = (byte) (c8 >> '\b');
            bArr4[i13 + 1] = (byte) (c8 & 255);
            i7++;
        }
        return bArr4;
    }

    private static byte[] decodeValue(String str, String str2) {
        String str3;
        int i7;
        if (str == null || str2 == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            str3 = str.substring(2);
            i7 = 16;
        } else {
            str3 = str;
            i7 = 8;
        }
        switch (str2) {
            case "host16":
            case "little16":
                int parseInt = Integer.parseInt(str3, i7);
                return new byte[]{(byte) (parseInt & 255), (byte) (parseInt >> 8)};
            case "host32":
            case "little32":
                long parseLong = Long.parseLong(str3, i7);
                return new byte[]{(byte) (255 & parseLong), (byte) ((parseLong & 65280) >> 8), (byte) ((parseLong & 16711680) >> 16), (byte) ((parseLong & (-16777216)) >> 24)};
            case "unicodeBE":
            case "unicodeLE":
            case "string":
            case "regex":
                return decodeString(str, str2);
            case "stringignorecase":
                return decodeString(str.toLowerCase(Locale.ROOT), str2);
            case "byte":
                return str3.getBytes(StandardCharsets.UTF_8);
            case "big16":
                int parseInt2 = Integer.parseInt(str3, i7);
                return new byte[]{(byte) (parseInt2 >> 8), (byte) (parseInt2 & 255)};
            case "big32":
                long parseLong2 = Long.parseLong(str3, i7);
                return new byte[]{(byte) ((parseLong2 & (-16777216)) >> 24), (byte) ((parseLong2 & 16711680) >> 16), (byte) ((parseLong2 & 65280) >> 8), (byte) (parseLong2 & 255)};
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.tika.detect.MagicDetector parse(org.apache.tika.mime.MediaType r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r0 = 0
            if (r11 == 0) goto L10
            r1 = 58
            int r1 = r11.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            int r0 = java.lang.Integer.parseInt(r11)
        L10:
            r7 = r0
            r8 = r7
            goto L27
        L13:
            java.lang.String r0 = r11.substring(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            int r1 = r1 + 1
            java.lang.String r11 = r11.substring(r1)
            int r11 = java.lang.Integer.parseInt(r11)
            r8 = r11
            r7 = r0
        L27:
            byte[] r3 = decodeValue(r12, r10)
            if (r13 == 0) goto L33
            byte[] r11 = decodeValue(r13, r10)
        L31:
            r4 = r11
            goto L35
        L33:
            r11 = 0
            goto L31
        L35:
            org.apache.tika.detect.MagicDetector r11 = new org.apache.tika.detect.MagicDetector
            java.lang.String r12 = "regex"
            boolean r5 = r10.equals(r12)
            java.lang.String r12 = "stringignorecase"
            boolean r6 = r10.equals(r12)
            r1 = r11
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.detect.MagicDetector.parse(org.apache.tika.mime.MediaType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.apache.tika.detect.MagicDetector");
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.offsetRangeEnd + this.length);
        int i7 = 0;
        while (true) {
            try {
                int i8 = this.offsetRangeBegin;
                if (i7 >= i8) {
                    int i9 = this.length + (this.offsetRangeEnd - i8);
                    byte[] bArr = new byte[i9];
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        i7 += read;
                    }
                    while (read != -1 && i7 < this.offsetRangeEnd + this.length) {
                        int i10 = i7 - this.offsetRangeBegin;
                        read = inputStream.read(bArr, i10, i9 - i10);
                        if (read > 0) {
                            i7 += read;
                        }
                    }
                    if (this.isRegex) {
                        Matcher matcher = Pattern.compile(new String(this.pattern, StandardCharsets.UTF_8), this.isStringIgnoreCase ? 2 : 0).matcher(StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(bArr)));
                        for (int i11 = 0; i11 <= this.offsetRangeEnd - this.offsetRangeBegin; i11++) {
                            matcher.region(i11, this.length + i11);
                            if (matcher.lookingAt()) {
                                return this.type;
                            }
                        }
                    } else {
                        if (i7 < this.offsetRangeBegin + this.length) {
                            return MediaType.OCTET_STREAM;
                        }
                        for (int i12 = 0; i12 <= this.offsetRangeEnd - this.offsetRangeBegin; i12++) {
                            boolean z6 = true;
                            for (int i13 = 0; z6 && i13 < this.length; i13++) {
                                int i14 = bArr[i12 + i13] & this.mask[i13];
                                if (this.isStringIgnoreCase) {
                                    i14 = Character.toLowerCase(i14);
                                }
                                z6 = i14 == this.pattern[i13];
                            }
                            if (z6) {
                                return this.type;
                            }
                        }
                    }
                    return MediaType.OCTET_STREAM;
                }
                long skip = inputStream.skip(i8 - i7);
                if (skip > 0) {
                    i7 = (int) (i7 + skip);
                } else {
                    if (inputStream.read() == -1) {
                        return MediaType.OCTET_STREAM;
                    }
                    i7++;
                }
            } finally {
                inputStream.reset();
            }
        }
    }

    public int getLength() {
        return this.patternLength;
    }

    public String toString() {
        MediaType mediaType = this.type;
        byte[] bArr = this.pattern;
        return "Magic Detection for " + mediaType + " looking for " + bArr.length + " bytes = " + Arrays.toString(bArr) + " mask = " + Arrays.toString(this.mask);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, int i7) {
        this(mediaType, bArr, null, i7, i7);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, int i7, int i8) {
        this(mediaType, bArr, bArr2, false, i7, i8);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z6, int i7, int i8) {
        this(mediaType, bArr, bArr2, z6, false, i7, i8);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z6, boolean z7, int i7, int i8) {
        if (mediaType == null) {
            throw new IllegalArgumentException("Matching media type is null");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Magic match pattern is null");
        }
        if (i7 >= 0 && i8 >= i7) {
            this.type = mediaType;
            this.isRegex = z6;
            this.isStringIgnoreCase = z7;
            int max = Math.max(bArr.length, bArr2 != null ? bArr2.length : 0);
            this.patternLength = max;
            if (z6) {
                this.length = 8192;
            } else {
                this.length = max;
            }
            this.mask = new byte[max];
            this.pattern = new byte[max];
            for (int i9 = 0; i9 < this.patternLength; i9++) {
                if (bArr2 != null && i9 < bArr2.length) {
                    this.mask[i9] = bArr2[i9];
                } else {
                    this.mask[i9] = -1;
                }
                if (i9 < bArr.length) {
                    this.pattern[i9] = (byte) (bArr[i9] & this.mask[i9]);
                } else {
                    this.pattern[i9] = 0;
                }
            }
            this.offsetRangeBegin = i7;
            this.offsetRangeEnd = i8;
            return;
        }
        throw new IllegalArgumentException("Invalid offset range: [" + i7 + "," + i8 + "]");
    }
}
