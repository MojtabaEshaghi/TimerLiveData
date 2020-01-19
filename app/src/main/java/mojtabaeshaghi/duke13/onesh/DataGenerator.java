package mojtabaeshaghi.duke13.onesh;

import android.os.CountDownTimer;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataGenerator extends ViewModel {
    private int ti = 10000;
    private MutableLiveData<String> time;


    public MutableLiveData<String> getTime() {
        if (time == null) {
            time = new MutableLiveData<>();

        }
        return time;
    }

    public void startTimer() {
        new CountDownTimer(ti, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
               time.setValue(millisUntilFinished/1000+"");
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
