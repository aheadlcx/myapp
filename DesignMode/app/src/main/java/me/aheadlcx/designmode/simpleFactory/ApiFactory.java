package me.aheadlcx.designmode.simpleFactory;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午4:44
 */

public class ApiFactory {

    public Api createApi(int condition){
        if (condition == 1){
            return new ApiA();
        }
        return new ApiB();
    }
}
