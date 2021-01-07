package day46_JavaRecap;

public class MorningWorkOut {

    public static void main(String[] args) {
        System.out.println("Push Up");
        sleep(1.5);

    }


    public static void sleep(double seconds){ // 2.5

        try {
            // (long) (2500.0)
            Thread.sleep((long) (seconds * 1000));
        }catch (InterruptedException e){

        }

    }

}

/*
MorningWorkOut:
		1. Do 30 push ups
				try pausing 1.5 seconds in each

		2. Do 20 Pull up
				try pausing 2.5 seconds in each
 */
