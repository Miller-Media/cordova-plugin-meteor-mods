#import <Cordova/CDVPlugin.h>

@interface MeteorMods : CDVPlugin {
}

// The hooks for our plugin commands
- (void)changeBackendUrl:(CDVInvokedUrlCommand *)command;

@end
