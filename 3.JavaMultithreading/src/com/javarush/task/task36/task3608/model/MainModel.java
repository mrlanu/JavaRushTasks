package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.dao.mock.DataSource;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.LinkedList;
import java.util.List;

public class MainModel implements Model {
    private  ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(userService.getUsersBetweenLevels(1,100));
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }
}
