package com.demo01;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//TCP协议通信
public class Cilent {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("客户端已经启动，马上发送请求！");
        Socket socket = new Socket("127.0.0.1",6666);

        OutputStream os = socket.getOutputStream();//字节输出流
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

            while(true){
                System.out.println("你说：");
                String str = input.next();
                if(str.equals("exit")){
                    break;
                }
                dos.writeUTF(str);
                //客户端结束响应
                System.out.println("她说："+dis.readUTF());
            }
        dos.close();
        os.close();
        socket.close();
    }
}
