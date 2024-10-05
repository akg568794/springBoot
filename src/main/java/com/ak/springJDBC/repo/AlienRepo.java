package com.ak.springJDBC.repo;

import com.ak.springJDBC.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class AlienRepo {
    private JdbcTemplate template;
//
    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien){
        System.out.println("Added");
        String sql="insert into alien (id,name,tech) values(?,?,?)";
        template.update(sql,alien.getId(),alien.getName(),alien.getTech());

    }

    public List<Alien> findAll(){
        return new ArrayList<Alien>();
    }
}
