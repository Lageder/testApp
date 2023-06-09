package org.arbitrary.web.app.controller;

import lombok.RequiredArgsConstructor;
import org.arbitrary.web.app.model.Group;
import org.arbitrary.web.app.model.GroupInformation;
import org.arbitrary.web.app.service.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @PostMapping("/group")
    public ResponseEntity<Group> createGroup(@RequestBody GroupInformation info) {
        Group group = groupService.createGroup(info);
        return ResponseEntity.ok(group);
    }

    @DeleteMapping("/group/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        Group group = groupService.getGroup(id);
        if (group == null) {
            return ResponseEntity.notFound().build();
        }
        groupService.deleteGroup(id);
        return ResponseEntity.noContent().build();
    }

}