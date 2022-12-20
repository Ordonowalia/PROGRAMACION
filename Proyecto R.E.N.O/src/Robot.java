
public class Robot {
	
private String nombre;
private int lifePoints;
private int ataque;
private int defensa;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getLifePoints() {
	return lifePoints;
}
public void setLifePoints(int lifePoints) {
	this.lifePoints = lifePoints;
	if(this.lifePoints>=100) {
		this.lifePoints=100;
	}else {
		if(this.lifePoints<=0) {
			this.lifePoints=1;
		}
	}
}
public int getAtaque() {
	return ataque;
}
public void setAtaque(int ataque) {
	this.ataque = ataque;
	if(this.ataque>=20) {
		this.ataque=20;
	}else {
		if(this.ataque<=0) {
			this.ataque=1;
		}
	}
}
public int getDefensa() {
	return defensa;
}
public void setDefensa(int defensa) {
	this.defensa = defensa;
}

public String toString() {
	return "Robot->nombre=" + nombre + ", lifePoints=" + lifePoints + ", ataque=" + ataque + ", defensa=" + defensa;
}
public Robot(String nombre) {

	this.nombre = nombre;
	this.lifePoints = 100;
	this.ataque = (int)(Math.random()*20);
	this.defensa = (int)(Math.random()*100);
}





}
