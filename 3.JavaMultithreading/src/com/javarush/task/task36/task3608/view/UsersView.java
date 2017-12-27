package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.LinkedList;
import java.util.List;

public class UsersView implements View {
    private Controller controller;

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        List<User> user = modelData.getUsers();
        for (User us : user){
            System.out.println("\t" + us);
        }
        System.out.println("===================================================");
    }
}
