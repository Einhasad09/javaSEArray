package com.demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务器端
public class Server {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("服务器已经启动！");
        ServerSocket ss = new ServerSocket(6666);//确定端口
        Socket socket = ss.accept();//接收客户端发送过来的socket

        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        while(true) {
            //服务器接收请求
            String str = dis.readUTF();
            if(str.equals("exit")){
                break;
            }
            System.out.println("他说：" + str);
            //服务器给出响应
            System.out.println("你说：");
            dos.writeUTF(input.next());
        }

        dis.close();
        socket.close();
        ss.close();
    }
}
