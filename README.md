# webage-bah-maven

Maven application to display a web site with a list of restaurants. 

Gets list of restaurants from _webage-bah-gradle_ 

Displays an error message if _webage-bah-gradle_ is not available.

This application depends on the following environment 
variable _RESTAURANT_LIST_SERVICE_URL_ be set and point to
the URL of _webage-bah-gradle_

Example: export _RESTAURANT_LIST_SERVICE_URL=http://localhost:9001/restaurants_

Execute in root directory with: _mvn spring-boot:run_




