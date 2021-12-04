package com.example.application.notificationexample;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

//Because you must create the notification channel before
//posting any notifications on Android 8.0 and higher,
//you should execute this code as soon as your app starts.
//It's safe to call this repeatedly because creating an existing
//notification channel performs no operation.

//We dont know if we need this so well run it without it
public class App extends Application
{
    //Normal channel1 is what your calling it you normally want to call it what it is
    public static final String CHANNEL_1_ID = "channel1";
    public static final String CHANNEL_2_ID = "channel2";

    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannels();
    }

    private void createNotificationChannels()
    {
        //Check if your on oreo or higher
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID,
                    //This is going to be displayed in the notification
                    //so call it something that is relative to the notification
                    "Channel 1",
                    //Define the import / How importation  the notifacation
                    NotificationManager.IMPORTANCE_HIGH
            );
            //Once you call the channel1 varaible dot you will see tones of options to how to display the notification
            channel1.setDescription("This is Channel 1");

            NotificationChannel channel2 = new NotificationChannel(
                    CHANNEL_2_ID,
                    //This is going to be displayed in the notification
                    //so call it something that is relative to the notification
                    "Channel 2",
                    //Define the import / How importation  the notifacation
                    NotificationManager.IMPORTANCE_LOW
            );
            //Once you call the channel2 varaible dot you will see tones of options to how to display the notification
            channel2.setDescription("This is Channel 2");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
            manager.createNotificationChannel(channel2);

        }
    }
}
