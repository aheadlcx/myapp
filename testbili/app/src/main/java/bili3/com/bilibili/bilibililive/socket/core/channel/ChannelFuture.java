package bili3.com.bilibili.bilibililive.socket.core.channel;

import java.util.concurrent.TimeUnit;

/* compiled from: BL */
public interface ChannelFuture {
    void addListener(ChannelFutureListener channelFutureListener);

    ChannelFuture await() throws InterruptedException;

    boolean await(long j) throws InterruptedException;

    boolean await(long j, TimeUnit timeUnit) throws InterruptedException;

    ChannelFuture awaitUninterruptibly();

    boolean awaitUninterruptibly(long j);

    boolean awaitUninterruptibly(long j, TimeUnit timeUnit);

    boolean cancel();

    Throwable getCause();

    Channel getChannel();

    boolean isCancelled();

    boolean isDone();

    boolean isSuccess();

    void removeListener(ChannelFutureListener channelFutureListener);

    boolean setFailure(Throwable th);

    boolean setProgress(long j, long j2, long j3);

    boolean setSuccess();
}
