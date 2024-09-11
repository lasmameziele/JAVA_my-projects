package com.datorium.Datorium.API.Repo;

import com.datorium.Datorium.API.DTOs.User;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static final String DB_URL = "jdbc:sqlite:my.db";

    public void add(User user) {
        try (var conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                var statement = conn.createStatement();
                statement.execute("INSERT INTO people (name) VALUES ('" + user.getName() + "')");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public List<User> get() {
        var resultList = new ArrayList<User>();
        try (var conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                var statement = conn.createStatement();
                var result = statement.executeQuery("SELECT id, name FROM people");

                while (result.next()) {
                    var user = new User();
                    user.setId(result.getInt("id"));
                    user.setName(result.getString("name"));
                    resultList.add(user);
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultList;
    }

    public User update(User user) {
        try (var conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                var statement = conn.createStatement();
                statement.execute("UPDATE people SET name = '" + user.getName() + "' WHERE id = " + user.getId());
                return user;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null; // Return null if update fails
    }
}
