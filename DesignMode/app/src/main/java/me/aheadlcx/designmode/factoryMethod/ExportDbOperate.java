package me.aheadlcx.designmode.factoryMethod;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午5:20
 */

public class ExportDbOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDbFile();
    }
}
