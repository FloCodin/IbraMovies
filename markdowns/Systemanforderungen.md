# **Systemanforderungen**

### **Grobanforderungen**

| **Anforderung**                        | **Anforderungsart**  | **Wichtigkeit** | **Dringlichkeit** |
| -------------------------------------- | -------------------- | --------------- | ----------------- |
| Filme zur Watchlist hinzufügen         | Funktional           | Hoch            | Hoch              |
| Details zu Filmen anzeigen             | Funktional           | Hoch            | Mittel            |
| Benutzeroberfläche responsiv gestalten | Nicht-funktional     | Mittel          | Niedrig           |
| Datenkonsistenz sicherstellen          | Qualitätsanforderung | Hoch            | Hoch              |
 
---
## **Systemübersicht**

### **Use-Case-Diagramm:**
![[asdasd.png]]

### **Funktionsbaum:**
![[asfsafasf.png]]

### **Paketdiagramm:**
![[asfnmasasnofp.png]]
 
---
## **Detailanforderungen**

### **Funktionale Anforderungen:**
1. **Watchlist-Funktionalität:**
    - **Beschreibung:** Ein Benutzer kann einen Film zur Watchlist hinzufügen oder entfernen.
    - **Ablauf:**
        - Benutzer wählt einen Film aus der Filmliste aus.
        - Klicke auf "Zur Watchlist hinzufügen".
        - Der Status ändert sich zu "Aus der Watchlist entfernen", wenn der Film bereits in der Watchlist ist.

2. **Film-Detailansicht:**
    - **Beschreibung:** Ein Benutzer kann detaillierte Informationen zu einem Film anzeigen.
    - **Ablauf:**
        - Benutzer wählt einen Film aus der Liste aus.
        - Die App zeigt Titel, Beschreibung, Bewertung und Erscheinungsdatum an.

### **Qualitätsanforderungen:**
1. **Zuverlässigkeit:**
    - Das System soll selbst bei hoher Benutzerlast die Datenkonsistenz sicherstellen.
2. **Performance:**
    - Die Ladezeit für Film- und Watchlist-Daten soll 2 Sekunden nicht überschreiten.

### **Systemarchitektur:**
- **Vorschlag:**
    - Architektur: **3-Schichten-Architektur**
        - **Frontend:** React.js für Benutzeroberfläche.
        - **Backend:** Spring Boot für API-Logik und Datenverarbeitung.
        - **Datenbank:** MySQL für persistenten Datenspeicher.
    - Kommunikation erfolgt über REST-API.

---
hat Kontextmenü