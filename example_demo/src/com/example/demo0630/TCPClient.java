package com.example.demo0630;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        new ClientReader(is).start();
        new ClientWriter(os).start();
    }
}
class ClientReader extends Thread{
    private BufferedReader br;
    public ClientReader(InputStream is){
        br = new BufferedReader(new InputStreamReader(is));
    }

    @Override
    public void run() {
        while (true){
            String info = null;
            try {
                info = br.readLine();
                if (info.equals("quit")) break;
                System.out.println("server message: " + info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class ClientWriter extends Thread{
    private PrintWriter pw;
    private Scanner ss;
    public ClientWriter(OutputStream os){
        pw = new PrintWriter(new OutputStreamWriter(os));
        ss = new Scanner(System.in);
    }

    @Override
    public void run() {
        while (true){
            String info = ss.next();
            if (info.equals("quit")) break;
            pw.println(info);
            pw.flush();
        }
    }
}
