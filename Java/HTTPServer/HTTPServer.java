//Erik Hellman

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class HTTPServer {

    public static void main(String[] args) throws IOException {
        byte[] fromClientBuffer = new byte[1024];
        int port = 0;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception ex) {
            System.err.println("Port not defined");
            System.exit(1);
        }

        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket connectionSocket = serverSocket.accept();
            connectionSocket.setSoTimeout(500);

            String data = "HTTP/1.1 200 OK\r\n\r\n" + "Server sent you this response:\r\n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam a ante nisi. Etiam velit risus, congue sit amet est eu, tempus scelerisque dolor. Nunc maximus, odio in auctor faucibus, felis odio ultrices felis, eu faucibus sem neque sed orci. Sed lobortis fringilla enim ac convallis. Aenean nisl nisl, tempus ac rutrum eget, consequat a enim. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Aenean faucibus elementum ullamcorper. Nullam diam leo, bibendum aliquam interdum a, varius nec magna. Morbi diam arcu, luctus et semper eget, hendrerit sit amet tellus. Nullam vel arcu at enim elementum convallis. " +
                    "Nullam blandit, elit in luctus dapibus, orci est vehicula sem, placerat blandit enim tortor vestibulum nulla. Donec arcu sem, euismod et quam sagittis, congue ultrices justo. Pellentesque sollicitudin ex at velit efficitur, eu ultrices metus dapibus. Suspendisse potenti. Vestibulum maximus magna sed urna convallis, quis aliquam augue maximus. Nullam non rutrum lectus. Mauris dignissim, nisl at interdum efficitur, libero nisl sollicitudin nibh, eget pretium tortor risus sed nisi. Duis eu purus tincidunt, varius ex ac, vehicula sapien. Ut gravida fermentum tincidunt. " +
                    "Nullam turpis quam, rutrum ac elit facilisis, porta placerat odio. Sed ornare auctor felis nec vehicula. Fusce nulla leo, blandit non neque et, imperdiet euismod nisl. Phasellus id rhoncus elit. Nunc ornare, elit mollis condimentum lacinia, velit dolor lobortis lectus, id eleifend libero justo vitae lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ullamcorper ultricies turpis nec ultrices. Nulla eget sollicitudin diam. " +
                    "Aliquam egestas nunc id dui rhoncus, a ultrices velit tempus. Ut non augue ut ipsum tincidunt pretium. Sed ut mi aliquet, sodales augue in, hendrerit orci. In hac habitasse platea dictumst. Quisque a nunc ut leo rutrum tincidunt. Vestibulum eu iaculis mi. Donec venenatis eget nulla eget aliquam. Fusce consectetur et ipsum sit amet efficitur. Nulla auctor fringilla porta. Sed convallis dolor vel turpis bibendum, id auctor felis laoreet. " +
                    "Phasellus ac diam porta, consectetur metus et, fringilla ligula. Nam volutpat fringilla ex quis fermentum. Maecenas sodales lectus risus, ultricies molestie nisi mattis nec. Aenean interdum posuere elit a tincidunt. Vivamus semper sollicitudin facilisis. Nullam vulputate mattis nibh in consectetur. Sed a est non ipsum venenatis accumsan at et nunc. Curabitur ut lobortis neque. Fusce felis tortor, gravida vitae auctor at, fermentum eget libero. Nullam a dui metus. Donec tempus mi eu elit ornare, ac pretium neque posuere. Duis nibh ex, pretium ac eleifend sit amet, rutrum sed risus. Fusce hendrerit eleifend diam, quis auctor risus volutpat ac.";

            byte[] toSend = data.getBytes(StandardCharsets.UTF_8);
            connectionSocket.getOutputStream().write(toSend);

            connectionSocket.close();
        }
    }
}
