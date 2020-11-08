package events;

import java.time.LocalDateTime;
import java.util.Date;

public class DebitMoney {
   private String name;
   private double amount;
   private String place;
   private Date time;
   public DebitMoney(String name, double amount, String place) {
	super();
	this.name = name;
	this.amount = amount;
	this.place = place;
	long millis=System.currentTimeMillis();  
	this.time = new java.util.Date(millis);
}
  
/**
 * @return the name
 */
public String getName() {
	return name;
}


/**
 * @return the amount
 */
public double getAmount() {
	return amount;
}

/**
 * @return the place
 */
public String getPlace() {
	return place;
}


/**
 * @return the time
 */
public Date getTime() {
	return time;
}



@Override
public String toString() {
	return "DebitMoney [name=" + name + ", amount=" + amount + ", place=" + place + ", time=" + time + "]";
}

   }
