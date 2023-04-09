# Project: TestVagrant
Summary: 
This project contains a Code written using JAVA language, where we are storing the recent three played songs by user. How To Use? Basically I have created two different classes, ie. Modularization. Now by using OOPs concept of Java I am extending the main class which iss basically abstraction.

Understanding **Modularization**: Modularization is a process in java to create a program by using different module rather than using single legacy architecture. As we know there are 4 main concepts in OOPs Java, ie. a. Encapsulation b. Inheritance c. Polymorphism d. Abstraction

Understanding **Abstraction**: It's a process of hiding the implementation and showing only functionality to the user. We can do this with the help of Inheritance and method overriding.

# Code explanation:
Here I have created one class Played songs in which LinkedList is used to store user songs. LinkedList internally uses a doubly linked list to store the elements that means it's bidirectional in nature. Also I've used a constructor to create the instance of the class. e.g. public PlayedSongs(int capacity) { this.capacity = capacity; this.songs = new LinkedList<>(); }

Then a method PlaySong() is created which basically checks whether the song which user is listening have equalize the capacity of playlist. If yes, then we are removing the first song from playlist and adding the recent played song in the last of the list.

Then method printPlaylist() just prints the user recent playlist which he's listening to.

# Main
In this class RecentlyPlayedSongs we are extending this class which means we are inheriting from another class.It means the base class is inheriting attributes and methods from super/parent class. This concept is called as Inheritance in java.
