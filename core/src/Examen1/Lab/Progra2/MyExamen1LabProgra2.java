package Examen1.Lab.Progra2;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;



public class MyExamen1LabProgra2 extends ApplicationAdapter {

	SpriteBatch batch;
	
	Texture img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, Menu;
	int x=0;
	int y=0;
	int z=0;
	int j = 0;
	int frame;
	Image mi_enemigo;
	Image mi_enemigo1;
	Image mi_enemigo2;
	Image menu;
	Stage stage2;
		
	
	
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		mi_enemigo = new Image();
		mi_enemigo1 = new Image();
		mi_enemigo2 = new Image();
		menu = new Image();
				
		stage2 = new Stage();
		Gdx.input.setInputProcessor(stage2);
		
		stage2.addActor(mi_enemigo);
		stage2.addActor(mi_enemigo1);
		stage2.addActor(mi_enemigo2);
		stage2.addActor(menu);
		
		Texture text_menu = new Texture("Menu.png");
		Menu men = new Menu(text_menu);
		stage2.addActor(men);
		
		img1 = new Texture("dibujo1.png");
		img2 = new Texture("dibujo2.png");
		img3 = new Texture("dibujo3.png");
		img4 = new Texture("dibujo4.png");
		img5 = new Texture("dibujo5.png");
		img6 = new Texture("dibujo6.png");
		img7 = new Texture("DefensaAerea.png");
		img8 = new Texture("DefensaAerea.png");
		img9 = new Texture("Globo.png");
		img10 = new Texture("Globo.png");
		img11 = new Texture("Misil.png");
		img12 = new Texture("Misil.png");
	}
	
	void agregarElemento(){
		 
		Texture text_enemigo = new Texture("Globo.png");
		Texture text_enemigo1 = new Texture("Globo.png");
		Texture text_enemigo2 = new Texture("Globo.png");
		
		Enemigo enemigoA = new Enemigo(text_enemigo);
		Enemigo enemigoB = new Enemigo(text_enemigo1);
		
		stage2.addActor(enemigoA);
		//enemigoA.setY((int)(Math.random()*500)%500);
		enemigoA.setY(320);
		
		
		stage2.addActor(enemigoB);
		//enemigoB.setY((int)(Math.random()*500)%500);
		enemigoB.setY(400);
		
		
		
	}
		

	@Override
	public void render () {
		Gdx.gl.glClearColor(1,1,1,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img1, 300, 400);
		batch.draw(img2, 350, -100);
		batch.draw(img3, 0, 1);
		batch.draw(img4, 350, 100);
		batch.draw(img5, 0, 30);
		batch.draw(img6, y, 100);
		batch.draw(img7, 125, 80);
		batch.draw(img8, 350, 80);
		//batch.draw(img9, 550-j, 360);
		//batch.draw(img10, j, 360);
		batch.draw(img11, 125, 80+z);
		batch.draw(img12, 350, 80+z);
		batch.end();
		if(x >= 520 && y >= 520 && z >= 520 && j<=0){
			x=0;
			y=0;
			z=0;
			j=520;
		}else{
			x++;
			y++;
			z+=2;
			j-=2;
		}
		
		stage2.draw();
		stage2.act();
		
		if(frame%200==0)
			agregarElemento();
		frame++;
		
	}
}
    