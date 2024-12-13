## Projektname: IBRAMOVIES
 
---

### Klassifizierung
- **Nicht klassifiziert**

---

### Status
- **In Arbeit**

---

### Programmname
- **IBRAMOVIES**

---

### Projektnummer
- **IM-2024**

---

### Projektleiter
- **Ibrahim Zeqiraj**

---

### Version
- **0.1**

---

### Datum
- **22. November 2024**

---

### Auftraggeber
- **WISS**

---

### Autor/Autoren
- **Ibrahim Zeqiraj**
- **Florian Rogenmoser**

---

### Verteiler
- **QA-Team**

---

## Änderungsverzeichnis

| **Version** | **Datum**   | **Änderung**                        | **Autor**            |
|-------------|-------------|-------------------------------------|----------------------|
| 0.1         | 22.11.2024  | Erstellung des Dokuments           | Ibrahim Zeqiraj      |
 
---

## Beschreibung
Das Testprotokoll dokumentiert die Testergebnisse der Anwendung **IBRAMOVIES**. Die Ergebnisse wurden gemäß den im Testkonzept definierten Kriterien bewertet.
 
---

## Übersicht der Testfälle / Testdurchführungen

| **ID**  | **Bezeichnung**              | **Testdatum**  | **Tester**          | **Mängelklasse (FK)** |
|---------|-------------------------------|----------------|---------------------|------------------------|
| T-001   | Film hinzufügen               | 20.11.2024     | Ibrahim Zeqiraj     | 0                      |
| T-002   | Watchlist-Funktion testen     | 20.11.2024     | QA-Team             | 2                      |
| T-003   | Filmdetails aufrufen          | 20.11.2024     | QA-Team             | 3                      |
Mängelklassifikation:*
- **0** = mängelfrei
- **1** = belangloser Mangel
- **2** = leichter Mangel
- **3** = schwerer Mangel
- **4** = kritischer Mangel

---

## Testfallbeschreibungen

### Testfall 1: Film hinzufügen

- **ID / Bezeichnung:** T-001
- **Beschreibung:** Hinzufügen eines neuen Films zur Datenbank.
- **Testvoraussetzungen:** Backend ist verfügbar, Datenbank ist aktiv.
- **Testschritte:**
    1. Anwendung starten.
    2. Film-Daten (Titel, Beschreibung, Poster-URL) eingeben.
    3. Auf "Hinzufügen" klicken.
- **Erwartetes Ergebnis:** Der Film wird zur Liste hinzugefügt und ist in der Datenbank gespeichert.
- **Testdurchführung:**
    - **Testdatum:** 20.11.2024
    - **Tester:** Ibrahim Zeqiraj
    - **Mängelklasse:** 0
- **Mangelbeschreibung:** Keine Fehler.
- **Bemerkungen:** Funktioniert wie erwartet.

---

### Testfall 2: Watchlist-Funktion testen

- **ID / Bezeichnung:** T-002
- **Beschreibung:** Filme zur Watchlist hinzufügen und entfernen.
- **Testvoraussetzungen:** Mindestens ein Film in der Datenbank vorhanden.
- **Testschritte:**
    1. Film zur Watchlist hinzufügen.
    2. Film aus der Watchlist entfernen.
- **Erwartetes Ergebnis:** Der Film kann zur Watchlist hinzugefügt und entfernt werden, ohne Duplikate.
- **Testdurchführung:**
    - **Testdatum:** 20.11.2024
    - **Tester:** QA-Team
    - **Mängelklasse:** 2
- **Mangelbeschreibung:** Doppelte Einträge in der Watchlist möglich.
- **Bemerkungen:** Funktionalität muss verbessert werden.

---

### Testfall 3: Filmdetails aufrufen

- **ID / Bezeichnung:** T-003
- **Beschreibung:** Filmdetails aus der Watchlist aufrufen.
- **Testvoraussetzungen:** Ein Film ist in der Watchlist vorhanden.
- **Testschritte:**
    1. Film aus der Watchlist auswählen.
    2. Details des Films anzeigen.
- **Erwartetes Ergebnis:** Die Details des Films werden korrekt angezeigt.
- **Testdurchführung:**
    - **Testdatum:** 20.11.2024
    - **Tester:** QA-Team
    - **Mängelklasse:** 3
- **Mangelbeschreibung:** Daten werden nicht korrekt aus der Watchlist übernommen.
- **Bemerkungen:** Fehlerhafte Datenübertragung zwischen Watchlist und Detailansicht.

---

## Start- und Abbruchbedingungen

### Startbedingungen:
- **Technische Voraussetzungen:**
    - Datenbank und Backend sind aktiv.
    - Testumgebung ist vollständig eingerichtet.
- **Organisatorische Voraussetzungen:**
    - Testfälle sind dokumentiert.
    - Rollen und Zuständigkeiten sind definiert.

### Abbruchbedingungen:
- **Technische Probleme:**
    - Backend ist nicht verfügbar.
    - Datenbankprobleme verhindern die Tests.
- **Unzureichende Testdaten:**
    - Testfälle können aufgrund fehlender Daten nicht durchgeführt werden.

---

## Testumgebung
- **Betriebssystem:** Windows 10
- **Browser:** Chrome 118, Firefox 119
- **Backend:** Spring Boot
- **Datenbank:** MySQL 8.0

---

## Testinfrastruktur
- **Frontend:** React.js-Anwendung.
- **Backend:** REST-API für Filmdaten und Watchlist-Funktionen.
- **Datenbank:** MySQL mit initialen Testdaten.

---

## Testdaten
- **Beispieldaten für Filme:**
    - Film 1: Titel: "Inception", Bewertung: 8.8.
    - Film 2: Titel: "Avatar", Bewertung: 7.8.

---

## Testhilfsmittel
- **Jira:** Dokumentation und Verfolgung von Testfällen.
- **Postman:** Testen von REST-API-Endpunkten.
- **JUnit:** Automatisierte Unit-Tests.

---
# IBRAMOVIE   ###### Klassifizierung - In... x Ibrahim Zeqiraj
Ibrahim Zeqiraj
11:35
# IBRAMOVIE

###### Klassifizierung
- Intern
###### Status
- In Bearbeitung
###### Programmname
- IBRAMOVIES
###### Projektnummer
- M450-001
###### Projektleiter
- Ibrahim Zeqiraj
###### Version
- 1.0
###### Datum
- 22.11.2024
###### Auftraggeber
- Hugo Lucca
###### Autor/Autoren
- Ibrahim Zeqiraj, Florian Rogenmoser
###### Verteiler
- Projektbetreuer, Dozenten und Teammitglieder

---
## Änderungsverzeichnis

| Version | Datum      | Änderung  | Autor                                |
| ------- | ---------- | --------- | ------------------------------------ |
| 0.1     | 22.11.2024 | Erstellen | Ibrahim Zeqiraj, Florian Roggenmoser |
|         |            |           |                                      |
|         |            |           |                                      |
|         |            |           |                                      |
|         |            |           |                                      |

 
---
## Beschreibung
Die Systemanforderungen beschreiben Anforderungen an das zukünftige System. Sie sind nach Anforderungskategorien strukturiert. Sie umfassen beispielsweise die Geschäftsanforde­rungen, Betriebsanforderungen, Supportanforderungen, Sicherheitsanforderungen und sind nach Ihrer Wichtigkeit priorisiert.

Die Dokumentation der Systemanforderungen erfolgt auf der Grundlage und mit den Standards/Notationen der eingesetzten Methode des Requirement Engineerings.
 
---
