package org.nighma.checklist.ms.checklist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChecklistController {

    @GetMapping(value = "/checklists")
    public String getAll() {
        return "La liste des checklists";
    }
}
