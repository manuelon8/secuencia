package hilos;

import java.util.Random;

public class Principal extends Thread{
	
	private int id;
	
	 
		public void run() {
		System.out.println("Soy el hilo " +id);	
		}
	

	private Principal(int id) {
		super();
		this.id = id;
	}



	public static void main(String[] args) {
		Principal[] vec = new Principal[15];
		Random ram= new Random();
		for(int i=0; i<vec.length; i++) {
			vec[i]=new Principal(ram.nextInt(10));
			 
			vec[i].start();	
			}
		
		try {
			
			for(int i=0; i<vec.length; i++) {
				vec[i].join();
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Soy el hilo principal");
		}

}
