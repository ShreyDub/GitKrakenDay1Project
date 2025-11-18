import java.io.*;
class MyThread extends Thread{


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