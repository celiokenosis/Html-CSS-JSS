/*Quando o documento estiver carregando*/

   /*
        var el = $('.box')

        el.html('<div class="teste">Meu Elemento!</div>');

        $('.box2').text("<div></div>");
        $('.box2').text($('.box2').text()+ "Olá Mundo!");

        $('input[type=text]').val("Olá Mundo!");

        $('textarea').text("Olá Mundo também via textarea");
    */

        /*Funções de string*/
        $('input[type=button]').click(function(){
            var str = $('input[type=text]').val();

            //Faz o split da string com base num caracter definido
            //console.log(str.split("@"));

            //Recorta a string com base num inicio e número de caracteres
            //console.log(str.substr(0,4));

            /*
            var splitstr = str.split("@");

            if (splitstr[1] == 'hotmail.com'){
                $('input[type=text]').css('opacity','0');
            }else{
                console.log("A condição não bateu!");
            }
            */

            console.log(str);
            console.log(str.trim());

        })
        
    $(function(){
        alert("Olá Mundo com Funcion");
    });

    $(document).ready(function(){
        alert("Documento carregado com sucesso!!!");
    })

    //Só começa quando o documento estiver totalmente carregado
    $(window).on('load',function(){
        alert("Olá...página carregada!!!")

    //Seta a propriedade
    setTimeout(function(){
        $('#teste.artigo1').css('background-color','green');
    },2000)

    //Pega/recupera o valor da propriedade
    console.log($('.artigo1 > p').css('color'));

    //Seta a propriedade
    setTimeout(function(){
        $('.artigo1 > p').css('color','red');
    },4000)

    //Pega/recupera o valor da propriedade
    console.log($('.artigo1 > p').css('color'));

        /*Pega a largura*/
        $('.box').width();
    
        /*Seta a largura*/
        $('.box').css('width','900px');
    
        /*Pega os valores da largura*/
        console.log("Width: " + $('.box').width());
        console.log("innerWidth: " + $('.box').innerWidth());
        console.log("OuterWidtrh: " + $('.box').outerWidth(true));
    
        /*Pega os valores da altura*/
        console.log("Height: " + $('.box').height());
        console.log("innerHeigth: " + $('.box').innerHeight());
        console.log("OuterHeighth: " + $('.box').outerHeight(true));
        


});


$(function(){
    $('.artigo1').click(function(){
        $('.artigo2').css('background-color','purple')
    })
})
