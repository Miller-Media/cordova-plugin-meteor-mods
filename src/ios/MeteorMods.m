#import "MeteorMods.h"

#import <Cordova/CDVAvailability.h>

@implementation MeteorMods

- (void)pluginInitialize {
}

- (void)changeBackendUrl:(CDVInvokedUrlCommand *)command {
	NSString* url = [command.arguments objectAtIndex:0];
	CDVPluginResult *result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:url];
	[self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
