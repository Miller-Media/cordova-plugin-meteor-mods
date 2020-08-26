
var exec = require('cordova/exec');

var MeteorMods = {
	changeBackendUrl: function(url, cb) {
		exec(cb, null, 'MeteorMods', 'changeBackendUrl', [url]);
	}
};

module.exports = MeteorMods;
