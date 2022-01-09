# NBD
Repozytorium z zadaniami na przedmiot NBD.
Poniżej krótkie uwagi do poszczególnych zadań.

## Zadanie 1

### Wyniki

Otrzymane wyniki zakładają, że zapytania wykonywane są **po kolei**.
Przykładowo wynik *zapytania 8* jest otrzymany już po **usunięciu** dokumentów z *zapytania 7*.

### Skrypt

Skrypt ```run-query.sh``` ułatwia szybkie wykonanie zapytań.

#### Przykładowe użycie

```./run-query.sh zapytanie-1.js```


## Zadanie 2

### Wyniki

Otrzymane wyniki są na świeżo załadowanej bazie (oryginalny stan).

### Skrypt

Skrypt ```run-query.sh``` ułatwia szybkie wykonanie zapytań.

#### Przykładowe użycie

```./run-query.sh zapytanie-1.js```


## Zadanie 6

### Wymagania

- Python 3.6

### Uruchomienie

```
cd zadanie-6/
pip install -r requirments.txt
python app.py --bucket s18174 --key schwarzenegger --json data.json
```

Aby zobaczyć wszystkie argumenty:

```
python app.py --help
```

## Zadania 7, 8, 9, 10

### Wymaganie

- Scala 2.13

