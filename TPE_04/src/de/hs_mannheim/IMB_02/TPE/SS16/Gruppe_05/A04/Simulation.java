package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A04;

public class Simulation {
	public static void main(String[] arg) {

		Block block1 = new Block(10, false);
		Block block2 = new Block(5, false);
		Block block3 = new Block(10, false);
		Block block4 = new Block(10, false);
		Block block5 = new Block(15, false);
		Block block6 = new Block(10, false);
		Block block7 = new Block(5, false);
		Block block8 = new Block(5, false);

		Strecke s1 = new Strecke(70, 8);

		s1.addBlock(block1);
		s1.addBlock(block2);
		s1.addBlock(block3);
		s1.addBlock(block4);
		s1.addBlock(block5);
		s1.addBlock(block6);
		s1.addBlock(block7);
		s1.addBlock(block8);

		System.out.println(s1.toString());

		Zug a = new Zug(5, 'A', block1, s1, 6);
		Zug b = new Zug(15, 'B', block2, s1, 11);
		Zug c = new Zug(5, 'C', block3, s1, 20);
		Zug d = new Zug(10, 'D', block4, s1, 30);
		Zug e = new Zug(6, 'E', block5, s1, 45);

		Thread z1 = new Thread(a);
		Thread z2 = new Thread(b);
		Thread z3 = new Thread(c);
		Thread z4 = new Thread(d);
		Thread z5 = new Thread(e);

		z1.start();
		z2.start();
		z3.start();
		z4.start();
		z5.start();

		try {
			z1.join();
			z2.join();
			z3.join();
			z4.join();
			z5.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		z1.interrupt();
		z2.interrupt();
		z3.interrupt();
		z4.interrupt();
		z5.interrupt();

	}
}
