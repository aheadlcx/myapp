package bili3.com.sina.weibo.sdk.cmd;

/* compiled from: BL */
interface CmdExecutor<T extends BaseCmd> {
    boolean doExecutor(T t);
}
