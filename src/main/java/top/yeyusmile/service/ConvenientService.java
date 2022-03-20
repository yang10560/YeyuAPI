package top.yeyusmile.service;

import top.yeyusmile.pojo.HistoryTody;

/**
 * 便民服务
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/16 15:14
 */
public interface ConvenientService {


    /**
     * 历史今天
     * https://api.heroa.cn:3403/convenience/history_today/
     */

    HistoryTody historyToday();

}
//
//    /**
//     *  60s读懂世界
//     *  https://api.heroa.cn:3403/convenience/sixty_second_read_world/
//     */
//
//    void SixtyReadWorld();
//
//
//    /**
//     *  舔狗日记
//     *  https://api.heroa.cn:3403/random/diary/
//     */
//
//    void diary();
//
//
//    /**
//     *  语录
//     *  https://api.heroa.cn:3403/random/quotation/
//     */
//
//    void quotation();
//
//
//    /**
//     * 看美女
//     *
//     * @param message
//     */
//    void lookGirl();
//
//
//    /**
//     * QQ凶吉
//     * @param qq
//     * @param message
//     */
//    void qqLucky(String qq, );
//
//
//    /**
//     * 绕口令
//     * @param message
//     */
//    void raokouling();
//
//
//    /**
//     * 笔话
//     * @param message
//     */
//    void joke();
//
//    /**
//     * 段子
//     * @param message
//     */
//    public void duanzi();
//
//
//    void weather(String weather);
//}
