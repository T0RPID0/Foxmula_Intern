package assignment_26May;

public class Time {

		private int hour, min, sec;

	    Time(int hour,int min,int sec){
	        this.hour = hour;
	        this.min = min;
	        this.sec = sec;
	    }

	    Time add(Time time){
	        Time totalTime = new Time(0,0,0);
	        totalTime.hour = this.hour + time.hour;
	        totalTime.min = this.min + time.min;
	        totalTime.sec = this.sec + time.sec;
	        if(totalTime.sec >=60){
	            totalTime.min++;
	            totalTime.sec %= 60;
	        }
	        if(totalTime.min >=60){
	            totalTime.hour++;
	            totalTime.min %= 60;
	        }
	        if(totalTime.hour >=24){
	            totalTime.hour %= 24;
	        }

	        System.out.println("Time = "+totalTime.hour+"h:"+totalTime.min+"m:"+totalTime.sec+"s");

	        return totalTime;
	    }
	    
	    public static void main(String[] args) {

	        // Time format is h:m:s i.e. 24: 60: 60
	        Time time1 = new Time(23,30,59);
	        Time time2 = new Time(0,31,1);
	        time1.add(time2);
	    }

	}

