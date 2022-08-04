package org.example.dao;

import org.example.domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private static JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(final User user) {
        String sql = "INSERT INTO userdata (name, email, nid, birthdate, bloodgroup, phone, address, usertype, gender, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                //ps.setInt(1, user.getNid());
                ps.setString(1, user.getName());
                ps.setString(2, user.getEmail());
                ps.setString(3, user.getNid());
                ps.setString(4, user.getBirthdate());
                ps.setString(5, user.getBloodgroup());
                ps.setString(6, user.getPhone());
                ps.setString(7, user.getAddress());
                ps.setString(8, user.getUsertype());
                ps.setString(9, user.getGender());
                ps.setString(10, user.getPassword());
                return ps.execute();
            }
        });
    }

    public List<User> getAll() {
        return this.jdbcTemplate.query("SELECT name, email, nid, birthdate, bloodgroup, phone, address, usertype, gender, password FROM my_app.userdata",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return getUser(rs);
                    }
                });
    }

    public User validation(User user) {

        return this.jdbcTemplate.queryForObject(
                "select email  from my_app.userdata where email = '" + user.getEmail() + "' and password = '" + user.getPassword() + "'",
                (resultSet, rowNum) -> {
                    User reverie = new User();
                    reverie.setEmail(resultSet.getString("email"));
                    return reverie;
                });
    }


    public static User validationByEmail(String email) {

/*
        return (User) this.jdbcTemplate.query("SELECT name, email, nid, birthdate, bloodgroup, phone, address, usertype, gender, password FROM my_app.userdata",
                (RowMapper<User>) (rs, rowNum) -> {
                    User user2 = new User();
                    //user.setNid(rs.getInt("nid"));
                    user2.setName(rs.getString("name"));
                    user2.setEmail(rs.getString("email"));
                    user2.setNid(rs.getString("nid"));
                    user2.setBirthdate(rs.getString("birthdate"));
                    user2.setBloodgroup(rs.getString("bloodgroup"));
                    user2.setPhone(rs.getString("phone"));
                    user2.setAddress(rs.getString("address"));
                    user2.setUsertype(rs.getString("usertype"));
                    user2.setGender(rs.getString("gender"));
                    user2.setPassword(rs.getString("password"));
                    return user2;
                });
        */


        return jdbcTemplate.queryForObject(
                "select name, email, nid, birthdate, bloodgroup, phone, address, usertype, gender, password from my_app.userdata where email = '" + email + "'",
                (rs, rowNum) -> {
                    return getUser(rs);
                });
    }

    private static User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setNid(rs.getString("nid"));
        user.setBirthdate(rs.getString("birthdate"));
        user.setBloodgroup(rs.getString("bloodgroup"));
        user.setPhone(rs.getString("phone"));
        user.setAddress(rs.getString("address"));
        user.setUsertype(rs.getString("usertype"));
        user.setGender(rs.getString("gender"));
        user.setPassword(rs.getString("password"));
        return user;
    }


    public static void updateUser(User user) {
        jdbcTemplate.update("update my_app.userdata set name =  ?,nid = ?, phone = ?, address = ?, password = ? where email = ?", user.getName(),user.getNid(), user.getPhone(), user.getAddress(), user.getPassword(), user.getEmail());
    }

/*

    public void updateUser(User user) {
        jdbcTemplate.update("update users set username =  ?,email = ?, phone = ?, age = ?, bloodgroup = ? where user_id = ?", user.getUserName(),
                 user.getEmail(), user.getPhone(), user.getAge(), user.getBg(), user.getUserId());
    }

    public User validation(User user) {

        return this.jdbcTemplate.queryForObject(
                "select user_id  from users where username = '" + user.getUserName() + "' and password = '" + user.getPassword() + "'",
                (resultSet, rowNum) -> {
                    User recieve = new User();
                    recieve.setEmail(resultSet.getString("email"));
                    return recieve;
                });
    }

*/



}
//`name`, `email`, `nid`, `birthdate`, `bloodGroup`, `phone`, `address`, `usertype`, `gender`, `password`