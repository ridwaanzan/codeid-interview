package id.code.interviewtest.models.murid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuridRepository extends JpaRepository<Murid, Long> {
}
