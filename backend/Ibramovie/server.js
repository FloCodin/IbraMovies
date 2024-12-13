const express = require('express');
const app = express();
const port = 8080;

// Beispiel für eine Route
app.get('/api/movies', (req, res) => {
    // Hier sollte die Logik zum Abrufen der Filme aus der Datenbank stehen
    res.json([]); // Gibt eine leere Liste zurück, wenn keine Filme vorhanden sind
});

app.listen(port, () => {
    console.log(`Server läuft auf http://localhost:${port}`);
});