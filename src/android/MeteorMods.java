/**
 */
package com.meteor.webapp;

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

import okhttp3.HttpUrl;

public class MeteorMods extends CordovaPlugin {

	private WebAppLocalServer webAppLocalServer;

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		webAppLocalServer = (WebAppLocalServer)webView.getPluginManager().getPlugin("WebAppLocalServer");
	}

	/**
	 * Execute a javascript command
	 *
	 * @param	action				The command being executed
	 * @param	args				An array of arguments passed
	 * @param	callbackContext		A handle to communicate over the javascript bridge
	 */
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		if( action.equals("changeBackendUrl") ) {
			String url = args.getString(0);
			HttpUrl rootUrl = HttpUrl.parse(url);
			HttpUrl baseUrl = rootUrl.resolve("__cordova/");
			webAppLocalServer.getAssetBundleManager().checkForUpdates(baseUrl);

			final PluginResult result = new PluginResult(PluginResult.Status.OK, "Done.");
			callbackContext.sendPluginResult(result);
			return true;
		}

		return false;
	}

}