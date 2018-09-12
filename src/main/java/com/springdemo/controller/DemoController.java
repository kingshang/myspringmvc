package com.springdemo.controller;

import com.springdemo.model.UserEntity;
import com.springdemo.model.assistorEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(UserEntity user) {
        return "login";
    }

    @RequestMapping(value = "/assistor", method = RequestMethod.GET)
    public ModelAndView assistor() {
        ModelAndView mv = new ModelAndView("assistor");
        return mv;
    }

    @RequestMapping(value = "/assistor", method = RequestMethod.POST)
    public ModelAndView assistor(@ModelAttribute assistorEntity assistor,Model model) throws IOException {
        File file = new File(assistor.getDir());
        String existsFiles = "";
        for (String subfile : file.list()) {
            String fullName = file.getPath() + "\\" + subfile;
            BufferedReader reader = new BufferedReader(new FileReader(fullName));
            StringBuilder content = new StringBuilder();
            String s;
            while ((s = reader.readLine()) != null) {
                content.append(s);
            }
            if (content.indexOf(assistor.getContext()) >= 0) {
                existsFiles += "<br>" + subfile;
            }
            assistor.setResult(existsFiles);
            assistor.setDir("");
        }
        if (existsFiles == "") {
            existsFiles = "content not found";
        }
        ModelAndView mv = new ModelAndView("assistor");
        mv.addObject("result", existsFiles);
        model.addAttribute("result", existsFiles);
        return mv;
    }

    private void sub() {

        //try {
        //加载Hibernate配置文件
        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(UserEntity.class);//该句不能漏掉
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        //实例化SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();


        UserEntity u = new UserEntity();
        u.setUserid(UUID.randomUUID().toString());
        u.setUsername("kingshang");
        u.setPassword("hello");
        DateTime date = new DateTime();
        Date d = new Date();
        d.getTime();
        u.setCreateTime(new Timestamp(d.getTime()));
        date = date.plusYears(1);
        u.setExpireTime(new Timestamp(d.getTime()));


        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        //} catch (Exception e) {
        //e.printStackTrace();
        //} finally {
        if (session != null) {
            session.close();
        }

        if (sessionFactory != null) {
            sessionFactory.close();
        }
        //}
    }

}