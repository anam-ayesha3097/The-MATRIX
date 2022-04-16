var webSocket;

function init() {
    initWebSocket();

}

async function initWebSocket() {
            webSocket = new WebSocket("@routes.HomeController.ws(keyWord:String).webSocketURL(request)");
            console.log("WebSocket -> ",webSocket)
            webSocket.onopen = onOpen;
            webSocket.onclose = onClose;
            webSocket.onmessage = onMessage;
            webSocket.onerror = onError;
}