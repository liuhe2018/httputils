package me.liuhe92.httputils;

public class HttpUtils {

    private HttpUtils instance;
    private static h

    private HttpUtils() {
    }

    public HttpUtils getInstance() {
        if (instance == null) {
            synchronized (HttpUtils.class) {
                if (instance == null) {
                    instance = new HttpUtils();
                }
            }
        }
        return instance;
    }

}
