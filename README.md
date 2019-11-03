# Api Start Wars

Api permite criar planeta desde que o mesmo esteja na api publica do start wars, lista, deletar, buscar por id,
buscar por nome e deletar.


A aplicação disponibiliza alguns endpoints 


### API

 - **Busca todo os planetas**

    - **[+GET+]** -  [http://localhost:8000/v1/planets](http://localhost:8000/v1/planets)
    
 - **Busca planeta por id**
 
     - **[+GET+]** -  [http://localhost:8000/v1/planets/id](http://localhost:8000/v1/planets/id)
     
 - **Busca planeta por nome**
 
     - **[+GET+]** -  [http://localhost:8000/v1/planets/?name=](http://localhost:8000/v1/planets/?name=)     
        
- **remover planet por id**
    
    - **[+Delete+]** - [http://localhost:8000/v1/planets/id](http://localhost:8000/v1/planets/id])
    
- **criar  laneta**  
    
    - **[+POST+]** - [http://localhost:8000/v1/planets](http://localhost:8000/v1/planets/)
    
    

### Executar aplicação

mvn clean install
mvn spring-boot:run

Criar uma base de dados chamada start-wars no mysql.

Obs. Não é necessario para executar a aplicação, mas é recomendado instalar o puglin do lombok na idea.


### Modelo de dados

![alt text](https://raw.githubusercontent.com/abraaoinfo/api-start-wars/master/src/main/resources/static/diagrama.png)



Ideia desse modelo é não duplicar filme na base e nem nave e diminuir o acesso a api publica. Caso o filme já esteja na base ele so associa com o planeta, caso não econtre o filme na base ele busca na api e grava na base.


## Tecnologias usadas.

- spring-boot
- java 8
- lombok
- maven
- mysql


## Divida Tecnicas

Não foram feito od teste unitario e nem intregado, apaser da sua importancia.
Não foi feito processo paralelo para as varias chamadas a api publica.

















