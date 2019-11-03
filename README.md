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
        
    
- **Delete planet por id**
    
    - **[+Delete+]** - [http://localhost:8000/v1/planets/id](http://localhost:8000/v1/planets/id])
    
- **criar  planeta**  
    
    - **[+POST+]** - [http://localhost:8000/v1/planets](http://localhost:8000/v1/planets/)
    
    

### Executar aplicação

mvn clean install
mvn spring-boot:run

Obs. Não é necessario para executar a aplicação, mas é recomendado instalar o puglin do lombok na idea.


### Modelo de dados

<img src=”https://raw.githubusercontent.com/abraaoinfo/api-start-wars/master/src/main/resources/static/diagrama.png”>

[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki


