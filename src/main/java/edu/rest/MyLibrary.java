package edu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/myapp")
public class MyLibrary {

    @Autowired
    B b;

    @GetMapping("sum")
    @ResponseBody
    public int doAdd(@RequestParam("a") int a, @RequestParam("b") int b) {
        return  a + b;
    }

    @ExceptionHandler
    public void handler(Throwable e){
        System.out.println(e);
    }
}
