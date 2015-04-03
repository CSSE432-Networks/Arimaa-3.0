package game;
import java.awt.Image;

public class Piece {
	private PieceType type;
	private Image image;
	private Owner owner;
	
	public enum Owner{
		Player1, Player2
	}
	
	public enum PieceType{
		Elephant, Camel, Horse, Dog, Cat, Rabbit
	}
	
	public Piece(PieceType t, Image i){
		this.type = t;
		this.image = i;
	}

	public PieceType getType() {
		return this.type;
	}

	public void setType(PieceType type) {
		this.type = type; 
	}

	public Image getImage() {
		return this.image;
	}

	public void setImg(Image img) {
		this.image = img;
	}

	public Owner getOwner() {
		return null;
	}

	public void setOwner(Owner owner) {
		
	}
}
