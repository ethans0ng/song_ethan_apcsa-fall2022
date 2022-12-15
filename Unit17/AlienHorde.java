//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private boolean right = true;
	private int buffering=1;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien A : aliens) {
			A.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien A : aliens) {
			if(buffering%41==0) {
				if(right) {
					A.move("RIGHT");
				}
				else {
					A.move("LEFT");
				}			}
			if(buffering%41==0) {
				A.move("DOWN");
			}
		}
		if(right) {right=false;}
		else {right=true;}
		buffering++;
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i=0; i<aliens.size(); i++) {
			for(Ammo ammo: shots) {
				if((Math.abs(ammo.getX()-aliens.get(i).getX())<=13 && Math.abs(ammo.getY()-aliens.get(i).getY())<=10)) {
					aliens.remove(i);
				}
			}
		}
	}

	public List<Alien> list()
	{
		return aliens;
	}
}
