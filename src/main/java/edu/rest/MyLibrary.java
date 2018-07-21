package edu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/myapp")
public class MyLibrary {

//    @Autowired
    //  B b;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public MyVal doAdd(//@RequestParam("a") int a, @RequestParam("b") int b,
                                        @RequestParam Map<String, String> params) {
        int sum = 0;
        for (Map.Entry<String, String> stringStringEntry : params.entrySet()) {
            System.out.printf("%s=%s\n", stringStringEntry.getKey(), stringStringEntry.getValue());
            try {
                int i = Integer.parseInt(stringStringEntry.getKey());
                sum += i;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return new MyVal(sum, params.size());

//        return new ResponseEntity<>(new MyVal(sum), HttpStatus.OK);
    }


    //
//  MyVal  sum(@RequestBody MyParam p)

    @ExceptionHandler
    public void handler(Throwable e) {
        System.out.println(e);
    }
}
