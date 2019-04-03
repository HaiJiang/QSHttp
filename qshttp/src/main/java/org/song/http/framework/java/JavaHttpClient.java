package org.song.http.framework.java;


import org.song.http.framework.QSHttpClient;

/*
 * Created by song on 2016/9/21.
 */
public class JavaHttpClient extends QSHttpClient {

    private static JavaHttpClient instance;

    public static JavaHttpClient getInstance() {
        if (instance == null)
            instance = new JavaHttpClient();
        return instance;
    }

    //开放实例
    public JavaHttpClient() {
        super(new HttpURLConnectionTask());
    }

}
