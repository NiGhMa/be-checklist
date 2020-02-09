package org.nighma.checklist.ms.checklist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChecklistController {

    @RequestMapping(value="/checklists", method= RequestMethod.GET)
    public String getAll() {
        return "La liste des checklists";
    }
}
