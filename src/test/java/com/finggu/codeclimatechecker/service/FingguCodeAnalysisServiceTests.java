package com.finggu.codeclimatechecker.service;

import com.finggu.codeclimatechecker.model.FingguCodeClimateCheckResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FingguCodeAnalysisServiceTests {

    @Test
    public void testGetCodeAnalysisResult() {
        FingguCodeAnalysisService service = new FingguCodeAnalysisService();
        List<FingguCodeClimateCheckResult> results = service.getCodeAnalysisResult();

        assertEquals(1, results.size());
    }

}