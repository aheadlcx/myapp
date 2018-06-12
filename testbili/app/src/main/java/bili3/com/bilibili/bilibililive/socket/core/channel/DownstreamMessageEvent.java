package bili3.com.bilibili.bilibililive.socket.core.channel;

import bl.hae;
import com.bilibili.bilibililive.socket.core.util.internal.StringUtil;
import java.net.SocketAddress;

/* compiled from: BL */
public class DownstreamMessageEvent implements MessageEvent {
    private final Channel channel;
    private final ChannelFuture future;
    private final Object message;
    private final SocketAddress remoteAddress;

    public DownstreamMessageEvent(Channel channel, ChannelFuture channelFuture, Object obj, SocketAddress socketAddress) {
        if (channel == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105}));
        } else if (channelFuture == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 99, (byte) 112, (byte) 113, (byte) 112, (byte) 119, (byte) 96}));
        } else if (obj == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}));
        } else {
            this.channel = channel;
            this.future = channelFuture;
            this.message = obj;
            if (socketAddress != null) {
                this.remoteAddress = socketAddress;
            } else {
                this.remoteAddress = channel.getRemoteAddress();
            }
        }
    }

    public Channel getChannel() {
        return this.channel;
    }

    public ChannelFuture getFuture() {
        return this.future;
    }

    public Object getMessage() {
        return this.message;
    }

    public SocketAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public String toString() {
        if (getRemoteAddress() == getChannel().getRemoteAddress()) {
            return getChannel().toString() + hae.a(new byte[]{(byte) 37, (byte) 82, (byte) 87, (byte) 76, (byte) 81, (byte) 64, (byte) 63, (byte) 37}) + StringUtil.stripControlCharacters(getMessage());
        }
        return getChannel().toString() + hae.a(new byte[]{(byte) 37, (byte) 82, (byte) 87, (byte) 76, (byte) 81, (byte) 64, (byte) 63, (byte) 37}) + StringUtil.stripControlCharacters(getMessage()) + " to " + getRemoteAddress();
    }
}
