package Examen1.Lab.Progra2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Menu extends Image {
	
	Menu(Texture texture){
		super(texture);
		addListener(new MenuInput(this));
		 
	  }
	
	@Override 
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX()+0);
   }

	
		
	}
	



