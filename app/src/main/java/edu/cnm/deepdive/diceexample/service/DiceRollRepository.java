package edu.cnm.deepdive.diceexample.service;

import io.reactivex.rxjava3.schedulers.Schedulers;

public class DiceRollRepository {

  private final DiceServiceProxy proxy = DiceServiceProxy.getInstance();

  public Single<Roll[]> rollDice(int numberOfDice, int numberOfSides) {
    return proxy.rollDice(numberOfDice, numberOfSides)
        .subscribeOn(Schedulers.io());
  }
}
