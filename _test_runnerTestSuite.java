import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
// Add imports here
import static org.junit.jupiter.api.Assertions.*;


public class _test_runnerTestSuite {

  @Test
  public void getNumberOfCloudsReturnsTwoClouds() {
      int[][] sky = {
        { 9, 8, 7, 4, 4, 3, 3, 2, 5, 9 },
        { 6, 6, 2, 3, 4, 4, 7, 8, 8, 9 },
        { 8, 7, 7, 8, 9, 9, 7, 7, 6, 5 },
        { 8, 4, 4, 3, 8, 8, 9, 9, 8, 7 },
        { 5, 4, 3, 2, 8, 8, 9, 8, 8, 7 }
      };
    
      int numberOfClouds = CloudsInTheSky.getNumberOfClouds(sky);
      assertEquals(2, numberOfClouds);
    
  }

  @Test
  public void getNumberOfCloudsReturnsThreeClouds() {
      int[][] sky = {
        {9, 9, 5, 2},
        {8, 8, 1, 5},
        {8, 8, 8, 8},
        {9, 9, 9, 4}
      };
    
      int numberOfClouds = CloudsInTheSky.getNumberOfClouds(sky);
      assertEquals(3, numberOfClouds);
    
  }

}