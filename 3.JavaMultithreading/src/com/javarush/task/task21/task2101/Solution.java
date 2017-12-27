package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        String l = Integer.toBinaryString(168 & 255);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000

    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte [] bytes = new byte[4];
        for (int i = 0; i < ip.length; i++ ){
            bytes[i] = (byte) (ip[i] & (byte)mask[i]);
        }
        return bytes;
    }

    public static void print(byte[] bytes) {
        String output;
        for (int b : bytes) {

            StringBuffer buf = new StringBuffer(Integer.toBinaryString(b));
            if (buf.length() < 8) {
                while (buf.length() < 8) buf.insert(0, '0');
                output = buf.toString();
            }
            else {
                output = buf.toString().substring(buf.length() - 8, buf.length());
            }
            System.out.print(output + " ");
        }
        System.out.println();

    }
}
