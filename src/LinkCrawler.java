/**
 * Created by alexvaccari on 6/26/17.
 */

/*
Crawls wikipedia until the Philosophy page is reached.
 */

import java.io.*;
import java.net.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class LinkCrawler{

    public static void getNextPage(Document nextPage){

        String title = nextPage.title();

        if(title.contains("Philosophy")){
            System.out.println("Found Philosophy");
            System.exit(0);
        }

        System.out.println(title);
        
        Elements links = nextPage.select("a[href]");

        for(Element link : links){

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader urlGet = new BufferedReader(new InputStreamReader(System.in));

        String url = "https://en.wikipedia.org/wiki/Machine";

        Document doc = Jsoup.connect(url).get();

        getNextPage(doc);


    }

}
