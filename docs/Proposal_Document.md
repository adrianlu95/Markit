#3.0

##3.1 Verbal Description

This semester, I am going to enact a 2 step plan of operations on the preexisting application MarkIt. The first part of the plan is to rework the backend, and host it on Heroku, such that future development on other platforms can be performed much more smoothly. Currently, MarkIt has no unified backend, meaning that each platform, (Android, iOS, and Webapp) has to write their own backend and hope that they work together nicely. With a single backend, there will be far less time spent making sure that things cooperate properly. As part of this process I will also cease using the current Firebase database, and build a new database from the ground up that will more accurately and adequately suit the application's needs. To this end I will be using a relational database model using SQLite or MySQL.

The second part of the plan is to finish implementing the rest of the feature list that were beyond our grasp last semester. This will include fleshing out the hub page, the profile page, and finally implementing important user-post interactions that the app is currently lacking.

##3.2 Justification

My plan to work towards these goals began last semester while working on the app, as many of the people, myself included, who were in the group did not like working with Firebase at all. The issue that became immediately obvious to me last semester was that MarkIt essentially needs a relational database. This is because we have many different data points (Users, Items for sale, Hubs) that are all deeply interconnected. What we had to do for this in Firebase was store all of our data 3 times, sorted differently for access by different means. However if this was to be redone using something like MySQL or SQLite, I could make use of the advantages of relational databases, which would be a far more elegant and efficient solution. This will take full advantage of my concurrent class CMSI 486, Databases, and beyond this, will let me apply the knowledge to a real world situation. I believe that this goal is achievable because I have some prior knowledge of database manipulation and implementation, however making such a radical change to a preexisting piece of software will be a new challenge. My previous work with databases left me looking forward to future chances to continue the experience and this project gives me the perfect opportunity to do so.

##3.3 Presentation

[Here](https://docs.google.com/presentation/d/1pioQvXCXN9sd545YoibIDJ5VRiyU4sYYtLOmyZoLYdA/edit?usp=sharing) is my Project Proposal Presentation!