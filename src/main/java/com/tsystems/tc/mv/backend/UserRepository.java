package com.tsystems.tc.mv.backend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Repostitory zum Zugriff auf {@link User}.
 *
 * Wegen POC-Charakter ist nur die Methode zur Suche nach username bereitgestellt.
 *
 * @author Marco Grunert <marco.grunert@t-systems.com>
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository  extends PagingAndSortingRepository<User, Long> {
    List<User> findByUsernameIgnoreCaseContaining(@Param("username") String username);
}
