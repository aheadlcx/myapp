package bili3.com.bilibili.bilibililive.socket.core.channel.socket;

import com.bilibili.bilibililive.socket.core.channel.Channel;
import java.net.InetSocketAddress;

/* compiled from: BL */
public interface SocketChannel extends Channel {
    SocketChannelConfig getConfig();

    InetSocketAddress getLocalAddress();

    InetSocketAddress getRemoteAddress();
}
