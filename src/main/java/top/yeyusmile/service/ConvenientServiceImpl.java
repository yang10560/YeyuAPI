package top.yeyusmile.service;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yeyusmile.pojo.*;
import top.yeyusmile.utils.HttpUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/16 15:15
 */
@Slf4j
@Service
public class ConvenientServiceImpl implements ConvenientService {

}
//
//    @Override
//    public HistoryTody historyToday() {
//        //this.myQQMessage = message;
//        String url = "https://api.heroa.cn:3403/convenience/history_today/";
//
//        HistoryTody historyTody = new Gson().fromJson(HttpUtil.doHttpsGet(url), HistoryTody.class);
//        return historyTody;
//    }
//}
//        HttpUtil.sendHttps(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                // System.out.println(response.body().string());
//                HistoryTody historyTody = new Gson().fromJson(response.body().string(), HistoryTody.class);
//                sendMsgService.sendMsg(historyTody.toString(), message);
//            }
//        });
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
//    }
//
//    @Override
//    public synchronized void SixtyReadWorld() {
//        //this.myQQMessage = message;
//        String url = "https://api.heroa.cn:3403/convenience/sixty_second_read_world/";
//        HttpUtil.sendHttps(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                // System.out.println(response.body().string());
//                SixtyReadWorld sixtyReadWorld = new Gson().fromJson(response.body().string(), SixtyReadWorld.class);
//                sendMsgService.sendMsg(sixtyReadWorld.toString(), message);
//            }
//        });
//    }
//
//
//    @Override
//    public void diary() {
//        //this.myQQMessage = message;
//        String url = "https://api.heroa.cn:3403/random/diary/";
//        HttpUtil.sendHttps(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                // System.out.println(response.body().string());
//                CommonResult commonResult = new Gson().fromJson(response.body().string(), CommonResult.class);
//                sendMsgService.sendMsg(commonResult.toString(), message);
//            }
//        });
//    }
//
//    @Override
//    public synchronized void  quotation() {
//        //this.myQQMessage = message;
//        String url = "https://api.heroa.cn:3403/random/quotation/";
//        HttpUtil.sendHttps(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                // System.out.println(response.body().string());
//                CommonResult commonResult = new Gson().fromJson(response.body().string(), CommonResult.class);
//                sendMsgService.sendMsg(commonResult.toString(), message);
//
//            }
//        });
//    }
//
//    @Override
//    public void lookGirl() {
//        //this.myQQMessage = message;
//        String url = "http://qxu66.xyz/api/kmt.php";
//        HttpUtil.sendOkHttpRequest(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                String picUrl = response.body().string();
//                Map<String, Object> map = sendMsgService.uploadPic(picUrl, message);
//                sendMsgService.sendMsg((String) ((Map) map.get("data")).get("ret"), message);
//            }
//        });
//    }
//
//    @Override
//    public void qqLucky(String qq, ) {
//        //this.myQQMessage = message;
//        String url = "http://qxu66.xyz/api/qq_xj.php?qq=" + qq;
//        HttpUtil.sendOkHttpRequest(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                String retStr = response.body().string();
//                QQLucky qqLucky = new Gson().fromJson(retStr, QQLucky.class);
//                sendMsgService.sendMsg(qqLucky.getData().toString(), message);
//            }
//        });
//    }
//
//    @Override
//    public void raokouling() {
//        //this.myQQMessage = message;
//        String url = "http://qxu66.xyz/api/rkl.php";
//        HttpUtil.sendOkHttpRequest(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                String retStr = response.body().string();
//                sendMsgService.sendMsg(retStr, message);
//            }
//        });
//    }
//
//    @Override
//    public void joke() {
//        //this.myQQMessage = message;
//        String url = "http://111.229.174.142:12345/query=&type=xiaohua";
//        HttpUtil.sendOkHttpRequest(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                String retStr = response.body().string();
//                sendMsgService.sendMsg(retStr, message);
//            }
//        });
//    }
//
//    @Override
//    public void duanzi() {
//        //this.myQQMessage = message;
//        String url = "http://111.229.174.142:12345/query=&type=duanzi";
//        HttpUtil.sendOkHttpRequest(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                String retStr = response.body().string();
//                sendMsgService.sendMsg(retStr, message);
//            }
//        });
//    }
//
//    @Override
//    public void weather(String weather, ) {
//        //this.myQQMessage = message;
//        String url = null;
//        try {
//            url = "http://111.229.174.142:12345/query=" + URLEncoder.encode(weather, "utf-8") + "&type=weather1";
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        HttpUtil.sendOkHttpRequest(url, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//               log.info(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                String retStr = response.body().string().replaceAll("var dataSK=", "");
//                if(!"失败".equals(retStr)){
//                    Weather w = new Gson().fromJson(retStr, Weather.class);
//                    sendMsgService.sendMsg(w.toString(), message);
//                }
//            }
//        });
//    }
//}
