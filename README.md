# JavaTechAPI
AppDirect TechChallenge
Contributer : Nikhil Gupta, Intern Engineer Email: nikhil.gupta@appdirect.com
Date : March 14, 2017
Product's Name : TechApp

This project integrates AppDirect APIs with the web application "web13" running on local system and hosted on ngrok. The project has servlets which interacts with the end point urls for dealing with create and cancel subscription events

The project has 4 packages:

1.com.nikhilgupta.Controller : it contains the servlets CreateSubscription and CancelSubscription which interacts with the market place and the project. Depending upon the type of event Url received appropiate methods are called in Util and Service packages to deal with it. Appropiate responses are also forwarded from these servlets depending upon the results of the processing.

2.com.nikhilgupta.Util: Auth signature happens here.

3.com.nikhilgupta.Bean: it contains the POJO class to map the JSON received to java object.

4.com.nikhilgupta.dao: Here all the connection and Sql queries of database resides to insert,delete, update and retrieving data.


It has 3 tables:
1.Create Subscription
2.Log Subscription
3.CompanyDetails

In all these 3 tables there is a common field "accountIdentifier" which is also the primary key in all these tables.
