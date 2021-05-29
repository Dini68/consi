package stringmethods.url;

public class UrlManager {

    private final String protocol;
    private Integer port = null;
    private final String host;
    private String path = "";
    private String query = "";

    public UrlManager(String url) {
        if (url.split("/").length < 3) {
            throw new IllegalArgumentException("Invalid url");
        }
        this.protocol = url.split(":")[0].toLowerCase();
        String temp = url.split("/")[2];
        if (temp.contains(":")) {
            this.host = temp.split(":")[0].toLowerCase();
            this.port = Integer.parseInt(temp.split(":")[1]);
        }
        else {
            this.host = url.split("/")[2].toLowerCase();
        }
        if (url.split("/").length > 3) {
            int index = url.indexOf(url.split("/")[3]);
            if (url.contains("query?")) {
                this.path = url.substring(index - 1, url.indexOf("?"));
            }
            else {
                this.path = url.substring(index - 1);
            }
        }
        if (url.contains("query?")) {
            this.query = url.substring(url.indexOf("query") + 6);
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException("Wrong data");
        }
        for (String s: query.split("&")) {
            if (s.split("=")[0].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public String getProperty(String key) {
        if (hasProperty(key)) {
            for (String s: query.split("&")) {
                if (s.contains(key)) {
                    return s.split("=")[1];
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String url= "https://earthquake.usgs.gov/fdsnws/event/1/" +
                "query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        System.out.println(url.split(":")[0]);
        String temp = url.split("/")[2];
        if (temp.contains(":")) {
            System.out.println(temp.split(":")[0]);
            System.out.println(Integer.parseInt(temp.split(":")[1]));
        }
        else {
            System.out.println(url.split("/")[2]);
        }
        int index =url.indexOf(url.split("/")[3]);
        System.out.println(url.substring(index, url.indexOf("?")));
        System.out.println(url.substring(url.indexOf("query") + 6));
    }
}
