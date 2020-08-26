
var exec = require('cordova/exec');

var MeteorMods = {
	changeBackendUrl: function(url, cb) {
		var checkForUpdates = function(result) {
			WebAppLocalServer.checkForUpdates();
			if (typeof cb === 'function') {
				cb(result);
			}
		};

		exec(checkForUpdates, null, 'MeteorMods', 'changeBackendUrl', [url]);
	}
};

module.exports = MeteorMods;
