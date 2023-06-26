package com.example.clientdemo;

import java.sql.Connection;
import java.util.List;

public interface IDao_group {
    List<Group> getAllGroups(Connection connection);
    Group getGroup(String name);
    void saveGroup();
    void deleteGroup();

}
