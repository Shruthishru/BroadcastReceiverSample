package app.sample.wallpaper.broadcastreceiversample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by shruthi on 19/4/18.
 */

public class ReceiverClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent detected", Toast.LENGTH_SHORT).show();
    }
}
