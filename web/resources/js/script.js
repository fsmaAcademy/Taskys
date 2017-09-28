/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validaFormulario() {
    
    prioridade = document.getElementById('frm:numeroDaPrioridade').value;
    
    if (!(prioridade >= 0 && prioridade <= 10)) {
        alert("A prioridade precisa ser maior que 0 e menor que 10.");
        return false;
    } else {
        alert("Seus dados foram salvo com sucesso!");
    }
    
    return true;
}

function validaFormularioDeItens() {
    
    porcentual = document.getElementById('frm:porcentual').value;
    
    if (!(porcentual >= 0.0 && porcentual <= 100.0)) {
        alert("O andamento precisa ser de 0% a 100%");
        return false;
    } else {
        alert("Seus dados foram salvos com sucesso!");
    }
    
    return true;
}
