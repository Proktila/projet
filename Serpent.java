public class Serpent {
    private String nom="théo";
    private int nbFruitMange;
	private double posx;
	private double posy;
	private double score;

    public Serpent(){}

    public Serpent(int taille, double position){
        this.t=taille;
        this.x=position;
    }
    public void setnom(String name){
        this.nom=name;
    }
}