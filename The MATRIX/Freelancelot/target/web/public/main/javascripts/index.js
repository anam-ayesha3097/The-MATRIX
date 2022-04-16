(function() {
    $(function() {
        var ws;
        ws = new WebSocket($("body").data("ws-url"));
        return ws.onmessage = function(event) {
            var message;
            //document.write(event.data);
            message = JSON.parse(event.data);
            console.log("WebSocket Response ->", event.data)
            //document.write(JSON.stringify(message, null,4));
            return $('#search').append(message + "<br/>");
        };
    });

}).call(this);