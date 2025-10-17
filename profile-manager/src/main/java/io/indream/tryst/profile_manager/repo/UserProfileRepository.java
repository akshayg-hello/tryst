package io.indream.tryst.profile_manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileDAO, String> {
}
