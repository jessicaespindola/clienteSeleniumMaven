

# Prova técnica de Automação de Teste

# Criado um projeto baseado em Maven utilizando a linguagem de programação Java.


## 🔖 Desafio 1

### Cadastro de cliente

- [X] Acessar a página:  https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap
- [X] Mudar o valor da combo Select version para “Bootstrap V4 Theme”
- [X] Clicar no botão Add Customer
- [X] Preencher os campos do formulário com as informações abaixo:
- [X] Clicar no botão Save
- [X] Validar a mensagem “Your data has been successfully stored into the database. Edit Customer or Go back to list” através de uma asserção
- [X] Fechar o browser

| campos           | descrição                  |
|------------------|:---------------------------|
| Name             | Teste Sicredi              |
| Last name        | Teste                      |
| ContactFirstName | Jéssica Espíndola da Silva |
| Phone            | 51 9999-9999               |
| AddressLine1     | Av Assis Brasil, 3970      |
| AddressLine2     | Torre D                    |
| City             | Porto Alegre               |
| State            | RS                         |
| PostalCode       | 91000-000                  |
| Country          | Brasil                     |
| from Employeer   | Fixter                     |
| CreditLimit      | 200                        |

## 🔖 Desafio 2

### Exclusão de cliente

- [X] Pré-condição (Desafio 1)
- [X] Clicar no link Go back to list
- [X] Clicar na coluna “Search Name” e digitar o conteúdo do Name (Teste Sicredi)
- [X] Clicar no checkbox abaixo da palavra Actions
- [X] Clicar no botão Delete
- [X] Validar o texto “Are you sure that you want to delete this 1 item?” através de uma asserção para a popup que será apresentada
- [X] Clicar no botão Delete da popup, aparecerá uma mensagem dentro de um box verde na parte superior direito da tela. Adicione uma asserção na mensagem “Your data has been successfully deleted from the database.”
- [X] Fechar o browser



## 🚀 Tecnologias

- [IntelliJ IDEA] - IDE de desenvolvimento (Runtime version 11.0.15+10-b2043.56 amd64)
- [Maven] - Ferramenta de compilação
- [Java] - Linguagem de Programação
- [Selenium] - 3.14.0
- [JUnit] - 4.13
- [ChromeDriver] - 103.0.5060.53

- https://www.selenium.dev/documentation/webdriver


## 🚀 Selenium IDE

- Criada automação do cadastro de cliente pelo Selenium IDE
- Arquivo: Desafio1_SeleniumIDE.side


Feito com 💜 &nbsp;por Jéssica Espíndola da Silva 👋 &nbsp;[Meu linkedin](https://www.linkedin.com/in/j%C3%A9ssica-esp%C3%ADndola-da-silva-81920076/)
