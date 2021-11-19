package com.inet.code.mouseclick.mouse;

import com.inet.code.mouseclick.common.Control;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.InputEvent;

@Service
public class Mouse {
    private static Robot robot;
    /**
     * 构造
     */
    public Mouse(){
        robot=Control.robot;
    }

    /**
     * 单击count次的
     *  1为左键
     *  2为滚轮
     *  3为右键
     */
    public void click(int count,int mouseNum){
        int i=0;
        int num = 0;
        switch (mouseNum){
            case 1:
                num=InputEvent.BUTTON1_DOWN_MASK;
                break;
            case 2:
                num=InputEvent.BUTTON2_DOWN_MASK;
                break;
            case 3:
                num=InputEvent.BUTTON3_DOWN_MASK;
            default:
                new Exception("输入无效");
        }
        while(i<count) {
            robot.mousePress(num);
            robot.mouseRelease(num);
            ++i;
        }
    }

    /**
     * 鼠标interval/1000秒点击一次
     * @param mouseNum
     * @param interval
     */
    public void click(int mouseNum,long interval){
        int num = 0;
        switch (mouseNum){
            case 1:
                num=InputEvent.BUTTON1_DOWN_MASK;
                break;
            case 2:
                num=InputEvent.BUTTON2_DOWN_MASK;
                break;
            case 3:
                num=InputEvent.BUTTON3_DOWN_MASK;
                break;
            default:
                new Exception("输入无效");
        }
        Control.flag=true;
        while(Control.flag) {
            robot.mousePress(num);
            robot.mouseRelease(num);
            robot.delay((int) interval);
        }
    }

    /**
     * 共点击count次，每interval/1000秒点一次
     * @param count
     * @param mouseNum
     * @param interval
     */
    public void click(int count,int mouseNum,long interval){
        int i=0;
        int num = 0;
        switch (mouseNum){
            case 1:
                num=InputEvent.BUTTON1_DOWN_MASK;
                break;
            case 2:
                num=InputEvent.BUTTON2_DOWN_MASK;
                break;
            case 3:
                num=InputEvent.BUTTON3_DOWN_MASK;
            default:
                new Exception("输入无效");
        }
        while(i<count){
            robot.mousePress(num);
            robot.mouseRelease(num);
            robot.delay((int) interval);
            ++i;
        }
    }






}
