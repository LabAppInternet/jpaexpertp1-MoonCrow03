package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.FavoriteJourney;
import cat.tecnocampus.fgcstations.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StationRepository extends JpaRepository<Station, String> {
    List<Station> findAll();

    Station findByName(String nom);
}
