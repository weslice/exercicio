# uau_box_test


A aplicação foi criada com o spring-boot, com algumas dependências necessárias para rodar a aplicação.
Utilizei o banco de dados embutido H2 para ser mais fácil e pratico de desenvolver uma aplicação de teste ou estudos. 
Para inicilizar a aplicação é só abrir como Projeto, baixar as dependências pelo Gradle e dar Iniciar no Spring Boot (RUN), mais nenhuma configuração é necessária.

Para utilizar o serviço:
Realizar uma requisição GET localmente quando subir a aplicação 
Endpoint: http://localhost:8080/call/calculate 
Passando no corpo um JSON no formato:

{
  "origin": "011",
  "destination": "017" ,
  "time": "80",
  "plan" : "FALE_MAIS_60"
}

Onde os dados podem variar de acordo com a necessidade.
Origin é a Origem
Destination é o Destino
time é o tempo desejado em minutos da ligação
plan é o nome do plano e tem que ser passado no seguinte padrão:

Tarifa Fixa = TARIFA_FIXA
Plano Fale Mais 30 = FALE_MAIS_30
Plano Fale Mais 60 = FALE_MAIS_60
Plano Fale Mais 120 =  FALE_MAIS_120

Você vai receber o retorno. 
