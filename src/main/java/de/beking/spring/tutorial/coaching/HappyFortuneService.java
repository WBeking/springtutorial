package de.beking.spring.tutorial.coaching;

import org.springframework.stereotype.Service;

@Service
public class HappyFortuneService implements FortuneService{

  @Override
  public String getFortune() {
    return "Today will be your lucky day";
  }
}
