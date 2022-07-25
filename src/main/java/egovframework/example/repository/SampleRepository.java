package egovframework.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import egovframework.example.domain.Sample;

public interface SampleRepository extends JpaRepository<Sample, String> {

}
