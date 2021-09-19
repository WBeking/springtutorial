package de.beking.spring.tutorial.coaching;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HappyBasketballCoach implements Coach{

  private final FortuneService fortuneService;

  public HappyBasketballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyExercise() {
    return "Practice free throws";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
