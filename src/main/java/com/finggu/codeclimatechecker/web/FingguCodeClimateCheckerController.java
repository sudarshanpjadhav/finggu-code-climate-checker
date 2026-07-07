package com.finggu.codeclimatechecker.web;

import com.finggu.codeclimatechecker.model.FingguCodeClimateCheckResult;
import com.finggu.codeclimatechecker.service.FingguCodeAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FingguCodeClimateCheckerController {

    @Autowired
    private FingguCodeAnalysisService codeAnalysisService;

    @GetMapping("/code-analysis")
    public List<FingguCodeClimateCheckResult> getCodeAnalysisResult() {
        return codeAnalysisService.getCodeAnalysisResult();
    }

}