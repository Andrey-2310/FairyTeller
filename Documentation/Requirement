# Requirements to Fairy Teller project
## 1. Introduction
 This project is a Web-application, the aim of which is expansion of reader community all over the world. On this site users will be able to write their own works, read masterpieces of the famous artists and amateurs, order works they like.
 There won’t be any chats between users. Buying process will be fake.
## 2.User requirements
### 2.1 Program interfaces
  Used technologies and services:
*	Java and Spring Framework on the backend.
*	HTML, CSS , Material Design,  Typescipt and Angular 2 on the front-end.
*	PostgreSQL  to store information about users, works, orders etc.
*	Auth0 service for generating tokens for users.
*	JWT technology for managing requests. 
*	Cloudinary cloud platform for keeping images from website.
### 2.2 User interface
   The user interface will provide facilities on the web pages to navigate user through various information about authors, genres, books with their description, content and rating. Depending on the situation page will look like a book, teaxt-editor or inline shop. For more details see mockups.
### 2.3 User characteristics
*	The writer: person who wants to publish his work or come up with a continuation of existing work;
*	The reader: person who is interested in reading published works;
*	The buyer: person who wants to buy selected masterpiece
### 2.4 Assumptions и dependencies
  Some problems with rendering in old versions of browsers may occur.

## 3. System requirements

To use the web app, you need desktop, laptop or mobile device with installed one of the recommended browsers:
*	Yandex (13+)
*	Mozilla Firefox (20+)
*	Google Chrome (15+)
	3.1 Functional requirements

### 3.1.1 Routing and navigation through the web application using sections
Users can browse content of the web application using sections on navigation bars. Routingand navigation through webapp must be implemented by using the correspond sections from the navigation bars. After clicking on the section the content of corresponded section appears on the web page. The following navigation bars will be implemented:
*	Profile
*	Create new
*	Favorite
*	Popular
*	Purchases

### 3.1.2 Possibility to visit author’s page
In a Profile bar User may visit author page and inspect the information about him: origin, age, interesting biographical facts, and books he have read, general rating and so on.

### 3.1.3 Possibility to add works to favorite
Users may add works they enjoy to favorite. It’s possible to view list of favorite works in a Favorite bar.

### 3.1.4 Possibility to create new work
This possibility allows User to create new work. When user enters this page text editor with all important instruments will be shown. User will choose the title and divide the work into chapters, create preamble and insert images to the content.

### 3.1.5 Possibility to continue existing works
There is a possibility to continue existing work of another author. Continuations have their own ratings within certain work. Creating continuation will be implemented in a similar with creation works way.

### 3.1.6 Possibility to view popular works
The possibility of watching popular works will be implemented by clicking Popular bar. Users may choose “rating” or “have read” filter.

### 3.1.7 Possibility to purchase works
User is able to purchase selected work. The process of purchasing is individual. It includes choosing font size, book format, cover and so on. After pressing order button ordered work will be added to the purchase list which User may look through in a Purchases page.

### 3.1.8 Possibility to change language
User may switch the language of the application content

## 3.2	Non-Functional requirements

### 3.2.1	Software Quality attributes
*	Security: will be and prevent server from unauthorized requests. Only authenticated users may change content of database.
*	Performance: users don't want to wait for a long time watching the web page is loading. To avoid wasting precious time user must wait maximum 1 second to load any page on web app. Measures in time needed to load web page.
*	Reliability: users should have a possibility to work with site 24/7.  That’s why it’s important to provide such ability for them. Measures count of situations when user can't load web page.
*	User-friendly interface: measures in user ability to intuitively understand the context and search the site without any problems.


 ## 3.3 General requirements

### 3.2.2	General Patterns
*	Works of amateur artists are posted in full version
*	Works of famous artists are posted in a short version. 
*	The continuation of work created by user which is not the author can be attached to this work.

 ###  3.2.3 Role abilities
*	Unauthenticated users have a possibility to watch works of all artists. 
*	Authenticated users in addition have an opportunity to create and edit their own works; continue, comment and estimate other’s works; order books
*	Admin may process orders, delete and block users.
