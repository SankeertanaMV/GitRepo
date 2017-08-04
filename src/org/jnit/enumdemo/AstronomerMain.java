package org.jnit.enumdemo;

public class AstronomerMain {

	public static void main(String[] args) {
		Astronomer a = new Astronomer();
		a.setName("Neil");
		a.setAge(35);
		a.setPlanet(Planet.MARS);
		
		Astronomer a1 = new Astronomer();
		a1.setName("Armstrong");
		a1.setAge(30);
		a1.setPlanet(Planet.EARTH);
		
		System.out.println(a1.getPlanet());
	    System.out.println(a.getPlanet());
	    System.out.println(a1.getPlanet().getOrder());
	    System.out.println(a1.getPlanet().isLiveable());
	}

}
