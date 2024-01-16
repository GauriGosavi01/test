package com.test;

public class Sports {

	public static void main(String[] args) {
		// Create objects 
		 Football football = new Football();
		 Basketball basketball = new Basketball();
		 Rugby rugby = new Rugby();

	   
	   football.play();
	   basketball.play();
	   rugby.play();

	}

}
//Sports base class
class Sportss {

public void play() {
   System.out.println("Playing a generic sports");
}
}

//Football subclass
class Football extends Sportss {

public void play() {
   System.out.println("Playing Football");
}
}

//Basketball subclass
class Basketball extends Sportss {

public void play() {
   System.out.println("Playing Basketball");
}
}

//Rugby subclass
class Rugby extends Sportss {

public void play() {
   System.out.println("Playing Rugby");
}
}


