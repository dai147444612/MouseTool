package com.inet.code.mouseclick.controller;

import com.inet.code.mouseclick.keyboard.Keyboard;
import com.inet.code.mouseclick.mouse.Mouse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CoreController {
    @Resource
    private Keyboard keyboard;
    @Resource
    private Mouse mouse;

   @GetMapping("OneKeyPress")
   public void OneKeyPress(@RequestParam String inputKey,@RequestParam Integer count,@RequestParam Long interval){
        if (interval==0){
            keyboard.keypress(inputKey,count);
        }else if (count==0){
            keyboard.keypress(inputKey,interval);
        }else {
            keyboard.keypress(inputKey,count,interval);
        }
   }

   @PostMapping("MoreKeyPress")
   public void MoreKeyPress(@RequestBody List<String> list){
       keyboard.keypress(list);
   }

    @GetMapping("MouseClick")
    public void MouseClick(@RequestParam int count,@RequestParam int MouseNum,@RequestParam Long interval){
        if (interval==0){
            mouse.click(count,MouseNum);
        }else if(count==0){
            mouse.click(MouseNum,interval);
        }else {
            mouse.click(count,MouseNum,interval);
        }
    }

}