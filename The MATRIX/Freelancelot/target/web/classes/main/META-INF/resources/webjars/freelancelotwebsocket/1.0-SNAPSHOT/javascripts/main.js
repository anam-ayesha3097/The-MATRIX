$(document).ready(function() {
    var url = $("#webSocketData").data("ws-url");
    ws = new WebSocket(url);
    ws.onmessage = function(event) {
        message= JSON.parse(event.data);
        json = message.data;
        obj = JSON.parse(json);
        keyword = obj.keyword;
        if ($('#'+keyword).length==0){
            createDiv(keyword);
        }
        updateDiv(keyword,obj.tweet);
    }

    $('#searchForm').on('submit', function(e) {
        e.preventDefault();
        console.log("capturing form submission");
        ws.send(JSON.stringify({
            keyword : $("#keyword").val()
        }));
        $("#keyword").val("");
    });

});

function updateDiv(keyword,tweet){
    $('#'+keyword).find('p').empty();
    var innerHtml="<ol>";
    tweet.forEach( function(item) {
        innerHtml+="<li><a target='_blank' href='user?screenName="+item.screenName+"'>"+item.screenName+"</a><span>"+item.tweet+"</span></li>";
    });
    innerHtml+="</ol>";
    $('#'+keyword).find('p').append(innerHtml);
}

function createDiv(keyword){
    $(".card").clone().attr('id', keyword).appendTo("#data");
    $('#'+keyword).show();
    $('#'+keyword).find('h4').text('Keyword: '+keyword);

}