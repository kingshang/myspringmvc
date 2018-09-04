package com.springdemo.controller;

import com.springdemo.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/demo")
class DemoController {

    @RequestMapping("/index")
    public ModelAndView index() {
        //try {
        //加载Hibernate配置文件
        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(UserEntity.class);//该句不能漏掉
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        //实例化SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        Session session = null;
            session = sessionFactory.openSession();


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
        ModelAndView mv = new ModelAndView("demo");
        return mv;
    }

    @RequestMapping("/helloworld")
    public ModelAndView helloworld() {
        ModelAndView mv = new ModelAndView("helloworld");
        return mv;
    }
}