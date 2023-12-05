package com.example.kepco.dao;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {
    @Autowired
    JdbcTemplate jt;
    public List<Map<String, Object>> select(){
        return jt.queryForList("select * from demo");
    }
    public void insert(String seq, String user){
        String sqlStmt = String.format("insert into demo(seq,user) values(%s,'%s')",seq,user);
        // System.out.println(sqlStmt);
        jt.execute(sqlStmt);
    }
    public List<Map<String,Object>> maxSeqSelect(){
        String sqlStmt = "select max(seq) as seq from demo";
        return jt.queryForList(sqlStmt);
    }
    public List<Map<String, Object>> totalCount(){
        String sqlStmt = "select count(*) as cnt from demo";
        return jt.queryForList(sqlStmt);
    }
}

// insert into demo(seq,user) values(7,KKK);