Cordova Plugin Meteor Mods
======

This plugin allows us to do the following:

* Change the baseUrl that cordova-plugin-meteor-webapp will connect to in order to receive hot code pushes

## Usage

```javascript
MeteorMods.changeBackendUrl('https://newbackend.domain.com', function(result) {
	console.log(result);
});
````