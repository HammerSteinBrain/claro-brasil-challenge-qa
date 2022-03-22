Claro Brasil Challenge - QA
----------

#### Instruções de entrega

	- Explicação rápida da decisão arquitetura utilizada e o motivo
		* Utilizado Page Objects para melhor leitura/ entendimento e escalabilidade do codigo
		
		
	- Lista de bibliotecas de terceiros utilizadas
		* Junit 5.7.1
		* Selenium 3.141.59
		* Mavem 3.0.0
	- O que você melhoraria se tivesse mais tempo
		* Desenvolveria cenarios usando Cucumber
		* Talvez criasse um arquivo csv para ser uma massa de dados para login...
	- Quais requisitos obrigatórios e desejáveis não foram entregues e o motivo
		* Cucumber - tem apenas dois cenarios e eles sao bem simples
		
	- Utilizar o comando abaixo para executar os testes Selenium WebDrive
		
		mvn clean test -Dtest=challenge.Test.ChallengeAutomatedTests
		
	- Utilizar o comando abaixo para executar os testes para Android
	
		mvn clean test  "-D_PLATFORM=android" -Dtest=challenge.Test.ChallengeAppiumTests
		
	- Utilizar o comando abaixo para executar os testes para ios
	
		mvn clean test  "-D_PLATFORM=ios" -Dtest=challenge.Test.ChallengeAppiumTests
		
		


