package id.code.interviewtest.models.murid;

import id.code.interviewtest.dto.MuridDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MuridRepository extends JpaRepository<Murid, Long> {
}
