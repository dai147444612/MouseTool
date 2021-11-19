package com.inet.code.mouseclick.keyboard;

import com.inet.code.mouseclick.common.Control;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class Keyboard {
    private static Robot robot;
    private static Key key;

    static {
        robot= Control.robot;
        key=new Key();
    }

    /**
     * 执行一个按键
     * @param inputKey
     */
    public void keypress(String inputKey){
        keypress(inputKey,1);
    }

    /**
     * 执行count次按键
     * @param inputKey
     */
    public void keypress(String inputKey,int count) {
        int oneKey = key.getOneKey(inputKey);
        int i = 0;
        while (i < count){
            robot.keyPress(oneKey);
            robot.keyRelease(oneKey);
            ++i;
        }
    }

    /**
     * 每隔interval秒执行一次按键，共执行count次
     * @param inputKey
     */
    public void keypress(String inputKey,int count,long interval){
        int oneKey = key.getOneKey(inputKey);
        int i=0;
        while(i<count) {
            robot.keyPress(oneKey);
            robot.keyRelease(oneKey);
            robot.delay((int) interval);
            ++i;
        }
    }

    /**
     * 每隔interval秒执行一次按键
     * @param inputKey
     */
    public void keypress(String inputKey,long interval){
        Control.flag=true;
        int oneKey = key.getOneKey(inputKey);
        int i=0;
        while(Control.flag) {
            robot.keyPress(oneKey);
            robot.keyRelease(oneKey);
            robot.delay((int) interval);
            ++i;
        }
    }


    /**
     * 在执行多个按键前要先清空
     */
    public void clear(){
        key.clearQueue();
    }

    /**
     * 执行多个按键
     * @param inputKey
     */
    public void keypress(List<String> inputKey){
        if (key.getQueue().peek()==null){
            key.getMoreKey(inputKey);
        }
        while(key.getQueue().peek()!=null){
            robot.keyPress(key.getQueue().peek());
            robot.keyRelease(key.getQueue().poll());
        }
    }

}