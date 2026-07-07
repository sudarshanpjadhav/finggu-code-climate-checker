package com.finggu.codeclimatechecker.service;

import com.finggu.codeclimatechecker.model.FingguCodeClimateCheckResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FingguCodeAnalysisService {

    public List<FingguCodeClimateCheckResult> getCodeAnalysisResult() {
        List<FingguCodeClimateCheckResult> results = new ArrayList<>();

        // Simulate code analysis result
        FingguCodeClimateCheckResult result = new FingguCodeClimateCheckResult("pass", "No issues found");
        results.add(result);

        return results;
    }

}