package service;

import utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static common.SimpleHttpServer.PORT;

public class HttpServerServiceImpl implements HttpServerService {

    @Override
    public void start(int port) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port "+ port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New connection established");

//                HttpHandler httpHandler = new
                new Thread(new HttpHandler(socket)).start();  // Because I implemented Runnable interface and not extending Thread class

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
