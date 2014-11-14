package Examen1.Lab.Progra2;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MenuInput extends InputListener {
	Menu Clash;
	MenuInput(Menu Clash){
		super();
		this.Clash=Clash;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
		int puntos =0;
		puntos++;
		System.out.println(puntos);
		
		Clash.remove();
		System.out.println("Let's begin the game");
		return super.touchDown(event, x, y, pointer, button);
	} 

}
