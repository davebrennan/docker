import mysql.connector
import os



mydb = mysql.connector.connect(
  # HOSTNAME is set using Dockfile 
  host='127.0.0.1',
  # use this port when connect from local machine since we are mapping the port
  #port='6603',
  #host=os.environ['HOSTNAME'],
  #host='localhost',
  user='root',
  password='secret',
  auth_plugin='mysql_native_password'
)

mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE mydatabase")

mycursor.execute("USE mydatabase")

mycursor.execute("CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))")

sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"
val = ("John", "Highway 21")
mycursor.execute(sql, val)

mydb.commit()
