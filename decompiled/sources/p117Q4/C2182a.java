package p117Q4;

import com.google.firebase.firestore.C3952f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p272k4.C5410A;

/* renamed from: Q4.a */
/* loaded from: classes2.dex */
public class C2182a extends Exception {

    /* renamed from: a */
    public final String f6596a;

    /* renamed from: b */
    public final String f6597b;

    /* renamed from: Q4.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6598a;

        static {
            int[] iArr = new int[C3952f.a.values().length];
            f6598a = iArr;
            try {
                iArr[C3952f.a.ABORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6598a[C3952f.a.ALREADY_EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6598a[C3952f.a.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6598a[C3952f.a.DATA_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6598a[C3952f.a.DEADLINE_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6598a[C3952f.a.FAILED_PRECONDITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6598a[C3952f.a.INTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6598a[C3952f.a.INVALID_ARGUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6598a[C3952f.a.NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6598a[C3952f.a.OUT_OF_RANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6598a[C3952f.a.PERMISSION_DENIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6598a[C3952f.a.RESOURCE_EXHAUSTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6598a[C3952f.a.UNAUTHENTICATED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6598a[C3952f.a.UNAVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6598a[C3952f.a.UNIMPLEMENTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6598a[C3952f.a.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C2182a(C3952f c3952f, Throwable th) {
        super(c3952f != null ? c3952f.getMessage() : StringUtils.EMPTY, th);
        String str;
        String str2;
        char c7;
        String str3 = "Unrecoverable data loss or corruption.";
        String str4 = "data-loss";
        if (th != null && th.getMessage() != null && th.getMessage().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            Matcher matcher = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(th.getMessage());
            if (matcher.find()) {
                String trim = matcher.group(1).trim();
                String trim2 = matcher.group(2).trim();
                trim.hashCode();
                switch (trim.hashCode()) {
                    case -1842427240:
                        if (trim.equals("DATA_LOSS")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1711692763:
                        if (trim.equals("INVALID_ARGUMENT")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1416305653:
                        if (trim.equals("PERMISSION_DENIED")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1031784143:
                        if (trim.equals("CANCELLED")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1025686472:
                        if (trim.equals("RESOURCE_EXHAUSTED")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -849706474:
                        if (trim.equals("UNAUTHENTICATED")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -476794961:
                        if (trim.equals("ABORTED")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -376214182:
                        if (trim.equals("DEADLINE_EXCEEDED")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 433141802:
                        if (trim.equals("UNKNOWN")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 695165606:
                        if (trim.equals("OUT_OF_RANGE")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 979228314:
                        if (trim.equals("FAILED_PRECONDITION")) {
                            c7 = '\n';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1023286998:
                        if (trim.equals("NOT_FOUND")) {
                            c7 = 11;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1353037501:
                        if (trim.equals("INTERNAL")) {
                            c7 = '\f';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1487498288:
                        if (trim.equals("UNAVAILABLE")) {
                            c7 = '\r';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1661336131:
                        if (trim.equals("ALREADY_EXISTS")) {
                            c7 = 14;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1854913705:
                        if (trim.equals("UNIMPLEMENTED")) {
                            c7 = 15;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        str2 = "Unrecoverable data loss or corruption.";
                        str = "data-loss";
                        break;
                    case 1:
                        str2 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                        str = "invalid-argument";
                        break;
                    case 2:
                        str2 = "The caller does not have permission to execute the specified operation.";
                        str = "permission-denied";
                        break;
                    case 3:
                        str2 = "The operation was cancelled (typically by the caller).";
                        str = "cancelled";
                        break;
                    case 4:
                        str2 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                        str = "resource-exhausted";
                        break;
                    case 5:
                        str2 = "The request does not have valid authentication credentials for the operation.";
                        str = "unauthenticated";
                        break;
                    case 6:
                        str2 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                        str = "aborted";
                        break;
                    case 7:
                        str2 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                        str = "deadline-exceeded";
                        break;
                    case '\b':
                        str = "unknown";
                        str2 = "Operation is not implemented or not supported/enabled.";
                        break;
                    case '\t':
                        str2 = "Operation was attempted past the valid range.";
                        str = "out-of-range";
                        break;
                    case '\n':
                        str2 = trim2.contains("index") ? trim2 : "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
                        str = "failed-precondition";
                        break;
                    case 11:
                        str2 = "Some requested document was not found.";
                        str = "not-found";
                        break;
                    case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        str2 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                        str = "internal";
                        break;
                    case '\r':
                        str2 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                        str = "unavailable";
                        break;
                    case 14:
                        str2 = "Some document that we attempted to create already exists.";
                        str = "already-exists";
                        break;
                    case 15:
                        str = "unimplemented";
                        str2 = "Operation is not implemented or not supported/enabled.";
                        break;
                }
                if (str != null && c3952f != null) {
                    switch (a.f6598a[c3952f.m15582a().ordinal()]) {
                        case 1:
                            str3 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                            str4 = "aborted";
                            break;
                        case 2:
                            str3 = "Some document that we attempted to create already exists.";
                            str4 = "already-exists";
                            break;
                        case 3:
                            str3 = "The operation was cancelled (typically by the caller).";
                            str4 = "cancelled";
                            break;
                        case 4:
                            break;
                        case 5:
                            str3 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                            str4 = "deadline-exceeded";
                            break;
                        case 6:
                            str3 = ((c3952f.getMessage() == null || !c3952f.getMessage().contains("query requires an index")) && !c3952f.getMessage().contains("ensure it has been indexed")) ? "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console." : c3952f.getMessage();
                            str4 = "failed-precondition";
                            break;
                        case 7:
                            str3 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                            str4 = "internal";
                            break;
                        case 8:
                            str3 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                            str4 = "invalid-argument";
                            break;
                        case 9:
                            str3 = "Some requested document was not found.";
                            str4 = "not-found";
                            break;
                        case 10:
                            str3 = "Operation was attempted past the valid range.";
                            str4 = "out-of-range";
                            break;
                        case 11:
                            str3 = "The caller does not have permission to execute the specified operation.";
                            str4 = "permission-denied";
                            break;
                        case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            str3 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                            str4 = "resource-exhausted";
                            break;
                        case 13:
                            str3 = "The request does not have valid authentication credentials for the operation.";
                            str4 = "unauthenticated";
                            break;
                        case 14:
                            str3 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                            str4 = "unavailable";
                            break;
                        case 15:
                            str4 = "unimplemented";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        case 16:
                            str3 = "Unknown error or an error from a different error domain.";
                            str4 = "unknown";
                            break;
                        default:
                            str3 = "An unknown error occurred";
                            str4 = "unknown";
                            break;
                    }
                } else {
                    str4 = str;
                    str3 = str2;
                }
                this.f6596a = str4;
                this.f6597b = str3;
            }
        }
        str = null;
        str2 = null;
        if (str != null) {
        }
        str4 = str;
        str3 = str2;
        this.f6596a = str4;
        this.f6597b = str3;
    }

    /* renamed from: a */
    public String m7383a() {
        return this.f6596a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f6597b;
    }
}
