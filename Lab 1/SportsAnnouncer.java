public class SportsAnnouncer implements Speaker{
public void speak(){
System.out.println("Gaol!!");
}

public void announce(String team){
System.out.println("The "+team + " have scored a goal!");
}


public class Actor implements Speaker{
public void speak(){
System.out.println("I've been nominated for three Academy Awards");
}

public void announce(String movie){
System.out.println("I'm currently staring in "+movie);
}
}

public class SpeakerOfTheHouse implements Speaker{

public void speak(){
System.out.println("I am the Speaker of the house");
}

public void announce(String bill){
System.out.println("The bill "+bill+" has been placed.");
}
}
}