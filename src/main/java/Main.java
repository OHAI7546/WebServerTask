import service.HttpServerServiceImpl;

import static common.SimpleHttpServer.PORT;

public class Main {

    public static void main(String[] args) throws Exception {

        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);

    }
}
