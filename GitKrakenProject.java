import java.io.*;
class MyThread extends Thread{
	private long sum = 0;

	public void run(){
		for(int i = 0; i < 1000000; i++){
			sum+= i;
		}
	}

	public long getSum(){
		return sum;
	}

}


public class GitKrakenProject{

	public static void main(String[] args){

		MyThread[] thread = new MyThread[1000];
        for(int i = 0; i < 1000; i++){
			thread[i] = new MyThread();
			thread[i].start();
		}


    }

}