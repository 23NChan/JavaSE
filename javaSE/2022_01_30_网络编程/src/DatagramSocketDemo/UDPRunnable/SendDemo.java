package DatagramSocketDemo.UDPRunnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo implements Runnable {
    DatagramSocket ds = null;

    public SendDemo(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
                if ("886".equals(line)) break;
                byte[] bys = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.0.107"),24232);
                ds.send(dp);

            } catch (IOException e) {
                try {
                    br.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                ds.close();
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ds.close();

    }
}
