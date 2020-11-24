import random

import mysql.connector
menu = [{'name': 'lemon grass', 'kind': 'food', 'price': 25, 'status': True}, {'name': 'squash', 'kind': 'food', 'price': 40, 'status': True}, {'name': 'lettuce', 'kind': 'food', 'price': 36, 'status': True}, {'name': 'sauerkraut', 'kind': 'food', 'price': 40, 'status': True}, {'name': 'spinach', 'kind': 'food', 'price': 21, 'status': True}, {'name': 'cream cheese', 'kind': 'food', 'price': 10, 'status': True}, {'name': 'garlic', 'kind': 'food', 'price': 48, 'status': True}, {'name': 'chile peppers', 'kind': 'food', 'price': 31, 'status': True}, {'name': 'vanilla bean', 'kind': 'food', 'price': 29, 'status': True}, {'name': 'pumpkins', 'kind': 'food', 'price': 9, 'status': True}, {'name': 'green onions', 'kind': 'food', 'price': 38, 'status': True}, {'name': 'black olives', 'kind': 'food', 'price': 12, 'status': True}, {'name': 'unsweetened chocolate', 'kind': 'food', 'price': 44, 'status': True}, {'name': 'beans', 'kind': 'food', 'price': 39, 'status': True}, {'name': 'anchovy paste', 'kind': 'food', 'price': 25, 'status': True}, {'name': 'Romano cheese', 'kind': 'food', 'price': 16, 'status': True}, {'name': 'apricots', 'kind': 'food', 'price': 15, 'status': True}, {'name': 'walnuts', 'kind': 'food', 'price': 18, 'status': True}, {'name': 'cactus', 'kind': 'food', 'price': 31, 'status': True}, {'name': 'carrots', 'kind': 'food', 'price': 39, 'status': True}, {'name': 'avocado', 'kind': 'drink', 'price': 17, 'status': True}, {'name': 'pomegranate', 'kind': 'drink', 'price': 6, 'status': True}, {'name': 'lemon', 'kind': 'drink', 'price': 29, 'status': True}, {'name': 'orange', 'kind': 'drink', 'price': 10, 'status': True}, {'name': 'peach', 'kind': 'drink', 'price': 17, 'status': True}, {'name': 'raspberry', 'kind': 'drink', 'price': 22, 'status': True}, {'name': 'Sidecar', 'kind': 'drink', 'price': 8, 'status': True}, {'name': 'Whiskey Sour', 'kind': 'drink', 'price': 9, 'status': True}, {'name': 'Gin Gimlet', 'kind': 'drink', 'price': 9, 'status': True}, {'name': 'El Presidente', 'kind': 'drink', 'price': 24, 'status': True}, {'name': 'Electric Lemonade', 'kind': 'drink', 'price': 29, 'status': True}, {'name': 'Mai Tai', 'kind': 'drink', 'price': 10, 'status': True}, {'name': 'Hurricane', 'kind': 'drink', 'price': 6, 'status': True}]
table = [{
  "capacity": 6,
  "status": False,
  "position": "Floor 2"
}, {
  "capacity": 1,
  "status": True,
  "position": "Floor 2"
}, {
  "capacity": 1,
  "status": False,
  "position": "Floor 2"
}, {
  "capacity": 7,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 3,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 3,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 4,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 1,
  "status": False,
  "position": "Floor 1"
}, {
  "capacity": 7,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 2,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 8,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 4,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 6,
  "status": True,
  "position": "Floor 2"
}, {
  "capacity": 2,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 4,
  "status": True,
  "position": "Floor 2"
}, {
  "capacity": 3,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 2,
  "status": True,
  "position": "Floor 1"
}, {
  "capacity": 6,
  "status": False,
  "position": "Floor 2"
}, {
  "capacity": 3,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 1,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 2,
  "status": True,
  "position": "Floor 2"
}, {
  "capacity": 1,
  "status": False,
  "position": "Floor 2"
}, {
  "capacity": 5,
  "status": False,
  "position": "Floor 3"
}, {
  "capacity": 6,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 8,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 3,
  "status": False,
  "position": "Floor 2"
}, {
  "capacity": 4,
  "status": True,
  "position": "Floor 1"
}, {
  "capacity": 7,
  "status": False,
  "position": "Floor 1"
}, {
  "capacity": 1,
  "status": True,
  "position": "Floor 3"
}, {
  "capacity": 1,
  "status": False,
  "position": "Floor 3"
}]


mydb = mysql.connector.connect(
  host="localhost",
  user="user",
  password="password",
  database="javawebtutor"
)

mycursor = mydb.cursor()
# sql = "INSERT INTO Tables (capacity, status, position) VALUES (%s, %s, %s)"
# for x in table:
#     mycursor.execute(sql, tuple(x.values()))



sql = "INSERT INTO Menu (name, kind, price, status) VALUES (%s, %s, %s, %s)"
for x in menu:
    mycursor.execute(sql, tuple(x.values()))

mydb.commit()

print(mycursor.rowcount, "record inserted.")
