//Altera propriedades ao clicar
var func = function(){
    $(this).css('background','green');
}

$(function(){

    $('input[name=nome_pessoa]').keyup(func)

});


