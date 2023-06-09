package org.arbitrary.web.app.service;

import lombok.RequiredArgsConstructor;
import org.arbitrary.web.app.model.Group;
import org.arbitrary.web.app.model.GroupInformation;
import org.arbitrary.web.app.repository.GroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    @Transactional
    public Group createGroup(GroupInformation info) {
        // Group info mapping
        Group group = Group.builder()
                .name(info.getName())
                .category(info.getCategory())
                .description(info.getDescription())
                .joinOpenPeriod(info.getJoinOpenPeriod())
                .joinOpenPeople(info.getJoinOpenPeople())
                .joinOpenTime(info.getJoinOpenTime())
                .place(info.getPlace())
                .cost(info.getCost())
                .withPet(info.getWithPet())
                .contactPoint(info.getContactPoint())
                .condition(info.getCondition())
                .freeInfo(info.getFreeInfo())
                .build();
        // Database save
        return groupRepository.save(group);
    }

    public Group getGroup(Long id) {
        return groupRepository.getById(id);
    }

    @Transactional
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }
}
