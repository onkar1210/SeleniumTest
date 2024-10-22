package ModulePackage;

import PoPackage.DemoQAHomePagePO;

import java.io.IOException;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class BrokenLinksModule {

    DemoQAHomePagePO demoQAHomePagePO = new DemoQAHomePagePO();
    private int brokenLinkCount = 0;

    public void findTheBrokenLinksOnPage() throws IOException {
        List<String> links = demoQAHomePagePO.getLinksOnThePage();

        for (String link : links) {
            verifyLink(link);
        }

        System.out.println("Broken Links :" + getBrokenLinkCount());

    }

    public void verifyLink(String link) throws IOException {

        if(link != null && !link.isEmpty()) {
            try {
                URL url = new URL(link);


                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setConnectTimeout(3000);

                connection.setRequestMethod("HEAD");

                connection.connect();

                if (connection.getResponseCode() == 200) {

                } else {
                    brokenLinkCount++;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    public int getBrokenLinkCount() {
        return brokenLinkCount;
    }
}
