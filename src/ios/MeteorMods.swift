@objc(MeteorMods)
class MeteorMods : CDVPlugin {
    @objc func changeBackendUrl(_ command: CDVInvokedUrlCommand) {
        let url = command.arguments[0] as? String ?? ""
        let configuration = WebAppConfiguration()
        configuration.rootURL = URL(string: url)
        
        let pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK,
            messageAs: "Done."
        )

        self.commandDelegate?.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }
}