package jp.techacademy.toduka.atsushi.broadcastreceiver
import android.widget.Toast
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class TimezoneBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        Toast.makeText(context, "タイムゾーンが変化しました", Toast.LENGTH_LONG).show()
    }
}
