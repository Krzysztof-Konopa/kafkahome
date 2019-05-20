package org.exercise.client.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TableService.class})
public class TableServiceTest {

    @Autowired
    private TableService tableService;

    @Test
    public void getTableTest() throws Exception {
        System.out.println("Test result: " + tableService.getTableList());
    }
}
