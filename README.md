# Soccer API

* This is a Soccer API that collects player statistics across Europe's most competitive competitions.

## Implementation
* Data is collected through web scraping using BeautifulSoup and converted into a .csv file.
* The data from the .csv file is transfer and stored in a PostgreSQL database.
* A Spring Boot application is developed to handle API requests.

## How to Use

### Get All Players
```bash
GET http://localhost:8080/api/v1/player
``` 

### Get Specific Player Statistics
```bash
GET http://localhost:8080/api/v1/player?name=son%20heung-min
```

```json
[
  {
    "id": 1043,
    "name": "Son Heung-min",
    "nation": "kr KOR",
    "position": "FW",
    "age": 32,
    "matchesPlayed": 24,
    "starts": 21,
    "minutesPlayed": 1768,
    "goals": 6,
    "assists": 9,
    "penaltiesScored": 6,
    "yellowCards": 1,
    "redCards": 0,
    "expectedGoals": 5.7,
    "expectedAssists": 7.9,
    "teamName": "Tottenham",
    "competition": "eng Premier League"
  }
]
```





