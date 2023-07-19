package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // Given
        String listName = "Test List";
        String description = "This is a test list";
        TaskList taskList = new TaskList(listName, description);
        taskListRepository.save(taskList);

        // When
        List<TaskList> foundLists = taskListRepository.findByListName(listName);

        // Then
        Assertions.assertEquals(1, foundLists.size());
        Assertions.assertEquals(listName, foundLists.get(0).getListName());
        Assertions.assertEquals(description, foundLists.get(0).getDescription());

        // CleanUp
        int id = foundLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}