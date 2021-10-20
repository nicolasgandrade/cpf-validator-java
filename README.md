# :brazil: CPF Validator  

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">

## :heavy_plus_sign: Descrição

O CPF Validator é um pequeno projeto desenvolvido na linguagem Java, que utiliza o algoritmo oficial de validação de CPFs como base para a construção do código.
Foi dividido em dois pequenos pacotes e classes, o pacote "application" que contém a classe "Program", e o pacote "entities" que possui o "Validator".  
  
O algoritmo que utilizei como base está disponível no seguinte site:  
https://bityli.com/oAyfkb (encurtei o link por ele ser bastante grande, mas se encontra no site www.macoratti.net)

  
## :dvd: Funcionamento do programa

Quando iniciado, o programa pede ao usuário que digite o seu CPF (apenas números). Após isso, o programa inicia o processo de verificação de veracidade do input
enviado, que consiste nos seguintes passos (resumidamente):  
1. Captura do CPF  
2. Cálculo e geração do primeiro dígito verificador  
3. Atualização do CPF gerado pelo programa, agora com o primeiro dígito verificador  
4. Cálculo do segundo dígito verificador  
5. Verificação de se o CPF digitado pelo usuário cumpre as regras de validação  
  
Ao fim do processo, caso o CPF seja real, ou seja, caso cumpra todas as regras padrões definidas pelo algoritmo, o usuário recebe uma mensagem de sucesso, caso
contrário, recebe a mensagem de CPF inválido.

## :grey_question: Como rodar o programa

Para iniciar o programa, basta compilá-lo na sua máquina a partir dos arquivos fonte desse repositório, e depois, utilizando um terminal independente ou da sua
IDE, iniciar a classe compilada "application.Program".

## :technologist: Contribuições

Caso seja do seu interesse, sita-se livre para clonar, fazer a sua versão, ou até mesmo contribuir para esse projeto. Pull requests são bem vindos!
