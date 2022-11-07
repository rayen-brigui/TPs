
public class Technicien extends Employer{
    private int Grade;
    public int getGrade() {
        return Grade;
    }
    public void setGrade(int grade) {
        Grade = grade;
    }
    Technicien(String N, String Pr, int S, String A,int G){
        super(N, Pr, S, A);
        setGrade(G);
    }
    public Technicien(Technicien T1){
        super(T1);
    }
    public int Prime() {
        int prime=0;
        switch (Grade) {
            case 1:
               prime=100;
                break;
             case 2:
                prime=200;
                break;
            case 3:
                prime=300;
                break;
            default:
                break;
        }
        return prime;
    }
    @Override
    public String toString() {
        String ch=super.toString()+"\nson prime ="+this.Prime()+"\n son grade est ="+getGrade();
        return ch;
    }
    public void Augmenter() {
        setSalaire(this.getSalaire()+this.Prime());
    }
    public void afficher() {
        System.out.println(this.toString());
       }
}
