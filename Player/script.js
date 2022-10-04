var video = document.querySelector('video');
var cutVideo = false;

video.ontimeupdate = ()=>{

    if(video.currentTime >= 2 && cutVideo == false){
        cutVideo = true;
        video.currentTime = 7;
        video.play();   
    }

}
