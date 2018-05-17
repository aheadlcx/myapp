package me.aheadlcx.designmode.factoryMethod;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午5:18
 */

public abstract class ExportOperate {

    public void export(String fileName){
        ExportFileApi api = factoryMethod();
        api.export(fileName);
    }
    protected abstract ExportFileApi factoryMethod();
}
