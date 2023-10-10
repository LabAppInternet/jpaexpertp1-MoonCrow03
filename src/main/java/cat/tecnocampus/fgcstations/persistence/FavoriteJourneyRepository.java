package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.FavoriteJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteJourneyRepository extends JpaRepository<FavoriteJourney, String> {
    void saveFavoriteJourney(FavoriteJourney favoriteJourney, String username);

    @Query("select * from favorite_journey where user=?1")
    List<FavoriteJourney> findFavoriteJourneys(String username);
}
