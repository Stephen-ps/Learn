package Intro;

import java.lang.reflect.Method;

/**
 * @author Stephen
 * @date 2021-05-17 02:24
 **/
public class reflection {
    public static void main(String[] args) throws Exception {
        //反射：
        Class<?> aClass = Class.forName("Intro.WeChat");//new WeChat(),初始化
        System.out.println(aClass);
        Object weChatObj = aClass.getDeclaredConstructor().newInstance();//WeChat wechat = new WeChat();
        System.out.println(weChatObj);
        Method method = aClass.getMethod("payOnline");//method --> payOnline();//.payOnline
        method.invoke(weChatObj);//method --> o --> new WeChat() --> payOnline(); //wechat.payOnline
    }
}