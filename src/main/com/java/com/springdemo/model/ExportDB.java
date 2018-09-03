package com.springdemo.model;


import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * 将hbm生成ddl
 *
 * @author liang
 */
public class ExportDB {
    public static void main(String[] args) {
        //默认读取hibernate.cfg.xml文件
        Configuration cfg = new Configuration().configure();
        ////生成并输出sql到文件（当前目录）和数据库
        SchemaExport export = new SchemaExport();
        export.create(true, true);
    }
}