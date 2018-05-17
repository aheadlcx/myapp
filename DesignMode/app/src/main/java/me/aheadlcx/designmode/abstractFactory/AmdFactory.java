package me.aheadlcx.designmode.abstractFactory;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午5:42
 */

public class AmdFactory implements AbstractFacroty {
    @Override
    public Cpu createCpu() {
        return new AMDCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AMainBoard();
    }
}
