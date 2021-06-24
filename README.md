Web service and client with JAX-WS
================

Compile instructions
--------


* **Compile web service :** `server/WebServices.java`

        javac server\WebServices.java

* **Compile server code :** `server/WebServicesServer.java`

        javac server\WebServicesServer.java

* **Start the server :** `server/WebServicesServer.class`

        java server.WebServicesServer

* **Open new command prompt, Type :**

        wsimport -keep -p client http://localhost:9898/WebServices?wsdl

* **Compile client code :** `client/WebServicesClient.java`

        javac client\WebServicesClient.java

* **Run the client :** `WebServicesClient.class`

        java client.WebServicesClient
