package com.fc.study.controller;

import com.fc.study.entity.Greeting;
import com.fc.study.entity.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/index")
    public String index(Model model) {
        Person single = new Person("aa", 11);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        // 向页面添加参数映射
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    /**
     * 使用get方法获取页面
     * @param model
     * @return
     */
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    /**
     * 使用post获取页面提交的数据
     * @param greeting
     * @return
     */
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        long id = greeting.getId();
        String content = greeting.getContent();
        System.out.println(">>:" + id + "--" + content);
        return "result";
    }

}
