package InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //Static InetAddress getByName(String host)确定主机名称的IP地址。主机名称可以是及其名称，也可以是IP地址
        InetAddress address = InetAddress.getByName("192.168.0.107");

//        InetAddress address = InetAddress.getByName("L6677"); //报错

        //String getHostName()获取此IP地址的主机名
        String hostName = address.getHostName();
        System.out.println(hostName);

        //String getHostAddress()返回文本显示中的IP地址字符串

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
    }
}
