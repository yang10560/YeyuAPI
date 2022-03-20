package top.yeyusmile.pojo;

import java.util.List;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/16 15:18
 */
public class HistoryTody {

    private Integer state;

    List<HistoryInfo> information;

    public static class HistoryInfo {
        private String year;
        private String event;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        @Override
        public String toString() {
            return year + "年：" + event + '\n';
        }
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


    public List<HistoryInfo> getInformation() {
        return information;
    }

    public void setInformation(List<HistoryInfo> information) {
        this.information = information;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (HistoryInfo historyInfo : information) {
            sb.append(historyInfo.toString());
        }
        return sb.toString();
    }
}
