package me.aheadlcx.designmode.abstractFactory;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午5:44
 */

public class IntelFactory implements AbstractFacroty {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new BMainBoard();
    }
}
