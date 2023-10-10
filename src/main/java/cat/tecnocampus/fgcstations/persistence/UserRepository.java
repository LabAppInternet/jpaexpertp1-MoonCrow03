package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.FavoriteJourney;
import cat.tecnocampus.fgcstations.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);

    List<User> getUsers();

    boolean existsUser(String username);
}
