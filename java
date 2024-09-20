function calcularSalario() {
    // Obtém os elementos do DOM
    const cargo = document.getElementById('cargo').value;
    const salarioBase = parseFloat(document.getElementById('salarioBase').value);

    // Calcula o aumento e o novo salário
    let aumento, novoSalario;
    switch (cargo) {
        case 'diretor':
            aumento = 10;
            break;
        case 'secretario':
            aumento = 20;
            break;
        case 'operador':
            aumento = 30;
            break;
        default:
            aumento = 0;
    }

    novoSalario = salarioBase * (1 + aumento / 100);

    // Exibe o resultado
    const resultado = document.getElementById('resultado');
    resultado.textContent = O novo salário é R$ ${novoSalario.toFixed(2)}. Aumento de ${aumento}%;
}
