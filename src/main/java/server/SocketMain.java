package server;

public class SocketMain {
    public static void main(String[] args) throws Exception {
        new EchoServer(6677).start(); // 启动
    }
}
