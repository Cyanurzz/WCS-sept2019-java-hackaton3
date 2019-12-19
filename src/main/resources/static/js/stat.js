var i = 0;

var counterBack = setInterval(function () {
  i++;
  if (i < 100) {
    $('.progress-bar').css('width', i + '%');
  } else {
    clearInterval(counterBack);
  }

}, 100);