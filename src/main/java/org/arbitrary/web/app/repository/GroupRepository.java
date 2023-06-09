package org.arbitrary.web.app.repository;

import org.arbitrary.web.app.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    // Additional custom query methods can be defined here if needed
}
