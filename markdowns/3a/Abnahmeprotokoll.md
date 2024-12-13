# Abnahmeprotokoll

## 1. Abnahmegegenstand
Die Anwendung **IBRAMOVIES**.

---

## 2. Abnahmebeteiligte
- **Projektleiter:** Ibrahim Zeqiraj
- **QA-Team:** Florian Rogenmoser und Team

---

## 3. Grundlagen
- **Systemanforderungen:** Basierend auf dem Systemanforderungskatalog&#8203;:contentReference[oaicite:0]{index=0}.
- **Testergebnisse:** Dokumentiert im Testprotokoll&#8203;:contentReference[oaicite:1]{index=1}.

---

## 4. Abnahmeverfahren
Die Tests wurden gemäß der FURPS+-Klassifizierung durchgeführt:
- **Functionality (F):** Testfälle zur Film-Watchlist und Detailansicht.
- **Usability (U):** Bewertung der Benutzerfreundlichkeit.
- **Reliability (R):** Überprüfung der Datenkonsistenz.
- **Performance (P):** Ladezeittests.
- **Supportability (S):** Skalierbarkeit und technische Dokumentation.

---

## 5. Abnahmekriterien und Mängelklassen
- **Kriterien:** Funktionalität, Usability, Zuverlässigkeit, Performance.
- **Mängelklassen:**
    - 0 = mängelfrei
    - 1 = belangloser Mangel
    - 2 = leichter Mangel
    - 3 = schwerer Mangel
    - 4 = kritischer Mangel

---

## 6. Lieferergebnisse und allfällige Mängel
### Beispiele:
1. **Mangel:** Doppelte Einträge in der Watchlist möglich (Mängelklasse 2).
    - **Maßnahme:** Fehlerbehebung durch das Entwicklungsteam.
    - **Verantwortlichkeit:** Entwicklungsteam.
    - **Termin:** Innerhalb von 14 Tagen.

2. **Mangel:** Fehlerhafte Datenübertragung zwischen Watchlist und Detailansicht (Mängelklasse 3).
    - **Maßnahme:** Korrektur der Datenübertragung.
    - **Verantwortlichkeit:** Entwicklungsteam.
    - **Termin:** Innerhalb von 14 Tagen.

---

## 7. Abnahmeergebnis
Das System wird unter Vorbehalt der Fehlerbehebung abgenommen. Nach erfolgreicher Nachbesserung erfolgt die finale Abnahme.

---

## 8. Unterschriften
- **Projektleiter:** ______________________
- **QA-Team:** ______________________

---

# Beantwortung der Fragen

1. **Fehlen noch wichtige Tests?**
    - Ja, es fehlen tiefere Tests zur Datenkonsistenz und Skalierbarkeit.

2. **Reicht der bisherige Werkzeugkasten aus?**
    - Nein, zusätzliche Tools wie JMeter wären sinnvoll für Lasttests.

3. **Wurde eine Testart übersehen oder weggelassen?**
    - Sicherheitstests wurden nicht durchgeführt.

4. **Wann wird im Entwicklungsprozess wie oft getestet?**
    - Funktionstests bei jedem Sprint-Ende; Usability-Tests vor dem Release.

5. **Wie kann man eine gute Testeffizienz erreichen?**
    - Durch Automatisierung von Tests mit JUnit und CI/CD-Integration.

6. **Welche Tests werden nach einem Bugfix (Patch) oder vor einem neuen Release getätigt?**
    - Regressionstests und spezifische Tests der behobenen Fehler.

---

**Zusammenarbeit:** Gut abgestimmt  
**Pünktliche Abgabe:** Erfüllt
