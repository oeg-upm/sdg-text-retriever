/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Djbosh
 */
public class ScraperWeb {

    public String scrapWebONU1(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-3387d4fd6917522d95b");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-fbece3109a8ac97a03e");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU2(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-f51c047db7ebd4ada26");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-f8108c4308a3cca9080");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU3(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-6da9677ebbc9dcd387c");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-3bee2d0d15e1c8b1c99");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU4(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-5a61be7008b48aecf2e");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-0d6fefdde5e8d081539");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU5(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-1326d3bdbf56bde3c7c");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-a04dba675b26e5abb4b");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU6(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-649a676d146ba4f2455");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-fd3dfc1b2f7d7c52725");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU7(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-d47d7f980240f558b1d");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-b410cdead5e706ff511");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU8(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-6b722fa94c97a4bb1ba");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-f9470c5b50f26d60612");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU9(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-faea3fb48bef75135b3");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-d28578a6b1fb144da3f");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU10(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-66a82dc66c987518589");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-654e87184f39d06204a");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String scrapWebONU11(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-ce4eb649bc8f0504cb9");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-8dd6cb9078e4c78159c");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public String scrapWebONU12(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-5b4f13085b74b691826");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-f5a3f2b68da58c89323");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public String scrapWebONU13(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-cb4c810cfdb3a627afb");
            for (Element e : elementsUL.select("ol")) {
                res += e.select("li").text();
                res += " ";
            }
            for (Element e: elementsUL.select("ul")){
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-e76b2ef939a4e3fe07c");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public String scrapWebONU14(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-5088216b9b366270626");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-00e77f8382e38fbd400");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public String scrapWebONU15(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-b19af39bcf797b8da86");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-6618ae57fe3398a03c8");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public String scrapWebONU16(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-d6cd6915ab4fe126430");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-92f0cb26a67ca64bf23");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public String scrapWebONU17(String url) {
        String res = "";
        try {
            Document d = Jsoup.connect(url).timeout(10000).get();
            Elements elements = d.select("div.fusion-text");
            for (Element e : elements.select("p")) {
                res += e.text();
                res += " ";
            }
            Elements elementsUL = d.select("div#tab-80a60b29e78b6c33ac0");
            for (Element e : elementsUL.select("ul")) {
                res += e.select("li").text();
                res += " ";
            }
            Elements elementsUL2 = d.select("div#tab-af85da2ef911cb7271e");
            for (Element e : elementsUL2.select("p")) {
                res += e.text();
                res += " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
