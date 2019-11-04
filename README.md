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

### PayLoad  de entrada.  
 metodo post;
 {
    	"name": "Tatooine"
 }   
 Obs. resto da informações será pego da api start wars publica   
  
 ### PayLoad de saida metodo de busca.
 
 [
    {
        "id": 2,
        "name": "Tatooine",
        "terrain": "desert",
        "climate": "arid",
        "url": "https://swapi.co/api/planets/1/",
        "created": "2014-12-09T13:50:50",
        "filmsList": [
            {
                "id": 1,
                "title": "Attack of the Clones",
                "director": "George Lucas",
                "created": "2014-12-20T10:57:58",
                "producer": "Rick McCallum",
                "starshipList": [
                    {
                        "id": 1,
                        "name": "Droid control ship",
                        "model": "Lucrehulk-class Droid Control Ship",
                        "manufacturer": "Hoersch-Kessel Drive, Inc.",
                        "url": "https://swapi.co/api/starships/32/",
                        "created": "2014-12-19T17:04:06"
                    },
                    {
                        "id": 9,
                        "name": "Solar Sailer",
                        "model": "Punworcca 116-class interstellar sloop",
                        "manufacturer": "Huppla Pasa Tisc Shipwrights Collective",
                        "url": "https://swapi.co/api/starships/58/",
                        "created": "2014-12-20T18:37:57"
                    },
                    {
                        "id": 8,
                        "name": "AA-9 Coruscant freighter",
                        "model": "Botajef AA-9 Freighter-Liner",
                        "manufacturer": "Botajef Shipyards",
                        "url": "https://swapi.co/api/starships/47/",
                        "created": "2014-12-20T17:24:24"
                    },
                    {
                        "id": 3,
                        "name": "J-type diplomatic barge",
                        "model": "J-type diplomatic barge",
                        "manufacturer": "Theed Palace Space Vessel Engineering Corps, Nubia Star Drives",
                        "url": "https://swapi.co/api/starships/43/",
                        "created": "2014-12-20T11:05:51"
                    },
                    {
                        "id": 6,
                        "name": "Naboo fighter",
                        "model": "N-1 starfighter",
                        "manufacturer": "Theed Palace Space Vessel Engineering Corps",
                        "url": "https://swapi.co/api/starships/39/",
                        "created": "2014-12-19T17:39:18"
                    },
                    {
                        "id": 2,
                        "name": "Slave 1",
                        "model": "Firespray-31-class patrol and attack",
                        "manufacturer": "Kuat Systems Engineering",
                        "url": "https://swapi.co/api/starships/21/",
                        "created": "2014-12-15T13:00:56"
                    },
                    {
                        "id": 4,
                        "name": "Republic Assault ship",
                        "model": "Acclamator I-class assault ship",
                        "manufacturer": "Rothana Heavy Engineering",
                        "url": "https://swapi.co/api/starships/52/",
                        "created": "2014-12-20T18:08:43"
                    },
                    {
                        "id": 7,
                        "name": "H-type Nubian yacht",
                        "model": "H-type Nubian yacht",
                        "manufacturer": "Theed Palace Space Vessel Engineering Corps",
                        "url": "https://swapi.co/api/starships/49/",
                        "created": "2014-12-20T17:46:47"
                    },
                    {
                        "id": 5,
                        "name": "Jedi starfighter",
                        "model": "Delta-7 Aethersprite-class interceptor",
                        "manufacturer": "Kuat Systems Engineering",
                        "url": "https://swapi.co/api/starships/48/",
                        "created": "2014-12-20T17:35:24"
                    }
                ],
                "url": "https://swapi.co/api/films/5/",
                "starships": null
            },
            {
                "id": 3,
                "title": "Revenge of the Sith",
                "director": "George Lucas",
                "created": "2014-12-20T18:49:38",
                "producer": "Rick McCallum",
                "starshipList": [
                    {
                        "id": 1,
                        "name": "Droid control ship",
                        "model": "Lucrehulk-class Droid Control Ship",
                        "manufacturer": "Hoersch-Kessel Drive, Inc.",
                        "url": "https://swapi.co/api/starships/32/",
                        "created": "2014-12-19T17:04:06"
                    },
                    {
                        "id": 13,
                        "name": "Trade Federation cruiser",
                        "model": "Providence-class carrier/destroyer",
                        "manufacturer": "Rendili StarDrive, Free Dac Volunteers Engineering corps.",
                        "url": "https://swapi.co/api/starships/59/",
                        "created": "2014-12-20T19:40:22"
                    },
                    {
                        "id": 14,
                        "name": "Republic attack cruiser",
                        "model": "Senator-class Star Destroyer",
                        "manufacturer": "Kuat Drive Yards, Allanteen Six shipyards",
                        "url": "https://swapi.co/api/starships/63/",
                        "created": "2014-12-20T19:52:56"
                    },
                    {
                        "id": 17,
                        "name": "Naboo star skiff",
                        "model": "J-type star skiff",
                        "manufacturer": "Theed Palace Space Vessel Engineering Corps/Nubia Star Drives, Incorporated",
                        "url": "https://swapi.co/api/starships/64/",
                        "created": "2014-12-20T19:55:15"
                    },
                    {
                        "id": 18,
                        "name": "arc-170",
                        "model": "Aggressive Reconnaissance-170 starfighte",
                        "manufacturer": "Incom Corporation, Subpro Corporation",
                        "url": "https://swapi.co/api/starships/66/",
                        "created": "2014-12-20T20:03:49"
                    },
                    {
                        "id": 21,
                        "name": "CR90 corvette",
                        "model": "CR90 corvette",
                        "manufacturer": "Corellian Engineering Corporation",
                        "url": "https://swapi.co/api/starships/2/",
                        "created": "2014-12-10T14:20:33"
                    },
                    {
                        "id": 22,
                        "name": "Belbullab-22 starfighter",
                        "model": "Belbullab-22 starfighter",
                        "manufacturer": "Feethan Ottraw Scalable Assemblies",
                        "url": "https://swapi.co/api/starships/74/",
                        "created": "2014-12-20T20:38:05"
                    },
                    {
                        "id": 16,
                        "name": "Jedi Interceptor",
                        "model": "Eta-2 Actis-class light interceptor",
                        "manufacturer": "Kuat Systems Engineering",
                        "url": "https://swapi.co/api/starships/65/",
                        "created": "2014-12-20T19:56:57"
                    },
                    {
                        "id": 19,
                        "name": "V-wing",
                        "model": "Alpha-3 Nimbus-class V-wing starfighter",
                        "manufacturer": "Kuat Systems Engineering",
                        "url": "https://swapi.co/api/starships/75/",
                        "created": "2014-12-20T20:43:04"
                    },
                    {
                        "id": 20,
                        "name": "Banking clan frigate",
                        "model": "Munificent-class star frigate",
                        "manufacturer": "Hoersch-Kessel Drive, Inc, Gwori Revolutionary Industries",
                        "url": "https://swapi.co/api/starships/68/",
                        "created": "2014-12-20T20:07:12"
                    },
                    {
                        "id": 15,
                        "name": "Theta-class T-2c shuttle",
                        "model": "Theta-class T-2c shuttle",
                        "manufacturer": "Cygnus Spaceworks",
                        "url": "https://swapi.co/api/starships/61/",
                        "created": "2014-12-20T19:48:40"
                    },
                    {
                        "id": 5,
                        "name": "Jedi starfighter",
                        "model": "Delta-7 Aethersprite-class interceptor",
                        "manufacturer": "Kuat Systems Engineering",
                        "url": "https://swapi.co/api/starships/48/",
                        "created": "2014-12-20T17:35:24"
                    }
                ],
                "url": "https://swapi.co/api/films/6/",
                "starships": null
            },
            {
                "id": 4,
                "title": "Return of the Jedi",
                "director": "Richard Marquand",
                "created": "2014-12-18T10:39:33",
                "producer": "Howard G. Kazanjian, George Lucas, Rick McCallum",
                "starshipList": [
                    {
                        "id": 29,
                        "name": "X-wing",
                        "model": "T-65 X-wing",
                        "manufacturer": "Incom Corporation",
                        "url": "https://swapi.co/api/starships/12/",
                        "created": "2014-12-12T11:19:05"
                    },
                    {
                        "id": 24,
                        "name": "A-wing",
                        "model": "RZ-1 A-wing Interceptor",
                        "manufacturer": "Alliance Underground Engineering, Incom Corporation",
                        "url": "https://swapi.co/api/starships/28/",
                        "created": "2014-12-18T11:16:35"
                    },
                    {
                        "id": 21,
                        "name": "CR90 corvette",
                        "model": "CR90 corvette",
                        "manufacturer": "Corellian Engineering Corporation",
                        "url": "https://swapi.co/api/starships/2/",
                        "created": "2014-12-10T14:20:33"
                    },
                    {
                        "id": 31,
                        "name": "B-wing",
                        "model": "A/SF-01 B-wing starfighter",
                        "manufacturer": "Slayn & Korpil",
                        "url": "https://swapi.co/api/starships/29/",
                        "created": "2014-12-18T11:18:05"
                    },
                    {
                        "id": 30,
                        "name": "Star Destroyer",
                        "model": "Imperial I-class Star Destroyer",
                        "manufacturer": "Kuat Drive Yards",
                        "url": "https://swapi.co/api/starships/3/",
                        "created": "2014-12-10T15:08:20"
                    },
                    {
                        "id": 32,
                        "name": "Executor",
                        "model": "Executor-class star dreadnought",
                        "manufacturer": "Kuat Drive Yards, Fondor Shipyards",
                        "url": "https://swapi.co/api/starships/15/",
                        "created": "2014-12-15T12:31:43"
                    },
                    {
                        "id": 28,
                        "name": "Y-wing",
                        "model": "BTL Y-wing",
                        "manufacturer": "Koensayr Manufacturing",
                        "url": "https://swapi.co/api/starships/11/",
                        "created": "2014-12-12T11:00:40"
                    },
                    {
                        "id": 33,
                        "name": "EF76 Nebulon-B escort frigate",
                        "model": "EF76 Nebulon-B escort frigate",
                        "manufacturer": "Kuat Drive Yards",
                        "url": "https://swapi.co/api/starships/23/",
                        "created": "2014-12-15T13:06:31"
                    },
                    {
                        "id": 25,
                        "name": "Imperial shuttle",
                        "model": "Lambda-class T-4a shuttle",
                        "manufacturer": "Sienar Fleet Systems",
                        "url": "https://swapi.co/api/starships/22/",
                        "created": "2014-12-15T13:04:47"
                    },
                    {
                        "id": 26,
                        "name": "Calamari Cruiser",
                        "model": "MC80 Liberty type Star Cruiser",
                        "manufacturer": "Mon Calamari shipyards",
                        "url": "https://swapi.co/api/starships/27/",
                        "created": "2014-12-18T10:54:58"
                    },
                    {
                        "id": 23,
                        "name": "Rebel transport",
                        "model": "GR-75 medium transport",
                        "manufacturer": "Gallofree Yards, Inc.",
                        "url": "https://swapi.co/api/starships/17/",
                        "created": "2014-12-15T12:34:52"
                    },
                    {
                        "id": 27,
                        "name": "Millennium Falcon",
                        "model": "YT-1300 light freighter",
                        "manufacturer": "Corellian Engineering Corporation",
                        "url": "https://swapi.co/api/starships/10/",
                        "created": "2014-12-10T16:59:45"
                    }
                ],
                "url": "https://swapi.co/api/films/3/",
                "starships": null
            },
            {
                "id": 2,
                "title": "The Phantom Menace",
                "director": "George Lucas",
                "created": "2014-12-19T16:52:56",
                "producer": "Rick McCallum",
                "starshipList": [
                    {
                        "id": 1,
                        "name": "Droid control ship",
                        "model": "Lucrehulk-class Droid Control Ship",
                        "manufacturer": "Hoersch-Kessel Drive, Inc.",
                        "url": "https://swapi.co/api/starships/32/",
                        "created": "2014-12-19T17:04:06"
                    },
                    {
                        "id": 12,
                        "name": "Republic Cruiser",
                        "model": "Consular-class cruiser",
                        "manufacturer": "Corellian Engineering Corporation",
                        "url": "https://swapi.co/api/starships/31/",
                        "created": "2014-12-19T17:01:31"
                    },
                    {
                        "id": 11,
                        "name": "Naboo Royal Starship",
                        "model": "J-type 327 Nubian royal starship",
                        "manufacturer": "Theed Palace Space Vessel Engineering Corps, Nubia Star Drives",
                        "url": "https://swapi.co/api/starships/40/",
                        "created": "2014-12-19T17:45:04"
                    },
                    {
                        "id": 6,
                        "name": "Naboo fighter",
                        "model": "N-1 starfighter",
                        "manufacturer": "Theed Palace Space Vessel Engineering Corps",
                        "url": "https://swapi.co/api/starships/39/",
                        "created": "2014-12-19T17:39:18"
                    },
                    {
                        "id": 10,
                        "name": "Scimitar",
                        "model": "Star Courier",
                        "manufacturer": "Republic Sienar Systems",
                        "url": "https://swapi.co/api/starships/41/",
                        "created": "2014-12-20T09:39:56"
                    }
                ],
                "url": "https://swapi.co/api/films/4/",
                "starships": null
            },
            {
                "id": 5,
                "title": "A New Hope",
                "director": "George Lucas",
                "created": "2014-12-10T14:23:32",
                "producer": "Gary Kurtz, Rick McCallum",
                "starshipList": [
                    {
                        "id": 29,
                        "name": "X-wing",
                        "model": "T-65 X-wing",
                        "manufacturer": "Incom Corporation",
                        "url": "https://swapi.co/api/starships/12/",
                        "created": "2014-12-12T11:19:05"
                    },
                    {
                        "id": 34,
                        "name": "Death Star",
                        "model": "DS-1 Orbital Battle Station",
                        "manufacturer": "Imperial Department of Military Research, Sienar Fleet Systems",
                        "url": "https://swapi.co/api/starships/9/",
                        "created": "2014-12-10T16:36:51"
                    },
                    {
                        "id": 21,
                        "name": "CR90 corvette",
                        "model": "CR90 corvette",
                        "manufacturer": "Corellian Engineering Corporation",
                        "url": "https://swapi.co/api/starships/2/",
                        "created": "2014-12-10T14:20:33"
                    },
                    {
                        "id": 30,
                        "name": "Star Destroyer",
                        "model": "Imperial I-class Star Destroyer",
                        "manufacturer": "Kuat Drive Yards",
                        "url": "https://swapi.co/api/starships/3/",
                        "created": "2014-12-10T15:08:20"
                    },
                    {
                        "id": 28,
                        "name": "Y-wing",
                        "model": "BTL Y-wing",
                        "manufacturer": "Koensayr Manufacturing",
                        "url": "https://swapi.co/api/starships/11/",
                        "created": "2014-12-12T11:00:40"
                    },
                    {
                        "id": 35,
                        "name": "Sentinel-class landing craft",
                        "model": "Sentinel-class landing craft",
                        "manufacturer": "Sienar Fleet Systems, Cyngus Spaceworks",
                        "url": "https://swapi.co/api/starships/5/",
                        "created": "2014-12-10T15:48:01"
                    },
                    {
                        "id": 36,
                        "name": "TIE Advanced x1",
                        "model": "Twin Ion Engine Advanced x1",
                        "manufacturer": "Sienar Fleet Systems",
                        "url": "https://swapi.co/api/starships/13/",
                        "created": "2014-12-12T11:21:33"
                    },
                    {
                        "id": 27,
                        "name": "Millennium Falcon",
                        "model": "YT-1300 light freighter",
                        "manufacturer": "Corellian Engineering Corporation",
                        "url": "https://swapi.co/api/starships/10/",
                        "created": "2014-12-10T16:59:45"
                    }
                ],
                "url": "https://swapi.co/api/films/1/",
                "starships": null
            }
        ],
        "films": null
    }
]

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
- spring data
- java 8
- lombok
- maven
- mysql


## Divida Tecnicas

Não foram feito od teste unitario e nem intregado, apaser da sua importancia.
Não foi feito processo paralelo para as varias chamadas a api publica.

















