$(document).ready(function () {
    updateTweets();

    $("#js-sendtweet").on("click", function () {
        sendTweet();
        $("#js-sendtweet").val("");
    });
});

function sendTweet() {
    $input = $("#js-tweet-text");
    var text = $input.val();
    if (text.length == 0) {
        return;
    }
    $.ajax({
        url: "/tweets/add",
        type: "POST",
        data: {
            text: text,
            currUsername: f()
        },
        success: function () {
            updateTweets();
        }
    })
}

function updateTweets() {
    $.ajax({
        url:"/tweets/getAll",
        type:"GET",
        data: {
            currUsername: f()
        },
        dataType: "html",
        success: function(data) {
            $("#js-tweets").html(data);
        }
    })
}
