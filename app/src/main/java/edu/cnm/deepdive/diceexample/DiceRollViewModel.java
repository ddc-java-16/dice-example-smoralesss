package edu.cnm.deepdive.diceexample;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import edu.cnm.deepdive.diceexample.model.Roll;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;

public class DiceRollViewModel extends AndroidViewModel {

private final MutableLiveData<Roll[]> diceRoll;
private final MutableLiveData<Throwable> throwable;
private final CompositeDisposable pending;
  public DiceRollViewModel(@NotNull Application application) {
    super(application);
    diceRoll = new MutableLiveData<>();
  }

  public LiveData<Roll[]> getDiceRoll() {
    return diceRoll;
  }
}
