# IBRAMOVIES
Das Filmarchiv und Watchlist-System

---

## Projektbeschreibung
IBRAMOVIES ist eine interaktive Anwendung, die ein umfangreiches Filmarchiv bereitstellt. Benutzer können Filme durchsuchen, detaillierte Informationen einsehen und ihre persönliche Watchlist verwalten. Die Anwendung deckt eine Vielzahl von Genres ab – von Action bis Komödie – und ermöglicht eine einfache Übersicht über Lieblingsfilme und zukünftige Sehvorhaben.

---

## Inhalt des Projekts
- **Filmdatenbank:** Alle wichtigen Informationen zu Filmen wie Titel, Bewertung, Genre, Dauer und Beschreibung.
- **Watchlist-Funktion:** Filme zur persönlichen Watchlist hinzufügen oder entfernen.
- **CRUD-Funktionen:** Bearbeiten, Hinzufügen und Löschen von Filmen sowie Verwaltung der Watchlist.
- **Datenquelle:** Verbindung zu einer Backend-Datenbank für sichere Speicherung und schnelle Datenabfragen.

---

## Ersteller
- **Name:** Ibrahim Zeqiraj
- **Datum:** 09.11.2024
- **Modul:** M295

---

## Projektdokumentation: IBRAMOVIES

### Projektidee
Die Projektidee ist die Entwicklung einer Anwendung namens "IBRAMOVIES", die eine einfache Verwaltung von Filmen ermöglicht. Benutzer können Filme in der Anwendung anzeigen, zur Watchlist hinzufügen, bearbeiten und löschen. Die App basiert auf einer RESTful-API, die es erlaubt, CRUD-Operationen (Erstellen, Lesen, Aktualisieren, Löschen) auf Filmeinträgen durchzuführen. Ein besonderes Augenmerk liegt auf der Möglichkeit, eine Watchlist zu führen und so Filme zur späteren Ansicht zu markieren. Das Projekt soll eine benutzerfreundliche Oberfläche bieten und gleichzeitig im Backend eine solide Grundlage mit validierten Datenspeicherungen und -abrufen schaffen.

---

## Anforderungskatalog

### Kernaufgaben
1. **Filme hinzufügen:** Benutzer können neue Filme zur Anwendung hinzufügen.
2. **Filme anzeigen:** Die Anwendung zeigt eine Liste aller Filme mit detaillierten Informationen zu jedem Film.
3. **Filme bearbeiten:** Benutzer können Filminformationen wie Titel, Beschreibung und Poster-URL ändern.
4. **Filme löschen:** Filme können aus der Datenbank gelöscht werden.
5. **Watchlist verwalten:** Filme können zur Watchlist hinzugefügt und von dort entfernt werden.
6. **Datenvalidierung:** Eingaben werden vor der Speicherung in der Datenbank überprüft.
7. **REST-API:** Erstellung einer REST-API für den Zugriff und die Manipulation der Filmdaten.

### Zusätzliche Anforderungen
- **Responsive Design:** Die Benutzeroberfläche soll auf verschiedenen Bildschirmgrößen gut aussehen.
- **Fehlerbehandlung:** Bei Eingabefehlern oder ungültigen Aktionen werden dem Benutzer klare Fehlermeldungen angezeigt.
- **Sicherheit:** Sensible Daten wie die Watchlist werden vertraulich behandelt und sicher gespeichert.

---

## Klassendiagramm
Das Klassendiagramm zeigt die wichtigsten Modell-Klassen und ihre Beziehungen. Folgende Klassen wurden im Projekt definiert:
- **Movie:** Repräsentiert einen Film mit Attributen wie `id`, `title`, `overview`, `poster_path`, `release_date`, `runtime`, `vote_average`.
- **Watchlist:** Repräsentiert einen Eintrag in der Watchlist und enthält Referenzen zu einem Movie-Objekt.
- **Controller, Service, Repository:** Diese Ebenen ermöglichen die logische Aufteilung des Codes und kümmern sich um die Verwaltung und den Zugriff der Daten.

*Hinweis: Das vollständige Klassendiagramm wurde in draw.io erstellt und liegt der Dokumentation bei.*

---

