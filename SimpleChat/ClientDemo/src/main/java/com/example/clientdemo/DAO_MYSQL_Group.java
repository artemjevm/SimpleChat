package com.example.clientdemo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class DAO_MYSQL_Group implements IDao_group{
    private static final String URL = "jdbc:mysql://localhost:3306/chat_bd";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    private static boolean ResultConnection;

    public String getConnectionResult(){
        if (ResultConnection)
            return  "Есть подключение";
        else
            return "Не удалось подключиться";
    }

    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Есть подключение");
        } catch (SQLException e){
            System.out.println("Ошибка подключения");
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to close the connection.");
            e.printStackTrace();
        }
    }

    @Override
    public List<Group> getAllGroups(Connection connection) {
        List<Group> result = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM groups";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()){
                Group group = new Group();
                group.setIdGroup(resultSet.getInt("ID"));
                group.setNameGroup(resultSet.getString("NameGroup"));
                result.add(group);
            }
            resultSet.getStatement().close();
            resultSet.close();
            connection.close();
            return result;
        } catch (SQLException e){
            System.out.println("Ошибка чтения");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Group getGroup(String name) {
        return null;
    }

    @Override
    public void saveGroup() {

    }

    @Override
    public void deleteGroup() {

    }
}
