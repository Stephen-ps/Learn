package JavaBasic.Practice.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatMain {

    public static void main(String[] args) {
        printDate();
        formatDate();

    }

    private static void formatDate() {
        Date date = new Date(); //创建一个Date对象
        java.text.DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒"); //格式化打印时间的格式
        dateFormat.format(date); //把当前时间作为参数传递
        System.out.println(dateFormat.format(date));//打印按照指定格式规定的时间
    }

    public static void printDate() {
        //创建一个Date对象
        Date date = new Date();
        //获取从时间原点（1970年0：0：00）到当前系统日期的毫秒数
        long time = date.getTime();
        System.out.println(time); //1620023616405
        date = new Date(time); //把毫秒数转换成为日期
        System.out.println(date);
    }
}