## REST-Schnittstellen
Folgende REST-Schnittstellen wurden definiert:
- **GET /api/movies:** Gibt eine Liste aller Filme zurück.
- **GET /api/movies/{id}:** Gibt Details zu einem bestimmten Film zurück.
- **POST /api/movies:** Fügt einen neuen Film hinzu.
- **PUT /api/movies/{id}:** Aktualisiert einen bestehenden Film.
- **DELETE /api/movies/{id}:** Löscht einen bestimmten Film.
- **POST /api/movies/watchlist:** Fügt einen Film zur Watchlist hinzu.
- **GET /api/movies/watchlist:** Gibt alle Filme in der Watchlist zurück.
- **DELETE /api/movies/watchlist/{id}:** Entfernt einen Film aus der Watchlist.

Die Datentypen und das JSON-Format für die Anfragen und Antworten wurden so gestaltet, dass sie mit den oben beschriebenen Attributen kompatibel sind.

---

## Testplan
Es wurden manuelle Tests für die wichtigsten Funktionen durchgeführt:

1. **Film hinzufügen:** Sicherstellen, dass der Film in der Datenbank gespeichert und in der Liste angezeigt wird.
2. **Film bearbeiten:** Änderungen an den Filmdaten werden gespeichert und korrekt angezeigt.
3. **Film löschen:** Der Film wird aus der Datenbank entfernt und ist nicht mehr sichtbar.
4. **Zur Watchlist hinzufügen und entfernen:** Filme können zur Watchlist hinzugefügt und entfernt werden. Die Änderung wird sofort angezeigt.
5. **Anzeige der Watchlist:** Die Watchlist zeigt nur Filme an, die hinzugefügt wurden und aktualisiert sich, wenn Filme entfernt werden.

Die Testergebnisse wurden dokumentiert und sind der Projektdokumentation beigefügt.

---

## Installationsanleitung
1. **Voraussetzungen:** Java, Maven, eine SQL-Datenbank und ein beliebiger Web-Browser.
2. **Installation:**
   - **Backend:** Projektordner öffnen und `mvn install` ausführen, um die Abhängigkeiten zu installieren. Starten Sie das Backend mit `mvn spring-boot:run`.
   - **Frontend:** Navigieren Sie in das Frontend-Verzeichnis, installieren Sie die Abhängigkeiten mit `npm install`, und starten Sie das Frontend mit `npm start`.
3. **Zugriff:** Die Anwendung ist unter `http://localhost:3000` erreichbar.

---

## Hilfestellungen
Hilfestellungen wurden vor allem durch Recherche im Internet, die Unterstützung durch Dozenten und Kollegen sowie mit Hilfe von ChatGPT durchgeführt, um technische Schwierigkeiten zu lösen und Best Practices umzusetzen.

---

## Back-End Applikation

### Maven
Das Projekt wurde mithilfe von Maven konfiguriert und enthält eine `pom.xml`-Datei, um alle notwendigen Abhängigkeiten zu verwalten und das Projekt einfacher in IDEs zu integrieren.

### Validierung
Daten werden im Backend validiert, bevor sie in der Datenbank gespeichert werden. Sollte eine Validierung fehlschlagen, wird eine entsprechende Fehlermeldung an den Client zurückgegeben.

### Code-Dokumentation
Alle Java-Klassen und Methoden sind mit JavaDoc-Kommentaren dokumentiert, um die Lesbarkeit und Wartbarkeit des Codes zu gewährleisten.

### Unit-Tests
Es wurden Unit-Tests für die wichtigsten Backend-Funktionen erstellt. Diese Tests überprüfen das Hinzufügen, Bearbeiten, Löschen und Abrufen von Filmen sowie die Watchlist-Funktionen.

---

## User Stories
- **Als Benutzer** möchte ich Filme zur Watchlist hinzufügen können, damit ich meine Lieblingsfilme für später speichern und schnell darauf zugreifen kann.
- **Als Benutzer** möchte ich die Details zu einem Film anzeigen können, um mehr Informationen wie Beschreibung, Bewertung und Erscheinungsdatum zu jedem Film zu erhalten.
- **Als Administrator** möchte ich Filme bearbeiten können, um Informationen wie den Titel, die Beschreibung oder die Bewertung anzupassen.
- **Als Benutzer** möchte ich einen Film aus meiner Watchlist entfernen können, falls ich mich entscheide, ihn nicht mehr sehen zu wollen.
- **Als Administrator** möchte ich Filme aus der Datenbank löschen können, um veraltete oder fehlerhafte Einträge zu entfernen.

