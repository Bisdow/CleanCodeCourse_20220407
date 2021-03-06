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

* Fachlichkeit in der Tiefe verstehen und hinterfragen

* KISS => "Keep it simple and stupid" =>Code so strukturiern und vereinfachen das einfach und verständlich ist.
* DRY => "Do not repeat (yourself) => Fachliche Logik nicht doppeln, CODE dagegen kann gerne gedoppelt werden
* YAGNI => "You aint gonna need it" => Dinge von dennen ich nicht WEISS das ich sie brauche, implementiere ich nicht.
* SRP => "Single Responsibility Principle" => Ein Baustein soll nur eine Verantwortung haben. Nur EINE Stakeholdergroupe darf Veränderungen anstoßen
* Liskovches Substitutionsprinzip => 
* Auskommentiertere Code hat NICHTS im Hauptbranch zu suchen
* keine "magic values" => alle Zahlen / Strings die sich innerhalb einer Fachlichkeit wiederholen sollten als Konstante oder enum zentralisiert werden.
* Wenn man beim "Aufräumen" an einer Stelle nicht weiterkommt, dann erst mal andere Stellen aufräumen, vielleicht wird damit die erste Stelle auch wieder verständlicher
* Komplexere Boolsche Ausdrücke in IF Statements in Funktion auslagern => Code leichter lesbar und gibt dem Boolschen Ausdruck einen "kontext"
* Es kann für das Verständnis hilfreich sein technische Funktionen in einer fachlich benamten Funktion zu wrappen => isUnknownType(xy){ return someEnum.contains(xy)}
* NOT ist fürs Gehirn Aufwendig zu verarbeiten, wenn man kann dann darauf verzichten oder in einer Funktion "erklären"
* Zerlegen in kleine Einheiten
* GOF-Patterns können hilfreich sein (aber zu viel des guten ist auch nicht gut)
* Cohärenz => was fachlich zusammengehört soll auch strukturell zusammen sein