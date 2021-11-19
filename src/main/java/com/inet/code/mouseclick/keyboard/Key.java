package com.inet.code.mouseclick.keyboard;

import java.awt.event.KeyEvent;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class Key {
    public  static Queue<Integer> queue=new ArrayDeque<>();


    public int getOneKey(String InputKey){
        switch (InputKey){
            case "0":
                return KeyEvent.VK_0;
            case "1":
                return KeyEvent.VK_1;
            case "2":
                return KeyEvent.VK_2;
            case "3":
                return KeyEvent.VK_3;
            case "4":
                return KeyEvent.VK_4;
            case "5":
                return KeyEvent.VK_5;
            case "6" :
                return KeyEvent.VK_6;
            case "7":
                return KeyEvent.VK_7;
            case "8":
                return KeyEvent.VK_8;
            case "9":
                return KeyEvent.VK_9;
            case "space":
                return KeyEvent.VK_SPACE;
            case "ctl":
                return KeyEvent.VK_CONTROL;
            case "win":
                return KeyEvent.VK_WINDOWS;
            case "alt":
                return KeyEvent.VK_ALT;
            case "shift":
                return KeyEvent.VK_SHIFT;
            case "A":
                return KeyEvent.VK_A;
            case "B":
                return KeyEvent.VK_B;
            case "C":
                return KeyEvent.VK_C;
            case "D":
                return KeyEvent.VK_D;
            case "E":
                return KeyEvent.VK_E;
            case "F":
                return KeyEvent.VK_F;
            case "G":
                return KeyEvent.VK_G;
            case "H":
                return KeyEvent.VK_H;
            case "I":
                return KeyEvent.VK_I;
            case "J":
                return KeyEvent.VK_J;
            case "K":
                return KeyEvent.VK_K;
            case "L":
                return KeyEvent.VK_L;
            case "M":
                return KeyEvent.VK_M;
            case "N":
                return KeyEvent.VK_N;
            case "O":
                return KeyEvent.VK_O;
            case "P":
                return KeyEvent.VK_P;
            case "Q":
                return KeyEvent.VK_Q;
            case "R":
                return KeyEvent.VK_R;
            case "S":
                return KeyEvent.VK_S;
            case "T":
                return KeyEvent.VK_T;
            case "U":
                return KeyEvent.VK_U;
            case "V":
                return KeyEvent.VK_V;
            case "W":
                return KeyEvent.VK_W;
            case "X":
                return KeyEvent.VK_X;
            case "Z":
                return KeyEvent.VK_Z;
            case "F1":
                return KeyEvent.VK_F1;
            case "F2":
                return KeyEvent.VK_F2;
            case "F3":
                return KeyEvent.VK_F3;
            case "F4":
                return KeyEvent.VK_F4;
            case "F5":
                return KeyEvent.VK_F5;
            case "F6":
                return KeyEvent.VK_F6;
            case "F7":
                return KeyEvent.VK_F7;
            case "F8":
                return KeyEvent.VK_F8;
            case "F9":
                return KeyEvent.VK_F9;
            case "F10":
                return KeyEvent.VK_F10;
            case "F11":
                return KeyEvent.VK_F11;
            case "F12":
                return KeyEvent.VK_F12;
        }
        return -1;
    }

    public Queue<Integer> getQueue(){
        return queue;
    }

    public void clearQueue(){
        queue.clear();
    }

    public Queue<Integer> getMoreKey(List<String> InputKey){
        queue.clear();
        int i=0;
        while(i<InputKey.size()){
            switch (InputKey.get(i)) {
                case "0":
                    queue.offer(KeyEvent.VK_0);
                    ++i;
                    break;
                case "1":
                    queue.offer(KeyEvent.VK_1);
                    ++i;
                    break;
                case "2":
                    queue.offer(KeyEvent.VK_2);
                    ++i;
                    break;
                case "3":
                    queue.offer(KeyEvent.VK_3);
                    ++i;
                    break;
                case "4":
                    queue.offer(KeyEvent.VK_4);
                    ++i;
                    break;
                case "5":
                    queue.offer(KeyEvent.VK_5);
                    ++i;
                    break;
                case "6":
                    queue.offer(KeyEvent.VK_6);
                    ++i;
                    break;
                case "7":
                    queue.offer(KeyEvent.VK_7);
                    ++i;
                    break;
                case "8":
                    queue.offer(KeyEvent.VK_8);
                    ++i;
                    break;
                case "9":
                    queue.offer(KeyEvent.VK_9);
                    ++i;
                    break;
                case "space":
                    queue.offer(KeyEvent.VK_SPACE);
                    ++i;
                    break;
                case "ctl":
                    queue.offer(KeyEvent.VK_CONTROL);
                    ++i;
                    break;
                case "win":
                    queue.offer(KeyEvent.VK_WINDOWS);
                    ++i;
                    break;
                case "alt":
                    queue.offer(KeyEvent.VK_ALT);
                    ++i;
                    break;
                case "shift":
                    queue.offer(KeyEvent.VK_SHIFT);
                    ++i;
                    break;
                case "A":
                    queue.offer(KeyEvent.VK_A);
                    ++i;
                    break;
                case "B":
                    queue.offer(KeyEvent.VK_B);
                    ++i;
                    break;
                case "C":
                    queue.offer(KeyEvent.VK_C);
                    ++i;
                    break;
                case "D":
                    queue.offer(KeyEvent.VK_D);
                    ++i;
                    break;
                case "E":
                    queue.offer(KeyEvent.VK_E);
                    ++i;
                    break;
                case "F":
                    queue.offer(KeyEvent.VK_F);
                    ++i;
                    break;
                case "G":
                    queue.offer(KeyEvent.VK_G);
                    ++i;
                    break;
                case "H":
                    queue.offer(KeyEvent.VK_H);
                    ++i;
                    break;
                case "I":
                    queue.offer(KeyEvent.VK_I);
                    ++i;
                    break;
                case "J":
                    queue.offer(KeyEvent.VK_J);
                    ++i;
                    break;
                case "K":
                    queue.offer(KeyEvent.VK_K);
                    ++i;
                    break;
                case "L":
                    queue.offer(KeyEvent.VK_L);
                    ++i;
                    break;
                case "M":
                    queue.offer(KeyEvent.VK_M);
                    ++i;
                    break;
                case "N":
                    queue.offer(KeyEvent.VK_N);
                    ++i;
                    break;
                case "O":
                    queue.offer(KeyEvent.VK_O);
                    ++i;
                    break;
                case "P":
                    queue.offer(KeyEvent.VK_P);
                    ++i;
                    break;
                case "Q":
                    queue.offer(KeyEvent.VK_Q);
                    ++i;
                    break;
                case "R":
                    queue.offer(KeyEvent.VK_R);
                    ++i;
                    break;
                case "S":
                    queue.offer(KeyEvent.VK_S);
                    ++i;
                    break;
                case "T":
                    queue.offer(KeyEvent.VK_T);
                    ++i;
                    break;
                case "U":
                    queue.offer(KeyEvent.VK_U);
                    ++i;
                    break;
                case "V":
                    queue.offer(KeyEvent.VK_V);
                    ++i;
                    break;
                case "W":
                    queue.offer(KeyEvent.VK_W);
                    ++i;
                    break;
                case "X":
                    queue.offer(KeyEvent.VK_X);
                    ++i;
                    break;
                case "Z":
                    queue.offer(KeyEvent.VK_Z);
                    ++i;
                    break;
                case "F1":
                    queue.offer(KeyEvent.VK_F1);
                    ++i;
                    break;
                case "F2":
                    queue.offer(KeyEvent.VK_F2);
                    ++i;
                    break;
                case "F3":
                    queue.offer(KeyEvent.VK_F3);
                    ++i;
                    break;
                case "F4":
                    queue.offer(KeyEvent.VK_F4);
                    ++i;
                    break;
                case "F5":
                    queue.offer(KeyEvent.VK_F5);
                    ++i;
                    break;
                case "F6":
                    queue.offer(KeyEvent.VK_F6);
                    ++i;
                    break;
                case "F7":
                    queue.offer(KeyEvent.VK_F7);
                    ++i;
                    break;
                case "F8":
                    queue.offer(KeyEvent.VK_F8);
                    ++i;
                    break;
                case "F9":
                    queue.offer(KeyEvent.VK_F9);
                    ++i;
                    break;
                case "F10":
                    queue.offer(KeyEvent.VK_F10);
                    ++i;
                    break;
                case "F11":
                    queue.offer(KeyEvent.VK_F11);
                    ++i;
                    break;
                case "F12":
                    queue.offer(KeyEvent.VK_F12);
                    ++i;
                    break;
                default:
                    ++i;
                    continue;
            }
        }
        return queue;
    }

}
