package top.yeyusmile.utils;


import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2021/1/15 14:22
 */
public class HttpUtil {

    public static volatile boolean doHttpsGetComplted = false;
    public static volatile boolean doPostComplted = false;
    public static volatile boolean doGetComplted = false;


    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        client.dispatcher().setMaxRequests(3000);
        client.dispatcher().setMaxRequestsPerHost(1000);
        Request request = new Request.Builder()
                .url(address)
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36")
                .build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendOkHttpRequestWithPost(String address, RequestBody requestBody, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        client.dispatcher().setMaxRequests(3000);
        client.dispatcher().setMaxRequestsPerHost(1000);
        Request request = new Request.Builder()
                .url(address)
                .post(requestBody)
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36")
                .build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendHttps(String address, okhttp3.Callback callback) {


        final OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .sslSocketFactory(SSLUtils.getSSLSocketFactory(), SSLUtils.getX509TrustManager())
                .hostnameVerifier(SSLUtils.getHostnameVerifier())
                .build();

        // OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(address)
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36")
                .build();
        client.newCall(request).enqueue(callback);
    }

    /**
     * http get
     *
     * @param address
     * @return
     */
    public static synchronized String doGet(String address) {
        final String[] ret = {null};
        doGetComplted = false;
        HttpUtil.sendOkHttpRequest(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                doGetComplted = true;
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ret[0] = response.body().string();
                doGetComplted = true;
                System.out.println("yes");
            }
        });
        while (!doGetComplted) {
        }
        return ret[0];
    }


    /**
     * http post
     *
     * @param address
     * @param requestBody
     * @return
     */
    public static synchronized String doPost(String address, RequestBody requestBody) {
        final String[] ret = {null};
        doPostComplted = false;
        HttpUtil.sendOkHttpRequestWithPost(address, requestBody, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                doPostComplted = true;
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ret[0] = response.body().string();
                doPostComplted = true;
            }
        });
        while (!doPostComplted) {
        }
        return ret[0];
    }

    /**
     * https get
     *
     * @param address
     * @return
     */
    public static synchronized String doHttpsGet(String address) {
        final String[] ret = {null};
        doHttpsGetComplted = false;
        HttpUtil.sendHttps(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                doHttpsGetComplted = true;
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ret[0] = response.body().string();
                doHttpsGetComplted = true;

            }
        });
        while (!doHttpsGetComplted) {
        }
        return ret[0];
    }


}
