/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author badar
 */
public final class Constants{
    public static final String SELECT_DAILY_FINANCE = " SELECT  DISTINCT a.roomId as roomNO , b.maxPrice as highestPrice, r.price_r as currentPrice, \n" +
"b.revenu as revenu,\n" +
"b.countr as booking\n" +
"FROM  ((Orders a\n" +
"        INNER JOIN\n" +
"        (\n" +
"            SELECT  \n" +
"            MAX(price_o) as maxPrice, \n" +
"            sum(price_o) as revenu,\n" +
"            COUNT(o2.roomId) as countr, \n" +
"            o2.roomId        \n" +
"            FROM Orders o2\n" +
"            GROUP BY o2.roomId\n" +
"        ) b ON a.roomId = b.roomId AND\n" +
"                a.price_o = b.maxPrice)     \n" +
"       INNER JOIN Rooms r on  r.roomId = a.roomId) WHERE a.date_o ="+(new SimpleDateFormat("yyyy-MM-dd").format((new Date(System.currentTimeMillis()))))+";" ;



    public static final String CREATE_TABLES_QUERY = " CREATE TABLE Clients (\n" +
"  clientId int IDENTITY(1,1) PRIMARY KEY,\n" +
"  name varchar(20) not Null,\n" +
"  fName varchar(20) Not Null,\n" +
"  email varchar(20) unique not NULL,\n" +
");\n" +
"\n" +
            
"CREATE TABLE [Rooms] (\n" +
"  [roomId] int not null    PRIMARY KEY ,\n" +
"  [type] varchar(20) not null,\n" +
"  [status] bit not null,\n" +
"  [price_r] float not null,\n" +
"  [floor] int not null\n" +
"\n" +
");\n" +
"\n" +
"\n" +
"\n" +
"CREATE TABLE [Address] (\n" +
"  [addressId] int not null IDENTITY(1,1)   PRIMARY KEY ,\n" +
"  [clientId] int unique NOT NULL FOREIGN KEY REFERENCES Clients(clientId),\n" +
"  [country] varchar(4) not null,\n" +
"  [zip] int not null,\n" +
"  [city] varchar(20) not null,\n" +
"  [street] varchar(30) not null\n" +
"\n" +
");\n" +
"\n" +
"CREATE TABLE [Orders] (\n" +
"  [orderId] int not null IDENTITY(1,1)   PRIMARY KEY ,\n" +
"  [clientId] int NOT NULL FOREIGN KEY REFERENCES  Clients(clientId),\n" +
"  [roomId] int  NOT NULL FOREIGN KEY REFERENCES Rooms(roomId),\n" +
"  [price_o] float not null,\n" +
"  [date_o] date not null\n" +
" \n" +
");\n" +
"\n" +
            
"CREATE TABLE [Duration] (\n" +
"  [durationId] int not null IDENTITY(1,1)   PRIMARY KEY ,\n" +
"  [arrival] date not null,\n" +
"  [departure] date not null,\n" +
"  [orderId] int unique NOT NULL FOREIGN KEY REFERENCES Duration(orderId)\n" +
"\n" +
"\n" +
");\n";
    
            

    public static void main(String[] args) throws ParseException {
//        System.out.println(CREATE_TABLES_QUERY);
 System.out.println(SELECT_DAILY_FINANCE);

    }
}
