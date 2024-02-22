package com.ssandyy.springjdbcdemo;

import com.ssandyy.springjdbcdemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class AlienDao {
    private JdbcTemplate template;
    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }


    public void save(Alien alien){
        String sql = "insert into alien (id, name, technology) values(?,?,?)";
        int rows = template.update(sql, alien.getId(), alien.getName(), alien.getTechnology()); //executeupdate

        System.out.println("data added and "+rows+" rows added sucessfully");
    }

    public List<Alien> findAll(){
        String sql = "SELECT * FROM alien";
        /*RowMapper<Alien> rowMapper = new RowMapper<Alien>() {
            @Override
            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setTechnology(rs.getString(3));


                return a;
            }*/

            // OR via Lambda expression
            /*RowMapper<Alien> rowMapper = (ResultSet rs, int rowNum)-> {
                    Alien a = new Alien();
                    a.setId(rs.getInt(1));
                    a.setName(rs.getString(2));
                    a.setTechnology(rs.getString(3));
                    return a;};
        List<Alien> aliens = template.query(sql, rowMapper);
        return aliens;*/

        List<Alien> aliens = template.query(sql, (rs, rows)-> {
            Alien a = new Alien();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setTechnology(rs.getString(3));
            return a;});
        return aliens;
    }
}
