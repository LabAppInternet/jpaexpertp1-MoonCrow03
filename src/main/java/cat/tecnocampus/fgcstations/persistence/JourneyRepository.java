package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.Journey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<Journey, String> {
    int saveJourney(Journey journey);

    String getJourneyId(Journey journey);

    Journey findJourney(String journeyId);
}
