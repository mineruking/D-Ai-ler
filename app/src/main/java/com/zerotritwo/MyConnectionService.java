package com.zerotritwo;

import android.app.Service;
import android.net.Uri;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccountHandle;
import android.telephony.*;
import android.util.Log;

public class MyConnectionService extends Service {
    @Override
     public Connection onCreateOutgoingConnection(PhoneAccountHandle, ConnectionRequest);
}
