from bs4 import BeautifulSoup
import requests
import pandas as pd

url = "https://fbref.com/en/comps/Big5/stats/players/Big-5-European-Leagues-Stats" 
result = requests.get(url)
doc = BeautifulSoup(result.text, "html.parser")

body = doc.find("tbody") # Selecting the body tag
table_rows = body.find_all("tr") # Selecting all the table row tags within the body tag

data = {
    "Player": [],
    "Nation": [],
    "Pos": [],
    "Age": [],
    "MP": [],
    "Starts": [],
    "Min": [],
    "Gls": [],
    "Ast": [],
    "PK": [],
    "CrdY": [],
    "CrdR": [],
    "xG": [],
    "xAG": [],
    "Team": [],
    "Comp": [],
} # Dictionary to store data for each stat column
info = {
    "player":"Player",
    "nationality":"Nation",
    "position": "Pos",
    "age":"Age",
    "games":"MP",
    "games_starts":"Starts",
    "minutes":"Min",
    "goals":"Gls",
    "assists":"Ast",
    "goals_pens":"PK",
    "cards_yellow":"CrdY",
    "cards_red":"CrdR",
    "xg":"xG",
    "xg_assist":"xAG",
    "team":"Team",
    "comp_level":"Comp",
} # Mapping HTML data attributes to CSV column names

for row in table_rows:
    td_elements = row.find_all("td") # Selecting all the table data within the row
    for td in td_elements:  
        stat = td.get("data-stat") # Extracting the value of the "data-stat" attribute
        if stat in info: 
            data.get(info.get(stat)).append(td.text.strip()) # Insert the stat into the data dictionary

df = pd.DataFrame(data) # Converting the data dictionary to a DataFrame
df.to_csv("stats.csv", index=False) # Creating a CSV file from the DataFrame
