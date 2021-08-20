package com.example.demo0727;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

public class demo01 {
    public static void main(String[] args) throws IOException {
        System.out.println("----------server start----------");
        ServerSocket server = new ServerSocket(80);
        Socket socket = server.accept();
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String actionRow = br.readLine();
        System.out.println(actionRow);
        String infoHead = null;
        while(!"".equals(infoHead = br.readLine())){
            map.put(infoHead.split(":")[0],infoHead.split(":")[1]);
            System.out.println(infoHead);
        }
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                //System.out.println("key:"+s+",value:"+s2);
            }
        });
        if(map.containsKey("Content-Length")){
            char[] arras = new char[Integer.parseInt(map.get("Content-Length").trim())];
            br.read(arras);
            System.out.println("请求体中的数据:"+new String(arras));
        }else{
            System.out.println("get");
        }
        String validataCode = "qwertyuioplkjhgfdsazxcvbnm0123456789";
        char[] code = validataCode.toCharArray();
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        buffer.append(code[random.nextInt(code.length)]);
        buffer.append(code[random.nextInt(code.length)]);
        buffer.append(code[random.nextInt(code.length)]);
        buffer.append(code[random.nextInt(code.length)]);
        String strInfo = "<html><head><title>服务器响应</title></head><body><h1>请求成功了!服务器响应成功!</h1><br/>验证码:<input type='text' value='"+ buffer +"' />&nbsp;</body></<html>";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("HTTP/1.1 200 ok\r\n");  //响应客户端的状态行
        bw.write("Content-Type:text/html;charset=UTF-8\r\n");
        bw.write("\r\n");
        bw.write(strInfo);
        bw.flush();
        bw.close();
        socket.close();
        server.close();
        System.out.println("----------server close----------");
    }
}
