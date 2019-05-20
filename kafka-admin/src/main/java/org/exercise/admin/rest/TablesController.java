package org.exercise.admin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablesController {
    private static final String MAPPING_ADRESS = "/api/tables";

    @GetMapping(MAPPING_ADRESS + "-list")
    public String listTables()  {
        return "LIST TABLES KKKKKK";
    }
}
