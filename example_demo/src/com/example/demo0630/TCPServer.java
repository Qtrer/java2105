package com.example.demo0630;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        new ServerReader(is).start();
        new ServerWriter(os).start();
    }
}
class ServerReader extends Thread{
    private BufferedReader br;
    public ServerReader(InputStream is){
        br = new BufferedReader(new InputStreamReader(is));
    }

    @Override
    public void run() {
        while (true){
            String info = null;
            try {
                info = br.readLine();
                if (info.equals("quit")) break;
                System.out.println("client message: " + info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class ServerWriter extends Thread{
    private PrintWriter pw;
    private Scanner ss;
    public ServerWriter(OutputStream os){
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
