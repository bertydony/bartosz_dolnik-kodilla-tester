package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;
    private String listName = "First List";
    private String description = "Here find full description";

    @Test

    public void testFindByListName() {
        List<TaskList> readTasksList = null;

        try {
            TaskList taskList = new TaskList(listName, description);
            taskListRepository.save(taskList);
            listName = taskList.getListName();
            readTasksList = taskListRepository.findByListName(listName);
            Assertions.assertEquals(1, readTasksList.size());

        } finally {
            int id = readTasksList.get(0).getId();
            taskListRepository.deleteById(id);
        }
    }
}