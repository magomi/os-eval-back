# Evaluierung - MV Backend

Einfaches Backend zum Test der OpenShift/AppAgile-basierten Build-Pipeline.

* application.properties.sample enthält alle Konfigurationsparameter incl. kurzer Beschreibung
* vor Start nach application.properties kopieren und Parameter entsprechend Umgebung anpassen
* Parameter können alternativ über Umgebungsvariablen gesetzt werden 
   * Bsp.: "server.port=8888" kannn durch "export SERVER_PORT=8888" übergeben werden
* Übersetzen: "mvn clean package"
* Ausführen: "java -jar target/be-eval-0.1.0.jar"
