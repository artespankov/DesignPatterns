package VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    URL initialURL;

    public static void main (String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception{

        // create panel and menu

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
//        Window frame = new Window();
//        frame.getContentPane().add(imageComponent);
    }
}