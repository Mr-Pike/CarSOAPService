# CarSOAPService

Un **web service SOAP** développé en **Java 1.8**, **Eclipse Photon**, et déployé sur **Oracle WebLogic Server 12c**, permettant de gérer une collection de voitures (ajout, consultation par ID, liste complète).

---

## Prérequis

Avant de lancer le projet, assurez-vous d’avoir installé :

- **Java JDK 1.8**
- **Eclipse 2020.06**
- **Oracle WebLogic Server 12c**
- **SoapUI** pour tester le service

---

## Structure du projet
│
├── src/
│ └── com/example/car/
│ ├── model/
│ │ └── Car.java
│ ├── service/
│ │ ├── CarService.java
│ │ └── CarServiceImpl.java
│ └── publisher/
│ └── CarPublisher.java # Test local sans WebLogic
│
└── WEB-INF/
├── web.xml
└── weblogic.xml

## 💻 Fonctionnalités

Le service SOAP expose les opérations suivantes :

| Méthode SOAP     | Description                            | Paramètres         | Retour |
|------------------|----------------------------------------|--------------------|---------|
| `addCar(Car car)` | Ajoute une voiture à la liste          | `Car`              | `String` |
| `getCarById(int id)` | Retourne une voiture par son ID      | `int`              | `Car` |
| `getAllCars()` | Liste toutes les voitures enregistrées   | Aucun              | `List<Car>` |

---

## Déploiement sur WebLogic 12c

1. Ouvrir **Eclipse Photon**
2. Créer un projet :  
   `File → New → Dynamic Web Project`  
   Nom : `CarSOAPService`
3. Cibler le serveur **WebLogic 12c**
4. Copier les sources dans le répertoire `src/`
5. Ajouter les fichiers de configuration `web.xml` et `weblogic.xml`
6. Lancer le projet :  
   `Run on Server → Oracle WebLogic Server`

Le service sera accessible à l’adresse :
http://localhost:7001/MonWebService/CarService?WSDL

---

## Test avec SoapUI

1. Ouvrir **SoapUI**
2. Créer un nouveau projet SOAP
3. Coller l’URL du WSDL :
http://localhost:7001/MonWebService/CarService?WSDL
4. Exemple de requête pour ajouter une voiture :

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:car="http://service.car.example.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <car:addCar>
         <car:car>
            <id>1</id>
            <brand>Toyota</brand>
            <model>Corolla</model>
            <year>2020</year>
         </car:car>
      </car:addCar>
   </soapenv:Body>
</soapenv:Envelope>
