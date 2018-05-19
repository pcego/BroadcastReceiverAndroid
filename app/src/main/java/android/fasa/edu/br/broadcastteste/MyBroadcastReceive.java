package android.fasa.edu.br.broadcastteste;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

/**
 * Created by pcego on 16/05/18.
 */

public class MyBroadcastReceive extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Intent i = new Intent(context, MainActivity2.class);

        PendingIntent pi = PendingIntent.
                getActivity(context,0,i,0);

        NotificationCompat.Builder not =
                new NotificationCompat.Builder(context,null);

        not.setDefaults(Notification.DEFAULT_ALL);
        not.setSmallIcon(R.mipmap.ic_launcher);
        not.setContentTitle("Notificação");
        not.setContentText("Esta é uma notificação de teste");
        not.setContentIntent(pi);

        NotificationManagerCompat nm =
                NotificationManagerCompat.
                        from(context);

        nm.notify(1, not.build());

    }
}
