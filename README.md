💱 Monitor de Cotação USD/BRL

Projeto fullstack para monitoramento da cotação do dólar (USD) em relação ao real (BRL).
O sistema consome uma API externa, trata os dados e exibe um gráfico interativo no navegador.

🚀 Objetivo do projeto

Este projeto foi desenvolvido para praticar:

Consumo de APIs externas
Criação de APIs REST com Spring Boot
Manipulação de dados no frontend
Visualização de dados com gráficos

⚙️ Tecnologias utilizadas

Backend:

Java
Spring Boot
Maven

Frontend:

HTML
JavaScript
Chart.js

Outros:

Git
GitHub

📊 Funcionalidades

Consulta de cotação USD → BRL via API externa
Cálculo automático da cotação inversa (BRL → USD)
Exibição em gráfico de linha
Atualização automática dos dados
Visualização com dois eixos (melhor leitura)

🧠 Como funciona

O backend (Spring Boot) consome a API externa de cotação
Os dados são retornados em formato JSON
O frontend busca esses dados via fetch
Os valores são tratados e exibidos no gráfico

🚀 Como executar o projeto

Clonar o repositório

git clone https://github.com/SEU-USUARIO/monitor-cotacao-usd-brl.git

Entrar na pasta do projeto

cd monitor-cotacao-usd-brl

Executar o backend

Opção 1 — IntelliJ:

Abrir o projeto
Rodar a classe CotacaoApplication.java

Opção 2 — Terminal:

Linux/Mac:
./mvnw spring-boot:run

Windows:
mvnw.cmd spring-boot:run

Acessar no navegador

http://localhost:8080/index.html
