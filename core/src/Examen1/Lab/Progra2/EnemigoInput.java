package Examen1.Lab.Progra2;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput extends InputListener {
	Enemigo Glob;
	EnemigoInput(Enemigo Glob){
		super();
		this.Glob=Glob;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
		int puntos =0;
		puntos++;
		System.out.println(puntos);
		
		Glob.remove();
		System.out.println("Se ha Derribado el Globo Enemigo");
		return super.touchDown(event, x, y, pointer, button);
	}
	

}
