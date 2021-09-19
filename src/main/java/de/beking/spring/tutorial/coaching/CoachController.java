package de.beking.spring.tutorial.coaching;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

  private final Coach happyCoach;
  private final Coach unhappyCoach;

  public CoachController(@Qualifier("happyBasketballCoach") Coach happyCoach, @Qualifier("unhappyBasketballCoach") Coach unhappyCoach) {
    this.happyCoach = happyCoach;
    this.unhappyCoach = unhappyCoach;
  }

  @GetMapping("/coach/happy/exercise")
  public String getHappyCoachExercise() {
    return happyCoach.getDailyExercise();
  }

  @GetMapping("/coach/happy/fortune")
  public String getHappyCoachFortune() {
    return happyCoach.getDailyFortune();
  }

  @GetMapping("/coach/unhappy/exercise")
  public String getUnhappyCoachExercise() {
    return unhappyCoach.getDailyExercise();
  }

  @GetMapping("/coach/unhappy/fortune")
  public String getUnhappyCoachFortune() {
    return unhappyCoach.getDailyFortune();
  }
}
