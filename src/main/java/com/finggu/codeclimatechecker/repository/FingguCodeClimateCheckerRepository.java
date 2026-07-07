package com.finggu.codeclimatechecker.repository;

import com.finggu.codeclimatechecker.model.FingguCodeClimateCheckResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FingguCodeClimateCheckerRepository extends JpaRepository<FingguCodeClimateCheckResult, Long> {

    List<FingguCodeClimateCheckResult> findByProjectName(String projectName);

}