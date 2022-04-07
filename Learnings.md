# Learnings

 ## Ziele die durch Programmierung erfüllt werden sollen

* Funktionalität bereitstellen
* Fehleranfälligkeit von Prozessen reduzieren
* 
* Produktivität / Effektivität -> Langfristig weniger Arbeit haben
* Effizienz der Ressourcen auslastung

* Wartbarkeit
  * Verständlichkeit
  * Code schwer kaputt zu kriegen.
  * In der Lage auf neue Anforderungen zu reagieren
  


 ## Welches Ziel versuche ich durch Clean Code zu erreichen
* Verständlichkeit
* Code schwer kaputt zu kriegen (durch Verständlichkeit, aber auch durch Strukurierung und Zerlegung in Einzelteile)
* Entwicklungseffizienz
* Weniger Fehler

 ## Strategien um Clean Code zu schreiben
* Variablen / Klassennamen / Funktionsnamen /... sollen einen Aussagekräfitgen Namen haben (also alle Namen)
* Codeblöcke in Funktionen/Methoden auslagern
* Design first Ansatz => Grobe Struktur erstellen und dann diese mit Leben füllen
* Fachlichkeit einheitlich benamen (eine Facchlichkeit soll überall gleich benamt sein)
* Pure Functions => Funktionen deren Ergebnis  NUR von den Importparametern abhängig sind, und die KEINEN Seiteneffekt nach außen haben
* Code Review
* Statische Analyze
* Einheitliche Codeformatierung
* KISS => "Keep it simple and stupid" =>Code so strukturiern und vereinfachen das einfach und verständlich ist.
* DRY => "Do not repeat (yourself) => Fachliche Logik nicht doppeln, CODE dagegen kann gerne gedoppelt werden
* YAGNI => "You aint gonna need it" => Dinge von dennen ich nicht WEISS das ich sie brauche, implementiere ich nicht.
* SRP => "Single Responsibility Principle" => Ein Baustein soll nur eine Verantwortung haben. Nur EINE Stakeholdergroupe darf Veränderungen anstoßen
* Auskommentiertere Code hat NICHTS im Hauptbranch zu suchen
* keine "magic values" => alle Zahlen / Strings die sich innerhalb einer Fachlichkeit wiederholen sollten als Konstante oder enum zentralisiert werden.