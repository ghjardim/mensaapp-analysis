package org.apache.tika.utils;

/* loaded from: classes2.dex */
public class FileProcessResult {
    String stderr = StringUtils.EMPTY;
    String stdout = StringUtils.EMPTY;
    int exitValue = -1;
    long processTimeMillis = -1;
    boolean isTimeout = false;
    long stdoutLength = -1;
    long stderrLength = -1;
    boolean stderrTruncated = false;
    boolean stdoutTruncated = false;

    public int getExitValue() {
        return this.exitValue;
    }

    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    public String getStderr() {
        return this.stderr;
    }

    public long getStderrLength() {
        return this.stderrLength;
    }

    public String getStdout() {
        return this.stdout;
    }

    public long getStdoutLength() {
        return this.stdoutLength;
    }

    public boolean isStderrTruncated() {
        return this.stderrTruncated;
    }

    public boolean isStdoutTruncated() {
        return this.stdoutTruncated;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setExitValue(int i7) {
        this.exitValue = i7;
    }

    public void setProcessTimeMillis(long j7) {
        this.processTimeMillis = j7;
    }

    public void setStderr(String str) {
        this.stderr = str;
    }

    public void setStderrLength(long j7) {
        this.stderrLength = j7;
    }

    public void setStderrTruncated(boolean z6) {
        this.stderrTruncated = z6;
    }

    public void setStdout(String str) {
        this.stdout = str;
    }

    public void setStdoutLength(long j7) {
        this.stdoutLength = j7;
    }

    public void setStdoutTruncated(boolean z6) {
        this.stdoutTruncated = z6;
    }

    public void setTimeout(boolean z6) {
        this.isTimeout = z6;
    }

    public String toString() {
        return "FileProcessResult{stderr='" + this.stderr + "', stdout='" + this.stdout + "', exitValue=" + this.exitValue + ", processTimeMillis=" + this.processTimeMillis + ", isTimeout=" + this.isTimeout + ", stdoutLength=" + this.stdoutLength + ", stderrLength=" + this.stderrLength + ", stderrTruncated=" + this.stderrTruncated + ", stdoutTruncated=" + this.stdoutTruncated + "}";
    }
}
