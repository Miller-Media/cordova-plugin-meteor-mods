/**
 */
package com.millermedia;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class MeteorMods extends CordovaPlugin {

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	}

	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		if( action.equals("changeBackendUrl") ) {
			String phrase = args.getString(0);
			final PluginResult result = new PluginResult(PluginResult.Status.OK, url);
			callbackContext.sendPluginResult(result);
		}

		return true;
	}

}
