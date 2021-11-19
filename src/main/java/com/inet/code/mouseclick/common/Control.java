package com.inet.code.mouseclick.common;

import java.awt.*;

public class Control {
    public static Robot robot;

    public static Boolean flag;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


}