---

## Stakeholder

1. **Endbenutzer (Film-Liebhaber und Gelegenheitsschauer)**
   - **Ziele:** Zugang zu einer umfangreichen Filmdatenbank; Möglichkeit, Filme zu suchen, anzuzeigen, zur Watchlist hinzuzufügen oder zu entfernen.
   - **Einfluss:** Ihre Rückmeldungen sind entscheidend für die Verbesserung der Benutzeroberfläche und Funktionen.

2. **Administrator (Projektbetreuer, Entwickler)**
   - **Ziele:** Pflege der Filmdatenbank, Aktualisierung oder Entfernung veralteter Filme.
   - **Einfluss:** Verantwortlich für das Backend und die Datenbank.

3. **Projektbetreuer (Lehrer/Dozent)**
   - **Ziele:** Beurteilung der Projektqualität und -funktionalität.
   - **Einfluss:** Kann Feedback zur Umsetzung geben und Verbesserungen anregen.

4. **Entwicklungsteam/Projektmitglieder**
   - **Ziele:** Entwicklung eines funktionalen und benutzerfreundlichen Produkts.
   - **Einfluss:** Direkte Implementierung der Projektanforderungen.

---

## Testfälle

### Testfall 1: Filme hinzufügen
- **Beschreibung:** Ein neuer Film wird in die Datenbank aufgenommen.
- **Erwartetes Ergebnis:** Der neue Film wird in der Filmliste angezeigt und in der Datenbank gespeichert.
- **Ergebnis:** Bestanden

### Testfall 2: Filme anzeigen
- **Beschreibung:** Überprüfung, ob alle Filme ordnungsgemäß angezeigt werden.
- **Erwartetes Ergebnis:** Alle Filme aus der Datenbank werden mit ihren Details angezeigt.
- **Ergebnis:** Nicht bestanden

### Testfall 3: Filme bearbeiten
- **Beschreibung:** Ein existierender Film wird bearbeitet und die Änderungen werden gespeichert.
- **Erwartetes Ergebnis:** Die Änderungen sind im Film-Detail sichtbar und wurden in der Datenbank aktualisiert.
- **Ergebnis:** Bestanden

### Testfall 4: Filme löschen
- **Beschreibung:** Ein Film wird aus der Datenbank gelöscht.
- **Erwartetes Ergebnis:** Der Film wird aus der Datenbank entfernt und ist nicht mehr in der Liste sichtbar.
- **Ergebnis:** Bestanden

### Testfall 5: Filme zur Watchlist hinzufügen und entfernen
- **Beschreibung:** Ein Film wird zur Watchlist hinzugefügt und wieder entfernt.
- **Erwartetes Ergebnis:** Der Film wird zur Watchlist hinzugefügt und kann wieder entfernt werden. Die Änderungen werden in der Watchlist angezeigt.
- **Ergebnis:** Bestanden

---

## Projektherausforderungen und offene Punkte

Nach mehreren Durchläufen konnte ich das Projekt leider nicht vollständig abschließen. Folgende Probleme bestehen weiterhin:

1. **Unvollständige Funktionalität des Watchlist-Buttons:** Der Button, der die Funktion "Zur Watchlist hinzufügen" bzw. "Aus der Watchlist entfernen" umschalten soll, funktioniert nicht wie gewünscht.
2. **Doppelte Einträge in der Watchlist:** Filme können mehrfach zur Watchlist hinzugefügt werden. Dies sollte nicht möglich sein; jeder Film sollte maximal einmal in der Watchlist enthalten sein.
3. **Probleme beim Aufrufen der Filmdetails von der Watchlist aus:** Wenn man von der Watchlist aus die Details eines Films aufruft, werden die Daten nicht korrekt angezeigt.

Diese offenen Punkte bedürfen weiterer Fehleranalyse und Anpassungen im Backend und Frontend, um die volle Funktionalität sicherzustellen.
