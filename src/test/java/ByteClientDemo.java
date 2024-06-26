import com.bytecloud.sdk.client.ByteClient;
import com.bytecloud.sdk.domain.Address;
import com.bytecloud.sdk.domain.Coin;
import com.bytecloud.sdk.domain.ResultMsg;

import java.math.BigDecimal;
import java.util.List;

public class ByteClientDemo {
    public static void main(String[] args) {
        //初始化
        ByteClient ByteClient = new ByteClient("https://hd03-node.bytecloud.com",
                "300016",
                "ade8e0a11032ceb27dca017dfcacd1b6",
                "http://192.168.2.223:8081/Byte/notify");
        //获取商户支持币种
        List<Coin> coinList = ByteClient.listSupportCoin(false);
        //创建地址
        Address address3 = ByteClient.createAddress("0", "1", "1", "http://demo.com/notify");
        System.out.println(address3);
        //检验地址合法性
        boolean b = ByteClient.checkAddress("133", "t1ge6MzUFbBFWVymxX1gdQa3yr7PFdBkomc");
        System.out.println(b);
        //提币
        ResultMsg withdrawResult1 = ByteClient.withdraw("0xa09921e9a3886e1b2b79e8fcd27d3a61ebe0ecd9", BigDecimal.TEN,
                "520", "520",
                "42423121", "", "http://demo.com/notify");
        System.out.println(withdrawResult1);

        ResultMsg withdrawResult2 = ByteClient.withdraw("0xa09921e9a3886e1b2b79e8fcd27d3a61ebe0ecd9", BigDecimal.TEN,
                "520", "520",
                "42423121", "");
        System.out.println(withdrawResult2);
        //代付
        ResultMsg proxyPayResult = ByteClient.autoWithdraw("0xa09921e9a3886e1b2b79e8fcd27d3a61ebe0ecd9", BigDecimal.TEN,
                "520", "520",
                "42423121", "", "http://demo.com/notify");
        System.out.println(proxyPayResult);

    }
}
