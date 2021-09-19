package de.beking.spring.tutorial.coaching;

import org.springframework.stereotype.Service;

@Service
public class UnhappyFortuneService implements FortuneService{

  @Override
  public String getFortune() {
    return "Today will be a bad day";
  }
}
