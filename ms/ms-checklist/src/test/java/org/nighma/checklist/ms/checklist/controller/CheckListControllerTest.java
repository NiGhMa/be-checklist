package org.nighma.checklist.ms.checklist.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.nighma.checklist.ms.checklist.controller.ChecklistController;

public class CheckListControllerTest {

    @Test
    public void getAll() {
        ChecklistController ctrl = new ChecklistController();
        String response = ctrl.getAll();
        assertEquals(response, "La liste des checklists");

    }
}
